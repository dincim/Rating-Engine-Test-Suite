package com.amaxinsurance.tests;

import com.amaxinsurance.pages.FindAnOfficePage;
import org.testng.Assert;
import org.testng.annotations.Test;
import re.base.BaseTest;
import re.base.TestBase;

public class FindAnOfficePageTest extends BaseTest {

    @Test(enabled = false)
    public void verifyPageTitle(){
        FindAnOfficePage findAnOfficePage =new FindAnOfficePage();
        findAnOfficePage.getFindAnOfficePageTitle();
        String pageTitle = driver.getTitle();
        Assert.assertEquals("Find an Office | A-MAX",pageTitle, "Page title does not match");
    }
}
