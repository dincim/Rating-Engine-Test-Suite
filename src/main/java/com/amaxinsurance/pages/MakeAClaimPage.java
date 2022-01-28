package com.amaxinsurance.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import re.base.BaseTest;

public class MakeAClaimPage extends BaseTest {
    @FindBy(xpath ="//span[text()='Make a Claim']")
    WebElement makeAClaimLink;
    public MakeAClaimPage() {
        PageFactory.initElements(driver,this);
    }

    public String verifyMakeAClaimPageTitle() {
        makeAClaimLink.click();
        return driver.getTitle();

    }
}
