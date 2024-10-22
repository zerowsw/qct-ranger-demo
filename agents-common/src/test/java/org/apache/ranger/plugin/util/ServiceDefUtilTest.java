/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.ranger.plugin.util;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.apache.commons.lang3.StringUtils;
import org.apache.ranger.plugin.contextenricher.RangerAdminUserStoreRetriever;
import org.apache.ranger.plugin.model.RangerPolicy;
import org.apache.ranger.plugin.model.RangerPolicy.RangerDataMaskPolicyItem;
import org.apache.ranger.plugin.model.RangerPolicy.RangerPolicyItem;
import org.apache.ranger.plugin.model.RangerPolicy.RangerPolicyItemCondition;
import org.apache.ranger.plugin.model.RangerPolicy.RangerPolicyItemDataMaskInfo;
import org.apache.ranger.plugin.model.RangerPolicy.RangerPolicyItemRowFilterInfo;
import org.apache.ranger.plugin.model.RangerPolicy.RangerRowFilterPolicyItem;
import org.apache.ranger.plugin.model.RangerPolicy.RangerPolicyResource;
import org.apache.ranger.plugin.model.RangerPolicyDelta;
import org.apache.ranger.plugin.model.RangerServiceDef;
import org.apache.ranger.plugin.model.RangerServiceDef.RangerAccessTypeDef;
import org.apache.ranger.plugin.model.RangerServiceDef.RangerAccessTypeDef.AccessTypeCategory;
import org.apache.ranger.plugin.store.EmbeddedServiceDefsUtil;
import org.apache.ranger.plugin.util.ServicePolicies.SecurityZoneInfo;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;


import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.apache.ranger.plugin.util.ServiceDefUtil.*;
import static org.junit.jupiter.api.Assertions.*;

public class ServiceDefUtilTest {
	private static final String REF_USER                    = "USER.dept";
	private static final String REF_UG                      = "UG['test-group1'].dept";
	private static final String REF_UGA                     = "UGA.sVal['dept']";
	private static final String REF_GET_UG_ATTR_CSV         = "GET_UG_ATTR_CSV('dept')";
	private static final String REF_GET_UG_ATTR_Q_CSV       = "GET_UG_ATTR_Q_CSV('dept')";
	private static final String REF_UG_ATTR_NAMES_CSV       = "UG_ATTR_NAMES_CSV";
	private static final String REF_UG_ATTR_NAMES_Q_CSV     = "UG_ATTR_NAMES_Q_CSV";
	private static final String REF_USER_ATTR_NAMES_CSV     = "USER_ATTR_NAMES_CSV";
	private static final String REF_USER_ATTR_NAMES_Q_CSV   = "USER_ATTR_NAMES_Q_CSV";
	private static final String REF_GET_UG_ATTR_CSV_F       = "ctx.ugAttrCsv('dept')";
	private static final String REF_GET_UG_ATTR_Q_CSV_F     = "ctx.ugAttrCsvQ('dept')";
	private static final String REF_UG_ATTR_NAMES_CSV_F     = "ctx.ugAttrNamesCsv()";
	private static final String REF_UG_ATTR_NAMES_Q_CSV_F   = "ctx.ugAttrNamesCsvQ()";
	private static final String REF_USER_ATTR_NAMES_CSV_F   = "ctx.userAttrNamesCsv()";
	private static final String REF_USER_ATTR_NAMES_Q_CSV_F = "ctx.userAttrNamesCsvQ()";

	private static final String[] UGA_ATTR_EXPRESSIONS = new String[] {
			REF_USER, REF_UG, REF_UGA,
			REF_GET_UG_ATTR_CSV, REF_GET_UG_ATTR_Q_CSV,
			REF_UG_ATTR_NAMES_CSV, REF_UG_ATTR_NAMES_Q_CSV,
			REF_USER_ATTR_NAMES_CSV, REF_USER_ATTR_NAMES_Q_CSV,
			REF_GET_UG_ATTR_CSV_F, REF_GET_UG_ATTR_Q_CSV_F,
			REF_UG_ATTR_NAMES_CSV_F, REF_UG_ATTR_NAMES_Q_CSV_F,
			REF_USER_ATTR_NAMES_CSV_F, REF_USER_ATTR_NAMES_Q_CSV_F
	};

	static Gson gsonBuilder;

	@BeforeAll
	public static void setUpBeforeClass() throws Exception {
		gsonBuilder = new GsonBuilder().setDateFormat("yyyyMMdd-HH:mm:ss.SSSZ").setPrettyPrinting().create();
	}

