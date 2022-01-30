package com.amaxinsurance.tests;

import com.amaxinsurance.pages.NewsAndEventsPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import re.base.BaseTest;

public class NewsAndEventsPageTest extends BaseTest {

    public NewsAndEventsPageTest() {
        super();
    }

    @Test
    public void verifyPageTitle(){
        NewsAndEventsPage newsAndEventsPage = new NewsAndEventsPage();
        String actualPageTitle = newsAndEventsPage.getPageTitle();

        Assert.assertEquals(actualPageTitle,"News Events");
    }
}
