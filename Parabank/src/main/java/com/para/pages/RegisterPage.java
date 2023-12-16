package com.para.pages;

import com.para.utility.Utility;
import org.openqa.selenium.By;

public class RegisterPage extends Utility {

    By Register = By.xpath("//div[@id='leftPanel']/div/p[2]/a");
    By Singupeasy = By.xpath("//div[@id='rightPanel']/h1");
    By FirstName = By.xpath("//input[@id='customer.firstName']");
    By Lastname = By.xpath("//input[@id='customer.lastName']");
    By Address = By.xpath("//input[@id='customer.address.street']");
    By City = By.xpath("//input[@name='customer.address.city']");
    By State = By.xpath("//input[@name='customer.address.state']");
    By Zipcode = By.xpath("//input[@name='customer.address.zipCode']");
    By PhoneNumber = By.xpath("//input[@id='customer.phoneNumber']");
    By SSN = By.xpath("//input[@name='customer.ssn']");
    By UserName = By.xpath("//input[@name='customer.username']");
    By Password = By.xpath("//input[@name='customer.password']");
    By ConfirmPass = By.xpath("//input[@name='repeatedPassword']");
    By RegisterSubmit = By.xpath("//input[@value='Register']");
    By WellMsg = By.xpath("//div[@id='rightPanel']/p");

    public void ClickRegister() {
        clickOnElement(Register);
    }

    public String VerifyMsg() {
        return getTextFromElement(Singupeasy);
    }
    public void EnterFirstName() throws InterruptedException {
        Thread.sleep(3000);
        sendTextToElement(FirstName, "Brown");
    }

    public void EnterLastName() throws InterruptedException {
        Thread.sleep(3000);
        sendTextToElement(Lastname, "Patel");
    }

    public void EnterAddress() throws InterruptedException {
        Thread.sleep(3000);
        sendTextToElement(Address, "1901Kingstreet");
    }
    public void EnterCity() throws InterruptedException {
        Thread.sleep(3000);
        sendTextToElement(City, "Brampton");
    }
    public void EnterState() throws InterruptedException {
        Thread.sleep(3000);
        sendTextToElement(State, "Ontario");
    }
    public void EnterZipcode() throws InterruptedException {
        Thread.sleep(3000);
        sendTextToElement(Zipcode, "M9V3T1");
    }
    public void EnterPhoneNum() throws InterruptedException {
        Thread.sleep(3000);
        sendTextToElement(PhoneNumber, "06655459645");
    }
    public void EnterSSN() throws InterruptedException {
        Thread.sleep(3000);
        sendTextToElement(SSN, "6585133555");
    }
    public void EnterUsername() throws InterruptedException {
        Thread.sleep(3000);
        sendTextToElement(UserName, "Brown");
    }
    public void EnterPassword() throws InterruptedException {
        Thread.sleep(3000);
        sendTextToElement(Password, "123456");
    }
    public void EnterRepetPass() throws InterruptedException {
        Thread.sleep(3000);
        sendTextToElement(ConfirmPass, "123456");
    }
    public void ClickRegistersub() throws InterruptedException {
        Thread.sleep(3000);
        clickOnElement(RegisterSubmit);
    }
    public void WelcomMsg(){
        clickOnElement(WellMsg);
    }

}
