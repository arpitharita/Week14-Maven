package com.para.pages;

import com.para.utility.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {

    By UserName = By.xpath("//input[@name='username']");
    By Password = By.xpath("//input[@name='password']");
    By Login = By.xpath("//input[@value='Log In']");
    By AccountsOverview = By.xpath("//div[@ng-if='showOverview']/h1");
    By Logout = By.xpath("//div[@id='leftPanel']/ul/li[8]");
    By Verifymsg = By.xpath("//div[@id='rightPanel']/p");

    public void EnterUserName() throws InterruptedException {
        sendTextToElement(UserName, "romi231");
        Thread.sleep(3000);
    }

    public void EnterPassword() throws InterruptedException {
        sendTextToElement(Password, "123456");
        Thread.sleep(3000);
    }

    public void ClickLogin() throws InterruptedException {
        clickOnElement(Login);
        Thread.sleep(3000);
    }

    public void OverviewMsg() throws InterruptedException {
        clickOnElement(AccountsOverview);
        Thread.sleep(3000);
    }

    public void ClickLogout() {
        clickOnElement(Logout);
    }

    public void EnterInvalidUserName() throws InterruptedException {
        sendTextToElement(UserName, "brown1");
        Thread.sleep(3000);
    }

    public void EnterInvalidPassword() throws InterruptedException {
        sendTextToElement(Password, "1234567");
        Thread.sleep(3000);
    }

    public void ClickLoginagin() throws InterruptedException {
        clickOnElement(Login);
        Thread.sleep(3000);
    }
    public String VerifyErrorMsg(){
        return getTextFromElement(Verifymsg);
    }
}



