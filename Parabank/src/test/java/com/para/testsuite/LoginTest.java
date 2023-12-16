package com.para.testsuite;

import com.para.pages.LoginPage;
import com.para.testbase.TestBase;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {
    LoginPage loginPage = new LoginPage();

    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials() throws InterruptedException {
        loginPage.EnterUserName();
        loginPage.EnterPassword();
        loginPage.ClickLogin();
        Thread.sleep(3000);
        loginPage.OverviewMsg();
        loginPage.ClickLogout();
    }
    @Test
    public void verifyTheErrorMessage() throws InterruptedException {
        loginPage.EnterInvalidUserName();
        loginPage.EnterInvalidPassword();
        loginPage.ClickLoginagin();
        loginPage.VerifyErrorMsg();
    }
}
