package com.tabwu.shardingJdbc.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.tabwu.shardingJdbc.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * @PROJECT_NAME: sharding-jdbc-demo
 * @USER: tabwu
 * @DATE: 2023/7/20 9:08
 * @DESCRIPTION:
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {

    @Insert("insert into `user` values(#{uid}, #{username}, #{age});")
    int addUser(User user);

    @Select("select * from `user` where uid = #{uid};")
    User queryUserById(int uid);
}
