package com.tabwu.sdjc.algorithm.table;

import org.apache.shardingsphere.api.sharding.standard.PreciseShardingAlgorithm;
import org.apache.shardingsphere.api.sharding.standard.PreciseShardingValue;

import java.util.Collection;

/**
 * @PROJECT_NAME: sdjc-demo
 * @USER: tabwu
 * @DATE: 2023/7/21 9:48
 * @DESCRIPTION:
 */
public class MyTableStandardPreciseAlgorithm implements PreciseShardingAlgorithm<Integer> {

    /**
     * @param collection            上级确定的数据源中的 表集合 如：user_1,user_2
     * @param preciseShardingValue  包含 逻辑表名、分片键、分片键值
     * @return                      返回实际需要使用的 表
     */
    @Override
    public String doSharding(Collection<String> collection, PreciseShardingValue<Integer> preciseShardingValue) {
//        Integer uid = preciseShardingValue.getValue();
//        String tableName = "user_" + (uid % collection.size() + 1);
//        if (!collection.contains(tableName)) {
//            throw new RuntimeException("没有定义该数据源---" + tableName);
//        }
//        return tableName;

        for (String tableName : collection) {
            Integer uid = preciseShardingValue.getValue();
            if (tableName.endsWith(uid % collection.size() + 1 + "")) {
                return tableName;
            }
        }
        throw new IllegalArgumentException();
    }
}
