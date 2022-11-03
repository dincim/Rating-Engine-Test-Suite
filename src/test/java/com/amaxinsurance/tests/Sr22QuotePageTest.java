package com.amaxinsurance.tests;

import com.amaxinsurance.pages.Sr22QuotePage;
import org.testng.Assert;
import org.testng.annotations.Test;
import re.base.BaseTest;

public class Sr22QuotePageTest extends BaseTest {
    public Sr22QuotePageTest() {
        super();
    }

    @Test(enabled = false)
    public void verifyPageTitle() throws InterruptedException {
        Sr22QuotePage sr22QuotePage = new Sr22QuotePage();
        String actualPageTitle = sr22QuotePage.getPageTitle();
        Assert.assertEquals(actualPageTitle,"SR-22 Insurance | A-MAX");
    }
}
