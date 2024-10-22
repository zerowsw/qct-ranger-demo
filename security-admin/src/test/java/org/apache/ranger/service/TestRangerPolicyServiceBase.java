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
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import jakarta.ws.rs.WebApplicationException;
import org.apache.ranger.biz.RangerBizUtil;
import org.apache.ranger.common.ContextUtil;
import org.apache.ranger.common.MessageEnums;
import org.apache.ranger.common.RESTErrorUtil;
import org.apache.ranger.common.RangerSearchUtil;
import org.apache.ranger.common.UserSessionBase;
import org.apache.ranger.db.RangerDaoManager;
import org.apache.ranger.db.XXServiceDao;
import org.apache.ranger.db.XXServiceDefDao;
import org.apache.ranger.entity.XXPolicy;
import org.apache.ranger.entity.XXService;
import org.apache.ranger.entity.XXServiceDef;
import org.apache.ranger.plugin.model.RangerPolicy;
import org.apache.ranger.plugin.model.RangerPolicy.RangerPolicyItem;
import org.apache.ranger.plugin.model.RangerPolicy.RangerPolicyItemAccess;
import org.apache.ranger.plugin.model.RangerPolicy.RangerPolicyItemCondition;
import org.apache.ranger.plugin.model.RangerPolicy.RangerPolicyResource;
import org.apache.ranger.security.context.RangerContextHolder;
import org.apache.ranger.security.context.RangerSecurityContext;

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
public class TestRangerPolicyServiceBase {

	private static Long Id = 8L;

	@InjectMocks
	RangerPolicyService policyService = new RangerPolicyService();

	@Mock
	RangerDaoManager daoManager;

	@Mock
	RESTErrorUtil restErrorUtil;

	@Mock
	ContextUtil contextUtil;

	@Mock
	RangerBizUtil rangerBizUtil;

	@Mock
	RangerSearchUtil searchUtil;

	public void setup() {
		RangerSecurityContext context = new RangerSecurityContext();
		context.setUserSession(new UserSessionBase());
		RangerContextHolder.setSecurityContext(context);
		UserSessionBase currentUserSession = ContextUtil
				.getCurrentUserSession();
		currentUserSession.setUserAdmin(true);
	}

	private RangerPolicy rangerPolicy() {
		List<RangerPolicyItemAccess> accesses = new ArrayList<RangerPolicyItemAccess>();
		List<String> users = new ArrayList<String>();
		List<String> groups = new ArrayList<String>();
		List<RangerPolicyItemCondition> conditions = new ArrayList<RangerPolicyItemCondition>();
		List<RangerPolicyItem> policyItems = new ArrayList<RangerPolicyItem>();
		RangerPolicyItem rangerPolicyItem = new RangerPolicyItem();
		rangerPolicyItem.setAccesses(accesses);
		rangerPolicyItem.setConditions(conditions);
		rangerPolicyItem.setGroups(groups);
		rangerPolicyItem.setUsers(users);
		rangerPolicyItem.setDelegateAdmin(false);

		policyItems.add(rangerPolicyItem);

		Map<String, RangerPolicyResource> policyResource = new HashMap<String, RangerPolicyResource>();
		RangerPolicyResource rangerPolicyResource = new RangerPolicyResource();
		rangerPolicyResource.setIsExcludes(true);
		rangerPolicyResource.setIsRecursive(true);
		rangerPolicyResource.setValue("1");
		rangerPolicyResource.setValues(users);
		RangerPolicy policy = new RangerPolicy();
		policy.setId(Id);
		policy.setCreateTime(new Date());
		policy.setDescription("policy");
		policy.setGuid("policyguid");
		policy.setIsEnabled(true);
		policy.setName("HDFS_1-1-20150316062453");
		policy.setUpdatedBy("Admin");
		policy.setUpdateTime(new Date());
		policy.setService("HDFS_1-1-20150316062453");
		policy.setIsAuditEnabled(true);
		policy.setPolicyItems(policyItems);
		policy.setResources(policyResource);
		policy.setZoneName("");

		return policy;
	}

	private XXPolicy policy() {
		XXPolicy xxPolicy = new XXPolicy();
		xxPolicy.setId(Id);
		xxPolicy.setName("HDFS_1-1-20150316062453");
		xxPolicy.setAddedByUserId(Id);
		xxPolicy.setCreateTime(new Date());
		xxPolicy.setDescription("test");
		xxPolicy.setIsAuditEnabled(false);
		xxPolicy.setIsEnabled(false);
		xxPolicy.setService(1L);
		xxPolicy.setUpdatedByUserId(Id);
		xxPolicy.setUpdateTime(new Date());
		xxPolicy.setZoneId(1L);
		return xxPolicy;
	}

