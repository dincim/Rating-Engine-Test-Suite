package com.amaxinsurance.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import re.base.BaseTest;

public class HomeownersQuotePage extends BaseTest {
    @FindBy(xpath ="//button[contains(text(),'Get Insurance')]")
    WebElement getInsuranceLink;
    @FindBy(xpath = "//a[contains(text(),'Home Owners')]")
    WebElement homeOwnersQuoteLink;

    public HomeownersQuotePage() {
        PageFactory.initElements(driver,this);
    }

    public String getTitle(){
        getInsuranceLink.click();
        homeOwnersQuoteLink.click();

        return driver.getTitle();
    }
}
