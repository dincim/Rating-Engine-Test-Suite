package com.amaxinsurance.tests;

import com.amaxinsurance.pages.ContactUsPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import re.base.BaseTest;

public class ContactUsPageTest extends BaseTest {
//    public ContactUsPageTest() {
//        super();
//    }

    @Test
    public void verifyContactUsPageTitle() {
        ContactUsPage contactUsPage=new ContactUsPage();
        contactUsPage.getContactUsPageTitle();
        String title = driver.getTitle();
        System.out.println(title);
        Assert.assertEquals("Contact Us | A-MAX", title);
    }
}
