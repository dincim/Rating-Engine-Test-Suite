package com.amaxinsurance.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import re.base.BaseTest;

public class NotaryServicesQuotePage extends BaseTest {
    @FindBy(xpath ="//button[contains(text(),'Get Insurance')]")
    WebElement getInsuranceLink;

    @FindBy(xpath = "//a[contains(text(),'Notary Services')]")
    WebElement notarySLink;

    public NotaryServicesQuotePage() {
        PageFactory.initElements(driver,this);
    }

    public String verifyPageTitle(){
        getInsuranceLink.click();
        notarySLink.click();
        return driver.getTitle();
    }
}
