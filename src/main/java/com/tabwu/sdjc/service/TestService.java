package com.tabwu.sdjc.service;

import com.tabwu.sdjc.entity.Test;

/**
 * @PROJECT_NAME: sdjc-demo
 * @USER: tabwu
 * @DATE: 2023/7/21 15:30
 * @DESCRIPTION:
 */
public interface TestService {

    void addTest(Test test);

    Test queryTestById(int id);
}
