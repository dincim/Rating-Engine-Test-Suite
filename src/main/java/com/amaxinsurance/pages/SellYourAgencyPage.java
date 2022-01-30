package com.amaxinsurance.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import re.base.BaseTest;

public class SellYourAgencyPage extends BaseTest {

    @FindBy(xpath = "//button[contains(text(),'About A-MAX')]")
    WebElement aboutAmaxLink;
    @FindBy (xpath = "//a[contains(text(),'Sell Your Agency')]")
    WebElement sellYourAgencyLink;

    public SellYourAgencyPage() {
        PageFactory.initElements(driver,this);
    }

    public String getPageTitle(){
        aboutAmaxLink.click();
        sellYourAgencyLink.click();

        return driver.getTitle();
    }
}
