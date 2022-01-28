package com.amaxinsurance.tests;

import com.amaxinsurance.pages.ReferAFriendPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import re.base.BaseTest;

public class ReferAFriendPageTest extends BaseTest {
    public ReferAFriendPageTest() {
        super();
    }

    @Test
    public void verifyPageTitle(){
        ReferAFriendPage referAFriendPage = new ReferAFriendPage();
        String actualPageTitle = referAFriendPage.getPageTitle();
        Assert.assertEquals(actualPageTitle,"A-MAX Auto Insurance");
    }
}
