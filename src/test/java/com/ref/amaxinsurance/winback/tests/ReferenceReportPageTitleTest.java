package com.ref.amaxinsurance.winback.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class ReferenceReportPageTitleTest {

    WebDriver driver;

    @BeforeMethod
    void setUp() {
        System.setProperty("webdriver.chrome.driver",
                "/Users/mattdinc/Documents/drivers/chromedriver");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        driver.get("http://18.216.112.189:8089/Authentication");

    }
    @Test(enabled = false)
    void pageTitleWinbackTest() throws InterruptedException {

        driver.findElement(By.xpath("//*[@id=\"Titlediv\"]/div[1]/div")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//div/div[3]/form/div[1]/div/input")).sendKeys("adminlogin");
        driver.findElement(By.xpath("//div[3]/form/div[2]/div/input")).sendKeys("Admin2019!");
        driver.findElement(By.xpath("//*[@id=\"AdminLoginForm\"]/div[3]/button")).click();

        String actualPageTitle = driver.getTitle();
        System.out.println(actualPageTitle);

        Assert.assertEquals(actualPageTitle, "Amax Insurance","Page title does not match");

    }

    @AfterMethod
    void tearDown() {
        driver.quit();
    }
}
