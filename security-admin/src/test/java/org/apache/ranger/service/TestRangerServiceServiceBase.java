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

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.apache.ranger.biz.RangerBizUtil;
import org.apache.ranger.common.ContextUtil;
import org.apache.ranger.common.RangerSearchUtil;
import org.apache.ranger.common.UserSessionBase;
import org.apache.ranger.common.db.BaseDao;
import org.apache.ranger.db.RangerDaoManager;
import org.apache.ranger.db.XXServiceDefDao;
import org.apache.ranger.db.XXServiceVersionInfoDao;
import org.apache.ranger.entity.XXService;
import org.apache.ranger.entity.XXServiceDef;
import org.apache.ranger.entity.XXServiceVersionInfo;
import org.apache.ranger.plugin.model.RangerService;
import org.apache.ranger.plugin.util.SearchFilter;
import org.apache.ranger.security.context.RangerContextHolder;
import org.apache.ranger.security.context.RangerSecurityContext;
import org.apache.ranger.view.RangerServiceList;
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
public class TestRangerServiceServiceBase {

	private static Long Id = 8L;

	@InjectMocks
	RangerServiceService rangerServiceService = new RangerServiceService();

	@Mock
	RangerDaoManager daoManager;

	@Mock
	RangerSearchUtil searchUtil;

	@Mock
	RangerBizUtil bizUtil;

	@Mock
	BaseDao<XXService> baseDao;

	public void setup() {
		RangerSecurityContext context = new RangerSecurityContext();
		context.setUserSession(new UserSessionBase());
		RangerContextHolder.setSecurityContext(context);
		UserSessionBase currentUserSession = ContextUtil
				.getCurrentUserSession();
		currentUserSession.setUserAdmin(true);
	}

	private RangerService rangerService() {
		Map<String, String> configs = new HashMap<String, String>();
		configs.put("username", "servicemgr");
		configs.put("password", "servicemgr");
		configs.put("namenode", "servicemgr");
		configs.put("hadoop.security.authorization", "No");
		configs.put("hadoop.security.authentication", "Simple");
		configs.put("hadoop.security.auth_to_local", "");
		configs.put("dfs.datanode.kerberos.principal", "");
		configs.put("dfs.namenode.kerberos.principal", "");
		configs.put("dfs.secondary.namenode.kerberos.principal", "");
		configs.put("hadoop.rpc.protection", "Privacy");
		configs.put("commonNameForCertificate", "");

		RangerService rangerService = new RangerService();
		rangerService.setId(Id);
		rangerService.setConfigs(configs);
		rangerService.setCreateTime(new Date());
		rangerService.setDescription("service");
		rangerService.setGuid("serviceguid");
		rangerService.setIsEnabled(true);
		rangerService.setName("Hdfs service");
		rangerService.setPolicyUpdateTime(new Date());
		rangerService.setPolicyVersion(1L);
		rangerService.setType(null);
		rangerService.setUpdatedBy("Admin");
		rangerService.setUpdateTime(new Date());
		rangerService.setVersion(Id);

		return rangerService;
	}

	private XXService service() {
		XXService xService = new XXService();
		xService.setAddedByUserId(Id);
		xService.setCreateTime(new Date());
		xService.setDescription("Hdfs service");
		xService.setGuid("serviceguid");
		xService.setId(Id);
		xService.setIsEnabled(true);
		xService.setName("Hdfs");
		xService.setPolicyUpdateTime(new Date());
		xService.setPolicyVersion(1L);
		xService.setType(1L);
		xService.setUpdatedByUserId(Id);
		xService.setUpdateTime(new Date());

		return xService;
	}

