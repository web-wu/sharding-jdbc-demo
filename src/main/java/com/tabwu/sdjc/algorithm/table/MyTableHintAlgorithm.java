package com.tabwu.sdjc.algorithm.table;

import org.apache.shardingsphere.api.sharding.hint.HintShardingAlgorithm;
import org.apache.shardingsphere.api.sharding.hint.HintShardingValue;

import java.util.Arrays;
import java.util.Collection;

/**
 * @PROJECT_NAME: sdjc-demo
 * @USER: tabwu
 * @DATE: 2023/7/21 14:23
 * @DESCRIPTION:
 */
public class MyTableHintAlgorithm implements HintShardingAlgorithm<Integer> {

    @Override
    public Collection<String> doSharding(Collection<String> collection, HintShardingValue<Integer> hintShardingValue) {
        String table = hintShardingValue.getLogicTableName() + "_" + hintShardingValue.getValues().toArray()[0];
        for (String tableName : collection) {
            if (tableName.endsWith(table)) {
                return Arrays.asList(tableName);
            }
        }
        return null;
    }
}
