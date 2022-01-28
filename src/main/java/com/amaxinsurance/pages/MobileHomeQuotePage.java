package com.amaxinsurance.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import re.base.BaseTest;

public class MobileHomeQuotePage extends BaseTest {
    @FindBy(xpath ="//button[contains(text(),'Get Insurance')]")
    WebElement getInsuranceLink;

    @FindBy(xpath = "//a[contains(text(),'Mobile Home')]")
    WebElement mHomePageLink;

    public MobileHomeQuotePage() {
        PageFactory.initElements(driver,this);
    }

    public String verifyPageTitle(){
        getInsuranceLink.click();
        mHomePageLink.click();
        return driver.getTitle();
    }
}
