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

package org.apache.ranger.authorization.utils;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.ranger.plugin.model.RangerPolicy.RangerPolicyResource;
import org.apache.ranger.plugin.model.RangerSecurityZone;
import org.apache.ranger.plugin.model.RangerSecurityZone.RangerSecurityZoneService;
import org.apache.ranger.plugin.util.RangerSecurityZoneHelper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class TestStringUtil {
    @Test
    public void testDedupString() {
        Map<String, String> strTbl = new HashMap<>();
        String              s1     = getString("database");
        String              s2     = getString("database");

        // s1 and s2 point to different instances of String
        Assertions.assertNotSame(s1, s2, "s1 != s2");

        // strTbl doesn't have s1; dedupString(s1) should return s1
        Assertions.assertSame(s1, StringUtil.dedupString(s1, strTbl), "s1 == dedupString(s1)");

        // strTbl now has s1; s2 has same value as s1, hence dedupString() should return s1
        Assertions.assertSame(s1, StringUtil.dedupString(s2, strTbl), "s1 == dedupString(s2)");
    }

    @Test
    public void testDedupStringsList() {
        Map<String, String> strTbl = new HashMap<>();
        List<String>        l1     = null;

        Assertions.assertSame(l1, StringUtil.dedupStringsList(l1, strTbl), "null list - dedupStringsList() should return the same list");

        l1 = Collections.emptyList();
        Assertions.assertSame(l1, StringUtil.dedupStringsList(l1, strTbl), "empty list - dedupStringsList() should return the same list");

        l1 = new ArrayList<>();
        Assertions.assertSame(l1, StringUtil.dedupStringsList(l1, strTbl), "empty list - dedupStringsList() should return the same list");

        l1 = new ArrayList<String>() {{ add(getString("*")); }};
        Assertions.assertNotSame(l1, StringUtil.dedupStringsList(l1, strTbl), "non-empty list - dedupStringsList() should return a new list");

        l1 = new ArrayList<String>() {{ add(getString("*")); add(getString("db1")); }};
        Assertions.assertNotSame(l1, StringUtil.dedupStringsList(l1, strTbl), "non-empty list - dedupStringsList() should return a new list");

        List<String> l2 = new ArrayList<String>() {{ add(getString("*")); add(getString("db1")); }};

        for (int i = 0; i < l1.size(); i++) {
            Assertions.assertNotSame(l1.get(i), l2.get(i), "Before dedupStringsList(): l1[" + i + "] == l2[" + i + "]");
        }

        l1 = StringUtil.dedupStringsList(l1, strTbl);
        l2 = StringUtil.dedupStringsList(l2, strTbl);

        for (int i = 0; i < l1.size(); i++) {
            Assertions.assertSame(l1.get(i), l2.get(i), "After dedupStringsList(): l1[" + i + "] == l2[" + i + "]");
        }
    }

    @Test
    public void testDedupStringsSet() {
        Map<String, String> strTbl = new HashMap<>();
        Set<String>         s1     = null;

        Assertions.assertSame(s1, StringUtil.dedupStringsSet(s1, strTbl), "null set - dedupStringsList() should return the same set");

        s1 = Collections.emptySet();
        Assertions.assertSame(s1, StringUtil.dedupStringsSet(s1, strTbl), "empty set - dedupStringsSet() should return the same set");

        s1 = new HashSet<>();
        Assertions.assertSame(s1, StringUtil.dedupStringsSet(s1, strTbl), "empty set - dedupStringsSet() should return the same set");

        s1 = new HashSet<String>() {{ add(getString("*")); }};
        Assertions.assertNotSame(s1, StringUtil.dedupStringsSet(s1, strTbl), "non-empty set - dedupStringsSet() should return a new set");

        s1 = new HashSet<String>() {{ add(getString("*")); add(getString("db1")); }};
        Assertions.assertNotSame(s1, StringUtil.dedupStringsSet(s1, strTbl), "non-empty set - dedupStringsSet() should return a new set");

        Set<String> s2 = new HashSet<String>() {{ add(getString("*")); add(getString("db1")); }};

        for (String elem : s1) {
            Assertions.assertFalse(containsInstance(s2, elem), "Before dedupStringsSet(): s1[" + elem + "] == s2[" + elem + "]");
        }

        s1 = StringUtil.dedupStringsSet(s1, strTbl);
        s2 = StringUtil.dedupStringsSet(s2, strTbl);

        for (String elem : s1) {
            Assertions.assertTrue(containsInstance(s2, elem), "After dedupStringsSet(): s1[" + elem + "] == s2[" + elem + "]");
        }
    }

    @Test
    public void testDedupStringsMap() {
        Map<String, String> strTbl = new HashMap<>();
        Map<String, String> m1     = null;

        Assertions.assertSame(m1, StringUtil.dedupStringsMap(m1, strTbl), "null map - dedupStringsMap() should return the same map");

        m1 = Collections.emptyMap();
        Assertions.assertSame(m1, StringUtil.dedupStringsMap(m1, strTbl), "empty map - dedupStringsMap() should return the same map");

        m1 = new HashMap<>();
        Assertions.assertSame(m1, StringUtil.dedupStringsMap(m1, strTbl), "empty map - dedupStringsMap() should return the same map");

        m1 = new HashMap<String, String>() {{ put(getString("database"), getString("*")); }};
        Assertions.assertNotSame(m1, StringUtil.dedupStringsMap(m1, strTbl), "non-empty map - dedupStringsMap() should return a new map");

        Map<String, String> m2 = new HashMap<String, String>() {{ put(getString("database"), getString("*")); }};

        for (Map.Entry<String, String> entry : m1.entrySet()) {
            String key = entry.getKey();

            Assertions.assertFalse(containsInstance(m2.keySet(), key), "Before dedupStringsMap(): m2 has same key as m1");
            Assertions.assertNotSame(m1.get(key), m2.get(key), "Before dedupStringsMap(): m1[" + key + "] == l2[" + key + "]");
        }

        m1 = StringUtil.dedupStringsMap(m1, strTbl);
        m2 = StringUtil.dedupStringsMap(m2, strTbl);

        for (Map.Entry<String, String> entry : m1.entrySet()) {
            String key = entry.getKey();

            Assertions.assertTrue(containsInstance(m2.keySet(), key), "After dedupStringsMap(): m2 has same key as m1");
            Assertions.assertSame(m1.get(key), m2.get(key), "After dedupStringsMap(): m1[" + key + "] == l2[" + key + "]");
        }
    }

    @Test
    public void testDedupMapOfPolicyResource() {
        Map<String, String>               strTbl = new HashMap<>();
        Map<String, RangerPolicyResource> m1     = null;

        Assertions.assertSame(m1, StringUtil.dedupStringsMapOfPolicyResource(m1, strTbl), "null map - dedupStringsMapOfPolicyResource() should return the same map");

        m1 = Collections.emptyMap();
        Assertions.assertSame(m1, StringUtil.dedupStringsMapOfPolicyResource(m1, strTbl), "empty map - dedupStringsMapOfPolicyResource() should return the same map");

        m1 = new HashMap<>();
        Assertions.assertSame(m1, StringUtil.dedupStringsMapOfPolicyResource(m1, strTbl), "empty map - dedupStringsMapOfPolicyResource() should return the same map");

        m1 = new HashMap<String, RangerPolicyResource>() {{ put(getString("database"), new RangerPolicyResource(getString("db1"))); put(getString("table"), new RangerPolicyResource(getString("*"))); }};
        Assertions.assertNotSame(m1, StringUtil.dedupStringsMapOfPolicyResource(m1, strTbl), "non-empty map - dedupStringsMapOfPolicyResource() should return a new map");

        Map<String, RangerPolicyResource> m2 = new HashMap<String, RangerPolicyResource>() {{ put(getString("database"), new RangerPolicyResource(getString("db1"))); put(getString("table"), new RangerPolicyResource(getString("*"))); }};

        for (Map.Entry<String, RangerPolicyResource> entry : m1.entrySet()) {
            String               key    = entry.getKey();
            RangerPolicyResource value1 = entry.getValue();
            RangerPolicyResource value2 = m2.get(key);

            Assertions.assertFalse(containsInstance(m2.keySet(), key), "Before dedupStringsMapOfPolicyResource(): m2 has same key as m1");

            for (String value : value1.getValues()) {
                Assertions.assertFalse(containsInstance(value2.getValues(), value), "Before dedupStringsMapOfPolicyResource(): m2.values not same values as m1.values for " + value);
            }
        }

        m1 = StringUtil.dedupStringsMapOfPolicyResource(m1, strTbl);
        m2 = StringUtil.dedupStringsMapOfPolicyResource(m2, strTbl);

        for (Map.Entry<String, RangerPolicyResource> entry : m1.entrySet()) {
            String               key    = entry.getKey();
            RangerPolicyResource value1 = entry.getValue();
            RangerPolicyResource value2 = m2.get(key);

            Assertions.assertTrue(containsInstance(m2.keySet(), key), "After dedupStringsMapOfPolicyResource(): m2 has same key as m1");

            for (String value : value1.getValues()) {
                Assertions.assertTrue(containsInstance(value2.getValues(), value), "After dedupStringsMapOfPolicyResource(): m2.values has same values as m1.values for " + value);
            }
        }
    }

    @Test
    public void testJsonCompression() throws IOException {
        int[] sizeFactors = new int[] { 1, 10, 50, 100, 250, 300, 400, 500 };

        for (int sizeFactor : sizeFactors) {
            RangerSecurityZone zone         = generateLargeSecurityZone(sizeFactor);
            String             json         = JsonUtils.objectToJson(zone);
            String             compressed   = StringUtil.compressString(json);
            String             deCompressed = StringUtil.decompressString(compressed);

            System.out.println("%d: resourceCount=%d: len(json)=%,d, len(compressed)=%,d, savings=(%,d == %.03f%%)".formatted(sizeFactor, getResourceCount(zone), json.length(), compressed.length(), (json.length() - compressed.length()), ((json.length() - compressed.length()) / (float) json.length()) * 100));

            Assertions.assertTrue(compressed.length() < deCompressed.length());

            Assertions.assertEquals(json, deCompressed);
        }
    }

    private boolean containsInstance(Collection<String> coll, String key) {
        boolean ret = false;

        if (coll != null) {
            for (String elem : coll) {
                if (elem == key) {
                    ret = true;

                    break;
                }
            }
        }

        return ret;
    }

    private String getString(String str) {
        return str == null ? str : new String(str);
    }

    private RangerSecurityZone generateLargeSecurityZone(int sizeFactor) {
        RangerSecurityZone zone          = new RangerSecurityZone();
        int                svcCount      = sizeFactor;
        int                resourceCount = sizeFactor;
        int                resNameLen    = (sizeFactor / 10) + 1;

        zone.setName("test-zone");
        zone.setDescription("this is a test zone");
        zone.setTagServices(generateStrings("tag-service-", 25, 1));
        zone.setAdminUsers(generateStrings("admin-", 20, 10));
        zone.setAdminUserGroups(generateStrings("admin-group-", 20, 5));
        zone.setAdminRoles(generateStrings("admin-role-", 20, 5));
        zone.setAuditUsers(generateStrings("audit-", 20, 10));
        zone.setAuditUserGroups(generateStrings("audit-group-", 20, 5));
        zone.setAuditRoles(generateStrings("audit-role-", 20, 5));

        for (int i = 0; i < svcCount; i++) {
            RangerSecurityZoneService svc = new RangerSecurityZoneService();

            for (int j = 0; j < resourceCount; j++) {
                HashMap<String, List<String>> resource = new HashMap<>();

                resource.put("database", generateStrings("db-", resNameLen, 1));
                resource.put("table", generateStrings("tbl-", resNameLen, 2));
                resource.put("column", generateStrings("col-", resNameLen, 3));

                svc.getResources().add(resource);
            }

            zone.getServices().put("service-" + i, svc);
        }

        return new RangerSecurityZoneHelper(zone, "testUser").getZone(); // add resourcesBaseInfo
    }

    private int getResourceCount(RangerSecurityZone zone) {
        int ret = 0;

        for (RangerSecurityZone.RangerSecurityZoneService svc : zone.getServices().values()) {
            ret += svc.getResources().size();
        }

        return ret;
    }

    private List<String> generateStrings(String prefix, int maxLen, int count) {
        List<String> ret = new ArrayList<>(count);

        for (int i = 0; i < count; i++) {
            ret.add(generateResourceName(prefix, maxLen));
        }

        return ret;
    }

    private String generateResourceName(String prefix, int maxLen) {
        return prefix.length() < maxLen ? (prefix + RandomStringUtils.random(maxLen - prefix.length(), true, true)) : prefix;
    }
}
