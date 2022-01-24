package com.amaxinsurance.tests;

import com.amaxinsurance.pages.BoatsAndWatercraftQuotePage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import re.base.BaseTest;
import re.base.TestBase;

public class BoatsAndWatercraftPageQuoteTest extends BaseTest {

    public BoatsAndWatercraftPageQuoteTest() {
        super();
    }
//    @BeforeMethod
//    public void setUp() {
//        initialization();
//        boatsAndWatercraftQuotePage = new BoatsAndWatercraftQuotePage();
//    }

    @Test
    public void verifyBoatsAndWCPageTitletest() throws Exception {
        BoatsAndWatercraftQuotePage boatsAndWatercraftQuotePage= new BoatsAndWatercraftQuotePage();
        boatsAndWatercraftQuotePage.getTitleOfBoatsAndWatercraftQuotePage();

        String title = driver.getTitle();
        System.out.println(title);
        Assert.assertEquals("Boat & Watercraft Insurance | A-MAX", title);
    }

//    @AfterMethod
//    public void tearDown() {
//        driver.quit();
//    }
}
