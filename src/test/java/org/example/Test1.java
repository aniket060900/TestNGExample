package org.example;
import org.testng.annotations.*;

public class Test1 {
    @BeforeSuite
    void beforesuite(){
        System.out.println("This will run before every suite");

    }
    @AfterSuite
    void aftersuite(){
        System.out.println("This will run after every suite");

    }
    @BeforeClass
    void beforeclass(){
        System.out.println("This will run before every class");

    }
    @AfterClass
    void afterclass(){
        System.out.println("This will run after every class");

    }
    @BeforeTest
    void beforetest(){
        System.out.println("This will run before every test");

    }
    @AfterTest
    void aftertest(){
        System.out.println("This will run after every test");

    }
    @BeforeMethod
    void beforemethod(){
        System.out.println("This will run before every method");

    }
    @AfterMethod
    void aftermethod(){
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
