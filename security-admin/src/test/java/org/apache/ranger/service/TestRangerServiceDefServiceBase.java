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
package org.apache.ranger.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import jakarta.ws.rs.WebApplicationException;

import org.apache.ranger.biz.RangerBizUtil;
import org.apache.ranger.common.ContextUtil;
import org.apache.ranger.common.GUIDUtil;
import org.apache.ranger.common.JSONUtil;
import org.apache.ranger.common.MessageEnums;
import org.apache.ranger.common.RESTErrorUtil;
import org.apache.ranger.common.RangerSearchUtil;
import org.apache.ranger.common.UserSessionBase;
import org.apache.ranger.common.db.BaseDao;
import org.apache.ranger.db.RangerDaoManager;
import org.apache.ranger.db.XXEnumElementDefDao;
import org.apache.ranger.db.XXResourceDefDao;
import org.apache.ranger.entity.XXAccessTypeDef;
import org.apache.ranger.entity.XXContextEnricherDef;
import org.apache.ranger.entity.XXEnumDef;
import org.apache.ranger.entity.XXEnumElementDef;
import org.apache.ranger.entity.XXPolicyConditionDef;
import org.apache.ranger.entity.XXResourceDef;
import org.apache.ranger.entity.XXServiceConfigDef;
import org.apache.ranger.entity.XXServiceDef;
import org.apache.ranger.plugin.model.RangerServiceDef;
import org.apache.ranger.plugin.model.RangerServiceDef.RangerAccessTypeDef;
import org.apache.ranger.plugin.model.RangerServiceDef.RangerContextEnricherDef;
import org.apache.ranger.plugin.model.RangerServiceDef.RangerEnumDef;
import org.apache.ranger.plugin.model.RangerServiceDef.RangerEnumElementDef;
import org.apache.ranger.plugin.model.RangerServiceDef.RangerPolicyConditionDef;
import org.apache.ranger.plugin.model.RangerServiceDef.RangerResourceDef;
import org.apache.ranger.plugin.model.RangerServiceDef.RangerServiceConfigDef;
import org.apache.ranger.plugin.util.SearchFilter;
import org.apache.ranger.security.context.RangerContextHolder;
import org.apache.ranger.security.context.RangerSecurityContext;
import org.apache.ranger.view.RangerServiceDefList;

import static org.junit.jupiter.api.Assertions.assertThrows;
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
public class TestRangerServiceDefServiceBase {

	private static Long Id = 8L;

	@InjectMocks
	RangerServiceDefService rangerServiceDefService = new RangerServiceDefService();

	@Mock
	RangerDaoManager daoManager;

	@Mock
	RESTErrorUtil restErrorUtil;

	@Mock
	ContextUtil contextUtil;

	@Mock
	RangerAuditFields rangerAuditFields;

	@Mock
	RangerBizUtil rangerBizUtil;

	@Mock
	RangerSearchUtil searchUtil;
	
	@Mock
	GUIDUtil guidUtil;
	
	@Mock
	JSONUtil jsonUtil;

	@Mock
	BaseDao<XXServiceDef> baseDao;

	public void setup() {
		RangerSecurityContext context = new RangerSecurityContext();
		context.setUserSession(new UserSessionBase());
		RangerContextHolder.setSecurityContext(context);
		UserSessionBase currentUserSession = ContextUtil
				.getCurrentUserSession();
		currentUserSession.setUserAdmin(true);
	}

	private RangerServiceDef rangerServiceDef() {
		List<RangerServiceConfigDef> configs = new ArrayList<RangerServiceConfigDef>();
		List<RangerResourceDef> resources = new ArrayList<RangerResourceDef>();
		List<RangerAccessTypeDef> accessTypes = new ArrayList<RangerAccessTypeDef>();
		List<RangerPolicyConditionDef> policyConditions = new ArrayList<RangerPolicyConditionDef>();
		List<RangerContextEnricherDef> contextEnrichers = new ArrayList<RangerContextEnricherDef>();
		List<RangerEnumDef> enums = new ArrayList<RangerEnumDef>();

		RangerServiceDef rangerServiceDef = new RangerServiceDef();
		rangerServiceDef.setId(Id);
		rangerServiceDef.setImplClass("RangerServiceHdfs");
		rangerServiceDef.setLabel("HDFS Repository");
		rangerServiceDef.setDescription("HDFS Repository");
		rangerServiceDef.setRbKeyDescription(null);
		rangerServiceDef.setUpdatedBy("Admin");
		rangerServiceDef.setUpdateTime(new Date());
		rangerServiceDef.setConfigs(configs);
		rangerServiceDef.setResources(resources);
		rangerServiceDef.setAccessTypes(accessTypes);
		rangerServiceDef.setPolicyConditions(policyConditions);
		rangerServiceDef.setContextEnrichers(contextEnrichers);
		rangerServiceDef.setEnums(enums);

		return rangerServiceDef;
	}

