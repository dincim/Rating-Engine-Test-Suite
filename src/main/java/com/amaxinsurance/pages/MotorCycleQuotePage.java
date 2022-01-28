package com.amaxinsurance.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import re.base.BaseTest;

public class MotorCycleQuotePage extends BaseTest {
    @FindBy(xpath = "//a[contains(text(),'Motorcycle')]")
    WebElement motorcycleLink;

    @FindBy(xpath = "//button[contains(text(),'Get Insurance')]")
    WebElement quoteMenu;

    public MotorCycleQuotePage() {
        PageFactory.initElements(driver,this);
    }

    public String verifyPageTitle(){
        quoteMenu.click();
        motorcycleLink.click();

        return driver.getTitle();
    }
}
