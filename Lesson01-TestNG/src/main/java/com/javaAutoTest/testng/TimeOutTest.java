package com.javaAutoTest.testng;

import org.testng.annotations.Test;

/**
 * AUTHOR:miko
 * EMAIL:273715955@qq.com
 * TIME:2023/3/30 11:22
 * PACKAGE:com.javaAutoTest.testng
 * PROJECT:AutoTest20230324
 **/
public class TimeOutTest {
    @Test(timeOut = 3000)//单位为毫秒
    public void successTest() throws InterruptedException {
        Thread.sleep(2000);
    }
    @Test(timeOut = 1000)
    public void failedTest() throws InterruptedException {
        Thread.sleep(2000);
    }
}
