package com.javaAutoTest.testng.asserts;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * AUTHOR:miko
 * EMAIL:273715955@qq.com
 * TIME:2023/4/3 11:10
 * PACKAGE:com.javaAutoTest.testng.asserts
 * PROJECT:AutoTest20230324
 **/
public class AssertTest {
    @Test
    public void test01(){
        Assert.assertEquals(1,2);
    }
    @Test
    public void test02(){
        Assert.assertEquals(1,1);
    }
    @Test
    public void test03(){
        Assert.assertEquals("abc","abc");
    }
    //@Test
    /*
    public void test04(){
        Reporter.log("run ok!");
        throw new RuntimeException("my error log");
    }*/
}
