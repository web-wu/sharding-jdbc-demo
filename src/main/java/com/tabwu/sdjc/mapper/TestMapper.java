package com.tabwu.sdjc.mapper;

import com.tabwu.sdjc.entity.Test;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

/**
 * @PROJECT_NAME: sdjc-demo
 * @USER: tabwu
 * @DATE: 2023/7/21 15:26
 * @DESCRIPTION:
 */
public interface TestMapper {

    @Insert("insert into `test` values(#{id}, #{msg});")
    void addTest(Test test);

    @Select("select * from `test` where id = #{id};")
    Test queryTestById(int id);
}
