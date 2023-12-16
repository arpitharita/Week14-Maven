package com.nop.pages;

import com.nop.utility.Utility;
import org.openqa.selenium.By;

public class TopMenuPage extends Utility {

    By Computer = By.xpath("//body/div[6]/div[2]/ul[1]/li[1]/a[1]");

    By Desktop = By.xpath("//div[@class='item-grid']/div[1]/div[1]");

    By Name_ZtoA = By.xpath("//div[@class='product-selectors']/div[2]/select");

    By VerifyName_ZtoA = By.xpath("//select[@id='products-orderby']/option[3]");

    By AtoZ = By.xpath("//select[@id='products-orderby']");

    By AddToCart = By.xpath("//div[@class='item-box'][1]//button[text()='Add to cart']");

    By VerifyBuildYourOwnComputer = By.xpath("//div[@class='item-grid']/div[1]/div[1]/div[2]/h2[1]/a[1]");

    By SelectGHz = By.xpath("//select[@name='product_attribute_1']");

    By Select8GB = By.xpath("//select[@name='product_attribute_2']");

    By SelectHDDRadio = By.xpath("//input[@id='product_attribute_3_7']");

    By selectOSRadio = By.xpath("//input[@id='product_attribute_4_9']");

    By CheckTwoBox = By.xpath("//input[@id='product_attribute_5_12']");

    By VerifyPrice = By.xpath("//span[@id='price-value-1']");

    By ClickAddtoCartBtn = By.xpath("//button[@id='add-to-cart-button-1']");

    By VerifyMsg = By.xpath("//div[@id='bar-notification']/div[1]/p[1]");

    By CloseCrossBtn = By.xpath("//span[@class='close']");

    By MouseShoppingCart = By.xpath("//span[@class='cart-label']");

    By ClickShopping = By.xpath("//button[contains(text(),'Go to cart')]");

    By VerifyShoppingCart = By.xpath("//div[@class='page-title']/h1[1]");
    By changeQtyClear = By.xpath("//input[@class='qty-input']");
    By ChangeQtyUpdate = By.xpath("//input[@class='qty-input']");
    By ChangeQtyClick = By.xpath("//button[@id='updatecart']");
    By verifyTotal = By.xpath("//div[@class='cart-footer']/div[2]/div[1]/table[1]/tbody[1]/tr[4]/td[2]/span[1]/strong[1]");
    By CheckBoxI = By.xpath("//input[@id='termsofservice']");
    By Checkout = By.xpath("//button[@id='checkout']");
    By VerifyTextMsg = By.xpath("//div[@class='page-title']");
    By CheckoutGuest = By.xpath("//button[@class='button-1 checkout-as-guest-button']");
    //2.22 Fill the all mandatory field
    By FirstName = By.xpath("//input[@id='BillingNewAddress_FirstName']");
    By LastName = By.xpath("//input[@id='BillingNewAddress_LastName']");
    By Email = By.xpath("//input[@id='BillingNewAddress_Email']");
    By Country = By.xpath("//select[@id='BillingNewAddress_CountryId']");
    By City = By.xpath("//input[@id='BillingNewAddress_City']");
    By Address = By.xpath("//input[@id='BillingNewAddress_Address1']");
    By ZipCode = By.xpath("//input[@id='BillingNewAddress_ZipPostalCode']");
    By PhoneNum = By.xpath("//input[@id='BillingNewAddress_PhoneNumber']");
    By Continue = By.xpath("//div[@id='billing-buttons-container']/button[4]");
    By RadioButtonNextDayAir = By.xpath("//input[@id='shippingoption_1']");
    By ContinueNextDayAir = By.xpath("//button[@class='button-1 shipping-method-next-step-button']");
    By RadioButton = By.xpath("//input[@id='paymentmethod_1']");
    By RadioButtonCredit = By.xpath("//button[@class='button-1 payment-method-next-step-button']");
    By MasterCard = By.xpath("//select[@id='CreditCardType']");

    //Fill all The Details
    By VerifypaymentCredirCard = By.xpath("//div[@class='order-summary-content']/div[1]/div[1]/div[2]/ul[1]/li[1]/span[2]");
    By VerifyShippingnextDayAir = By.xpath("//div[@class='order-summary-content']/div[1]/div[2]/div[2]/ul[1]/li[1]/span[2]");

    By VerifyTotalNextAir = By.xpath("//div[@class='total-info']/table[1]/tbody[1]/tr[4]/td[2]/span[1]/strong[1]");

    By Confirm = By.xpath("//button[@class='button-1 confirm-order-next-step-button']");
    By VerifyThankyou = By.xpath("//div[@class='master-column-wrapper']/div[1]/div[1]/div[1]/h1[1]");
    By VerifyMessageSuccessfully = By.xpath("//div[@class='center-1']/div[1]/div[2]/div[1]/div[1]/strong[1]");
    By ContinueOrder =By.xpath("//button[@class='button-1 order-completed-continue-button']");
    By VerifyWelcome = By.xpath("//div[@class='center-1']/div[1]/div[1]/div[2]/div[1]/h2[1]");