	private XXServiceDef serviceDef() {
		XXServiceDef xServiceDef = new XXServiceDef();
		xServiceDef.setAddedByUserId(Id);
		xServiceDef.setCreateTime(new Date());
		xServiceDef.setDescription("HDFS Repository");
		xServiceDef.setGuid("0d047247-bafe-4cf8-8e9b-d5d377284b2d");
		xServiceDef.setId(Id);
		xServiceDef.setImplclassname("RangerServiceHdfs");
		xServiceDef.setIsEnabled(true);
		xServiceDef.setLabel("HDFS Repository");
		xServiceDef.setName("hdfs");
		xServiceDef.setRbkeydescription(null);
		xServiceDef.setRbkeylabel(null);
		xServiceDef.setUpdatedByUserId(Id);
		xServiceDef.setUpdateTime(new Date());

		return xServiceDef;
	}

	@Test
	public void test1MapViewToEntityBean() {
		RangerServiceDef rangerServiceDef = rangerServiceDef();
		XXServiceDef serviceDef = serviceDef();
		int operationContext = 1;

		XXServiceDef dbServiceDef = rangerServiceDefService
				.mapViewToEntityBean(rangerServiceDef, serviceDef,
						operationContext);
		Assertions.assertNotNull(dbServiceDef);
		Assertions.assertEquals(dbServiceDef, serviceDef);
		Assertions.assertEquals(dbServiceDef.getDescription(),
				serviceDef.getDescription());
		Assertions.assertEquals(dbServiceDef.getGuid(), serviceDef.getGuid());
		Assertions.assertEquals(dbServiceDef.getName(), serviceDef.getName());
		Assertions.assertEquals(dbServiceDef.getAddedByUserId(),
				serviceDef.getAddedByUserId());
		Assertions.assertEquals(dbServiceDef.getId(), serviceDef.getId());
		Assertions.assertEquals(dbServiceDef.getVersion(), serviceDef.getVersion());
		Assertions.assertEquals(dbServiceDef.getImplclassname(),
				serviceDef.getImplclassname());
		Assertions.assertEquals(dbServiceDef.getUpdatedByUserId(),
				serviceDef.getUpdatedByUserId());
	}

	@Test
	public void test2MapEntityToViewBean() {
		RangerServiceDef rangerServiceDef = rangerServiceDef();
		XXServiceDef serviceDef = serviceDef();

		RangerServiceDef dbRangerServiceDef = rangerServiceDefService
				.mapEntityToViewBean(rangerServiceDef, serviceDef);
		Assertions.assertNotNull(dbRangerServiceDef);
		Assertions.assertEquals(dbRangerServiceDef, rangerServiceDef);
		Assertions.assertEquals(dbRangerServiceDef.getDescription(),
				rangerServiceDef.getDescription());
		Assertions.assertEquals(dbRangerServiceDef.getGuid(),
				rangerServiceDef.getGuid());
		Assertions.assertEquals(dbRangerServiceDef.getName(),
				rangerServiceDef.getName());
		Assertions.assertEquals(dbRangerServiceDef.getId(),
				rangerServiceDef.getId());
		Assertions.assertEquals(dbRangerServiceDef.getVersion(),
				rangerServiceDef.getVersion());

	}

	@Test
	public void test3populateRangerServiceConfigDefToXX() {
		RangerServiceConfigDef serviceConfigDefObj = new RangerServiceConfigDef();
		XXServiceConfigDef configDefObj = new XXServiceConfigDef();
		XXServiceDef serviceDefObj = new XXServiceDef();

		Mockito.when(
				(XXServiceConfigDef) rangerAuditFields.populateAuditFields(
						configDefObj, serviceDefObj)).thenReturn(configDefObj);

		XXServiceConfigDef dbServiceConfigDef = rangerServiceDefService
				.populateRangerServiceConfigDefToXX(serviceConfigDefObj,
						configDefObj, serviceDefObj, 1);
		Assertions.assertNotNull(dbServiceConfigDef);

	}

	@Test
	public void test4populateXXToRangerServiceConfigDef() {
		XXServiceConfigDef serviceConfigDefObj = new XXServiceConfigDef();

		RangerServiceConfigDef dbserviceConfigDefObj = rangerServiceDefService
				.populateXXToRangerServiceConfigDef(serviceConfigDefObj);
		Assertions.assertNotNull(dbserviceConfigDefObj);
	}