	@Test
	public void testNoUserGroupAttrRef() {
		ServicePolicies svcPolicies = getServicePolicies();
		RangerPolicy    policy      = getPolicy(svcPolicies);

		svcPolicies.getPolicies().add(policy);
		assertFalse(ServiceDefUtil.addUserStoreEnricherIfNeeded(svcPolicies, RangerAdminUserStoreRetriever.class.getCanonicalName(), "60000"), "policy doesn't have any reference to user/group attribute");

		policy.setResource("database", new RangerPolicyResource("/departments/USER.dept/")); // expressions must be within ${{}}
		assertFalse(ServiceDefUtil.addUserStoreEnricherIfNeeded(svcPolicies, RangerAdminUserStoreRetriever.class.getCanonicalName(), "60000"), "policy doesn't have any reference to user/group attribute");

		policy.getRowFilterPolicyItems().get(0).getRowFilterInfo().setFilterExpr("dept in USER.dept"); // expressions must be within ${{}}
		assertFalse(ServiceDefUtil.addUserStoreEnricherIfNeeded(svcPolicies, RangerAdminUserStoreRetriever.class.getCanonicalName(), "60000"), "policy doesn't have any reference to user/group attribute");
	}

	@Test
	public void testResourceUserGroupAttrRef() {
		for (String attrExpr : UGA_ATTR_EXPRESSIONS) {
			String          resource    = "test_" + "${{" + attrExpr + "}}";
			ServicePolicies svcPolicies = getServicePolicies();
			RangerPolicy    policy      = getPolicy(svcPolicies);

			policy.setResource("database", new RangerPolicyResource(resource));

			svcPolicies.getPolicies().add(policy);
			assertTrue(ServiceDefUtil.addUserStoreEnricherIfNeeded(svcPolicies, RangerAdminUserStoreRetriever.class.getCanonicalName(), "60000"), "policy resource refers to user/group attribute: " + resource);

			svcPolicies.getServiceDef().getContextEnrichers().clear();
			svcPolicies.getPolicies().clear();
			svcPolicies.getPolicyDeltas().add(new RangerPolicyDelta(1L, RangerPolicyDelta.CHANGE_TYPE_POLICY_CREATE, 1L, policy));
			assertTrue(ServiceDefUtil.addUserStoreEnricherIfNeeded(svcPolicies, RangerAdminUserStoreRetriever.class.getCanonicalName(), "60000"), "policy-delta resource refers to user/group attribute: " + resource);

			svcPolicies.getServiceDef().getContextEnrichers().clear();
			svcPolicies.getPolicyDeltas().clear();
			svcPolicies.getSecurityZones().put("zone1", getSecurityZoneInfo("zone1"));
			svcPolicies.getSecurityZones().get("zone1").getPolicies().add(policy);
			assertTrue(ServiceDefUtil.addUserStoreEnricherIfNeeded(svcPolicies, RangerAdminUserStoreRetriever.class.getCanonicalName(), "60000"), "zone-policy resource refers to user/group attribute: " + resource);

			svcPolicies.getServiceDef().getContextEnrichers().clear();
			svcPolicies.getSecurityZones().get("zone1").getPolicies().clear();
			svcPolicies.getSecurityZones().get("zone1").getPolicyDeltas().add(new RangerPolicyDelta(1L, RangerPolicyDelta.CHANGE_TYPE_POLICY_CREATE, 1L, policy));
			assertTrue(ServiceDefUtil.addUserStoreEnricherIfNeeded(svcPolicies, RangerAdminUserStoreRetriever.class.getCanonicalName(), "60000"), "zone-policy-delta resource refers to user/group attribute: " + resource);
		}
	}

