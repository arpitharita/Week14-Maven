package com.para.testsuite;

import com.para.pages.RegisterPage;
import com.para.testbase.TestBase;
import org.testng.annotations.Test;

public class RegisterTest extends TestBase {

    RegisterPage registerPage = new RegisterPage();

    @Test
    public void verifyThatSigningUpPageDisplay(){
        registerPage.ClickRegister();
        registerPage.VerifyMsg();
    }
    @Test
    public void userSholdRegisterAccountSuccessfully() throws InterruptedException {

        registerPage.ClickRegister();
        registerPage.EnterFirstName();
        registerPage.EnterLastName();
        registerPage.EnterAddress();
        registerPage.EnterCity();
        registerPage.EnterState();
        registerPage.EnterZipcode();
        registerPage.EnterPhoneNum();
        registerPage.EnterSSN();
        registerPage.EnterUsername();
        registerPage.EnterPassword();
        registerPage.EnterRepetPass();
        registerPage.ClickRegistersub();
        registerPage.WelcomMsg();
    }
}
