package com.testingpractice.test;

import com.testingpractice.pages.pageFactory.LoginPage_PF;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.testingpractice.driver.DriverManager.driver;

public class TestVWOLogin_PF {

    @Test
    public void LoginNegative() {


        LoginPage_PF loginPage_pf = new LoginPage_PF(driver);
        String error_msg=loginPage_pf.LoginInvalid();

        Assert.assertEquals(error_msg, "Your email, password, IP address or location did not match");
        driver.quit();

    }


}