	@Test
	public void testPolicyConditionUserGroupAttrRef() {
		for (String attrExpr : UGA_ATTR_EXPRESSIONS) {
			String          condExpr    = attrExpr + " != null";
			ServicePolicies svcPolicies = getServicePolicies();
			RangerPolicy    policy      = getPolicy(svcPolicies);

			policy.addCondition(new RangerPolicyItemCondition("expr", Collections.singletonList(condExpr)));

			svcPolicies.getPolicies().add(policy);
			assertTrue(ServiceDefUtil.addUserStoreEnricherIfNeeded(svcPolicies, RangerAdminUserStoreRetriever.class.getCanonicalName(), "60000"), "policy condition refers to user/group attribute: " + condExpr);

			svcPolicies.getServiceDef().getContextEnrichers().clear();
			svcPolicies.getPolicies().clear();
			svcPolicies.getPolicyDeltas().add(new RangerPolicyDelta(1L, RangerPolicyDelta.CHANGE_TYPE_POLICY_CREATE, 1L, policy));
			assertTrue(ServiceDefUtil.addUserStoreEnricherIfNeeded(svcPolicies, RangerAdminUserStoreRetriever.class.getCanonicalName(), "60000"), "policy-delta condition refers to user/group attribute: " + condExpr);

			svcPolicies.getServiceDef().getContextEnrichers().clear();
			svcPolicies.getPolicyDeltas().clear();
			svcPolicies.getSecurityZones().put("zone1", getSecurityZoneInfo("zone1"));
			svcPolicies.getSecurityZones().get("zone1").getPolicies().add(policy);
			assertTrue(ServiceDefUtil.addUserStoreEnricherIfNeeded(svcPolicies, RangerAdminUserStoreRetriever.class.getCanonicalName(), "60000"), "zone-policy condition refers to user/group attribute: " + condExpr);

			svcPolicies.getServiceDef().getContextEnrichers().clear();
			svcPolicies.getSecurityZones().get("zone1").getPolicies().clear();
			svcPolicies.getSecurityZones().get("zone1").getPolicyDeltas().add(new RangerPolicyDelta(1L, RangerPolicyDelta.CHANGE_TYPE_POLICY_CREATE, 1L, policy));
			assertTrue(ServiceDefUtil.addUserStoreEnricherIfNeeded(svcPolicies, RangerAdminUserStoreRetriever.class.getCanonicalName(), "60000"), "zone-policy-delta condition refers to user/group attribute: " + condExpr);

			svcPolicies.getServiceDef().getContextEnrichers().clear();
			svcPolicies.getPolicies().clear();
			svcPolicies.getPolicyDeltas().clear();
			svcPolicies.getSecurityZones().clear();
			svcPolicies.getTagPolicies().getPolicies().add(policy);
			assertTrue(ServiceDefUtil.addUserStoreEnricherIfNeeded(svcPolicies, RangerAdminUserStoreRetriever.class.getCanonicalName(), "60000"), "tag-policy condition refers to user/group attribute: " + condExpr);
		}
	}

	@Test
	public void testPolicyItemConditionUserGroupRef() {
		int i = 0;

		for (String attrExpr : UGA_ATTR_EXPRESSIONS) {
			String          condExpr    = attrExpr + " != null";
			ServicePolicies svcPolicies = getServicePolicies();
			RangerPolicy    policy      = getPolicy(svcPolicies);

			final List<? extends RangerPolicyItem> policyItems;

			switch (i % 6) {
				case 0:
					policyItems = policy.getPolicyItems();
				break;

				case 1:
					policyItems = policy.getDenyPolicyItems();
				break;

				case 2:
					policyItems = policy.getAllowExceptions();
				break;

				case 3:
					policyItems = policy.getDenyExceptions();
				break;

				case 4:
					policyItems = policy.getRowFilterPolicyItems();
				break;

				case 5:
					policyItems = policy.getDataMaskPolicyItems();
				break;

				default:
					policyItems = policy.getPolicyItems();
				break;
			}

			policyItems.get(0).addCondition(new RangerPolicyItemCondition("expr", Collections.singletonList(condExpr)));

			svcPolicies.getPolicies().add(policy);
			assertTrue(ServiceDefUtil.addUserStoreEnricherIfNeeded(svcPolicies, RangerAdminUserStoreRetriever.class.getCanonicalName(), "60000"), "policyItem condition refers to user/group attribute: " + condExpr);

			svcPolicies.getServiceDef().getContextEnrichers().clear();
			svcPolicies.getPolicies().clear();
			svcPolicies.getPolicyDeltas().add(new RangerPolicyDelta(1L, RangerPolicyDelta.CHANGE_TYPE_POLICY_CREATE, 1L, policy));
			assertTrue(ServiceDefUtil.addUserStoreEnricherIfNeeded(svcPolicies, RangerAdminUserStoreRetriever.class.getCanonicalName(), "60000"), "policy-delta-item condition refers to user/group attribute: " + condExpr);

			svcPolicies.getServiceDef().getContextEnrichers().clear();
			svcPolicies.getPolicyDeltas().clear();
			svcPolicies.getSecurityZones().put("zone1", getSecurityZoneInfo("zone1"));
			svcPolicies.getSecurityZones().get("zone1").getPolicies().add(policy);
			assertTrue(ServiceDefUtil.addUserStoreEnricherIfNeeded(svcPolicies, RangerAdminUserStoreRetriever.class.getCanonicalName(), "60000"), "zone-policy-item condition refers to user/group attribute: " + condExpr);

			svcPolicies.getServiceDef().getContextEnrichers().clear();
			svcPolicies.getSecurityZones().get("zone1").getPolicies().clear();
			svcPolicies.getSecurityZones().get("zone1").getPolicyDeltas().add(new RangerPolicyDelta(1L, RangerPolicyDelta.CHANGE_TYPE_POLICY_CREATE, 1L, policy));
			assertTrue(ServiceDefUtil.addUserStoreEnricherIfNeeded(svcPolicies, RangerAdminUserStoreRetriever.class.getCanonicalName(), "60000"), "zone-policy-delta-item condition refers to user/group attribute: " + condExpr);

			svcPolicies.getServiceDef().getContextEnrichers().clear();
			svcPolicies.getPolicies().clear();
			svcPolicies.getTagPolicies().getPolicies().add(policy);

			assertTrue(ServiceDefUtil.addUserStoreEnricherIfNeeded(svcPolicies, RangerAdminUserStoreRetriever.class.getCanonicalName(), "60000"), "tag-policyItem condition refers to user/group attribute: " + condExpr);

			i++;
		}
	}

