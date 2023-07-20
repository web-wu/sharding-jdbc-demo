package com.tabwu.shardingJdbc.service;

import com.tabwu.shardingJdbc.entity.User;

/**
 * @PROJECT_NAME: sharding-jdbc-demo
 * @USER: tabwu
 * @DATE: 2023/7/20 9:16
 * @DESCRIPTION:
 */
public interface UserService {

    int addUser(User user);

    User queryUserById(int uid);
}