	@Test
	public void test5populateRangerResourceDefToXX() {
		RangerResourceDef rangerResourceDefObj = new RangerResourceDef();
		rangerResourceDefObj.setDescription("HDFS Repository");
		rangerResourceDefObj.setExcludesSupported(false);
		rangerResourceDefObj.setLabel("HDFS Repository");
		rangerResourceDefObj.setName("HDFs");

		XXResourceDef resourceDefObj = new XXResourceDef();
		resourceDefObj.setAddedByUserId(Id);
		resourceDefObj.setCreateTime(new Date());
		resourceDefObj.setDefid(Id);
		resourceDefObj.setDescription("HDFS Repository");
		resourceDefObj.setId(Id);

		XXServiceDef serviceDefObj = new XXServiceDef();
		serviceDefObj.setAddedByUserId(Id);
		serviceDefObj.setCreateTime(new Date());
		serviceDefObj.setDescription("HDFS Repository");
		serviceDefObj.setGuid("1427365526516_835_0");
		serviceDefObj.setId(Id);

		Mockito.when(
				(XXResourceDef) rangerAuditFields.populateAuditFields(
						resourceDefObj, serviceDefObj)).thenReturn(
				resourceDefObj);

		XXResourceDef dbResourceDef = rangerServiceDefService
				.populateRangerResourceDefToXX(rangerResourceDefObj,
						resourceDefObj, serviceDefObj, 1);
		Assertions.assertNotNull(dbResourceDef);
		Assertions.assertEquals(dbResourceDef, resourceDefObj);
		Assertions.assertEquals(dbResourceDef.getId(), resourceDefObj.getId());
		Assertions.assertEquals(dbResourceDef.getLabel(), resourceDefObj.getLabel());
		Assertions.assertEquals(dbResourceDef.getName(), resourceDefObj.getName());
		Assertions.assertEquals(dbResourceDef.getDescription(),
				resourceDefObj.getDescription());

	}

	@Test
	public void test6populateXXToRangerResourceDef() {
		XXResourceDefDao xResourceDefDao = Mockito.mock(XXResourceDefDao.class);
		XXResourceDef resourceDefObj = new XXResourceDef();
		resourceDefObj.setAddedByUserId(Id);
		resourceDefObj.setCreateTime(new Date());
		resourceDefObj.setDefid(Id);
		resourceDefObj.setDescription("HDFS Repository");
		resourceDefObj.setId(Id);

		Mockito.when(daoManager.getXXResourceDef()).thenReturn(xResourceDefDao);

		RangerResourceDef dbRangerResourceDef = rangerServiceDefService
				.populateXXToRangerResourceDef(resourceDefObj);
		Assertions.assertNotNull(dbRangerResourceDef);
		Assertions.assertEquals(dbRangerResourceDef.getName(),
				resourceDefObj.getName());
		Assertions.assertEquals(dbRangerResourceDef.getDescription(),
				resourceDefObj.getDescription());
		Assertions.assertEquals(dbRangerResourceDef.getType(),
				resourceDefObj.getType());
		Assertions.assertEquals(dbRangerResourceDef.getRbKeyDescription(),
				resourceDefObj.getRbkeydescription());
		Mockito.verify(daoManager).getXXResourceDef();
	}

