package com.amaxinsurance.tests;

import com.amaxinsurance.pages.BlogPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import re.base.BaseTest;
import re.base.TestBase;

public class BlogPageTest extends BaseTest {

    public BlogPageTest() {
        super();
    }

    @Test(enabled = false)
    public void verifyPageTitle(){
        BlogPage blogPage = new BlogPage();
        String actualPageTitle = blogPage.getPageTitle();

        Assert.assertEquals(actualPageTitle,"Blog");
    }
}
