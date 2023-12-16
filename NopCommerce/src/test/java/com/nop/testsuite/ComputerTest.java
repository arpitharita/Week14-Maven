package com.nop.testsuite;

import com.nop.pages.TopMenuPage;
import com.nop.testbase.TestBase;
import org.testng.annotations.Test;

public class TopMenuTest extends TestBase {
    TopMenuPage topMenuPage = new TopMenuPage();
    @Test
    public void computernevigate() throws InterruptedException {
        topMenuPage.ClickDesktop();
        topMenuPage.ClickZtoA();
        topMenuPage.VerifyZtoA();
        topMenuPage.NameAtoZ();
        topMenuPage.ClickAddToCart();
        topMenuPage.VerifyText();
        topMenuPage.SelectGHZIntel();
        topMenuPage.Select8GBIntel();
        topMenuPage.SelectHDDRadioIntel();
        topMenuPage.SelectOSRadioIntel();
        topMenuPage.checkMicroSoftOffice();
        topMenuPage.VerifyThePrice();
        topMenuPage.AddToCartButton();
        topMenuPage.VerifyMsgProduct();
        topMenuPage.CloseCressButoon();
        topMenuPage.MouseHoverShoppingCat();
        topMenuPage.VerifyShoppingCart();
        topMenuPage.ChangeQTYClear();
        topMenuPage.VerifyTheTotal();
        topMenuPage.CheckBoxClick();
        topMenuPage.CheckoutClick();
        topMenuPage.VerifyWelcomeMsg();
        topMenuPage.CheckOutAsGuest();
        topMenuPage.EnterFirstName();
        topMenuPage.EnterLastName();
        topMenuPage.EnterGmail();
        topMenuPage.EnterCountry();
        topMenuPage.EnterCity();
        topMenuPage.EnterAddress();
        topMenuPage.EnterZipCodeClick();
        topMenuPage.EnterPhoneNumClick();
        topMenuPage.ClickContinue();
        topMenuPage.ClickRadioButtonNextAir();
        topMenuPage.ClickContinueNextAir();
        topMenuPage.RadioButtonCreditCard();
        topMenuPage.MasterCardClick();
        topMenuPage.PaymentMethodCreditAir();
        topMenuPage.ShippingMethodNextDayAir();
        topMenuPage.VerifyTotalMsgnextAir();
        topMenuPage.ClickConfirm();
        topMenuPage.VerifyThankyYouText();
        topMenuPage.VerifyMessageSuccessfullyText();
        topMenuPage.ContinueOrderSuccessfully();
        topMenuPage.VerifyWelcomeText();
    }
}
