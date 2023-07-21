package com.tabwu.sdjc.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @PROJECT_NAME: sdjc-demo
 * @USER: tabwu
 * @DATE: 2023/7/20 17:21
 * @DESCRIPTION:
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    private int uid;
    private String username;
    private int age;
}
