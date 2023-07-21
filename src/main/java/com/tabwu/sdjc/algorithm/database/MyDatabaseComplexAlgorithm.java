package com.tabwu.sdjc.algorithm.database;

import org.apache.shardingsphere.api.sharding.complex.ComplexKeysShardingAlgorithm;
import org.apache.shardingsphere.api.sharding.complex.ComplexKeysShardingValue;

import java.util.Collection;
import java.util.HashSet;

/**
 * @PROJECT_NAME: sdjc-demo
 * @USER: tabwu
 * @DATE: 2023/7/21 13:50
 * @DESCRIPTION:
 */
public class MyDatabaseComplexAlgorithm implements ComplexKeysShardingAlgorithm<Integer> {
    @Override
    public Collection<String> doSharding(Collection<String> collection, ComplexKeysShardingValue<Integer> complexKeysShardingValue) {
        Collection<Integer> uids = complexKeysShardingValue.getColumnNameAndShardingValuesMap().get("uid");
        Collection<Integer> ages = complexKeysShardingValue.getColumnNameAndShardingValuesMap().get("age");

        HashSet<String> databaseSet = new HashSet<>();
        for (Integer uid : uids) {
            databaseSet.add("ds" + (uid % collection.size() + 1));
        }
        return databaseSet;
    }
}