	@Test
	public void test7populateRangerAccessTypeDefToXX() {
		RangerAccessTypeDef rangerAccessTypeDefObj = new RangerAccessTypeDef();
		rangerAccessTypeDefObj.setLabel("Read");
		rangerAccessTypeDefObj.setName("read");
		rangerAccessTypeDefObj.setRbKeyLabel(null);
		XXAccessTypeDef accessTypeDefObj = new XXAccessTypeDef();
		accessTypeDefObj.setAddedByUserId(Id);
		accessTypeDefObj.setCreateTime(new Date());
		accessTypeDefObj.setDefid(Id);
		accessTypeDefObj.setId(Id);
		accessTypeDefObj.setLabel("Read");
		accessTypeDefObj.setName("read");
		accessTypeDefObj.setOrder(null);
		accessTypeDefObj.setRbkeylabel(null);
		accessTypeDefObj.setUpdatedByUserId(Id);
		accessTypeDefObj.setUpdateTime(new Date());
		XXServiceDef serviceDefObj = new XXServiceDef();
		serviceDefObj.setAddedByUserId(Id);
		serviceDefObj.setCreateTime(new Date());
		serviceDefObj.setDescription("HDFS Repository");
		serviceDefObj.setGuid("1427365526516_835_0");
		serviceDefObj.setId(Id);

		Mockito.when(
				(XXAccessTypeDef) rangerAuditFields.populateAuditFields(
						accessTypeDefObj, serviceDefObj)).thenReturn(
				accessTypeDefObj);

		XXAccessTypeDef dbAccessTypeDef = rangerServiceDefService
				.populateRangerAccessTypeDefToXX(rangerAccessTypeDefObj,
						accessTypeDefObj, serviceDefObj, 1);
		Assertions.assertNotNull(dbAccessTypeDef);
		Assertions.assertEquals(dbAccessTypeDef, accessTypeDefObj);
		Assertions.assertEquals(dbAccessTypeDef.getName(),
				accessTypeDefObj.getName());
		Assertions.assertEquals(dbAccessTypeDef.getLabel(),
				accessTypeDefObj.getLabel());
		Assertions.assertEquals(dbAccessTypeDef.getRbkeylabel(),
				accessTypeDefObj.getRbkeylabel());
		Assertions.assertEquals(dbAccessTypeDef.getDefid(),
				accessTypeDefObj.getDefid());
		Assertions.assertEquals(dbAccessTypeDef.getId(), accessTypeDefObj.getId());
		Assertions.assertEquals(dbAccessTypeDef.getCreateTime(),
				accessTypeDefObj.getCreateTime());
		Assertions.assertEquals(dbAccessTypeDef.getOrder(),
				accessTypeDefObj.getOrder());

	}

	@Test
	public void test8populateRangerAccessTypeDefToXXNullValue() {
		assertThrows(WebApplicationException.class, () -> {
		RangerAccessTypeDef rangerAccessTypeDefObj = null;
		XXAccessTypeDef accessTypeDefObj = null;
		XXServiceDef serviceDefObj = null;
		Mockito.when(
				restErrorUtil.createRESTException(
						"RangerServiceDef cannot be null.",
						MessageEnums.DATA_NOT_FOUND)).thenThrow(
				new WebApplicationException());
		XXAccessTypeDef dbAccessTypeDef = rangerServiceDefService
				.populateRangerAccessTypeDefToXX(rangerAccessTypeDefObj,
						accessTypeDefObj, serviceDefObj, 1);
			Assertions.assertNull(dbAccessTypeDef);
		});
	}

	@Test
	public void test9populateXXToRangerAccessTypeDef() {

		XXAccessTypeDef accessTypeDefObj = new XXAccessTypeDef();
		accessTypeDefObj.setAddedByUserId(Id);
		accessTypeDefObj.setCreateTime(new Date());
		accessTypeDefObj.setDefid(Id);
		accessTypeDefObj.setId(Id);
		accessTypeDefObj.setLabel("Read");
		accessTypeDefObj.setName("read");
		accessTypeDefObj.setOrder(null);
		accessTypeDefObj.setRbkeylabel(null);
		accessTypeDefObj.setUpdatedByUserId(Id);
		accessTypeDefObj.setUpdateTime(new Date());

		RangerAccessTypeDef dbRangerAccessTypeDef = rangerServiceDefService
				.populateXXToRangerAccessTypeDef(accessTypeDefObj, Collections.emptyList());
		Assertions.assertNotNull(dbRangerAccessTypeDef);
		Assertions.assertEquals(dbRangerAccessTypeDef.getName(),
				accessTypeDefObj.getName());
		Assertions.assertEquals(dbRangerAccessTypeDef.getLabel(),
				accessTypeDefObj.getLabel());
		Assertions.assertEquals(dbRangerAccessTypeDef.getRbKeyLabel(),
				accessTypeDefObj.getRbkeylabel());
	}

