package com.amaxinsurance.tests;

import com.amaxinsurance.pages.MotorCycleQuotePage;
import org.testng.Assert;
import org.testng.annotations.Test;
import re.base.BaseTest;

public class MotorCycleQuotePageTest extends BaseTest {
    public MotorCycleQuotePageTest() {
        super();
    }

    @Test
    public void getMotorCyclePageTitle(){
        MotorCycleQuotePage motorCycleQuotePage = new MotorCycleQuotePage();
        String actualPageTitle = motorCycleQuotePage.verifyPageTitle();
        Assert.assertEquals(actualPageTitle,"Motorcycle Insurance | A-MAX");
    }
}
