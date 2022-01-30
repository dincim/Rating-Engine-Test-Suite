package com.amaxinsurance.tests;

import com.amaxinsurance.pages.MobileHomeQuotePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.Test;
import re.base.BaseTest;

public class MobileHomeQuotePageTest extends BaseTest {

    public MobileHomeQuotePageTest() {
        super();
    }

   @Test
    public void verifyPageTitle() {
       MobileHomeQuotePage mobileHomeQuotePage = new MobileHomeQuotePage();
       String actualPageTitle = mobileHomeQuotePage.verifyPageTitle();
       Assert.assertEquals(actualPageTitle,"Mobile Home Insurance | A-MAX");
   }
}
