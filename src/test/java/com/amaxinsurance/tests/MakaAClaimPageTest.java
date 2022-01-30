package com.amaxinsurance.tests;

import com.amaxinsurance.pages.MakeAClaimPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import re.base.BaseTest;

public class MakaAClaimPageTest extends BaseTest {
    public MakaAClaimPageTest() {
        super();
    }

    @Test
    public void verifyPageTitle() {
        MakeAClaimPage makeAClaimPage = new MakeAClaimPage();
        String makeaClaimPageTitle = makeAClaimPage.verifyMakeAClaimPageTitle();
        Assert.assertEquals(makeaClaimPageTitle, "Make a Claim | A-MAX", "Failed. Title mismatched");

    }
}