	@Test
	public void testPolicyItemRowFilterExprUserGroupRef() {
		for (String attrExpr : UGA_ATTR_EXPRESSIONS) {
			String          filterExpr  = "${{" + attrExpr + "}}";
			ServicePolicies svcPolicies = getServicePolicies();
			RangerPolicy    policy      = getPolicy(svcPolicies);

			policy.getRowFilterPolicyItems().get(0).setRowFilterInfo(new RangerPolicyItemRowFilterInfo("dept in (" + filterExpr + ")"));

			svcPolicies.getPolicies().add(policy);
			assertTrue(ServiceDefUtil.addUserStoreEnricherIfNeeded(svcPolicies, RangerAdminUserStoreRetriever.class.getCanonicalName(), "60000"), "policy row-filter refers to user/group attribute: " + filterExpr);

			svcPolicies.getServiceDef().getContextEnrichers().clear();
			svcPolicies.getPolicies().clear();
			svcPolicies.getPolicyDeltas().add(new RangerPolicyDelta(1L, RangerPolicyDelta.CHANGE_TYPE_POLICY_CREATE, 1L, policy));
			assertTrue(ServiceDefUtil.addUserStoreEnricherIfNeeded(svcPolicies, RangerAdminUserStoreRetriever.class.getCanonicalName(), "60000"), "policy-delta row-filter refers to user/group attribute: " + filterExpr);

			svcPolicies.getServiceDef().getContextEnrichers().clear();
			svcPolicies.getPolicyDeltas().clear();
			svcPolicies.getSecurityZones().put("zone1", getSecurityZoneInfo("zone1"));
			svcPolicies.getSecurityZones().get("zone1").getPolicies().add(policy);
			assertTrue(ServiceDefUtil.addUserStoreEnricherIfNeeded(svcPolicies, RangerAdminUserStoreRetriever.class.getCanonicalName(), "60000"), "zone-policy row-filter refers to user/group attribute: " + filterExpr);

			svcPolicies.getServiceDef().getContextEnrichers().clear();
			svcPolicies.getSecurityZones().get("zone1").getPolicies().clear();
			svcPolicies.getSecurityZones().get("zone1").getPolicyDeltas().add(new RangerPolicyDelta(1L, RangerPolicyDelta.CHANGE_TYPE_POLICY_CREATE, 1L, policy));
			assertTrue(ServiceDefUtil.addUserStoreEnricherIfNeeded(svcPolicies, RangerAdminUserStoreRetriever.class.getCanonicalName(), "60000"), "zone-policy-delta row-filter refers to user/group attribute: " + filterExpr);
		}
	}

