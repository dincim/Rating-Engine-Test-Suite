package com.amaxinsurance.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import re.base.TestBase;

public class CommercialAutoQuotePage extends TestBase {
    @FindBy(xpath ="//button[contains(text(),'Get Insurance')]")
    WebElement getInsuranceLink;
    @FindBy(xpath = "//a[contains(text(),'Commercial Auto')]")
    WebElement cAutoLink;

    public CommercialAutoQuotePage() {
        PageFactory.initElements(driver, this);
    }
    public void getCommercialAutoQuotePageTitle() throws Exception {

        getInsuranceLink.click();
        Thread.sleep(3000);
        cAutoLink.click();
    }
}
