package com.tabwu.shardingJdbc;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @PROJECT_NAME: sharding-jdbc-demo
 * @USER: tabwu
 * @DATE: 2023/7/20 9:07
 * @DESCRIPTION:
 */
@SpringBootApplication
@MapperScan("com.tabwu.shardingJdbc.mapper")
public class ShardingApplication {
    public static void main(String[] args) {
        SpringApplication.run(ShardingApplication.class, args);
    }
}
