package com.amaxinsurance.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import re.base.BaseTest;

public class RVQuotePage extends BaseTest {
    @FindBy(xpath ="//button[contains(text(),'Get Insurance')]")
    WebElement getInsuranceLink;

    @FindBy(xpath = "//a[contains(text(),'RV')]")
    WebElement rvQuoteLink;

    public RVQuotePage() {
        PageFactory.initElements(driver,this);
    }

    public String getPageTitle(){
        getInsuranceLink.click();
        rvQuoteLink.click();

        return driver.getTitle();
    }

}
