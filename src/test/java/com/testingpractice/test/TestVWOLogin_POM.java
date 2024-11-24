package com.testingpractice.test;

import com.testingpractice.pages.PageObjectModel.LoginPage_POM;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestVWOLogin_POM {

    @Test
    public void LoginNegative() {

        WebDriver driver = new EdgeDriver();
        LoginPage_POM loginPage_pom = new LoginPage_POM(driver);
        String error_msg_text = loginPage_pom.loginInvalid("admin@gmail.com", "admin");

        Assert.assertEquals(error_msg_text, "Your email, password, IP address or location did not match");
        driver.quit();

    }

    @Test
    public void LoginNegative2() {

        WebDriver driver = new EdgeDriver();
        LoginPage_POM loginPage_pom = new LoginPage_POM(driver);
        String error_msg_text = loginPage_pom.loginInvalid("shri@gmail.com", "shri");

        Assert.assertEquals(error_msg_text, "Your email, password, IP address or location did not match");
        driver.quit();

    }
}
