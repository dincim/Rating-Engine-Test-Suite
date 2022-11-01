package com.amaxinsurance.tests;

import com.amaxinsurance.pages.GeneralLiabilityQuotePage;
import org.testng.Assert;
import org.testng.annotations.Test;
import re.base.BaseTest;

public class GeneralLiabilityQuotePageTest extends BaseTest {
    public GeneralLiabilityQuotePageTest() {
        super();
    }

    @Test
    public void verifyPageTitle() throws Exception {
        GeneralLiabilityQuotePage generalLiabilityQuotePage=new GeneralLiabilityQuotePage();
        generalLiabilityQuotePage.getTitle();
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle,"Commercial General Liability | A-MAX");
    }
}
