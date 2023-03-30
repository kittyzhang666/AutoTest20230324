package com.javaAutoTest.testng.groups;

import org.testng.annotations.Test;

/**
 * AUTHOR:miko
 * EMAIL:273715955@qq.com
 * TIME:2023/3/28 10:19
 * PACKAGE:com.javaAutoTest.testng.groups
 * PROJECT:AutoTest20230324
 **/
@Test(groups = "manager")
public class GroupsOnClass03 {
    public void manager01(){
        System.out.println("GroupsOnClass03中的manager01");
    }
    public void manager02(){
        System.out.println("GroupsOnClass03中的manager02");
    }
}
