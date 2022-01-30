package com.amaxinsurance.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import re.base.BaseTest;

public class CareersPage extends BaseTest {

    @FindBy(xpath = "//button[contains(text(),'About A-MAX')]")
    WebElement aboutAmaxLink;
    @FindBy(xpath = "//a[contains(text(),'Careers')]")
    WebElement careersLink;

    public CareersPage() {
        PageFactory.initElements(driver,this);
    }

    public String getPageTitle(){
        aboutAmaxLink.click();
        careersLink.click();

        return driver.getTitle();
    }
}
