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

package org.apache.ranger.rest;

import java.util.LinkedHashMap;
import java.util.Map;
import org.apache.ranger.plugin.model.RangerMetrics;
import org.apache.ranger.util.RangerMetricsUtil;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.MethodOrderer.MethodName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
@TestMethodOrder(MethodName.class)
public class TestMetricsREST {
    @InjectMocks
    MetricsREST metricsREST = new MetricsREST();

    @Mock
    RangerMetricsUtil jvmMetricUtil;


    @Test
    public void testGetStatus() throws Exception {
        Map<String, Object> rangerMetricsValues = getRangerMetricsValues();

        Mockito.when(jvmMetricUtil.getValues()).thenReturn(rangerMetricsValues);

        RangerMetrics rangerMetrics = metricsREST.getStatus();

        Assertions.assertNotNull(rangerMetrics);
        Assertions.assertNotNull(rangerMetrics.getData());
        Assertions.assertNotNull(rangerMetrics.getData().get("jvm"));

        Map<String, Object> jvmMetricsMap = (Map<String, Object>)rangerMetrics.getData().get("jvm");

        Assertions.assertNotNull(jvmMetricsMap.get("JVM Machine Actual Name"));
        Assertions.assertNotNull(jvmMetricsMap.get("version"));
        Assertions.assertNotNull(jvmMetricsMap.get("JVM Vendor Name"));
        Assertions.assertEquals("Mac OS X, x86_64, 12.6.3", jvmMetricsMap.get("os.spec"));
        Assertions.assertEquals("8", jvmMetricsMap.get("os.vcpus"));
        Assertions.assertNotNull(jvmMetricsMap.get("memory"));

        Map<String, Object> memoryDetailsMap = (Map<String, Object>)jvmMetricsMap.get("memory");

        Assertions.assertEquals("7635730432", memoryDetailsMap.get("heapMax"));
        Assertions.assertEquals("40424768", memoryDetailsMap.get("heapUsed"));
    }


    private Map<String, Object> getRangerMetricsValues() {
        Map<String, Object>  rangerMetricsMap = new LinkedHashMap<>();
        rangerMetricsMap.put("os.spec", "Mac OS X, x86_64, 12.6.3");
        rangerMetricsMap.put("os.vcpus", "8");

        Map<String, Object> memoryDetailsMap  = new LinkedHashMap<>();
        memoryDetailsMap.put("heapMax", String.valueOf(7635730432L));
        memoryDetailsMap.put("heapCommitted", String.valueOf(514850816L));
        memoryDetailsMap.put("heapUsed", String.valueOf(40424768L));
        rangerMetricsMap.put("memory", memoryDetailsMap);

        return rangerMetricsMap;
    }
}
