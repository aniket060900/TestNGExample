package org.example;

import org.testng.annotations.Test;

public class GroupingInTestNG {
    @Test(groups = "regression")
    void tests1(){
        System.out.println("tests1 regression");
    }
    @Test(groups = "critical")
    void tests2(){
        System.out.println("tests2 critical");
    }
    @Test(groups = "critical")
    void tests3(){
        System.out.println("tests3 critical");
    }
    @Test(groups = "regression")
    void tests4(){
        System.out.println("tests4 regression");
    }
    @Test(groups = {"critical","regression"})
    void tests5(){
        System.out.println("tests5 critical and regression");
    }
    @Test(groups = "critical")
    void tests6(){
        System.out.println("tests6 critical```");
    }
}
