package com.amaxinsurance.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import re.base.BaseTest;

public class RentersQuotePage extends BaseTest {
    @FindBy(xpath ="//button[contains(text(),'Get Insurance')]")
    WebElement getInsuranceLink;

    @FindBy(xpath = "//a[contains(text(),'Renters')]")
    WebElement rentersPageLink;

    public RentersQuotePage() {
        PageFactory.initElements(driver,this);
    }

    public String getPageTitle(){
        getInsuranceLink.click();
        rentersPageLink.click();

        return driver.getTitle();
    }
}