	@Test
	public void test10populateRangerPolicyConditionDefToXX() {
		RangerPolicyConditionDef rangerConditionDefvObj = new RangerPolicyConditionDef();
		rangerConditionDefvObj.setDescription("Countries");
		rangerConditionDefvObj.setEvaluator("COUNTRY");
		rangerConditionDefvObj.setLabel("Countries");
		rangerConditionDefvObj.setName("country");
		rangerConditionDefvObj.setRbKeyDescription(null);
		rangerConditionDefvObj.setRbKeyLabel(null);
		XXPolicyConditionDef policyConditionDefObj = new XXPolicyConditionDef();
		policyConditionDefObj.setAddedByUserId(Id);
		policyConditionDefObj.setCreateTime(new Date());
		policyConditionDefObj.setDefid(Id);
		policyConditionDefObj.setDescription("policy");
		policyConditionDefObj.setId(Id);
		policyConditionDefObj.setName("country");
		policyConditionDefObj.setOrder(0);
		policyConditionDefObj.setUpdatedByUserId(Id);
		policyConditionDefObj.setUpdateTime(new Date());
		XXServiceDef serviceDefObj = new XXServiceDef();
		serviceDefObj.setAddedByUserId(Id);
		serviceDefObj.setCreateTime(new Date());
		serviceDefObj.setDescription("HDFS Repository");
		serviceDefObj.setGuid("1427365526516_835_0");
		serviceDefObj.setId(Id);
		Mockito.when(
				(XXPolicyConditionDef) rangerAuditFields.populateAuditFields(
						policyConditionDefObj, serviceDefObj)).thenReturn(
				policyConditionDefObj);
		XXPolicyConditionDef dbPolicyConditionDef = rangerServiceDefService
				.populateRangerPolicyConditionDefToXX(rangerConditionDefvObj,
						policyConditionDefObj, serviceDefObj, 1);
		Assertions.assertNotNull(dbPolicyConditionDef);
		Assertions.assertEquals(dbPolicyConditionDef.getName(),
				policyConditionDefObj.getName());
		Assertions.assertEquals(dbPolicyConditionDef.getDescription(),
				policyConditionDefObj.getDescription());
		Assertions.assertEquals(dbPolicyConditionDef.getEvaluator(),
				policyConditionDefObj.getEvaluator());
		Assertions.assertEquals(dbPolicyConditionDef.getLabel(),
				policyConditionDefObj.getLabel());
		Assertions.assertEquals(dbPolicyConditionDef.getId(),
				policyConditionDefObj.getId());
		Assertions.assertEquals(dbPolicyConditionDef.getRbkeydescription(),
				policyConditionDefObj.getRbkeydescription());
		Assertions.assertEquals(dbPolicyConditionDef.getOrder(),
				policyConditionDefObj.getOrder());
		Assertions.assertEquals(dbPolicyConditionDef.getUpdatedByUserId(),
				policyConditionDefObj.getUpdatedByUserId());
		Assertions.assertEquals(dbPolicyConditionDef.getUpdateTime(),
				policyConditionDefObj.getUpdateTime());

	}

	@Test
	public void test11populateRangerPolicyConditionDefToXXnullValue() {
		assertThrows(WebApplicationException.class, () -> {
		RangerPolicyConditionDef rangerConditionDefvObj = null;
		XXPolicyConditionDef policyConditionDefObj = null;
		XXServiceDef serviceDefObj = null;

		Mockito.when(
				restErrorUtil.createRESTException(
						"RangerServiceDef cannot be null.",
						MessageEnums.DATA_NOT_FOUND)).thenThrow(
				new WebApplicationException());

		XXPolicyConditionDef dbPolicyConditionDef = rangerServiceDefService
				.populateRangerPolicyConditionDefToXX(rangerConditionDefvObj,
						policyConditionDefObj, serviceDefObj, 1);
			Assertions.assertNull(dbPolicyConditionDef);
		});
	}

	@Test
	public void test12populateXXToRangerPolicyConditionDef() {
		XXPolicyConditionDef policyConditionDefObj = new XXPolicyConditionDef();
		policyConditionDefObj.setAddedByUserId(Id);
		policyConditionDefObj.setCreateTime(new Date());
		policyConditionDefObj.setDefid(Id);
		policyConditionDefObj.setDescription("policy");
		policyConditionDefObj.setId(Id);
		policyConditionDefObj.setName("country");
		policyConditionDefObj.setOrder(0);
		policyConditionDefObj.setUpdatedByUserId(Id);
		policyConditionDefObj.setUpdateTime(new Date());

		RangerPolicyConditionDef dbRangerPolicyConditionDef = rangerServiceDefService
				.populateXXToRangerPolicyConditionDef(policyConditionDefObj);
		Assertions.assertNotNull(dbRangerPolicyConditionDef);
		Assertions.assertEquals(dbRangerPolicyConditionDef.getName(),
				policyConditionDefObj.getName());
		Assertions.assertEquals(dbRangerPolicyConditionDef.getDescription(),
				policyConditionDefObj.getDescription());
		Assertions.assertEquals(dbRangerPolicyConditionDef.getEvaluator(),
				policyConditionDefObj.getEvaluator());
		Assertions.assertEquals(dbRangerPolicyConditionDef.getLabel(),
				policyConditionDefObj.getLabel());
	}

