package com.amaxinsurance.tests;

import com.amaxinsurance.pages.BoatsAndWatercraftQuotePage;
import com.amaxinsurance.pages.CommercialAutoQuotePage;
import org.testng.Assert;
import org.testng.annotations.Test;
import re.base.BaseTest;

public class CommercialAutoQuotePageTest extends BaseTest {

    public CommercialAutoQuotePageTest() {
        super();
    }
    @Test
    public void verifycommercialAutoQuoteTitle() throws Exception {
        CommercialAutoQuotePage commercialAutoQuotePage= new CommercialAutoQuotePage();
        commercialAutoQuotePage.getCommercialAutoQuotePageTitle();
        String title = driver.getTitle();
        System.out.println(title);
        Assert.assertEquals("Commercial Auto Insurance | A-MAX", title);
    }
}
