package com.javaAutoTest.testng.parameter;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 * AUTHOR:miko
 * EMAIL:273715955@qq.com
 * TIME:2023/3/28 14:37
 * PACKAGE:com.javaAutoTest.testng.paramter
 * PROJECT:AutoTest20230324
 **/
public class ParameterTest {
    @Test
    @Parameters({"name","age"})
    public void patameterTest01(String name,int age){
        System.out.println("姓名："+name+"，年龄："+age);
    }
}
