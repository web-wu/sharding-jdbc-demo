package com.tabwu.shardingJdbc.service.impl;

import com.tabwu.shardingJdbc.entity.User;
import com.tabwu.shardingJdbc.mapper.UserMapper;
import com.tabwu.shardingJdbc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @PROJECT_NAME: sharding-jdbc-demo
 * @USER: tabwu
 * @DATE: 2023/7/20 9:17
 * @DESCRIPTION:
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public int addUser(User user) {
        return userMapper.addUser(user);
    }

    @Override
    public User queryUserById(int uid) {
        return userMapper.queryUserById(uid);
    }
}
