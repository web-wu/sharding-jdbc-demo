package com.tabwu.sdjc.algorithm.table;

import org.apache.shardingsphere.api.sharding.complex.ComplexKeysShardingAlgorithm;
import org.apache.shardingsphere.api.sharding.complex.ComplexKeysShardingValue;

import java.util.Collection;
import java.util.HashSet;

/**
 * @PROJECT_NAME: sdjc-demo
 * @USER: tabwu
 * @DATE: 2023/7/21 13:30
 * @DESCRIPTION:
 */
public class MyTableComplexAlgorithm implements ComplexKeysShardingAlgorithm<Integer> {
    @Override
    public Collection<String> doSharding(Collection<String> collection, ComplexKeysShardingValue<Integer> complexKeysShardingValue) {
        Collection<Integer> uids = complexKeysShardingValue.getColumnNameAndShardingValuesMap().get("uid");
        Collection<Integer> ages = complexKeysShardingValue.getColumnNameAndShardingValuesMap().get("age");

        HashSet<String> tableSet = new HashSet<>();
        for (Integer age : ages) {
            tableSet.add(complexKeysShardingValue.getLogicTableName() + "_" + (age % collection.size() + 1));
        }
        return tableSet;
    }
}
