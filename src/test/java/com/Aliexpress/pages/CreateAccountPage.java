package com.Aliexpress.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateAccountPage extends BasePage{

    @FindBy(className = "fm-switch-action")
    public WebElement registerWithEmail;

    @FindBy(xpath = "//input[@placeholder=\"Email address\"]")
    public WebElement getEmail;

    @FindBy(xpath = "//input[@placeholder=\"Password\"]")
    public WebElement getPassword;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement submit;

    @FindBy(className = "fm-error-tip")
    public WebElement getError;

    @FindBy(className = "sign-btn")
    public WebElement siginButton;

    @FindBy(id = "fm-login-id")
    public WebElement signinEmail;

    @FindBy(id = "fm-login-password")
    public WebElement signinPassword;

}