	@Test
	public void test1mapViewToEntityBean() {
		XXServiceDao xServiceDao = Mockito.mock(XXServiceDao.class);
		XXService xService = Mockito.mock(XXService.class);
		XXServiceDefDao xServiceDefDao = Mockito.mock(XXServiceDefDao.class);
		XXServiceDef xServiceDef = Mockito.mock(XXServiceDef.class);
		RangerPolicy rangerPolicy = rangerPolicy();
		XXPolicy policy = policy();
		int OPERATION_CONTEXT = 0;

		Mockito.when(daoManager.getXXService()).thenReturn(xServiceDao);
		Mockito.when(xServiceDao.findByName(rangerPolicy.getService()))
				.thenReturn(xService);
		Mockito.when(daoManager.getXXServiceDef()).thenReturn(xServiceDefDao);
		Mockito.when(xServiceDefDao.getById(xService.getType())).thenReturn(xServiceDef);

		XXPolicy dbPolicy = policyService.mapViewToEntityBean(rangerPolicy,
				policy, OPERATION_CONTEXT);
		Assertions.assertNotNull(dbPolicy);
		Assertions.assertEquals(dbPolicy.getId(), policy.getId());
		Assertions.assertEquals(dbPolicy.getGuid(), policy.getGuid());
		Assertions.assertEquals(dbPolicy.getName(), policy.getName());
		Assertions.assertEquals(dbPolicy.getAddedByUserId(),
				policy.getAddedByUserId());
		Assertions.assertEquals(dbPolicy.getIsEnabled(), policy.getIsEnabled());
		Assertions.assertEquals(dbPolicy.getVersion(), policy.getVersion());
		Assertions.assertEquals(dbPolicy.getDescription(), policy.getDescription());

		Mockito.verify(daoManager).getXXService();
	}

	@Test
	public void test2mapViewToEntityBeanNullValue() {
		assertThrows(WebApplicationException.class, () -> {
		XXServiceDao xServiceDao = Mockito.mock(XXServiceDao.class);
		RangerPolicy rangerPolicy = rangerPolicy();
		XXPolicy policy = policy();
		int OPERATION_CONTEXT = 0;

		Mockito.when(
				restErrorUtil.createRESTException(
						"No corresponding service found for policyName: "
								+ rangerPolicy.getName()
								+ "Service Not Found : "
								+ rangerPolicy.getName(),
						MessageEnums.INVALID_INPUT_DATA)).thenThrow(
				new WebApplicationException());

		Mockito.when(daoManager.getXXService()).thenReturn(xServiceDao);
		Mockito.when(xServiceDao.findByName(rangerPolicy.getService()))
				.thenReturn(null);

		XXPolicy dbPolicy = policyService.mapViewToEntityBean(rangerPolicy,
				policy, OPERATION_CONTEXT);
			Assertions.assertNotNull(dbPolicy);
			Assertions.assertEquals(dbPolicy.getId(), policy.getId());
			Assertions.assertEquals(dbPolicy.getGuid(), policy.getGuid());
			Assertions.assertEquals(dbPolicy.getName(), policy.getName());
			Assertions.assertEquals(dbPolicy.getAddedByUserId(),
				policy.getAddedByUserId());
			Assertions.assertEquals(dbPolicy.getIsEnabled(), policy.getIsEnabled());
			Assertions.assertEquals(dbPolicy.getVersion(), policy.getVersion());
			Assertions.assertEquals(dbPolicy.getDescription(), policy.getDescription());

		Mockito.verify(daoManager).getXXService();
		});
	}

	@Test
	public void test3mapEntityToViewBean() {
		XXServiceDao xServiceDao = Mockito.mock(XXServiceDao.class);
		XXService xService = Mockito.mock(XXService.class);
		XXServiceDefDao xServiceDefDao = Mockito.mock(XXServiceDefDao.class);
		XXServiceDef xServiceDef = Mockito.mock(XXServiceDef.class);
		RangerPolicy rangerPolicy = rangerPolicy();
		XXPolicy policy = policy();

		Mockito.when(daoManager.getXXService()).thenReturn(xServiceDao);
		Mockito.when(xServiceDao.getById(policy.getService())).thenReturn(
				xService);
		Mockito.when(daoManager.getXXServiceDef()).thenReturn(xServiceDefDao);
		Mockito.when(xServiceDefDao.getById(xService.getType())).thenReturn(
				xServiceDef);
		RangerPolicy dbRangerPolicy = policyService.mapEntityToViewBean(
				rangerPolicy, policy);

		Assertions.assertNotNull(dbRangerPolicy);
		Assertions.assertEquals(dbRangerPolicy.getId(), rangerPolicy.getId());
		Assertions.assertEquals(dbRangerPolicy.getGuid(), rangerPolicy.getGuid());
		Assertions.assertEquals(dbRangerPolicy.getName(), rangerPolicy.getName());
		Assertions.assertEquals(dbRangerPolicy.getIsEnabled(),
				rangerPolicy.getIsEnabled());
		Assertions.assertEquals(dbRangerPolicy.getVersion(),
				rangerPolicy.getVersion());
		Assertions.assertEquals(dbRangerPolicy.getDescription(),
				rangerPolicy.getDescription());

		Mockito.verify(daoManager).getXXService();
	}

}
