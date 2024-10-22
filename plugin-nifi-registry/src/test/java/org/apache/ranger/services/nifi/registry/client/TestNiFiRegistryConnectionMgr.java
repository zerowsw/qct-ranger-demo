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
package org.apache.ranger.services.nifi.registry.client;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class TestNiFiRegistryConnectionMgr {

    @Test
    public void testValidURLWithWrongEndPoint() throws Exception {
		assertThrows(IllegalArgumentException.class, () -> {
        final String nifiRegistryUrl = "http://localhost:18080/nifi-registry";

        Map<String,String> configs = new HashMap<>();
        configs.put(NiFiRegistryConfigs.NIFI_REG_URL, nifiRegistryUrl);
        configs.put(NiFiRegistryConfigs.NIFI_REG_AUTHENTICATION_TYPE, NiFiRegistryAuthType.NONE.name());

        NiFiRegistryConnectionMgr.getNiFiRegistryClient("nifi-registry", configs);
		});
    }

    @Test
    public void testInvalidURL() throws Exception {
		assertThrows(IllegalArgumentException.class, () -> {
        final String nifiRegistryUrl = "not a url";

        Map<String,String> configs = new HashMap<>();
        configs.put(NiFiRegistryConfigs.NIFI_REG_URL, nifiRegistryUrl);
        configs.put(NiFiRegistryConfigs.NIFI_REG_AUTHENTICATION_TYPE, NiFiRegistryAuthType.NONE.name());

        NiFiRegistryConnectionMgr.getNiFiRegistryClient("nifi-registry", configs);
		});
    }

    @Test
    public void testAuthTypeNone() throws Exception {
        final String nifiRegistryUrl = "http://localhost:18080/nifi-registry-api/policies/resources";

        Map<String,String> configs = new HashMap<>();
        configs.put(NiFiRegistryConfigs.NIFI_REG_URL, nifiRegistryUrl);
        configs.put(NiFiRegistryConfigs.NIFI_REG_AUTHENTICATION_TYPE, NiFiRegistryAuthType.NONE.name());

        NiFiRegistryClient client = NiFiRegistryConnectionMgr.getNiFiRegistryClient("nifi", configs);
        Assertions.assertNotNull(client);
        Assertions.assertEquals(nifiRegistryUrl, client.getUrl());
        Assertions.assertNull(client.getSslContext());
    }

    @Test
    public void testAuthTypeNoneMissingURL() throws Exception {
		assertThrows(IllegalArgumentException.class, () -> {
        Map<String,String> configs = new HashMap<>();
        configs.put(NiFiRegistryConfigs.NIFI_REG_URL, null);
        configs.put(NiFiRegistryConfigs.NIFI_REG_AUTHENTICATION_TYPE, NiFiRegistryAuthType.NONE.name());

        NiFiRegistryConnectionMgr.getNiFiRegistryClient("nifi-registry", configs);
		});
    }

    @Test
    public void testAuthTypeSSL() throws Exception {
		assertThrows(FileNotFoundException.class, () -> {
        final String nifiRegistryUrl = "https://localhost:18080/nifi-registry-api/policies/resources";

        Map<String,String> configs = new HashMap<>();
        configs.put(NiFiRegistryConfigs.NIFI_REG_URL, nifiRegistryUrl);
        configs.put(NiFiRegistryConfigs.NIFI_REG_AUTHENTICATION_TYPE, NiFiRegistryAuthType.SSL.name());

        configs.put(NiFiRegistryConfigs.NIFI_REG_SSL_KEYSTORE, "src/test/resources/missing.jks");
        configs.put(NiFiRegistryConfigs.NIFI_REG_SSL_KEYSTORE_PASSWORD, "password");
        configs.put(NiFiRegistryConfigs.NIFI_REG_SSL_KEYSTORE_TYPE, "JKS");

        configs.put(NiFiRegistryConfigs.NIFI_REG_SSL_TRUSTSTORE, "src/test/resources/missing.jks");
        configs.put(NiFiRegistryConfigs.NIFI_REG_SSL_TRUSTSTORE_PASSWORD, "password");
        configs.put(NiFiRegistryConfigs.NIFI_REG_SSL_TRUSTSTORE_TYPE, "JKS");

        NiFiRegistryConnectionMgr.getNiFiRegistryClient("nifi-registry", configs);
		});
    }

    @Test
    public void testAuthTypeSSLWithNonHttpsUrl() throws Exception {
		assertThrows(IllegalArgumentException.class, () -> {
        final String nifiRegistryUrl = "http://localhost:18080/nifi-registry-api/policies/resources";

        Map<String,String> configs = new HashMap<>();
        configs.put(NiFiRegistryConfigs.NIFI_REG_URL, nifiRegistryUrl);
        configs.put(NiFiRegistryConfigs.NIFI_REG_AUTHENTICATION_TYPE, NiFiRegistryAuthType.SSL.name());

        configs.put(NiFiRegistryConfigs.NIFI_REG_SSL_KEYSTORE, "src/test/resources/missing.jks");
        configs.put(NiFiRegistryConfigs.NIFI_REG_SSL_KEYSTORE_PASSWORD, "password");
        configs.put(NiFiRegistryConfigs.NIFI_REG_SSL_KEYSTORE_TYPE, "JKS");

        configs.put(NiFiRegistryConfigs.NIFI_REG_SSL_TRUSTSTORE, "src/test/resources/missing.jks");
        configs.put(NiFiRegistryConfigs.NIFI_REG_SSL_TRUSTSTORE_PASSWORD, "password");
        configs.put(NiFiRegistryConfigs.NIFI_REG_SSL_TRUSTSTORE_TYPE, "JKS");

        NiFiRegistryConnectionMgr.getNiFiRegistryClient("nifi-registry", configs);
		});
    }

    @Test
    public void testAuthTypeSSLMissingConfigs() throws Exception {
		assertThrows(IllegalArgumentException.class, () -> {
        final String nifiRegistryUrl = "http://localhost:18080/nifi-registry";

        Map<String,String> configs = new HashMap<>();
        configs.put(NiFiRegistryConfigs.NIFI_REG_URL, nifiRegistryUrl);
        configs.put(NiFiRegistryConfigs.NIFI_REG_AUTHENTICATION_TYPE, NiFiRegistryAuthType.SSL.name());

        NiFiRegistryConnectionMgr.getNiFiRegistryClient("nifi-registry", configs);
		});
    }

}
