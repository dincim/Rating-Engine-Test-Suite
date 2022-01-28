package com.amaxinsurance.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import re.base.BaseTest;

public class GeneralLiabilityQuotePage extends BaseTest {

    @FindBy(xpath ="//button[contains(text(),'Get Insurance')]")
    WebElement getInsuranceLink;
    @FindBy(xpath = "//a[contains(text(),'General Liability')]")
    WebElement gLiabilityLink;

    public GeneralLiabilityQuotePage() {
        PageFactory.initElements(driver, this);
    }

    public void getTitle() throws Exception {
        getInsuranceLink.click();
        Thread.sleep(3000);
        gLiabilityLink.click();
    }

}
