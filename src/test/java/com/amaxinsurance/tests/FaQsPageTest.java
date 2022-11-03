package com.amaxinsurance.tests;

import com.amaxinsurance.pages.FaQsPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import re.base.BaseTest;

public class FaQsPageTest extends BaseTest {
    public FaQsPageTest() {
        super();
    }

    @Test(enabled = false)
    public void verifyPageTitle(){
        FaQsPage faQsPage = new FaQsPage();
        String actualPageTitle = faQsPage.getPageTitle();

        Assert.assertEquals(actualPageTitle,"How Does The A-MAX Process Work? | FAQs | A-MAX");
    }
}
