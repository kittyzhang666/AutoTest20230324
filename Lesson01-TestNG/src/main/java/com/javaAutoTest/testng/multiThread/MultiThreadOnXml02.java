package com.javaAutoTest.testng.multiThread;

import org.testng.annotations.Test;

/**
 * AUTHOR:miko
 * EMAIL:273715955@qq.com
 * TIME:2023/3/30 9:45
 * PACKAGE:com.javaAutoTest.testng.multiThread
 * PROJECT:AutoTest20230324
 **/
public class MultiThreadOnXml02 {
    @Test
    public void test01(){
        System.out.printf("MultiThreadOnXml02.test01-Thread id is %s%n",Thread.currentThread().getId());
    }
    @Test
    public void test02(){
        System.out.printf("MultiThreadOnXml02.test01-Thread id is %s%n",Thread.currentThread().getId());
    }
    @Test
    public void test03(){
        System.out.printf("MultiThreadOnXml02.test01-hread id is %s%n",Thread.currentThread().getId());
    }
}
