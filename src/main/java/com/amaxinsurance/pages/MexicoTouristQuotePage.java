package com.amaxinsurance.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import re.base.BaseTest;

public class MexicoTouristQuotePage extends BaseTest {
    @FindBy(xpath ="//button[contains(text(),'Get Insurance')]")
    WebElement getInsuranceLink;

    @FindBy(xpath = "//a[contains(text(),'Mexico Tourist')]")
    WebElement mTouristLink;

    public MexicoTouristQuotePage() {
        PageFactory.initElements(driver,this);
    }

    public String verifyPageTitle(){
        getInsuranceLink.click();
        mTouristLink.click();
        return driver.getTitle();
    }
}
