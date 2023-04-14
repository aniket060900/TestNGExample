package org.example;

import org.testng.Assert;
import org.testng.annotations.Test;
public class DependencyExample {
    @Test
    void login(){
        System.out.println("login to ums");
    }
    @Test(dependsOnMethods = "login")
    void accessHomepage(){
        System.out.println("access to home page");
        Assert.fail();
    }
    @Test(dependsOnMethods = {"login","accessHomepage"},alwaysRun = true)
    void accessAnnouncement(){
        System.out.println("view Announcement");
    }
}