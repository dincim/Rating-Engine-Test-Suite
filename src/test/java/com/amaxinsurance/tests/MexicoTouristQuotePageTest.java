package com.amaxinsurance.tests;

import com.amaxinsurance.pages.MexicoTouristQuotePage;
import org.testng.Assert;
import org.testng.annotations.Test;
import re.base.BaseTest;

public class MexicoTouristQuotePageTest extends BaseTest {
    public MexicoTouristQuotePageTest() {
        super();
    }

    @Test(enabled = false)
    public void verifyPageTitle() {
        MexicoTouristQuotePage mexicoTouristQuotePageTest = new MexicoTouristQuotePage();
        String actualPageTitle = mexicoTouristQuotePageTest.verifyPageTitle();
        Assert.assertEquals(actualPageTitle,"Mexico Tourist Insurance | A-MAX");
    }
}