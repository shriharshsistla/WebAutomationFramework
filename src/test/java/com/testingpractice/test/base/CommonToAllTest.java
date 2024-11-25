package com.testingpractice.test.base;

import com.testingpractice.driver.DriverManager;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class CommonToAllTest {
    // Call , Start , quit Driver

    @BeforeMethod
    public void setupDriver(){
        DriverManager.init();
    }

    @AfterMethod
    public void tearDown(){
        DriverManager.down();
    }

}
