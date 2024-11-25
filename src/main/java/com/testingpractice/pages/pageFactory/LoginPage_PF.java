package com.testingpractice.pages.pageFactory;

import com.testingpractice.base.CommonToAllPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage_PF extends CommonToAllPage {
    WebDriver driver;

    public LoginPage_PF(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }


    //Page locators
    @FindBy(id="login-username")
    private WebElement username;

    @FindBy(id="login-password")
    private WebElement password;

    @FindBy(id="js-login-btn")
    private WebElement signInBtn;

    @FindBy(id="js-notification-box-msg")
    private WebElement error_message;

    //Actions

    public String LoginInvalid(){

        enterInput(username,"admin@admin.com");
        enterInput(password,"usp");
        clickElement(signInBtn);

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        return getElement(error_message).getText();
    }

}