    public void ClickComputer()
    {
        clickOnElement(Computer);

    }
    public void ClickDesktop()
    {
        clickOnElement(Desktop);

    }
    public void ClickZtoA() throws InterruptedException {
        Thread.sleep(1000);
        selectByValueFromDropDown(Name_ZtoA,"6");

    }
    public String VerifyZtoA()
    {
        return getTextFromElement(VerifyName_ZtoA);

    }
    public void NameAtoZ()
    {
        selectByValueFromDropDown(AtoZ,"5");

    }
    public void ClickAddToCart() throws InterruptedException {
        Thread.sleep(1000);
        clickOnElement(AddToCart);

    }
    public String VerifyText()
    {
        return getTextFromElement(VerifyBuildYourOwnComputer);

    }
    public void SelectGHZIntel() throws InterruptedException {
        selectByValueFromDropDown(SelectGHz,"1");
        Thread.sleep(1000);

    }
    public void Select8GBIntel() throws InterruptedException {
        selectByValueFromDropDown(Select8GB,"5");
        Thread.sleep(1000);

    }
    public void SelectHDDRadioIntel() throws InterruptedException {
        clickOnElement(SelectHDDRadio);
        Thread.sleep(1000);

    }
    public void SelectOSRadioIntel() throws InterruptedException {
        clickOnElement(selectOSRadio);
        Thread.sleep(1000);

    }
    public void checkMicroSoftOffice() throws InterruptedException {
        clickOnElement(CheckTwoBox);
        Thread.sleep(1000);

    }
    public String VerifyThePrice()
    {
        return getTextFromElement(VerifyPrice);

    }
    public void AddToCartButton() throws InterruptedException {
        clickOnElement(ClickAddtoCartBtn);
        Thread.sleep(1000);

    }
    public String VerifyMsgProduct()
    {
        return getTextFromElement(VerifyMsg);

    }
    public void CloseCressButoon() throws InterruptedException {
        clickOnElement(CloseCrossBtn);
        Thread.sleep(1000);

    }
    public void MouseHoverShoppingCat() throws InterruptedException {
        mouseHoverToElement(MouseShoppingCart);
        Thread.sleep(1000);
        clickOnElement(ClickShopping);
    }
    public String VerifyShoppingCart()
    {
        return getTextFromElement(VerifyShoppingCart);

    }
    public void ChangeQTYClear() throws InterruptedException {
        driver.findElement(changeQtyClear).clear();
        Thread.sleep(1000);
        sendTextToElement(ChangeQtyUpdate,"2");
        clickOnElement(ChangeQtyClick);
        Thread.sleep(1000);

    }
    public String VerifyTheTotal()
    {
        return getTextFromElement(verifyTotal);

    }
    public void CheckBoxClick() throws InterruptedException {
        clickOnElement(CheckBoxI);
        Thread.sleep(1000);

    }
    public void CheckoutClick() throws InterruptedException {
        clickOnElement(Checkout);
        Thread.sleep(1000);

    }
    public String VerifyWelcomeMsg()
    {
        return getTextFromElement(VerifyTextMsg);

    }
    public void CheckOutAsGuest() throws InterruptedException {
        clickOnElement(CheckoutGuest);
        Thread.sleep(1000);
    }
    public void EnterFirstName()
    {
        sendTextToElement(FirstName,"ketty");

    }
    public void EnterLastName()
    {
        sendTextToElement(LastName,"patel");

    }
    public void EnterGmail()
    {
        sendTextToElement(Email,"ketty@23gmail.com");

    }
    public void EnterCountry()
    {
        selectByValueFromDropDown(Country,"153");

    }
    public void EnterCity()
    {
        sendTextToElement(City,"Brampton");

    }
    public void EnterAddress()
    {
        sendTextToElement(Address,"King street");

    }
    public void EnterZipCodeClick()
    {
        sendTextToElement(ZipCode,"M9V3T1");
    }
    public void EnterPhoneNumClick()
    {
        sendTextToElement(PhoneNum,"06587452331");

    }
    public void ClickContinue() throws InterruptedException {
        clickOnElement(Continue);
        Thread.sleep(1000);

    }
    public void ClickRadioButtonNextAir()
    {
        clickOnElement(RadioButtonNextDayAir);
    }
    public void ClickContinueNextAir()
    {
        clickOnElement(ContinueNextDayAir);
    }
    public void RadioButtonCreditCard() throws InterruptedException {
        clickOnElement(RadioButton);
        clickOnElement(RadioButtonCredit);
        Thread.sleep(1000);

    }
    public void MasterCardClick() throws InterruptedException {
        selectByValueFromDropDown(MasterCard,"MasterCard");
        Thread.sleep(1000);

    }

    public String PaymentMethodCreditAir()
    {
        return getTextFromElement(VerifypaymentCredirCard);

    }
    public String ShippingMethodNextDayAir()
    {
        return getTextFromElement(VerifyShippingnextDayAir);

    }
    public String VerifyTotalMsgnextAir()
    {
        return getTextFromElement(VerifyTotalNextAir);

    }
    public void ClickConfirm()
    {
        clickOnElement(Confirm);

    }
    public String VerifyThankyYouText()
    {
        return getTextFromElement(VerifyThankyou);

    }
    public String VerifyMessageSuccessfullyText()
    {
        return getTextFromElement(VerifyMessageSuccessfully);

    }
    public void ContinueOrderSuccessfully()
    {
        clickOnElement(ContinueOrder);

    }
    public String VerifyWelcomeText()
    {
        return getTextFromElement(VerifyWelcome);

    }
}
