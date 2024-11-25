package com.testingpractice.test;

import com.testingpractice.pages.pageFactory.LoginPage_PF;
import com.testingpractice.test.base.CommonToAllTest;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.testingpractice.driver.DriverManager.driver;

public class TestVWOLogin_PF_DM extends CommonToAllTest {

    private static final Logger logger = LogManager.getLogger(TestVWOLogin_PF_DM.class);


    @Test
    public void LoginNegative() {

        logger.info("Starting Test");
        LoginPage_PF loginPage_pf = new LoginPage_PF(driver);

        logger.info("Opening Url");
        loginPage_pf.OpenLoginURL();

        String error_msg = loginPage_pf.LoginInvalid();

        Assert.assertEquals(error_msg, "Your email, password, IP address or location did not match");
        driver.quit();

    }


}
