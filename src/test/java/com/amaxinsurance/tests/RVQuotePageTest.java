package com.amaxinsurance.tests;

import com.amaxinsurance.pages.RVQuotePage;
import org.testng.Assert;
import org.testng.annotations.Test;
import re.base.BaseTest;

public class RVQuotePageTest extends BaseTest {
    public RVQuotePageTest() {
        super();
    }

    @Test
    public void verifyPageTitle(){
        RVQuotePage rVQuotePage = new RVQuotePage();
        String actualPageTitle = rVQuotePage.getPageTitle();
        Assert.assertEquals(actualPageTitle,"RV Insurance | A-MAX");
    }
}
