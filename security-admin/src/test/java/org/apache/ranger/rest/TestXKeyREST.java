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
package org.apache.ranger.rest;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.ws.rs.WebApplicationException;
import org.apache.ranger.biz.KmsKeyMgr;
import org.apache.ranger.biz.XAuditMgr;
import org.apache.ranger.common.MessageEnums;
import org.apache.ranger.common.RESTErrorUtil;
import org.apache.ranger.common.SearchUtil;
import org.apache.ranger.service.XAccessAuditService;
import org.apache.ranger.view.VXKmsKey;
import org.apache.ranger.view.VXKmsKeyList;

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
public class TestXKeyREST {
	@InjectMocks
	XKeyREST keyREST = new XKeyREST();

	@Mock
	XAuditMgr xAuditMgr;

	@Mock
	SearchUtil searchUtil;

	@Mock
	XAccessAuditService xAccessAuditSrv;

	@Mock
	KmsKeyMgr keyMgr;

	@Mock
	VXKmsKey vxKmsKey;

	@Mock
	RESTErrorUtil restErrorUtil;

	@Mock
	HttpServletRequest request;

	String provider = "providerX";
	String name = "xyz";
	String nameNl = "";

	@Test
	public void Test1Searchkeys() throws Exception {
		VXKmsKeyList vxKeyListExp = new VXKmsKeyList();

		Mockito.when(keyMgr.searchKeys(request, provider)).thenReturn(vxKeyListExp);

		VXKmsKeyList vxKeyListAct = keyREST.searchKeys(request, provider);

		Assertions.assertNotNull(vxKeyListAct);
		Assertions.assertEquals(vxKeyListExp, vxKeyListAct);

		Mockito.verify(keyMgr).searchKeys(request, provider);
	}

	@Test
	public void Test2RolloverKey() throws Exception {
		VXKmsKey vxKeyExp = new VXKmsKey();
		vxKeyExp.setName(name);
		vxKeyExp.setCipher("CipherX");

		Mockito.when(keyMgr.rolloverKey(provider, vxKeyExp)).thenReturn(vxKeyExp);

		VXKmsKey vxKeyAct = keyREST.rolloverKey(provider, vxKeyExp);

		Assertions.assertNotNull(vxKeyAct);
		Assertions.assertEquals(vxKeyExp, vxKeyAct);
		Assertions.assertEquals(vxKeyExp.getName(), vxKeyAct.getName());
		Mockito.verify(keyMgr).rolloverKey(provider, vxKeyExp);
	}

	@Test
	public void Test3RolloverKey() throws Exception {
		VXKmsKey vxKeyExp = new VXKmsKey();
		vxKeyExp.setName(name);

		Mockito.when(keyMgr.rolloverKey(provider, vxKeyExp)).thenReturn(vxKeyExp);

		VXKmsKey vxKeyAct = keyREST.rolloverKey(provider, vxKeyExp);

		Assertions.assertNotNull(vxKeyAct);
		Assertions.assertEquals(vxKeyExp, vxKeyAct);
		Assertions.assertEquals(vxKeyExp.getName(), vxKeyAct.getName());
		Assertions.assertNull(vxKeyAct.getCipher());

		Mockito.verify(keyMgr).rolloverKey(provider, vxKeyExp);
	}

	@Test
	public void Test4RolloverKey() throws Exception {
		assertThrows(WebApplicationException.class, () -> {
		VXKmsKey vxKeyExp = new VXKmsKey();

		Mockito.when(restErrorUtil.createRESTException(Mockito.nullable(String.class), (MessageEnums) Mockito.any()))
				.thenReturn(new WebApplicationException());

		keyREST.rolloverKey(provider, vxKeyExp);

		Mockito.verify(restErrorUtil).createRESTException(Mockito.anyString(), (MessageEnums) Mockito.any());
		});
	}

	@Test
	public void Test5DeleteKey() throws Exception {
		Mockito.doNothing().when(keyMgr).deleteKey(provider, name);

		keyREST.deleteKey(name, provider, request);

		Mockito.verify(keyMgr).deleteKey(provider, name);
	}

