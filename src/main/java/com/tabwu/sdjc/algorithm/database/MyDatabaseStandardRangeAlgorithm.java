package com.tabwu.sdjc.algorithm.database;

import org.apache.shardingsphere.api.sharding.standard.RangeShardingAlgorithm;
import org.apache.shardingsphere.api.sharding.standard.RangeShardingValue;

import java.util.Collection;

/**
 * @PROJECT_NAME: sdjc-demo
 * @USER: tabwu
 * @DATE: 2023/7/21 10:27
 * @DESCRIPTION:
 */
public class MyDatabaseStandardRangeAlgorithm implements RangeShardingAlgorithm<Integer> {

    /**
     * @param collection
     * @param rangeShardingValue
     * @return
     */
    @Override
    public Collection<String> doSharding(Collection<String> collection, RangeShardingValue<Integer> rangeShardingValue) {
        Integer lowerEndpoint = rangeShardingValue.getValueRange().lowerEndpoint();
        Integer upperEndpoint = rangeShardingValue.getValueRange().upperEndpoint();
        return collection;
    }
}
