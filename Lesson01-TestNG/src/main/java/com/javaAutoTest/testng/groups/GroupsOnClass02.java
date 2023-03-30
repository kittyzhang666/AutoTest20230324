package com.javaAutoTest.testng.groups;

import org.testng.annotations.Test;

/**
 * AUTHOR:miko
 * EMAIL:273715955@qq.com
 * TIME:2023/3/28 10:19
 * PACKAGE:com.javaAutoTest.testng.groups
 * PROJECT:AutoTest20230324
 **/
@Test(groups="user")
public class GroupsOnClass02 {
    public void user01(){
        System.out.println("GroupsOnClass02中的user01");
    }
    public void user02(){
        System.out.println("GroupsOnClass02中的user02");
    }

}