	@Test
	public void testNormalizeAccessTypeDefs() throws Exception {
		try (InputStream inStream = this.getClass().getResourceAsStream("/test_servicedef-normalize.json")) {
			InputStreamReader reader   = new InputStreamReader(inStream);
			ServicePolicies   policies = gsonBuilder.fromJson(reader, ServicePolicies.class);

			RangerAccessTypeDef serviceMarkerAll = getAccessType(policies.getServiceDef().getMarkerAccessTypes(), ACCESS_TYPE_MARKER_ALL);
			RangerAccessTypeDef tagMarkerAll     = getAccessType(policies.getTagPolicies().getServiceDef().getMarkerAccessTypes(), ACCESS_TYPE_MARKER_ALL);

			assertNotEquals(policies.getServiceDef().getAccessTypes().size(), policies.getTagPolicies().getServiceDef().getAccessTypes().size(), "accessType count");
			assertNotEquals(new HashSet<>(serviceMarkerAll.getImpliedGrants()), new HashSet<>(tagMarkerAll.getImpliedGrants()), "impliedGrants: _ALL");
			assertNotEquals(policies.getServiceDef().getDataMaskDef().getAccessTypes().size(), policies.getTagPolicies().getServiceDef().getDataMaskDef().getAccessTypes().size(), "dataMask.accessType count");
			assertNotEquals(policies.getServiceDef().getRowFilterDef().getAccessTypes().size(), policies.getTagPolicies().getServiceDef().getRowFilterDef().getAccessTypes().size(), "rowFilter.accessType count");

			ServiceDefUtil.normalizeAccessTypeDefs(policies.getTagPolicies().getServiceDef(), policies.getServiceDef().getName());

			serviceMarkerAll = getAccessType(policies.getServiceDef().getMarkerAccessTypes(), ACCESS_TYPE_MARKER_ALL);
			tagMarkerAll     = getAccessType(policies.getTagPolicies().getServiceDef().getMarkerAccessTypes(), ACCESS_TYPE_MARKER_ALL);

			assertEquals(policies.getServiceDef().getAccessTypes().size(), policies.getTagPolicies().getServiceDef().getAccessTypes().size(), "accessType count");
			assertEquals(new HashSet<>(serviceMarkerAll.getImpliedGrants()), new HashSet<>(tagMarkerAll.getImpliedGrants()), "impliedGrants: _ALL");
			assertEquals(policies.getServiceDef().getDataMaskDef().getAccessTypes().size(), policies.getTagPolicies().getServiceDef().getDataMaskDef().getAccessTypes().size(), "dataMask.accessType count");
			assertEquals(0, policies.getTagPolicies().getServiceDef().getRowFilterDef().getAccessTypes().size(), "rowFilter.accessType count");
		}
	}

	private RangerAccessTypeDef getAccessType(List<RangerAccessTypeDef> accessTypeDefs, String accessType) {
		RangerAccessTypeDef ret = null;

		if (accessTypeDefs != null) {
			for (RangerAccessTypeDef accessTypeDef : accessTypeDefs) {
				if (StringUtils.equals(accessTypeDef.getName(), accessType)) {
					ret = accessTypeDef;

					break;
				}
			}
		}

		return ret;
	}

