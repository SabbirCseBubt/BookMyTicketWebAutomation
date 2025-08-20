package com.makemytrip.testcases;

import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.makemytrip.base.BaseTest;
import com.makemytrip.pages.LoginPage;

public class LoginPageTest extends BaseTest{
	
	@Test
    public void doLogin() {
        test = extent.createTest("Login to book Flight ");
        LoginPage login = new LoginPage();
        login.login();
        test.log(Status.INFO, "Clicked on Login Link");
        login.enterMobile();
        test.log(Status.INFO, "Entered Mobile Number");
        login.continueBtn();
        test.log(Status.INFO, "Clicked on Continue Button");
    }

}
