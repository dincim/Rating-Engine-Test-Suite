package com.amaxinsurance.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import re.base.BaseTest;

public class NewsAndEventsPage extends BaseTest {
    @FindBy(xpath = "//button[contains(text(),'About A-MAX')]")
    WebElement aboutAmaxLink;
    @FindBy(xpath = "//a[contains(text(),'News & Events')]")
    WebElement newsAndEventLink;

    public NewsAndEventsPage() {
        PageFactory.initElements(driver,this);
    }

    public String getPageTitle(){
        aboutAmaxLink.click();
        newsAndEventLink.click();

        return driver.getTitle();
    }
}
