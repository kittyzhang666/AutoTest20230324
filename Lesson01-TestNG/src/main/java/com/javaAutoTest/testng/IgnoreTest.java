package com.javaAutoTest.testng;

import org.testng.annotations.Test;

/**
 * AUTHOR:miko
 * EMAIL:273715955@qq.com
 * TIME:2023/3/28 9:32
 * PACKAGE:com.javaAutoTest.testng
 * PROJECT:AutoTest20230324
 **/
public class IgnoreTest {
    @Test
    public void ignoreTest01(){
        System.out.println("IgnoreTest01 执行！");
    }
    @Test(enabled = false)
    public void ignoreTest02(){
        System.out.println("IgnoreTest02 执行！");
    }
    @Test(enabled = true)
    public void ignoreTest03(){
        System.out.println("IgnoreTest03 执行！");
    }
}
