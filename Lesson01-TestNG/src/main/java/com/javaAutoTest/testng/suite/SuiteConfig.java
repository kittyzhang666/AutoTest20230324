package com.javaAutoTest.testng.suite;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

/**
 * AUTHOR:miko
 * EMAIL:273715955@qq.com
 * TIME:2023/3/27 11:22
 * PACKAGE:com.javaAutoTest.testng.suite
 * PROJECT:AutoTest20230324
 **/
public class SuiteConfig {
    @BeforeSuite
    public void beforSuite(){
        System.out.println("=======Befor Suite run=======");
    }
    @AfterSuite
    public void afterSuite(){
        System.out.println("=======After Suite run=======");
    }
    @BeforeTest
    public void beforeTest(){
        System.out.println("-----BeforeTest-----");
    }
    @AfterTest
    public void afterTest(){
        System.out.println("-----AfterTest-----");
    }
}
