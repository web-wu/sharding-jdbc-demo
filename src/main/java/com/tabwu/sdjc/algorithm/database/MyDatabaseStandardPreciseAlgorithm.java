package com.tabwu.sdjc.algorithm.database;

import org.apache.shardingsphere.api.sharding.standard.PreciseShardingAlgorithm;
import org.apache.shardingsphere.api.sharding.standard.PreciseShardingValue;

import java.util.Collection;

/**
 * @PROJECT_NAME: sdjc-demo
 * @USER: tabwu
 * @DATE: 2023/7/21 9:42
 * @DESCRIPTION:
 */
public class MyDatabaseStandardPreciseAlgorithm implements PreciseShardingAlgorithm<Integer> {

    /**
      * @param collection           配置文件中定义的 数据源 集合 如：ds1,ds2
     * @param preciseShardingValue  包含 逻辑表名、分片键、分片键值
     * @return                      返回实际需要使用的 数据源
     */
    @Override
    public String doSharding(Collection<String> collection, PreciseShardingValue<Integer> preciseShardingValue) {

//        Integer uid = preciseShardingValue.getValue();
//        String databaseName = "ds" + (uid % collection.size() + 1);
//        if (!collection.contains(databaseName)) {
//            throw new RuntimeException("没有定义该数据源---" + databaseName);
//        }
//        return databaseName;

        for (String database : collection) {
            Integer uid = preciseShardingValue.getValue();
            if (database.endsWith(uid % collection.size() + 1 + "")) {
                return database;
            }
        }
        throw new IllegalArgumentException();
    }
}
