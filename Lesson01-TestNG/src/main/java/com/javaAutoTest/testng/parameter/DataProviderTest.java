package com.javaAutoTest.testng.parameter;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

/**
 * AUTHOR:miko
 * EMAIL:273715955@qq.com
 * TIME:2023/3/28 15:03
 * PACKAGE:com.javaAutoTest.testng.parameter
 * PROJECT:AutoTest20230324
 **/
public class DataProviderTest {
    @Test(dataProvider = "data")
    public void testDataProvider(String name, int age) {
        System.out.println("name is " + name + ";age is " + age);
    }

    @DataProvider(name = "data")
    public Object[][] providerData() {
        Object[][] o = new Object[][]{
                {"zhangsan", 10},
                {"lisi", 20},
                {"wangwu", 30}
        };
        return o;
    }

    @Test(dataProvider = "methodProvider")
    public void test01(String name, int age) {
        System.out.println("test01方法：name:" + name + ",age:" + age);
    }
    @Test(dataProvider = "methodProvider")
    public void test02(String name, int age) {
        System.out.println("test02方法：name:" + name + ",age:" + age);
    }
    @DataProvider(name = "methodProvider")
    public Object[][] methodDataTest(Method method) {
        Object[][] result = null;
        if (method.getName().equals("test01")) {
            result = new Object[][]{
                    {"zhangsan", 11},
                    {"lisi", 21},
                    {"liuzi",23}
            };
        } else if (method.getName().equals("test02")) {
            result = new Object[][]{
                    {"wangwu", 50},
                    {"zhangsan", 60}
            };
        }return result;
    }
}
