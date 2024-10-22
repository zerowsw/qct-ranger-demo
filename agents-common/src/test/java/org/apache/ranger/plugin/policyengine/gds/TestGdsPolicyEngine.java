/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.apache.ranger.plugin.policyengine.gds;

import com.google.gson.*;
import org.apache.commons.lang3.StringUtils;
import org.apache.ranger.authorization.hadoop.config.RangerPluginConfig;
import org.apache.ranger.plugin.model.RangerServiceDef;
import org.apache.ranger.plugin.model.validation.RangerServiceDefHelper;
import org.apache.ranger.plugin.policyengine.*;
import org.apache.ranger.plugin.util.RangerAccessRequestUtil;
import org.apache.ranger.plugin.util.ServiceDefUtil;
import org.apache.ranger.plugin.util.ServiceGdsInfo;
import org.apache.ranger.plugin.util.ServicePolicies.SecurityZoneInfo;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.lang.reflect.Type;
import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestGdsPolicyEngine {
    static Gson gsonBuilder;

    @BeforeAll
    public static void setUpBeforeClass() throws Exception {
        gsonBuilder = new GsonBuilder().setDateFormat("yyyyMMdd-HH:mm:ss.SSSZ")
                .setPrettyPrinting()
                .registerTypeAdapter(RangerAccessRequest.class, new RangerAccessRequestDeserializer())
                .registerTypeAdapter(RangerAccessResource.class, new RangerResourceDeserializer())
                .create();
    }

    @Test
    public void testGdsPolicyEngineHive() throws Exception {
        runTestsFromResourceFile("/policyengine/gds/test_gds_policy_engine_hive.json");
    }

    private void runTestsFromResourceFile(String resourceFile) throws Exception {
        InputStream       inStream = this.getClass().getResourceAsStream(resourceFile);
        InputStreamReader reader   = new InputStreamReader(inStream);

        runTests(reader, resourceFile);
    }

    private void runTests(Reader reader, String testName) {
        GdsPolicyEngineTestCase testCase = gsonBuilder.fromJson(reader, GdsPolicyEngineTestCase.class);

        if (StringUtils.isNotBlank(testCase.gdsInfoFilename)) {
            InputStream inStream = this.getClass().getResourceAsStream(testCase.gdsInfoFilename);

            testCase.gdsInfo = gsonBuilder.fromJson(new InputStreamReader(inStream), ServiceGdsInfo.class);
        }

        assertTrue(testCase != null && testCase.gdsInfo != null && testCase.tests != null, "invalid input: " + testName);

        testCase.serviceDef.setMarkerAccessTypes(ServiceDefUtil.getMarkerAccessTypes(testCase.serviceDef.getAccessTypes()));

        RangerPluginContext       pluginContext = new RangerPluginContext(new RangerPluginConfig(testCase.serviceDef.getName(), null, "hive", "cl1", "on-prem", null));
        RangerSecurityZoneMatcher zoneMatcher   = new RangerSecurityZoneMatcher(testCase.securityZones, testCase.serviceDef, pluginContext);
        GdsPolicyEngine           policyEngine  = new GdsPolicyEngine(testCase.gdsInfo, new RangerServiceDefHelper(testCase.serviceDef, false), pluginContext);

        for (TestData test : testCase.tests) {
            if (test.request != null) {
                Set<String> zoneNames = zoneMatcher.getZonesForResourceAndChildren(test.request.getResource());

                RangerAccessRequestUtil.setResourceZoneNamesInContext(test.request, zoneNames);

                if (test.acls != null) {
                    RangerResourceACLs acls = policyEngine.getResourceACLs(test.request);

                    assertEquals(test.acls, acls, test.name);
                } else {
                    GdsAccessResult result = policyEngine.evaluate(test.request);

                    assertEquals(test.result, result, test.name);
                }
            } else if (test.sharedWith != null) {
                Set<String> users  = test.sharedWith.get("users");
                Set<String> groups = test.sharedWith.get("groups");
                Set<String> roles  = test.sharedWith.get("roles");

                if (test.datasets != null) {
                    Set<Long> datasets = policyEngine.getDatasetsSharedWith(users, groups, roles);

                    assertEquals(test.datasets, datasets, test.name);
                }

                if (test.projects != null) {
                    Set<Long> projects = policyEngine.getProjectsSharedWith(users, groups, roles);

                    assertEquals(test.projects, projects, test.name);
                }
            } else if (test.resourceIds != null) {
                Iterator<GdsSharedResourceEvaluator> iter;

                if (test.datasetId != null) {
                    iter = policyEngine.getDatasetResources(test.datasetId);
                } else if (test.projectId != null) {
                    iter = policyEngine.getProjectResources(test.projectId);
                } else if (test.dataShareId != null) {
                    iter = policyEngine.getDataShareResources(test.dataShareId);
                } else if (test.projectIds != null || test.datasetIds != null || test.dataShareIds != null) {
                    iter = policyEngine.getResources(test.projectIds, test.datasetIds, test.dataShareIds);
                } else {
                    iter = Collections.emptyIterator();
                }

                Set<Long> resourceIds = new HashSet<>();

                iter.forEachRemaining(e -> resourceIds.add(e.getId()));

                assertEquals(test.resourceIds, resourceIds, test.name);
            }
        }
    }

    static class GdsPolicyEngineTestCase {
        public RangerServiceDef              serviceDef;
        public Map<String, SecurityZoneInfo> securityZones;
        public ServiceGdsInfo                gdsInfo;
        public String                        gdsInfoFilename;
        public List<TestData>                tests;
    }

    static class TestData {
        public String                   name;
        public RangerAccessRequest      request;
        public GdsAccessResult          result;
        public RangerResourceACLs       acls;
        public Map<String, Set<String>> sharedWith; // principals
        public Set<Long>                datasets;
        public Set<Long>                projects;
        public Long                     datasetId;
        public Long                     projectId;
        public Long                     dataShareId;
        public List<Long>               datasetIds;
        public List<Long>               projectIds;
        public List<Long>               dataShareIds;
        public Set<Long>                resourceIds;
    }

    static class RangerAccessRequestDeserializer implements JsonDeserializer<RangerAccessRequest> {
        @Override
        public RangerAccessRequest deserialize(JsonElement jsonObj, Type type,
                                               JsonDeserializationContext context) throws JsonParseException {
            RangerAccessRequestImpl ret = gsonBuilder.fromJson(jsonObj, RangerAccessRequestImpl.class);

            ret.setAccessType(ret.getAccessType()); // to force computation of isAccessTypeAny and isAccessTypeDelegatedAdmin
            if (ret.getAccessTime() == null) {
                ret.setAccessTime(new Date());
            }
            Map<String, Object> reqContext  = ret.getContext();
            Object accessTypes = reqContext.get(RangerAccessRequestUtil.KEY_CONTEXT_ALL_ACCESSTYPES);
            if (accessTypes != null) {
                Collection<String> accessTypesCollection = (Collection<String>) accessTypes;
                Set<String> requestedAccesses = new TreeSet<>(accessTypesCollection);
                ret.getContext().put(RangerAccessRequestUtil.KEY_CONTEXT_ALL_ACCESSTYPES, requestedAccesses);
            }

            Object accessTypeGroups = reqContext.get(RangerAccessRequestUtil.KEY_CONTEXT_ALL_ACCESSTYPE_GROUPS);
            if (accessTypeGroups != null) {
                Set<Set<String>> setOfAccessTypeGroups = new HashSet<>();

                List<Object> listOfAccessTypeGroups = (List<Object>) accessTypeGroups;
                for (Object accessTypeGroup : listOfAccessTypeGroups) {
                    List<String> accesses = (List<String>) accessTypeGroup;
                    Set<String> setOfAccesses = new TreeSet<>(accesses);
                    setOfAccessTypeGroups.add(setOfAccesses);
                }

                reqContext.put(RangerAccessRequestUtil.KEY_CONTEXT_ALL_ACCESSTYPE_GROUPS, setOfAccessTypeGroups);
            }

            return ret;
        }
    }

    static class RangerResourceDeserializer implements JsonDeserializer<RangerAccessResource> {
        @Override
        public RangerAccessResource deserialize(JsonElement jsonObj, Type type,
                                                JsonDeserializationContext context) throws JsonParseException {
            return gsonBuilder.fromJson(jsonObj, RangerAccessResourceImpl.class);
        }
    }
}
