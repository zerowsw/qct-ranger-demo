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

package org.apache.ranger.tagsync.process;

import java.util.HashMap;
import java.util.Map;

import org.apache.ranger.plugin.model.RangerServiceResource;
import org.apache.ranger.tagsync.source.atlas.AtlasKafkaResourceMapper;
import org.apache.ranger.tagsync.source.atlasrest.RangerAtlasEntity;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class TestKafkaResourceMapper {
    private static final String CLUSTER_NAME    = "cl1";
    private static final String TOPIC           = "kafka-topic";
    private static final String QUALIFIED_NAME  = "kafka-topic@cl1";

    private static final String SERVICE_NAME    = "cl1_kafka";
    private static final String RANGER_TOPIC    = "kafka-topic";

    AtlasKafkaResourceMapper resourceMapper = new AtlasKafkaResourceMapper();

    @Test
    public void testKafkaResourceFromQualifiedName() throws Exception {
        Map<String, Object> entAttribs = new HashMap<String, Object>();

        entAttribs.put(AtlasKafkaResourceMapper.ENTITY_ATTRIBUTE_QUALIFIED_NAME, QUALIFIED_NAME);

        RangerAtlasEntity entity   = getKafkaTopicEntity(entAttribs);
        RangerServiceResource  resource = resourceMapper.buildResource(entity);

        assertServiceResource(resource);
    }

    @Test
    public void testKafkaResourceFromOnlyTopic() throws Exception {
        Map<String, Object> entAttribs = new HashMap<String, Object>();

        entAttribs.put(AtlasKafkaResourceMapper.ENTITY_ATTRIBUTE_QUALIFIED_NAME, TOPIC);

        RangerAtlasEntity entity   = getKafkaTopicEntity(entAttribs);

        try {
            RangerServiceResource resource = resourceMapper.buildResource(entity);

            Assertions.fail("expected exception. Found " + resource);
        } catch(Exception excp) {
            // ignore
        }
    }

    @Test
    public void testKafkaResourceFromOnlyClusterName() throws Exception {
        Map<String, Object> entAttribs = new HashMap<String, Object>();

        entAttribs.put(AtlasKafkaResourceMapper.ENTITY_ATTRIBUTE_QUALIFIED_NAME, CLUSTER_NAME);

        RangerAtlasEntity entity   = getKafkaTopicEntity(entAttribs);

        try {
            RangerServiceResource resource = resourceMapper.buildResource(entity);

            Assertions.fail("expected exception. Found " + resource);
        } catch(Exception excp) {
            // ignore
        }
    }

    @Test
    public void testKafkaResourceFromMissingAttribs() throws Exception {
        Map<String, Object> entAttribs = new HashMap<String, Object>();

        RangerAtlasEntity entity  = getKafkaTopicEntity(entAttribs);

        try {
            RangerServiceResource resource = resourceMapper.buildResource(entity);

            Assertions.fail("expected exception. Found " + resource);
        } catch(Exception excp) {
            // ignore
        }
    }

    private RangerAtlasEntity getKafkaTopicEntity(Map<String, Object> entAttribs) throws Exception {
        RangerAtlasEntity entity = Mockito.mock(RangerAtlasEntity.class);

        Mockito.when(entity.getTypeName()).thenReturn(AtlasKafkaResourceMapper.ENTITY_TYPE_KAFKA_TOPIC);
        Mockito.when(entity.getAttributes()).thenReturn(entAttribs);

        return entity;
    }

    private void assertServiceResource(RangerServiceResource resource) {
        Assertions.assertNotNull(resource);
        Assertions.assertEquals(SERVICE_NAME, resource.getServiceName());
        Assertions.assertNotNull(resource.getResourceElements());
        Assertions.assertEquals(1, resource.getResourceElements().size());
        Assertions.assertTrue(resource.getResourceElements().containsKey(AtlasKafkaResourceMapper.RANGER_TYPE_KAFKA_TOPIC));
        Assertions.assertNotNull(resource.getResourceElements().get(AtlasKafkaResourceMapper.RANGER_TYPE_KAFKA_TOPIC).getValues());
        Assertions.assertEquals(1, resource.getResourceElements().get(AtlasKafkaResourceMapper.RANGER_TYPE_KAFKA_TOPIC).getValues().size());
        Assertions.assertEquals(RANGER_TOPIC, resource.getResourceElements().get(AtlasKafkaResourceMapper.RANGER_TYPE_KAFKA_TOPIC).getValues().get(0));
    }
}
