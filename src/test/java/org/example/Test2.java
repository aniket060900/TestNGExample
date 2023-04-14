package org.example;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test2 {
    @BeforeMethod
    void beforemethod(){
    System.out.println("This will run before every method");

}
    @AfterMethod
    void afteremethod(){
        System.out.println("This will run after every method");

    }
    @Test
    void test1(){
        System.out.println("print test1");

    }
    @Test
    void test2(){
        System.out.println("print test2");

    }
}
