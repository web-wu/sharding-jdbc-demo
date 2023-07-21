package com.tabwu.sdjc.algorithm.table;

import org.apache.shardingsphere.api.sharding.standard.RangeShardingAlgorithm;
import org.apache.shardingsphere.api.sharding.standard.RangeShardingValue;

import java.util.Collection;
import java.util.HashSet;

/**
 * @PROJECT_NAME: sdjc-demo
 * @USER: tabwu
 * @DATE: 2023/7/21 10:28
 * @DESCRIPTION:
 */
public class MyTableStandardRangeAlgorithm implements RangeShardingAlgorithm<Integer> {

    @Override
    public Collection<String> doSharding(Collection<String> collection, RangeShardingValue<Integer> rangeShardingValue) {
        Integer lower = rangeShardingValue.getValueRange().lowerEndpoint();
        Integer upper = rangeShardingValue.getValueRange().upperEndpoint();
        HashSet<String> tableSet = new HashSet<>();
        for (int i = lower; i <= upper; i++) {
            for (String tableName : collection) {
                if (tableName.endsWith(i % collection.size() + 1 + "")) {
                    tableSet.add(tableName);
                }
            }
        }
        return tableSet;

        /* 范围查询实际是将所有库与所有表返回
        return collection;*/
    }
}
