package com.tabwu.shardingJdbc.entity;

import lombok.Data;

/**
 * @PROJECT_NAME: sharding-jdbc-demo
 * @USER: tabwu
 * @DATE: 2023/7/20 9:10
 * @DESCRIPTION:
 */
@Data
public class User {

    private int uid;
    private String username;
    private int age;
}
