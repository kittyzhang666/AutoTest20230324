package com.javaAutoTest.testng;

import org.testng.annotations.Test;

/**
 * AUTHOR:miko
 * EMAIL:273715955@qq.com
 * TIME:2023/3/28 11:28
 * PACKAGE:com.javaAutoTest.testng
 * PROJECT:AutoTest20230324
 **/
public class DependTest {
    @Test
    public void test01(){
        System.out.println("test01 run");
        throw new RuntimeException();
    }
    @Test(dependsOnMethods = {"test01"})
    public void test02(){
        System.out.println("test02 run");

    }
}
