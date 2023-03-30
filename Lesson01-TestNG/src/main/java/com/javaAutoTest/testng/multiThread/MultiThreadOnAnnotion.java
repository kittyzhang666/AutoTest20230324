package com.javaAutoTest.testng.multiThread;

import org.testng.annotations.Test;

/**
 * AUTHOR:miko
 * EMAIL:273715955@qq.com
 * TIME:2023/3/29 10:42
 * PACKAGE:com.javaAutoTest.testng.multiThread
 * PROJECT:AutoTest20230324
 **/
public class MultiThreadOnAnnotion {
    @Test(threadPoolSize = 2,invocationCount = 5)
    public void test(){
        System.out.println(1);
        System.out.printf("Thread Id: %s%n",Thread.currentThread().getId());
    }
}
