package com.tabwu.sdjc.service;

import com.tabwu.sdjc.entity.User;

import java.util.List;

/**
 * @PROJECT_NAME: sdjc-demo
 * @USER: tabwu
 * @DATE: 2023/7/21 9:14
 * @DESCRIPTION:
 */
public interface UserService {

    void addUser(User user);

    User queryUserByUid(int uid);

    List<User> queryUserList(int lower, int upper);

    List<User> queryUserListByUidRangeAndAgePrecise(int lower, int upper, int age);
}
