package com.amaxinsurance.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import re.base.BaseTest;

public class OurCompanyPage extends BaseTest {
    @FindBy(xpath = "//button[contains(text(),'About A-MAX')]")
    WebElement aboutAmaxLink;
    @FindBy(xpath = "//a[contains(text(),'Our Company')]")
    WebElement ourCompanyLink;

    public OurCompanyPage() {
        PageFactory.initElements(driver,this);
    }

    public String getPageTitle(){
        aboutAmaxLink.click();
        ourCompanyLink.click();
        return driver.getTitle();
    }
}
