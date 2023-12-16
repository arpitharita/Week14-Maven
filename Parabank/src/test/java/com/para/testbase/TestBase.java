package com.para.testbase;

import com.para.propertyreader.PropertyReader;
import com.para.utility.Utility;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBase extends Utility {

    String browser = PropertyReader.getInstance().getProperty("browser");

    @BeforeMethod (alwaysRun = true)
    public void setUp(){
        selectBrowser(browser);
    }

    @AfterMethod
    public void tearDown(){
      closeBrowser();
    }


}
