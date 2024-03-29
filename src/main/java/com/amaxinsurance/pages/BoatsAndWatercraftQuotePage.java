package com.amaxinsurance.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import re.base.TestBase;

public class BoatsAndWatercraftQuotePage extends TestBase {
    @FindBy(xpath ="//button[contains(text(),'Get Insurance')]")
    WebElement getInsuranceLink;
    @FindBy(xpath = "//a[contains(text(),'Boats & Watercraft')]")
    WebElement boatsAndWCLink;

    public BoatsAndWatercraftQuotePage() {
        PageFactory.initElements(driver, this);
    }
    public String verifPageTitle(){

        getInsuranceLink.click();
        boatsAndWCLink.click();
        return driver.getTitle();
    }
}
