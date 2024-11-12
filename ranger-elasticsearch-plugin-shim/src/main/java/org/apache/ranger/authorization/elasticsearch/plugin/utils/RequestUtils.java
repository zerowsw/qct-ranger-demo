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

package org.apache.ranger.authorization.elasticsearch.plugin.utils;

import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.collections4.CollectionUtils;
import org.elasticsearch.action.ActionRequest;
import org.elasticsearch.action.DocWriteRequest;
import org.elasticsearch.action.admin.cluster.shards.ClusterSearchShardsRequest;
import org.elasticsearch.action.admin.indices.alias.IndicesAliasesRequest;
import org.elasticsearch.action.admin.indices.alias.get.GetAliasesRequest;
import org.elasticsearch.action.admin.indices.cache.clear.ClearIndicesCacheRequest;
import org.elasticsearch.action.admin.indices.close.CloseIndexRequest;
import org.elasticsearch.action.admin.indices.create.CreateIndexRequest;
import org.elasticsearch.action.admin.indices.delete.DeleteIndexRequest;
import org.elasticsearch.action.admin.indices.exists.indices.IndicesExistsRequest;
import org.elasticsearch.action.admin.indices.exists.types.TypesExistsRequest;
import org.elasticsearch.action.admin.indices.flush.FlushRequest;
import org.elasticsearch.action.admin.indices.flush.SyncedFlushRequest;
import org.elasticsearch.action.admin.indices.forcemerge.ForceMergeRequest;
import org.elasticsearch.action.admin.indices.get.GetIndexRequest;
import org.elasticsearch.action.admin.indices.mapping.get.GetFieldMappingsRequest;
import org.elasticsearch.action.admin.indices.mapping.get.GetMappingsRequest;
import org.elasticsearch.action.admin.indices.mapping.put.PutMappingRequest;
import org.elasticsearch.action.admin.indices.open.OpenIndexRequest;
import org.elasticsearch.action.admin.indices.recovery.RecoveryRequest;
import org.elasticsearch.action.admin.indices.refresh.RefreshRequest;
import org.elasticsearch.action.admin.indices.rollover.RolloverRequest;
import org.elasticsearch.action.admin.indices.segments.IndicesSegmentsRequest;
import org.elasticsearch.action.admin.indices.settings.get.GetSettingsRequest;
import org.elasticsearch.action.admin.indices.settings.put.UpdateSettingsRequest;
import org.elasticsearch.action.admin.indices.shards.IndicesShardStoresRequest;
import org.elasticsearch.action.admin.indices.shrink.ResizeRequest;
import org.elasticsearch.action.admin.indices.stats.IndicesStatsRequest;
import org.elasticsearch.action.admin.indices.template.delete.DeleteIndexTemplateRequest;
import org.elasticsearch.action.admin.indices.template.get.GetIndexTemplatesRequest;
import org.elasticsearch.action.admin.indices.template.put.PutIndexTemplateRequest;
import org.elasticsearch.action.admin.indices.upgrade.get.UpgradeStatusRequest;
import org.elasticsearch.action.admin.indices.upgrade.post.UpgradeRequest;
import org.elasticsearch.action.admin.indices.validate.query.ValidateQueryRequest;
import org.elasticsearch.action.bulk.BulkRequest;
import org.elasticsearch.action.fieldcaps.FieldCapabilitiesRequest;
import org.elasticsearch.action.get.MultiGetRequest;
import org.elasticsearch.action.get.MultiGetRequest.Item;
import org.elasticsearch.action.search.ClearScrollRequest;
import org.elasticsearch.action.search.MultiSearchRequest;
import org.elasticsearch.action.search.SearchRequest;
import org.elasticsearch.action.support.replication.ReplicationRequest;
import org.elasticsearch.action.support.single.instance.InstanceShardOperationRequest;
import org.elasticsearch.action.support.single.shard.SingleShardRequest;
import org.elasticsearch.action.termvectors.MultiTermVectorsRequest;
import org.elasticsearch.action.termvectors.TermVectorsRequest;
import org.elasticsearch.index.reindex.DeleteByQueryRequest;
import org.elasticsearch.index.reindex.ReindexRequest;
import org.elasticsearch.index.reindex.UpdateByQueryRequest;
import org.elasticsearch.rest.RestRequest;

