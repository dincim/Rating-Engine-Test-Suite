package com.amaxinsurance.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import re.base.BaseTest;

public class MakeAPaymentPage extends BaseTest {
    @FindBy(xpath = "//*[@id=\"container-3011f4f98a\"]/div/div/div[1]/section[1]/div/ul/li[2]/a/span")
    WebElement makePaymentLink;

    public MakeAPaymentPage() {
        PageFactory.initElements(driver,this);
    }

    public String verifyMakeApaymentPageTitle() {
        makePaymentLink.click();
        return driver.getTitle();
    }
}