	@Test
	public void testAccessTypeMarkers() {
		RangerAccessTypeDef create   = new RangerAccessTypeDef(1L, "create",  "create",  null, null, AccessTypeCategory.CREATE);
		RangerAccessTypeDef select   = new RangerAccessTypeDef(2L, "select",  "select",  null, null, AccessTypeCategory.READ);
		RangerAccessTypeDef update   = new RangerAccessTypeDef(3L, "update",  "update",  null, null, AccessTypeCategory.UPDATE);
		RangerAccessTypeDef delete   = new RangerAccessTypeDef(4L, "delete",  "delete",  null, null, AccessTypeCategory.DELETE);
		RangerAccessTypeDef manage   = new RangerAccessTypeDef(5L, "manage",  "manage",  null, null, AccessTypeCategory.MANAGE);
		RangerAccessTypeDef read     = new RangerAccessTypeDef(6L, "read",    "read",    null, null, AccessTypeCategory.READ);
		RangerAccessTypeDef write    = new RangerAccessTypeDef(7L, "write",   "write",   null, null, AccessTypeCategory.UPDATE);
		RangerAccessTypeDef execute  = new RangerAccessTypeDef(8L, "execute", "execute", null, null, null);
		Set<String>         allNames = toSet(create.getName(), select.getName(), update.getName(), delete.getName(), manage.getName(), read.getName(), write.getName(), execute.getName());

		// 6 marker access-types should be populated with impliedGrants
		List<RangerAccessTypeDef> accessTypeDefs = Arrays.asList(create, select, update, delete, manage, read, write, execute);
		List<RangerAccessTypeDef> markerTypeDefs = ServiceDefUtil.getMarkerAccessTypes(accessTypeDefs);
		assertEquals(6, markerTypeDefs.size(), "markerTypeDefs count");
		assertEquals(toSet(create.getName()), getImpliedGrants(markerTypeDefs, ACCESS_TYPE_MARKER_CREATE), "impliedGrants in " + ACCESS_TYPE_MARKER_CREATE);
		assertEquals(toSet(select.getName(), read.getName()),  getImpliedGrants(markerTypeDefs, ACCESS_TYPE_MARKER_READ),  "impliedGrants in " + ACCESS_TYPE_MARKER_READ);
		assertEquals(toSet(update.getName(), write.getName()), getImpliedGrants(markerTypeDefs, ACCESS_TYPE_MARKER_UPDATE), "impliedGrants in " + ACCESS_TYPE_MARKER_UPDATE);
		assertEquals(toSet(delete.getName()), getImpliedGrants(markerTypeDefs, ACCESS_TYPE_MARKER_DELETE), "impliedGrants in " + ACCESS_TYPE_MARKER_DELETE);
		assertEquals(toSet(manage.getName()), getImpliedGrants(markerTypeDefs, ACCESS_TYPE_MARKER_MANAGE), "impliedGrants in " + ACCESS_TYPE_MARKER_MANAGE);
		assertEquals(allNames, getImpliedGrants(markerTypeDefs, ACCESS_TYPE_MARKER_ALL), "impliedGrants in " + ACCESS_TYPE_MARKER_ALL);

		// 2 marker access-types should be populated with impliedGrants: _CREATE, _ALL
		accessTypeDefs = new ArrayList<>(Collections.singleton(create));
		markerTypeDefs = ServiceDefUtil.getMarkerAccessTypes(accessTypeDefs);
		assertEquals(6, markerTypeDefs.size(), "markerTypeDefs count");
		assertEquals(toSet(create.getName()), getImpliedGrants(markerTypeDefs, ACCESS_TYPE_MARKER_CREATE), "impliedGrants in " + ACCESS_TYPE_MARKER_CREATE);
		assertEquals(Collections.emptySet(), getImpliedGrants(markerTypeDefs, ACCESS_TYPE_MARKER_READ), "impliedGrants in " + ACCESS_TYPE_MARKER_READ);
		assertEquals(Collections.emptySet(), getImpliedGrants(markerTypeDefs, ACCESS_TYPE_MARKER_UPDATE), "impliedGrants in " + ACCESS_TYPE_MARKER_UPDATE);
		assertEquals(Collections.emptySet(), getImpliedGrants(markerTypeDefs, ACCESS_TYPE_MARKER_DELETE), "impliedGrants in " + ACCESS_TYPE_MARKER_DELETE);
		assertEquals(Collections.emptySet(), getImpliedGrants(markerTypeDefs, ACCESS_TYPE_MARKER_MANAGE), "impliedGrants in " + ACCESS_TYPE_MARKER_MANAGE);
		assertEquals(toSet(create.getName()),  getImpliedGrants(markerTypeDefs, ACCESS_TYPE_MARKER_ALL),  "impliedGrants in " + ACCESS_TYPE_MARKER_ALL);

		// 2 marker access-types should be populated with impliedGrants: _READ, _ALL
		accessTypeDefs = new ArrayList<>(Arrays.asList(select, read));
		markerTypeDefs = ServiceDefUtil.getMarkerAccessTypes(accessTypeDefs);
		assertEquals(6, markerTypeDefs.size(), "markerTypeDefs count");
		assertEquals(Collections.emptySet(), getImpliedGrants(markerTypeDefs, ACCESS_TYPE_MARKER_CREATE), "impliedGrants in " + ACCESS_TYPE_MARKER_CREATE);
		assertEquals(toSet(select.getName(), read.getName()), getImpliedGrants(markerTypeDefs, ACCESS_TYPE_MARKER_READ), "impliedGrants in " + ACCESS_TYPE_MARKER_READ);
		assertEquals(Collections.emptySet(), getImpliedGrants(markerTypeDefs, ACCESS_TYPE_MARKER_UPDATE), "impliedGrants in " + ACCESS_TYPE_MARKER_UPDATE);
		assertEquals(Collections.emptySet(), getImpliedGrants(markerTypeDefs, ACCESS_TYPE_MARKER_DELETE), "impliedGrants in " + ACCESS_TYPE_MARKER_DELETE);
		assertEquals(Collections.emptySet(), getImpliedGrants(markerTypeDefs, ACCESS_TYPE_MARKER_MANAGE), "impliedGrants in " + ACCESS_TYPE_MARKER_MANAGE);
		assertEquals(toSet(select.getName(), read.getName()), getImpliedGrants(markerTypeDefs, ACCESS_TYPE_MARKER_ALL), "impliedGrants in " + ACCESS_TYPE_MARKER_ALL);

		// accessTypes with no category should be added to _ALL
		accessTypeDefs = new ArrayList<>(Collections.singleton(execute));
		markerTypeDefs = ServiceDefUtil.getMarkerAccessTypes(accessTypeDefs);
		assertEquals(6, markerTypeDefs.size(), "markerTypeDefs count"); // 1 marker access-types should be added: _ALL
		assertEquals(Collections.emptySet(), getImpliedGrants(markerTypeDefs, ACCESS_TYPE_MARKER_CREATE), "impliedGrants in " + ACCESS_TYPE_MARKER_CREATE);
		assertEquals(Collections.emptySet(), getImpliedGrants(markerTypeDefs, ACCESS_TYPE_MARKER_READ), "impliedGrants in " + ACCESS_TYPE_MARKER_READ);
		assertEquals(Collections.emptySet(), getImpliedGrants(markerTypeDefs, ACCESS_TYPE_MARKER_UPDATE), "impliedGrants in " + ACCESS_TYPE_MARKER_UPDATE);
		assertEquals(Collections.emptySet(), getImpliedGrants(markerTypeDefs, ACCESS_TYPE_MARKER_DELETE), "impliedGrants in " + ACCESS_TYPE_MARKER_DELETE);
		assertEquals(Collections.emptySet(), getImpliedGrants(markerTypeDefs, ACCESS_TYPE_MARKER_MANAGE), "impliedGrants in " + ACCESS_TYPE_MARKER_MANAGE);
		assertEquals(toSet(execute.getName()), getImpliedGrants(markerTypeDefs, ACCESS_TYPE_MARKER_ALL), "impliedGrants in " + ACCESS_TYPE_MARKER_ALL);
	}

