package com.ninja.testsuite;

import com.ninja.pages.MyAccountPage;
import com.ninja.testbase.TestBase;
import org.testng.annotations.Test;

public class MyAccountTest extends TestBase {

    MyAccountPage myAccountPage=new MyAccountPage();

    @Test
    public void verifyUserShouldNavigateToRegisterPageSuccessfully() throws InterruptedException {
        myAccountPage.ClickMyAccount();
        Thread.sleep(3000);
        myAccountPage.ClickRegister();
        myAccountPage.VerifyRegister();
        Thread.sleep(3000);

    }
    @Test
    public void verifyUserShouldNavigateToLoginPageSuccessfully() throws InterruptedException {
        myAccountPage.ClickMyAccount();
        myAccountPage.ClickLogin();
        myAccountPage.VerifyLogin();
    }
    @Test
    public void verifyThatUserRegisterAccountSuccessfully() throws InterruptedException {
        myAccountPage.ClickMyAccount();
        Thread.sleep(3000);
        myAccountPage.ClickRegister();
        Thread.sleep(3000);
        myAccountPage.FillMandatoryForm();
        Thread.sleep(3000);
        myAccountPage.ClickContinueBtn();
        Thread.sleep(3000);
        myAccountPage.ClickMyAccount();
        myAccountPage.ClickLogout();
        Thread.sleep(3000);
        myAccountPage.VerifyAccountLogout();

    }
    @Test
    public void verifyThatUserShouldLoginAndLogoutSuccessfully() throws InterruptedException {
        myAccountPage.ClickMyAccount();
        Thread.sleep(3000);
        myAccountPage.ClickLogin();
        Thread.sleep(3000);
        myAccountPage.ClickEmail();
        Thread.sleep(3000);
        myAccountPage.ClickPassword();
        myAccountPage.ClickLoginButton();
        myAccountPage.VerifyMyAccount();
        Thread.sleep(3000);
        myAccountPage.ClickMyAccount();
        Thread.sleep(3000);
        myAccountPage.ClickAccountOptions();
        myAccountPage.VerifyAccountLogoutMy();
        Thread.sleep(3000);
        myAccountPage.ClickMyContinue();

    }
}
