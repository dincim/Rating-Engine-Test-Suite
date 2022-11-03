package com.amaxinsurance.tests;

import com.amaxinsurance.pages.SuretyBondQuotePage;
import org.testng.Assert;
import org.testng.annotations.Test;
import re.base.BaseTest;

public class SuretyBondQuotePageTest extends BaseTest {
    public SuretyBondQuotePageTest() {
        super();
    }

    @Test(enabled = false)
    public void verifyPageTitle(){
        SuretyBondQuotePage suretyBondQuotePage = new SuretyBondQuotePage();
        String actualPageTitle = suretyBondQuotePage.getPageTitle();
        Assert.assertEquals(actualPageTitle,"Surety Bond | A-MAX");
    }
}