	private Set<String> getImpliedGrants(List<RangerAccessTypeDef> accessTypeDefs, String accessType) {
		Set<String> ret = null;

		if (accessTypeDefs != null) {
			for (RangerAccessTypeDef accessTypeDef : accessTypeDefs) {
				if (StringUtils.equals(accessTypeDef.getName(), accessType)) {
					ret = new HashSet<>(accessTypeDef.getImpliedGrants());

					break;
				}
			}
		}

		return ret;
	}

	private Set<String> toSet(String...values) {
		Set<String> ret = new HashSet<>();

		if (values != null) {
			for (String value : values) {
				ret.add(value);
			}
		}

		return ret;
	}
	public void testPolicyItemDataMaskExprUserGroupRef() {
		for (String attrExpr : UGA_ATTR_EXPRESSIONS) {
			String          filterExpr  = "${{" + attrExpr + "}}";
			ServicePolicies svcPolicies = getServicePolicies();
			RangerPolicy    policy      = getPolicy(svcPolicies);

			policy.getDataMaskPolicyItems().get(0).setDataMaskInfo(new RangerPolicyItemDataMaskInfo("CUSTOM", "", "CASE WHEN dept in (" + filterExpr + ")THEN {col} ELSE '0' END"));

			svcPolicies.getPolicies().add(policy);
			assertTrue(ServiceDefUtil.addUserStoreEnricherIfNeeded(svcPolicies, RangerAdminUserStoreRetriever.class.getCanonicalName(), "60000"), "policy data-mask refers to user/group attribute: " + filterExpr);

			svcPolicies.getServiceDef().getContextEnrichers().clear();
			svcPolicies.getPolicies().clear();
			svcPolicies.getPolicyDeltas().add(new RangerPolicyDelta(1L, RangerPolicyDelta.CHANGE_TYPE_POLICY_CREATE,  1L, policy));
			assertTrue(ServiceDefUtil.addUserStoreEnricherIfNeeded(svcPolicies, RangerAdminUserStoreRetriever.class.getCanonicalName(), "60000"), "policy-delta data-mask refers to user/group attribute: " + filterExpr);

			svcPolicies.getServiceDef().getContextEnrichers().clear();
			svcPolicies.getPolicyDeltas().clear();
			svcPolicies.getSecurityZones().put("zone1", getSecurityZoneInfo("zone1"));
			svcPolicies.getSecurityZones().get("zone1").getPolicies().add(policy);
			assertTrue(ServiceDefUtil.addUserStoreEnricherIfNeeded(svcPolicies, RangerAdminUserStoreRetriever.class.getCanonicalName(), "60000"), "zone-policy data-mask refers to user/group attribute: " + filterExpr);

			svcPolicies.getServiceDef().getContextEnrichers().clear();
			svcPolicies.getSecurityZones().get("zone1").getPolicies().clear();
			svcPolicies.getSecurityZones().get("zone1").getPolicyDeltas().add(new RangerPolicyDelta(1L, RangerPolicyDelta.CHANGE_TYPE_POLICY_CREATE,  1L, policy));
			assertTrue(ServiceDefUtil.addUserStoreEnricherIfNeeded(svcPolicies, RangerAdminUserStoreRetriever.class.getCanonicalName(), "60000"), "zone-policy-delta data-mask refers to user/group attribute: " + filterExpr);
		}
	}

