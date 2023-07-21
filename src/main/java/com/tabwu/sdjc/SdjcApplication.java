package com.tabwu.sdjc;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @PROJECT_NAME: sdjc-demo
 * @USER: tabwu
 * @DATE: 2023/7/20 17:19
 * @DESCRIPTION:
 */
@SpringBootApplication
@MapperScan("com.tabwu.sdjc.mapper")
public class SdjcApplication {
    public static void main(String[] args) {
        SpringApplication.run(SdjcApplication.class, args);
    }
}