public class RequestUtils {
	public static final String CLIENT_IP_ADDRESS = "ClientIPAddress";

	public static String getClientIPAddress(RestRequest request) {
		SocketAddress socketAddress = request.getHttpChannel().getRemoteAddress();
		if (socketAddress instanceof InetSocketAddress address) {
			return address.getAddress().getHostAddress();
		}

		return null;
	}

	// To support all kinds of request in elasticsearch
	public static <Request extends ActionRequest> List<String> getIndexFromRequest(Request request) {
		List<String> indexs = new ArrayList<>();

		if (request instanceof SingleShardRequest<?> shardRequest) {
			indexs.add(shardRequest.index());
			return indexs;
		}

		if (request instanceof ReplicationRequest<?> replicationRequest) {
			indexs.add(replicationRequest.index());
			return indexs;
		}

		if (request instanceof InstanceShardOperationRequest<?> operationRequest) {
			indexs.add(operationRequest.index());
			return indexs;
		}

		if (request instanceof CreateIndexRequest indexRequest) {
			indexs.add(indexRequest.index());
			return indexs;
		}

		if (request instanceof PutMappingRequest mappingRequest) {
			if (mappingRequest.getConcreteIndex() != null) {
				indexs.add(mappingRequest.getConcreteIndex().getName());
				return indexs;
			} else {
				return Arrays.asList(mappingRequest.indices());
			}
		}

		if (request instanceof SearchRequest searchRequest) {
			return Arrays.asList(searchRequest.indices());
		}

		if (request instanceof IndicesStatsRequest statsRequest) {
			return Arrays.asList(statsRequest.indices());
		}

		if (request instanceof OpenIndexRequest indexRequest) {
			return Arrays.asList(indexRequest.indices());
		}

		if (request instanceof DeleteIndexRequest indexRequest) {
			return Arrays.asList(indexRequest.indices());
		}

		if (request instanceof BulkRequest bulkRequest) {
			@SuppressWarnings("rawtypes") List<DocWriteRequest<?>> requests = bulkRequest.requests();

			if (CollectionUtils.isNotEmpty(requests)) {
				for (DocWriteRequest<?> docWriteRequest : requests) {
					indexs.add(docWriteRequest.index());
				}
				return indexs;
			}
		}

		if (request instanceof MultiGetRequest getRequest) {
			List<Item> items = getRequest.getItems();
			if (CollectionUtils.isNotEmpty(items)) {
				for (Item item : items) {
					indexs.add(item.index());
				}
				return indexs;
			}
		}

		if (request instanceof GetMappingsRequest mappingsRequest) {
			return Arrays.asList(mappingsRequest.indices());
		}

		if (request instanceof GetSettingsRequest settingsRequest) {
			return Arrays.asList(settingsRequest.indices());
		}

		if (request instanceof IndicesExistsRequest existsRequest) {
			return Arrays.asList(existsRequest.indices());
		}

		if (request instanceof GetAliasesRequest aliasesRequest) {
			return Arrays.asList(aliasesRequest.indices());
		}

		if (request instanceof GetIndexRequest indexRequest) {
			return Arrays.asList(indexRequest.indices());
		}

		if (request instanceof GetFieldMappingsRequest mappingsRequest) {
			return Arrays.asList(mappingsRequest.indices());
		}

		if (request instanceof TypesExistsRequest existsRequest) {
			return Arrays.asList(existsRequest.indices());
		}

		if (request instanceof ValidateQueryRequest queryRequest) {
			return Arrays.asList(queryRequest.indices());
		}

		if (request instanceof RecoveryRequest recoveryRequest) {
			return Arrays.asList(recoveryRequest.indices());
		}

		if (request instanceof IndicesSegmentsRequest segmentsRequest) {
			return Arrays.asList(segmentsRequest.indices());
		}

		if (request instanceof IndicesShardStoresRequest storesRequest) {
			return Arrays.asList(storesRequest.indices());
		}

		if (request instanceof UpgradeStatusRequest statusRequest) {
			return Arrays.asList(statusRequest.indices());
		}

		if (request instanceof ClusterSearchShardsRequest shardsRequest) {
			return Arrays.asList(shardsRequest.indices());
		}

		if (request instanceof IndicesAliasesRequest aliasesRequest) {
			List<IndicesAliasesRequest.AliasActions> aliasActions = aliasesRequest.getAliasActions();
			if (CollectionUtils.isNotEmpty(aliasActions)) {
				for (IndicesAliasesRequest.AliasActions action : aliasActions) {
					indexs.addAll(Arrays.asList(action.indices()));
				}
				return indexs;
			}
		}

		if (request instanceof ClearIndicesCacheRequest cacheRequest) {
			return Arrays.asList(cacheRequest.indices());
		}

		if (request instanceof CloseIndexRequest indexRequest) {
			return Arrays.asList(indexRequest.indices());
		}

		if (request instanceof FlushRequest flushRequest) {
			return Arrays.asList(flushRequest.indices());
		}

		if (request instanceof SyncedFlushRequest flushRequest) {
			return Arrays.asList(flushRequest.indices());
		}

		if (request instanceof ForceMergeRequest mergeRequest) {
			return Arrays.asList(mergeRequest.indices());
		}

		if (request instanceof RefreshRequest refreshRequest) {
			return Arrays.asList(refreshRequest.indices());
		}

		if (request instanceof RolloverRequest rolloverRequest) {
			return Arrays.asList(rolloverRequest.indices());
		}

		if (request instanceof UpdateSettingsRequest settingsRequest) {
			return Arrays.asList(settingsRequest.indices());
		}

		if (request instanceof ResizeRequest resizeRequest) {
			return Arrays.asList(resizeRequest.indices());
		}

		if (request instanceof DeleteIndexTemplateRequest templateRequest) {
			indexs.add(templateRequest.name());
			return indexs;
		}

		if (request instanceof GetIndexTemplatesRequest templatesRequest) {
			return Arrays.asList(templatesRequest.names());
		}

		if (request instanceof PutIndexTemplateRequest templateRequest) {
			indexs.add(templateRequest.name());
			return indexs;
		}

		if (request instanceof UpgradeRequest upgradeRequest) {
			return Arrays.asList(upgradeRequest.indices());
		}

		if (request instanceof FieldCapabilitiesRequest capabilitiesRequest) {
			return Arrays.asList(capabilitiesRequest.indices());
		}

		if (request instanceof MultiSearchRequest searchRequest) {
			List<SearchRequest> searchRequests = searchRequest.requests();
			if (CollectionUtils.isNotEmpty(searchRequests)) {
				for (SearchRequest singleRequest : searchRequests) {
					indexs.addAll(Arrays.asList(singleRequest.indices()));
				}
				return indexs;
			}
		}

		if (request instanceof MultiTermVectorsRequest vectorsRequest) {
			List<TermVectorsRequest> termVectorsRequests = vectorsRequest.getRequests();
			if (CollectionUtils.isNotEmpty(termVectorsRequests)) {
				for (TermVectorsRequest singleRequest : termVectorsRequests) {
					indexs.addAll(Arrays.asList(singleRequest.indices()));
				}
				return indexs;
			}
		}

		if (request instanceof UpdateByQueryRequest queryRequest) {
			return Arrays.asList(queryRequest.indices());
		}

		if (request instanceof DeleteByQueryRequest queryRequest) {
			return Arrays.asList(queryRequest.indices());
		}

		if (request instanceof ReindexRequest reindexRequest) {
			indexs.addAll(Arrays.asList(reindexRequest.getSearchRequest().indices()));
			indexs.addAll(Arrays.asList(reindexRequest.getDestination().indices()));
			return indexs;
		}

		//ClearScrollRequest does not carry any index, so return empty List
		if (request instanceof ClearScrollRequest) {
			return indexs;
		}

		// No matched request type to find specific index , set default value *
		indexs.add("*");
		return indexs;
	}
}
