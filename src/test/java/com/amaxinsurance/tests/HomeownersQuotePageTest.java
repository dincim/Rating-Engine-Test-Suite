package com.amaxinsurance.tests;

import com.amaxinsurance.pages.HomeownersQuotePage;
import org.testng.Assert;
import org.testng.annotations.Test;
import re.base.BaseTest;

public class HomeownersQuotePageTest extends BaseTest {
    public HomeownersQuotePageTest() {
        super();
    }
    @Test(enabled = false)
    public void verifyPageTitle(){
        HomeownersQuotePage homeownersQuotePage = new HomeownersQuotePage();
        String actualPageTitle = homeownersQuotePage.getTitle();
        Assert.assertEquals(actualPageTitle,"Homeowners Insurance | A-MAX");
    }
}