	@Test
	public void test13populateRangerContextEnricherDefToXX() {
		RangerContextEnricherDef rangerContextEnricherDefObj = new RangerContextEnricherDef();
		rangerContextEnricherDefObj.setName("country-provider");
		rangerContextEnricherDefObj.setEnricher("RangerCountryProvider");

		XXContextEnricherDef contextEnricherDefObj = new XXContextEnricherDef();
		contextEnricherDefObj.setAddedByUserId(Id);
		contextEnricherDefObj.setCreateTime(new Date());
		contextEnricherDefObj.setDefid(Id);
		contextEnricherDefObj.setId(Id);
		contextEnricherDefObj.setName("country-provider");
		contextEnricherDefObj
				.setEnricherOptions("contextName=COUNTRY;dataFile=/etc/ranger/data/userCountry.properties");
		contextEnricherDefObj.setEnricher("RangerCountryProvider");
		contextEnricherDefObj.setOrder(null);
		contextEnricherDefObj.setUpdatedByUserId(Id);
		contextEnricherDefObj.setUpdateTime(new Date());
		XXServiceDef serviceDefObj = new XXServiceDef();
		serviceDefObj.setAddedByUserId(Id);
		serviceDefObj.setCreateTime(new Date());
		serviceDefObj.setDescription("HDFS Repository");
		serviceDefObj.setGuid("1427365526516_835_0");
		serviceDefObj.setId(Id);

		Mockito.when(
				(XXContextEnricherDef) rangerAuditFields.populateAuditFields(
						contextEnricherDefObj, serviceDefObj)).thenReturn(
				contextEnricherDefObj);

		XXContextEnricherDef dbContextEnricherDef = rangerServiceDefService
				.populateRangerContextEnricherDefToXX(
						rangerContextEnricherDefObj, contextEnricherDefObj,
						serviceDefObj, 1);
		Assertions.assertNotNull(dbContextEnricherDef);
		Assertions.assertEquals(dbContextEnricherDef.getEnricher(),
				contextEnricherDefObj.getEnricher());
		Assertions.assertEquals(dbContextEnricherDef.getEnricherOptions(),
				contextEnricherDefObj.getEnricherOptions());
		Assertions.assertEquals(dbContextEnricherDef.getName(),
				contextEnricherDefObj.getName());
		Assertions.assertEquals(dbContextEnricherDef.getCreateTime(),
				contextEnricherDefObj.getCreateTime());
		Assertions.assertEquals(dbContextEnricherDef.getId(),
				contextEnricherDefObj.getId());
		Assertions.assertEquals(dbContextEnricherDef.getOrder(),
				contextEnricherDefObj.getOrder());
		Assertions.assertEquals(dbContextEnricherDef.getUpdatedByUserId(),
				contextEnricherDefObj.getUpdatedByUserId());
		Assertions.assertEquals(dbContextEnricherDef.getUpdateTime(),
				contextEnricherDefObj.getUpdateTime());

	}

	@Test
	public void test14populateRangerContextEnricherDefToXXnullValue() {
		assertThrows(WebApplicationException.class, () -> {
		RangerContextEnricherDef rangerContextEnricherDefObj = null;
		XXContextEnricherDef contextEnricherDefObj = null;
		XXServiceDef serviceDefObj = null;

		Mockito.when(
				restErrorUtil.createRESTException(
						"RangerServiceDef cannot be null.",
						MessageEnums.DATA_NOT_FOUND)).thenThrow(
				new WebApplicationException());

		XXContextEnricherDef dbContextEnricherDef = rangerServiceDefService
				.populateRangerContextEnricherDefToXX(
						rangerContextEnricherDefObj, contextEnricherDefObj,
						serviceDefObj, 1);
			Assertions.assertNull(dbContextEnricherDef);

		});

	}

	@Test
	public void test15populateXXToRangerContextEnricherDef() {
		XXContextEnricherDef contextEnricherDefObj = new XXContextEnricherDef();
		contextEnricherDefObj.setAddedByUserId(Id);
		contextEnricherDefObj.setCreateTime(new Date());
		contextEnricherDefObj.setDefid(Id);
		contextEnricherDefObj.setId(Id);
		contextEnricherDefObj.setName("country-provider");
		contextEnricherDefObj
				.setEnricherOptions("contextName=COUNTRY;dataFile=/etc/ranger/data/userCountry.properties");
		contextEnricherDefObj.setEnricher("RangerCountryProvider");
		contextEnricherDefObj.setOrder(null);
		contextEnricherDefObj.setUpdatedByUserId(Id);
		contextEnricherDefObj.setUpdateTime(new Date());

		RangerContextEnricherDef dbRangerContextEnricherDef = rangerServiceDefService
				.populateXXToRangerContextEnricherDef(contextEnricherDefObj);
		Assertions.assertNotNull(dbRangerContextEnricherDef);
		Assertions.assertEquals(dbRangerContextEnricherDef.getEnricher(),
				contextEnricherDefObj.getEnricher());
		Assertions.assertEquals(dbRangerContextEnricherDef.getName(),
				contextEnricherDefObj.getName());

	}