	private ServicePolicies getServicePolicies() {
		ServicePolicies ret = new ServicePolicies();

		ret.setServiceName("dev_hive");
		ret.setServiceId(1L);
		ret.setPolicyVersion(1L);
		ret.setServiceDef(getServiceDef("hive"));
		ret.setPolicies(new ArrayList<>());
		ret.setPolicyDeltas(new ArrayList<>());
		ret.setSecurityZones(new HashMap<>());

		ret.setTagPolicies(new ServicePolicies.TagPolicies());
		ret.getTagPolicies().setServiceDef(getServiceDef("tag"));
		ret.getTagPolicies().setPolicies(new ArrayList<>());

		return ret;
	}

	private RangerServiceDef getServiceDef(String serviceType) {
		RangerServiceDef ret = null;

		try {
			RangerServiceDef serviceDef = EmbeddedServiceDefsUtil.instance().getEmbeddedServiceDef(serviceType);

			if (serviceDef != null) { // make a copy
				ret = new RangerServiceDef();

				ret.updateFrom(serviceDef);
			}
		} catch (Exception excp) {
			// ignore
		}

		return ret;
	}

	private RangerPolicy getPolicy(ServicePolicies svcPolicies) {
		RangerPolicy ret = new RangerPolicy();

		ret.setConditions(new ArrayList<>());

		ret.setService(svcPolicies.getServiceName());
		ret.setServiceType(svcPolicies.getServiceDef().getName());
		ret.setResource("database", new RangerPolicyResource("testdb"));
		ret.addCondition(new RangerPolicyItemCondition("expr", Collections.singletonList("TAG.attr1 == 'value1'")));
		ret.addPolicyItem(getPolicyItem());
		ret.addAllowException(getPolicyItem());
		ret.addDenyPolicyItem(getPolicyItem());
		ret.addDenyException(getPolicyItem());
		ret.addDataMaskPolicyItem(getDataMaskPolicyItem());
		ret.addRowFilterPolicyItem(getRowFilterPolicyItem());

		return ret;
	}

	private RangerPolicyItem getPolicyItem() {
		RangerPolicyItem ret = new RangerPolicyItem();

		ret.addUser("testUser");
		ret.addGroup("testGroup");
		ret.addRole("testRole");
		ret.addCondition(new RangerPolicyItemCondition("expr", Collections.singletonList("TAG.attr1 == 'value1'")));

		return ret;
	}

	private RangerDataMaskPolicyItem getDataMaskPolicyItem() {
		RangerDataMaskPolicyItem ret = new RangerDataMaskPolicyItem();

		ret.addUser("testUser");
		ret.addGroup("testGroup");
		ret.addRole("testRole");
		ret.addCondition(new RangerPolicyItemCondition("expr", Collections.singletonList("TAG.attr1 == 'value1'")));
		ret.setDataMaskInfo(new RangerPolicyItemDataMaskInfo("MASK_NULL", null, null));

		return ret;
	}

	private RangerRowFilterPolicyItem getRowFilterPolicyItem() {
		RangerRowFilterPolicyItem ret = new RangerRowFilterPolicyItem();

		ret.addUser("testUser");
		ret.addGroup("testGroup");
		ret.addRole("testRole");
		ret.addCondition(new RangerPolicyItemCondition("expr", Collections.singletonList("TAG.attr1 == 'value1'")));
		ret.setRowFilterInfo(new RangerPolicyItemRowFilterInfo("dept in ('dept1','dept2')"));

		return ret;
	}

	private SecurityZoneInfo getSecurityZoneInfo(String zoneName) {
		SecurityZoneInfo ret = new SecurityZoneInfo();

		ret.setZoneName(zoneName);
		ret.setPolicies(new ArrayList<>());
		ret.setPolicyDeltas(new ArrayList<>());

		return ret;
	}
}
