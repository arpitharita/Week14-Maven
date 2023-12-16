package com.ninja.testsuite;

import com.ninja.pages.Desktoppage;
import com.ninja.pages.Laptopandnotebookpage;
import com.ninja.pages.TopMenuPage;
import com.ninja.testbase.TestBase;
import org.testng.annotations.Test;

public class LapTopAndNoteBookTest extends TestBase {

    TopMenuPage topMenuPage = new TopMenuPage();
    Laptopandnotebookpage laptopandnotebookpage = new Laptopandnotebookpage();
    Desktoppage desktoppage =new Desktoppage();

    @Test
    public void verifyProductsPriceDisplayHighToLowSuccessfully() throws InterruptedException {
        topMenuPage.clickLaptopandnotebook();
        Thread.sleep(3000);
        laptopandnotebookpage.SortByPrice();
        laptopandnotebookpage.verifyProductView();
    }
    @Test
    public void verifyThatUserPlaceOrderSuccessfully() throws InterruptedException {
        topMenuPage.clickLaptopandnotebook();
        Thread.sleep(3000);
        laptopandnotebookpage.SortByPrice();
        laptopandnotebookpage.verifyProductView();
        laptopandnotebookpage.ClickMacBook();
        laptopandnotebookpage.VerifyMacBook();
        desktoppage.AddtoCart();
        desktoppage.clickShoppingCartDisplay();
        laptopandnotebookpage.VerifyMacBook();
        Thread.sleep(3000);
        laptopandnotebookpage.ClearQty();
        laptopandnotebookpage.VerifyPrice();
        Thread.sleep(3000);
        laptopandnotebookpage.ClickCheckout();
        laptopandnotebookpage.ClickGuestCheckout();
        Thread.sleep(3000);
        laptopandnotebookpage.ClickContinue();
        Thread.sleep(3000);
        laptopandnotebookpage.FillMandatory();
        Thread.sleep(3000);
        laptopandnotebookpage.EnterTextArea();
        Thread.sleep(3000);
        laptopandnotebookpage.CheckTermsAndCondition();
        Thread.sleep(3000);
        laptopandnotebookpage.ClickContinueForm();
    }

}
