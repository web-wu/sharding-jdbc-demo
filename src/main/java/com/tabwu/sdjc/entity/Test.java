package com.tabwu.sdjc.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @PROJECT_NAME: sdjc-demo
 * @USER: tabwu
 * @DATE: 2023/7/21 15:26
 * @DESCRIPTION:
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("test")
public class Test {

    private int id;

    private String msg;
}
