package com.amaxinsurance.tests;

import com.amaxinsurance.pages.NotaryServicesQuotePage;
import org.testng.Assert;
import org.testng.annotations.Test;
import re.base.BaseTest;

public class NotaryServicesQuotePageTest extends BaseTest {
    public NotaryServicesQuotePageTest() {
        super();
    }

    @Test
    public void getPageTitle(){
        NotaryServicesQuotePage notaryServicesQuotePage = new NotaryServicesQuotePage();
        String actualPageTitle = notaryServicesQuotePage.verifyPageTitle();
        Assert.assertEquals(actualPageTitle,"Notary Public Services");
    }
}
