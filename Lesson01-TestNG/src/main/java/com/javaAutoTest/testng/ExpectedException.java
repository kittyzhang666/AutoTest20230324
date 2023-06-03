package com.javaAutoTest.testng;

import org.testng.annotations.Test;

/**
 * AUTHOR:miko
 * EMAIL:273715955@qq.com
 * TIME:2023/3/28 11:11
 * PACKAGE:com.javaAutoTest.testng
 * PROJECT:AutoTest20230324
 **/
public class ExpectedException {
    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeExceptionFailed(){
        System.out.println("这是一个失败的异常测试");
    }
    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeExceptionSuccess(){
        System.out.println("这是一个成功的异常测试");//注意要放到throw前一行
        throw new RuntimeException();
    }
}
