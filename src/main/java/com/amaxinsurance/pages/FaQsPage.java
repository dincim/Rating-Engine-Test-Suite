package com.amaxinsurance.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import re.base.BaseTest;

public class FaQsPage extends BaseTest {
    @FindBy(xpath = "//button[contains(text(),'About A-MAX')]")
    WebElement aboutAmaxLink;
    @FindBy(xpath = "//a[contains(text(),'FAQs')]")
    WebElement ourCompanyLink;

    public FaQsPage() {
        PageFactory.initElements(driver,this);
    }

    public String getPageTitle(){
        aboutAmaxLink.click();
        ourCompanyLink.click();

        return driver.getTitle();
    }
}