	@Test
	public void Test6DeleteKey() throws Exception {
		assertThrows(WebApplicationException.class, () -> {
		Mockito.when(restErrorUtil.createRESTException(Mockito.nullable(String.class), (MessageEnums) Mockito.any()))
				.thenReturn(new WebApplicationException());

		keyREST.deleteKey(nameNl, provider, request);

		Mockito.verify(restErrorUtil).createRESTException(Mockito.anyString(), (MessageEnums) Mockito.any());
		});
	}

	@Test
	public void Test6CreateKey() throws Exception {
		VXKmsKey vxKeyExp = new VXKmsKey();
		vxKeyExp.setName(name);
		vxKeyExp.setCipher("CipherX");

		Mockito.when(keyMgr.createKey(provider, vxKeyExp)).thenReturn(vxKeyExp);
		VXKmsKey vxKeyAct = keyREST.createKey(provider, vxKeyExp);

		Assertions.assertNotNull(vxKeyAct);
		Assertions.assertEquals(vxKeyAct, vxKeyExp);
		Assertions.assertEquals(vxKeyExp.getName(), vxKeyAct.getName());
		Assertions.assertEquals(vxKeyExp.getCipher(), vxKeyAct.getCipher());

		Mockito.verify(keyMgr).createKey(provider, vxKeyExp);
	}

	@Test
	public void Test7CreateKey() throws Exception {
		VXKmsKey vxKeyExp = new VXKmsKey();
		vxKeyExp.setName(name);

		Mockito.when(keyMgr.createKey(provider, vxKeyExp)).thenReturn(vxKeyExp);

		VXKmsKey vxKeyAct = keyREST.createKey(provider, vxKeyExp);

		Assertions.assertNotNull(vxKeyAct);
		Assertions.assertEquals(vxKeyAct, vxKeyExp);
		Assertions.assertEquals(vxKeyExp.getName(), vxKeyAct.getName());
		Assertions.assertNull(vxKeyAct.getCipher());

		Mockito.verify(keyMgr).createKey(provider, vxKeyExp);
	}

	@Test
	public void Test8CreateKey() throws Exception {
		assertThrows(WebApplicationException.class, () -> {
		VXKmsKey vxKeyExp = new VXKmsKey();

		Mockito.when(restErrorUtil.createRESTException(Mockito.nullable(String.class), (MessageEnums) Mockito.any()))
				.thenReturn(new WebApplicationException());

		VXKmsKey vxKeyAct = keyREST.createKey(provider, vxKeyExp);

		Mockito.verify(restErrorUtil).createRESTException(Mockito.anyString(), (MessageEnums) Mockito.any());

			Assertions.assertNull(vxKeyAct);
		});
	}

	@Test
	public void Test9GetKey() throws Exception {
		VXKmsKey vxKeyExp = new VXKmsKey();

		Mockito.when(keyMgr.getKey(provider, name)).thenReturn(vxKeyExp);

		VXKmsKey vxKeyAct = keyREST.getKey(name, provider);

		Assertions.assertNotNull(vxKeyAct);
		Assertions.assertEquals(vxKeyAct, vxKeyExp);
		Assertions.assertEquals(vxKeyExp.getName(), vxKeyAct.getName());

		Mockito.verify(keyMgr).getKey(provider, name);
	}

	@Test
	public void Test10GetKey() throws Exception {
		assertThrows(WebApplicationException.class, () -> {
		Mockito.when(restErrorUtil.createRESTException(Mockito.nullable(String.class), (MessageEnums) Mockito.any()))
				.thenReturn(new WebApplicationException());

		VXKmsKey vxKeyAct = keyREST.getKey(nameNl, provider);

			Assertions.assertNull(vxKeyAct);

		Mockito.verify(restErrorUtil).createRESTException(Mockito.anyString(), (MessageEnums) Mockito.any());
		});
	}
}
