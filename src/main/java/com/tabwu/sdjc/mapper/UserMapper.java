package com.tabwu.sdjc.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.tabwu.sdjc.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @PROJECT_NAME: sdjc-demo
 * @USER: tabwu
 * @DATE: 2023/7/20 17:21
 * @DESCRIPTION:
 */
public interface UserMapper extends BaseMapper<User> {

    @Insert("insert into `user` values(#{uid}, #{username}, #{age});")
    void addUser(User user);

    @Select("select * from user where uid = #{uid};")
    User queryUserByUid(int uid);

    @Select("select * from user where uid between #{lower} and #{upper};")
    List<User> queryUserList(int lower, int upper);

    @Select("select * from user where uid between #{lower} and #{upper} and age = #{age};")
    List<User> queryUserListByUidRangeAndAgePrecise(int lower, int upper, int age);
}
