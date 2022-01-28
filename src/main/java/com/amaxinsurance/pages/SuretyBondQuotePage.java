package com.amaxinsurance.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import re.base.BaseTest;

public class SuretyBondQuotePage extends BaseTest {
    @FindBy(xpath ="//button[contains(text(),'Get Insurance')]")
    WebElement getInsuranceLink;

    @FindBy(xpath = "//a[contains(text(),'Surety Bond')]")
    WebElement sBondQuoteLink;

    public SuretyBondQuotePage() {
        PageFactory.initElements(driver,this);
    }

    public String getPageTitle(){
        getInsuranceLink.click();
        sBondQuoteLink.click();

        return driver.getTitle();
    }
}
