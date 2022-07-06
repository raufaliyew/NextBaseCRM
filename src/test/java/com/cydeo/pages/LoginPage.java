package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(name = "USER_LOGIN")
    public WebElement username;

    @FindBy(name = "USER_PASSWORD")
    public WebElement password;

    @FindBy(id = "USER_REMEMBER")
    public WebElement rememberMeBtn;

    @FindBy(css = ".login-btn")
    public WebElement loginBtn;

    @FindBy(css = "div>a")
    public WebElement forgotPasswordBtn;

}
