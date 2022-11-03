package com.amaxinsurance.tests;

import com.amaxinsurance.pages.RentersQuotePage;
import org.testng.Assert;
import org.testng.annotations.Test;
import re.base.BaseTest;

public class RentersQuotePageTest extends BaseTest {
    public RentersQuotePageTest() {
        super();
    }

    @Test(enabled = false)
    public void verifyPageTitle(){
        RentersQuotePage rentersQuotePage = new RentersQuotePage();
        String actualPageTitle = rentersQuotePage.getPageTitle();
        Assert.assertEquals(actualPageTitle,"Renters Insurance | A-MAX");
    }
}
