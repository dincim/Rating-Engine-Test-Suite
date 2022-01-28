package com.amaxinsurance.tests;

import com.amaxinsurance.pages.MakeAPaymentPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import re.base.BaseTest;

public class MakeAPaymentPageTest extends BaseTest {

    public MakeAPaymentPageTest() {
        super();
    }
    @Test
    public void verifyMakeAPaymentPageTitleTest() {
        MakeAPaymentPage makeAPaymentPage = new MakeAPaymentPage();
        String makeaPaymentPageTitle = makeAPaymentPage.verifyMakeApaymentPageTitle();
        Assert.assertEquals(makeaPaymentPageTitle, "Make a Payment | A-MAX", "Failed. Title mismatched");

    }

}
