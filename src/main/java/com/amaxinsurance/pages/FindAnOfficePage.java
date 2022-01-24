package com.amaxinsurance.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import re.base.TestBase;

public class FindAnOfficePage extends TestBase {
    @FindBy(xpath="//a[contains(text(),'Find an Office')]")
    WebElement findOfficeLink;

    public FindAnOfficePage() {
        PageFactory.initElements(driver,this);
    }
    public String getFindAnOfficePageTitle(){
        findOfficeLink.click();
        return driver.getTitle();
    }
}
