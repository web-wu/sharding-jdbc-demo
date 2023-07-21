package com.tabwu.sdjc;

import com.tabwu.sdjc.entity.User;
import com.tabwu.sdjc.service.TestService;
import com.tabwu.sdjc.service.UserService;
import org.apache.shardingsphere.api.hint.HintManager;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

/**
 * @PROJECT_NAME: sdjc-demo
 * @USER: tabwu
 * @DATE: 2023/7/21 9:17
 * @DESCRIPTION:
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class SdjcApplicationTest {

    @Resource
    private UserService userService;
    @Resource
    private TestService testService;

    @Test
    public void addUser() {
        for (int i = 1; i < 10; i++) {
            User user = new User(i, "tabwu" + i, 12 + i);
            userService.addUser(user);
        }
    }

    @Test
    public void addTest() {
        for (int i = 1; i <= 10; i++) {
            com.tabwu.sdjc.entity.Test test = new com.tabwu.sdjc.entity.Test(i, "test" + i);
            testService.addTest(test);
        }
    }

    @Test
    public void queryUserPrecise() {
        User user = userService.queryUserByUid(2);
        System.out.println(user);
    }


    @Test
    public void queryUserRange() {
        List<User> users = userService.queryUserList(2, 5);
        System.out.println(users);
    }

    @Test
    public void queryUserRangeAndPrecise() {
        List<User> users = userService.queryUserListByUidRangeAndAgePrecise(2, 5, 15);
        System.out.println(users);
    }


    @Test
    public void hintTest() {
        HintManager.clear();
        HintManager instance = HintManager.getInstance();
//        instance.addDatabaseShardingValue("user", 1);  强制指定只去 user_1 表中查询
        instance.addTableShardingValue("user", 1);
        List<User> users = userService.queryUserList(2, 5);
        System.out.println(users);
    }



}



