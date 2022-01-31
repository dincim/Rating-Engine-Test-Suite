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
    public void verifyPageTitle() {
        BoatsAndWatercraftQuotePage boatsAndWatercraftQuotePage= new BoatsAndWatercraftQuotePage();

        String actualPageTitle = boatsAndWatercraftQuotePage.getTitleOfBoatsAndWatercraftQuotePage();
        //System.out.println(title);
        Assert.assertEquals(actualPageTitle,"Boat & Watercraft Insurance | A-MAX");
    }

//    @AfterMethod
//    public void tearDown() {
//        driver.quit();
//    }
}
