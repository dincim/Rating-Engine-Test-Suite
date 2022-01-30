package com.amaxinsurance.tests;

import com.amaxinsurance.pages.CareersPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import re.base.BaseTest;

public class CareersPageTest extends BaseTest {

    public CareersPageTest() {
        super();
    }

    @Test
    public void verifyPageTitle(){
        CareersPage careersPage = new CareersPage();
        String actualPageTitle = careersPage.getPageTitle();

        Assert.assertEquals(actualPageTitle,"Auto Insurance Careers | A-MAX");
    }
}
