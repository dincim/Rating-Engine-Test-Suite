package com.amaxinsurance.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import re.base.BaseTest;

public class ReferAFriendPage extends BaseTest {
    @FindBy(xpath = "//a[@id='teaser-05aee71daf-cta-96c320a640']")
    WebElement referAFriendBtn;

    @FindBy(xpath = "//button[@class='btn banner-btn']")
    WebElement referBtn;

    public ReferAFriendPage() {
        PageFactory.initElements(driver,this);
    }

    public String getPageTitle(){
        referAFriendBtn.click();
        referBtn.click();
      return driver.getTitle();
    }
}