	@Test
	public void test16populateRangerEnumDefToXX() {
		RangerEnumDef rangerEnumDefObj = new RangerEnumDef();
		rangerEnumDefObj.setName("authnType");
		rangerEnumDefObj.setDefaultIndex(0);
		XXEnumDef enumDefObj = new XXEnumDef();
		enumDefObj.setAddedByUserId(Id);
		enumDefObj.setCreateTime(new Date());
		enumDefObj.setDefaultindex(0);
		enumDefObj.setDefid(Id);
		enumDefObj.setId(Id);
		enumDefObj.setName("authnType");
		enumDefObj.setUpdatedByUserId(Id);
		enumDefObj.setUpdateTime(new Date());
		XXServiceDef serviceDefObj = new XXServiceDef();
		serviceDefObj.setAddedByUserId(Id);
		serviceDefObj.setCreateTime(new Date());
		serviceDefObj.setDescription("HDFS Repository");
		serviceDefObj.setGuid("1427365526516_835_0");
		serviceDefObj.setId(Id);

		Mockito.when(
				(XXEnumDef) rangerAuditFields.populateAuditFields(enumDefObj,
						serviceDefObj)).thenReturn(enumDefObj);

		XXEnumDef dbEnumDef = rangerServiceDefService
				.populateRangerEnumDefToXX(rangerEnumDefObj, enumDefObj,
						serviceDefObj,1);
		Assertions.assertNotNull(dbEnumDef);
		Assertions.assertEquals(dbEnumDef, enumDefObj);
		Assertions.assertEquals(dbEnumDef.getName(), enumDefObj.getName());
		Assertions.assertEquals(dbEnumDef.getDefid(), enumDefObj.getDefid());
		Assertions.assertEquals(dbEnumDef.getId(), enumDefObj.getId());
		Assertions.assertEquals(dbEnumDef.getCreateTime(),
				enumDefObj.getCreateTime());

	}

	@Test
	public void test17populateRangerEnumDefToXXnullValue() {
		assertThrows(WebApplicationException.class, () -> {
		RangerEnumDef rangerEnumDefObj = null;
		XXEnumDef enumDefObj = null;
		XXServiceDef serviceDefObj = null;

		Mockito.when(
				restErrorUtil.createRESTException(
						"RangerServiceDef cannot be null.",
						MessageEnums.DATA_NOT_FOUND)).thenThrow(
				new WebApplicationException());

		XXEnumDef dbEnumDef = rangerServiceDefService
				.populateRangerEnumDefToXX(rangerEnumDefObj, enumDefObj,
						serviceDefObj, 1);
			Assertions.assertNull(dbEnumDef);

		});

	}

	@Test
	public void test18populateXXToRangerEnumDef() {
		XXEnumElementDefDao xEnumElementDefDao = Mockito
				.mock(XXEnumElementDefDao.class);

		List<XXEnumElementDef> enumElementDefList = new ArrayList<XXEnumElementDef>();
		XXEnumElementDef enumElementDefObj = new XXEnumElementDef();
		enumElementDefObj.setAddedByUserId(Id);
		enumElementDefObj.setCreateTime(new Date());
		enumElementDefObj.setEnumdefid(Id);
		enumElementDefObj.setId(Id);
		enumElementDefObj.setLabel("Simple");
		enumElementDefObj.setName("simple");
		enumElementDefObj.setOrder(0);
		enumElementDefObj.setUpdatedByUserId(Id);
		enumElementDefObj.setUpdateTime(new Date());
		enumElementDefList.add(enumElementDefObj);

		XXEnumDef enumDefObj = new XXEnumDef();
		enumDefObj.setAddedByUserId(Id);
		enumDefObj.setCreateTime(new Date());
		enumDefObj.setDefaultindex(0);
		enumDefObj.setDefid(Id);
		enumDefObj.setId(Id);
		enumDefObj.setName("authnType");
		enumDefObj.setUpdatedByUserId(Id);
		enumDefObj.setUpdateTime(new Date());

		Mockito.when(daoManager.getXXEnumElementDef()).thenReturn(
				xEnumElementDefDao);
		Mockito.when(xEnumElementDefDao.findByEnumDefId(enumDefObj.getId()))
				.thenReturn(enumElementDefList);

		RangerEnumDef dbRangerEnumDef = rangerServiceDefService
				.populateXXToRangerEnumDef(enumDefObj);
		Assertions.assertNotNull(dbRangerEnumDef);
		Assertions.assertEquals(dbRangerEnumDef.getName(), enumDefObj.getName());

		Mockito.verify(daoManager).getXXEnumElementDef();
	}

