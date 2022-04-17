package com.amaxinsurance.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import re.base.BaseTest;
import re.base.TestBase;

public class BlogPage extends TestBase {

    @FindBy(xpath = "//button[contains(text(),'About A-MAX')]")
    WebElement aboutAmaxLink;
    @FindBy (xpath = "//a[contains(text(),'Blog')]")
    WebElement blogLink;

    public BlogPage() {
        PageFactory.initElements(driver,this);
    }

    public String getPageTitle(){
        aboutAmaxLink.click();
        blogLink.click();

        return driver.getTitle();
    }
}
