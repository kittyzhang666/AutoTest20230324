package com.javaAutoTest.testng;
import org.testng.annotations.*;
import org.testng.annotations.Test;

public class BasicAnnotation {
    //TestNG注解
    @Test
    public void testCase01(){
        System.out.println("Test--this is testcase 01");
    }

    @Test
    public void testCase02(){
        System.out.println("Test--this is testcase 02");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("beforeMethod--this is beforeMethod 在测试方法之前运行的");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("AfterMethod--this is afterMethod 在测试方法之后运行的方法");
    }
    @BeforeClass
    public void beforeClass(){
        System.out.println("beforeClass--this is beforeClass 在类运行之前运行的方法");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("afterClass--this is afterClass 在类运行之后运行的方法");
    }
    @BeforeSuite
    public void beforeSuit(){
        System.out.println("beforeSuit测试套件");
    }

    @AfterSuite
    public void afterSuit(){
        System.out.println("afterSuit测试套件");
    }
}
