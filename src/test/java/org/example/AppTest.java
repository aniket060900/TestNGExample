package org.example;

import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.testng.annotations.Test;


/**
 * Unit test for simple App.
 */
public class AppTest {

    @Test(priority = 1)
    public void openbrowser() {
        System.out.println("openbrowser");
    }

    @Test(priority = 2)
    public void ums() {
        System.out.println("ums");
    }

    @Test(priority = 3)
    public void openhomepage() {
        System.out.println("openhomepage");
    }
    @Test(priority = 4)
    public void closeums() {
        System.out.println("closeums");
    }

    @Test(priority = 5)
    public void closebrowser() {
        System.out.println("closebrowser");
    }
}