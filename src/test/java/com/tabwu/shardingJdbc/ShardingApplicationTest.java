package com.tabwu.shardingJdbc;

import com.tabwu.shardingJdbc.entity.User;
import com.tabwu.shardingJdbc.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @PROJECT_NAME: sharding-jdbc-demo
 * @USER: tabwu
 * @DATE: 2023/7/20 9:20
 * @DESCRIPTION:
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class ShardingApplicationTest {

    @Autowired
    private UserService userService;

    @Test
    public void addUser() {
        for (int i = 1; i < 10; i++) {
            User user = new User();
            user.setUid(i);
            user.setUsername("tabwu" + i);
            user.setAge(27 + i);
            userService.addUser(user);
        }
    }

    @Test
    public void queryUser() {
        User user = userService.queryUserById(1);
        System.out.println("=======================" + user + "======================");
    }
}
