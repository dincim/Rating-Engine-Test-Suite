package com.amaxinsurance.tests;

import com.amaxinsurance.pages.OurCompanyPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.Test;
import re.base.BaseTest;

public class OurCompanyPageTest extends BaseTest {

    public OurCompanyPageTest() {
        super();
    }

   @Test(enabled = false)
    public void verifyPageTitle(){
       OurCompanyPage ourCompanyPage = new OurCompanyPage();
       String actualPageTitle = ourCompanyPage.getPageTitle();

       Assert.assertEquals(actualPageTitle,"Our Company | A-MAX");
   }
}