	@Test
	public void test19populateRangerEnumElementDefToXX() {

		RangerEnumElementDef rangerEnumElementDefObj = new RangerEnumElementDef();
		rangerEnumElementDefObj.setLabel("Simple");
		rangerEnumElementDefObj.setName("simple");
		rangerEnumElementDefObj.setRbKeyLabel(null);
		XXEnumElementDef enumElementDefObj = new XXEnumElementDef();
		enumElementDefObj.setAddedByUserId(Id);
		enumElementDefObj.setCreateTime(new Date());
		enumElementDefObj.setEnumdefid(Id);
		enumElementDefObj.setId(Id);
		enumElementDefObj.setLabel("Simple");
		enumElementDefObj.setName("simple");
		enumElementDefObj.setOrder(0);
		enumElementDefObj.setUpdatedByUserId(Id);
		enumElementDefObj.setUpdateTime(new Date());
		XXEnumDef enumDefObj = new XXEnumDef();
		enumDefObj.setAddedByUserId(Id);
		enumDefObj.setCreateTime(new Date());
		enumDefObj.setDefaultindex(0);
		enumDefObj.setDefid(Id);
		enumDefObj.setId(Id);
		enumDefObj.setName("authnType");
		enumDefObj.setUpdatedByUserId(Id);
		enumDefObj.setUpdateTime(new Date());

		Mockito.when(
				(XXEnumElementDef) rangerAuditFields.populateAuditFields(
						enumElementDefObj, enumDefObj)).thenReturn(
				enumElementDefObj);
		XXEnumElementDef dbEnumElementDef = rangerServiceDefService
				.populateRangerEnumElementDefToXX(rangerEnumElementDefObj,
						enumElementDefObj, enumDefObj, 1);
		Assertions.assertNotNull(dbEnumElementDef);
		Assertions.assertEquals(dbEnumElementDef.getId(), enumElementDefObj.getId());
		Assertions.assertEquals(dbEnumElementDef.getName(),
				enumElementDefObj.getName());
		Assertions.assertEquals(dbEnumElementDef.getLabel(),
				enumElementDefObj.getLabel());
		Assertions.assertEquals(dbEnumElementDef.getCreateTime(),
				enumElementDefObj.getCreateTime());
		Assertions.assertEquals(dbEnumElementDef.getAddedByUserId(),
				enumElementDefObj.getAddedByUserId());
		Assertions.assertEquals(dbEnumElementDef.getUpdateTime(),
				enumElementDefObj.getUpdateTime());
		Assertions.assertEquals(dbEnumElementDef.getUpdatedByUserId(),
				enumElementDefObj.getUpdatedByUserId());
		Mockito.verify(rangerAuditFields).populateAuditFields(
				enumElementDefObj, enumDefObj);
	}

	@Test
	public void test20populateXXToRangerEnumElementDef() {
		XXEnumElementDef enumElementDefObj = new XXEnumElementDef();
		enumElementDefObj.setAddedByUserId(Id);
		enumElementDefObj.setCreateTime(new Date());
		enumElementDefObj.setEnumdefid(Id);
		enumElementDefObj.setId(Id);
		enumElementDefObj.setLabel("Simple");
		enumElementDefObj.setName("simple");
		enumElementDefObj.setOrder(0);
		enumElementDefObj.setUpdatedByUserId(Id);
		enumElementDefObj.setUpdateTime(new Date());

		RangerEnumElementDef dbRangerEnumElementDef = rangerServiceDefService
				.populateXXToRangerEnumElementDef(enumElementDefObj);
		Assertions.assertNotNull(dbRangerEnumElementDef);
		Assertions.assertEquals(dbRangerEnumElementDef.getLabel(),
				enumElementDefObj.getLabel());
		Assertions.assertEquals(dbRangerEnumElementDef.getName(),
				enumElementDefObj.getName());

	}

	@Test
	public void test21searchRangerServiceDefs() {
		setup();
		SearchFilter searchFilter = new SearchFilter();
		searchFilter.setParam(SearchFilter.POLICY_NAME, "policyName");
		searchFilter.setParam(SearchFilter.SERVICE_NAME, "serviceName");

		RangerServiceDefList dbRangerServiceDefList = rangerServiceDefService
				.searchRangerServiceDefs(searchFilter);
		Assertions.assertNotNull(dbRangerServiceDefList);
	}
}