	@Test
	public void test1MapViewToEntityBean() {
		XXServiceDefDao xServiceDefDao = Mockito.mock(XXServiceDefDao.class);
		XXServiceDef xServiceDef = Mockito.mock(XXServiceDef.class);
		RangerService rangerService = rangerService();
		XXService service = service();
		int OPERATION_CONTEXT = 1;

		Mockito.when(daoManager.getXXServiceDef()).thenReturn(xServiceDefDao);
		Mockito.when(xServiceDefDao.findByName(rangerService.getType()))
				.thenReturn(xServiceDef);

		XXService dbService = rangerServiceService.mapViewToEntityBean(
				rangerService, service, OPERATION_CONTEXT);
		Assertions.assertNotNull(dbService);
		Assertions.assertEquals(dbService, service);
		Assertions.assertEquals(dbService.getDescription(),
				service.getDescription());
		Assertions.assertEquals(dbService.getGuid(), service.getGuid());
		Assertions.assertEquals(dbService.getName(), service.getName());
		Assertions.assertEquals(dbService.getAddedByUserId(),
				service.getAddedByUserId());
		Assertions.assertEquals(dbService.getId(), service.getId());
		Assertions.assertEquals(dbService.getVersion(), service.getVersion());
		Assertions.assertEquals(dbService.getType(), service.getType());
		Assertions.assertEquals(dbService.getUpdatedByUserId(),
				service.getUpdatedByUserId());

		Mockito.verify(daoManager).getXXServiceDef();
	}

	@Test
	public void test2mapEntityToViewBean() {
		XXServiceDefDao xServiceDefDao = Mockito.mock(XXServiceDefDao.class);
		XXServiceDef xServiceDef = Mockito.mock(XXServiceDef.class);
		RangerService rangerService = rangerService();
		XXService service = service();

		XXServiceVersionInfoDao xServiceVersionInfoDao = Mockito.mock(XXServiceVersionInfoDao.class);

		XXServiceVersionInfo serviceVersionInfo = new XXServiceVersionInfo();
		serviceVersionInfo.setServiceId(service.getId());
		serviceVersionInfo.setPolicyVersion(service.getPolicyVersion());
		serviceVersionInfo.setPolicyUpdateTime(service.getPolicyUpdateTime());
		serviceVersionInfo.setTagVersion(service.getTagVersion());
		serviceVersionInfo.setPolicyUpdateTime(service.getTagUpdateTime());

		Mockito.when(daoManager.getXXServiceVersionInfo()).thenReturn(xServiceVersionInfoDao);
		Mockito.when(xServiceVersionInfoDao.findByServiceId(service.getId())).thenReturn(
				serviceVersionInfo);

		Mockito.when(daoManager.getXXServiceDef()).thenReturn(xServiceDefDao);
		Mockito.when(xServiceDefDao.getById(service.getType())).thenReturn(
				xServiceDef);

		RangerService dbRangerService = rangerServiceService
				.mapEntityToViewBean(rangerService, service);
		Assertions.assertNotNull(dbRangerService);
		Assertions.assertEquals(dbRangerService, rangerService);
		Assertions.assertEquals(dbRangerService.getDescription(),
				rangerService.getDescription());
		Assertions.assertEquals(dbRangerService.getGuid(), rangerService.getGuid());
		Assertions.assertEquals(dbRangerService.getName(), rangerService.getName());
		Assertions.assertEquals(dbRangerService.getId(), rangerService.getId());
		Assertions.assertEquals(dbRangerService.getVersion(),
				rangerService.getVersion());
		Assertions.assertEquals(dbRangerService.getType(), rangerService.getType());

		Mockito.verify(daoManager).getXXServiceDef();
	}

	@Test
	public void test3searchRangerServices() {
		SearchFilter searchFilter = new SearchFilter();
		searchFilter.setParam(SearchFilter.POLICY_NAME, "policyName");
		searchFilter.setParam(SearchFilter.SERVICE_NAME, "serviceName");

		RangerServiceList dbRangerServiceList = rangerServiceService
				.searchRangerServices(searchFilter);
		Assertions.assertNotNull(dbRangerServiceList);

	}
}
