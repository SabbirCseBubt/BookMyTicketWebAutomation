package com.makemytrip.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.makemytrip.base.BaseTest;

public class LoginPage extends BaseTest {
    @FindBy(xpath = "//span[@class='landingSprite myIconWhite']")
     WebElement login;

    @FindBy(xpath = "//input[@placeholder='Enter Mobile Number']")
     WebElement EnterMobile;

    @FindBy(xpath = "//span[normalize-space()='Continue']")
     WebElement continueButton;

    public LoginPage() {
    	super();
        PageFactory.initElements(driver, this);
    }

    public void login() {
    	login.click();
    }

    public void enterMobile() {
    	EnterMobile.sendKeys("9868101234");
    }

    public void continueBtn() {
        continueButton.click();
    }
}