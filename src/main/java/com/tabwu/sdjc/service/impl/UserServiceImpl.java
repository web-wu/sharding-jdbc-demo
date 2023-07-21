package com.tabwu.sdjc.service.impl;

import com.tabwu.sdjc.entity.User;
import com.tabwu.sdjc.mapper.UserMapper;
import com.tabwu.sdjc.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @PROJECT_NAME: sdjc-demo
 * @USER: tabwu
 * @DATE: 2023/7/21 9:15
 * @DESCRIPTION:
 */
@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public void addUser(User user) {
        userMapper.addUser(user);
    }

    @Override
    public User queryUserByUid(int uid) {
        return userMapper.queryUserByUid(uid);
    }

    @Override
    public List<User> queryUserList(int lower, int upper) {
        return userMapper.queryUserList(lower, upper);
    }

    @Override
    public List<User> queryUserListByUidRangeAndAgePrecise(int lower, int upper, int age) {
        return userMapper.queryUserListByUidRangeAndAgePrecise(lower, upper, age);
    }
}
