package com.amaxinsurance.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import re.base.BaseTest;

public class Sr22QuotePage extends BaseTest {
    @FindBy(xpath ="//button[contains(text(),'Get Insurance')]")
    WebElement getInsuranceLink;

    @FindBy(xpath = "//a[contains(text(),'SR-22')]")
    WebElement sr22Link;

    public Sr22QuotePage() {
        PageFactory.initElements(driver,this);
    }

    public String getPageTitle(){
        getInsuranceLink.click();
        sr22Link.click();

        return driver.getTitle();
    }
}
