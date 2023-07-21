package com.tabwu.sdjc.service.impl;

import com.tabwu.sdjc.entity.Test;
import com.tabwu.sdjc.mapper.TestMapper;
import com.tabwu.sdjc.service.TestService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @PROJECT_NAME: sdjc-demo
 * @USER: tabwu
 * @DATE: 2023/7/21 15:31
 * @DESCRIPTION:
 */
@Service
public class TestServiceImpl implements TestService {

    @Resource
    private TestMapper testMapper;

    @Override
    public void addTest(Test test) {
        testMapper.addTest(test);
    }

    @Override
    public Test queryTestById(int id) {
        return testMapper.queryTestById(id);
    }
}
