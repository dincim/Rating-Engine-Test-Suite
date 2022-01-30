package com.amaxinsurance.tests;

import com.amaxinsurance.pages.BlogPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import re.base.BaseTest;

public class BlogPageTest extends BaseTest {

    public BlogPageTest() {
        super();
    }

    @Test
    public void verifyPageTitle(){
        BlogPage blogPage = new BlogPage();
        String actualPageTitle = blogPage.getPageTitle();

        Assert.assertEquals(actualPageTitle,"Blog");
    }
}
