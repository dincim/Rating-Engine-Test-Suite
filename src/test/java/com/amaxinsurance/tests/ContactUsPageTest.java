package com.amaxinsurance.tests;

import com.amaxinsurance.pages.ContactUsPage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import re.base.BaseTest;

public class ContactUsPageTest extends BaseTest {

    public ContactUsPageTest() {
        super();
    }

    @Test(enabled = false)
    public void verifyPageTitle() {
        ContactUsPage contactUsPage=new ContactUsPage();
        contactUsPage.getContactUsPageTitle();
        String title = driver.getTitle();
        //System.out.println(title);
        Assert.assertEquals("Contact Us | A-MAX", title,"title does not match");
    }
}
