package re.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import re.base.BaseTest;

import java.util.ArrayList;

import static org.openqa.selenium.support.ui.ExpectedConditions.elementToBeClickable;

public class GetQuotePublicDataPage extends BaseTest {
    
    @FindBy(xpath = "//*[@id=\"container-b6c3c4c729\"]/div/div[1]/div/input")
    WebElement zipCode;
    @FindBy(xpath = "//*[@id=\"container-b6c3c4c729\"]/div/div[2]/button")
    WebElement getQuoteBtn;

    @FindBy(id = "driver-driverlicense")
    WebElement driversLicense;

    @FindBy(id = "driver-dateofbirth")
    WebElement driverDateOfBirth;
    @FindBy(id = "driver-firstname")
    WebElement driverFirstName;

    @FindBy(xpath = "//a[@class='cmp-button cmp-quote__button--start']")
    WebElement startBtn;

    @FindBy(xpath = "//input[@id='driver-email']")
    WebElement driverEmail;
    @FindBy(xpath = "//input[@id='driver-phone']")
    WebElement driverPhone;
    @FindBy(xpath = "//input[@id='driver-privatepolicy']")
    WebElement policyCheckBox;
    @FindBy(xpath = "//*[@id=\"container-1d368398d6\"]/div/div/div/div[2]/div[2]/div[3]/div[2]/a[2]")
    WebElement nextBtn;

//    @FindBy(xpath = "//*[@id='driver-driveraddress']")
//    WebElement driverAddress;

    @FindBy(xpath = "//*[@id='male']")
    WebElement driverGender;
    @FindBy(xpath = "//*[@id='single']")
    WebElement driverMaritalStatus;
    @FindBy(xpath = "//*[@id='insured']")
    WebElement driverInsuredStatus;
    @FindBy(xpath = "//*[@id=\"container-1d368398d6\"]/div/div/div/div[2]/div[3]/div[11]/a[2]")
    WebElement driverSummaryNextBtn;

    @FindBy(xpath = "//*[@id=\"container-1d368398d6\"]/div/div/div/div[2]/div[4]/div[6]/a[2]")
    WebElement vehicleNextBtn;

    @FindBy(id = "vehicle-year")
    WebElement selectCarYear;
    @FindBy(id = "vehicle-make")
    WebElement selectCarMake;
    @FindBy(id = "vehicle-model")
    WebElement selectCarModel;

    @FindBy(xpath = "//*[@id=\"myModal\"]/div/div[3]/div/a")
    WebElement addVehicleBtn;

    @FindBy(xpath = "//*[@id=\"container-1d368398d6\"]/div/div/div/div[3]/div/div[4]/a[2]")
    WebElement nextPolicyBtn;

    @FindBy (xpath = "//input[@id='0']")
    WebElement covMinStateLiability;

    @FindBy (xpath = "//*[@id=\"container-1d368398d6\"]/div/div/div/div[4]/div/div[6]/a[2]")
    WebElement finishBtn;

    @FindBy(xpath = ("//*[@id=\"container-1d368398d6\"]/div/div/div/div[5]/div/div[5]/div[2]/div/div[2]/div[3]/div[2]/a"))
    WebElement buyNowBtn;

    @FindBy(xpath = "//*[@id='logo2']")
    WebElement buyNowAmaxLogo;

    @FindBy(xpath = "//*[@id=\"container-1d368398d6\"]/div/div/div/div[5]/div/div[5]/div[2]/div[1]/div[2]/div[3]/div[2]/a/div/span")
    WebElement seaharborBuyNowBtn;

    @FindBy(xpath = "//*[@id=\"container-1d368398d6\"]/div/div/div/div[5]/div/div[5]/div[2]/div[2]/div[2]/div[3]/div[2]/a/div")
    WebElement unitedAutoLimited6MonthBuyNowBtn;
    @FindBy(xpath = "//*[@id=\"container-1d368398d6\"]/div/div/div/div[5]/div/div[5]/div[2]/div[2]/div[2]/div[3]/div[2]/a/div/span")
    WebElement americanAccessBuyNowBtn;
    @FindBy(xpath = "//*[@id=\"container-1d368398d6\"]/div/div/div/div[5]/div/div[5]/div[2]/div[3]/div[2]/div[3]/div[2]/a/div/span")
    WebElement commonwealthGeneralBuyNowBtn;



    public GetQuotePublicDataPage(){
        PageFactory.initElements(driver,this);
    }

    public void getQuotePublicData() throws InterruptedException {
        zipCode.sendKeys("75247");
        getQuoteBtn.click();
        Thread.sleep(2000);

        driversLicense.sendKeys("47466110");
        Thread.sleep(2000);
        driverDateOfBirth.sendKeys("01011990");
        Thread.sleep(2000);

        Actions act = new Actions(driver);
        act.click(driverFirstName).perform();
        //act.moveToElement(driverFirstName).perform();
        Thread.sleep(2000);

        JavascriptExecutor j = (JavascriptExecutor) driver;
        j.executeScript("window.scrollBy(0,350)", "");



        WebDriverWait wait = new WebDriverWait(driver,5);
        WebElement startButton = wait.until(elementToBeClickable(startBtn));
        startButton.click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
//      js.executeScript("arguments[0].click();",startBtn);
        Thread.sleep(2000);


        driverEmail.sendKeys("test@mail.com");
        driverPhone.sendKeys("1111111111");
        policyCheckBox.click();
        Thread.sleep(2000);
        nextBtn.click();

        //driverAddress.sendKeys("61 Plano");
        driverGender.click();
        driverMaritalStatus.click();
        driverInsuredStatus.click();
        Thread.sleep(2000);

        js.executeScript("arguments[0].click();",driverSummaryNextBtn);
//      driverSummaryNextBtn.click();
        Thread.sleep(2000);

        js.executeScript("arguments[0].click();",vehicleNextBtn);
        // vehicleNextBtn.click();
        Thread.sleep(2000);

        Select drpVehicleYear = new Select(selectCarYear);
        drpVehicleYear.selectByVisibleText("2021");
        Thread.sleep(3000);
        Select drpVehicleMake = new Select(selectCarMake);
        drpVehicleMake.selectByVisibleText("ACURA");
        Thread.sleep(3000);
        Select drpVehicleModel = new Select(selectCarModel);
        drpVehicleModel.selectByVisibleText("MDX");
        Thread.sleep(3000);
        addVehicleBtn.click();
        Thread.sleep(2000);

        nextPolicyBtn.click();

        covMinStateLiability.click();
        Thread.sleep(2000);

        finishBtn.click();
        Thread.sleep(3000);

    }

    public void getSeaHarborPageTitle() throws InterruptedException {

        seaharborBuyNowBtn.click();
        Thread.sleep(3000);
        // considering that there is only one tab opened in that point.
        String oldTab = driver.getWindowHandle();
        //driver.findElement(By.linkText("Twitter Advertising Blog")).click();
        ArrayList<String> newTab = new ArrayList<String>(driver.getWindowHandles());
        newTab.remove(oldTab);
        // change focus to new tab
        driver.switchTo().window(newTab.get(0));
        //assertAdvertisingBlog();

        // Do what you want here, you are in the new tab
        String actualTitle = driver.getTitle();
        System.out.println(actualTitle);
        Assert.assertEquals(actualTitle,"Insuror Atlas Consumer Web System");

        driver.close();
        // change focus back to old tab
        driver.switchTo().window(oldTab);

        //assertStartAdvertising();

        // Do what you want here, you are in the old tab

    }

    public void getUAICPageTitle() throws InterruptedException {

        unitedAutoLimited6MonthBuyNowBtn.click();
        Thread.sleep(3000);

        // considering that there is only one tab opened in that point.
        String oldTab = driver.getWindowHandle();
        //driver.findElement(By.linkText("Twitter Advertising Blog")).click();
        ArrayList<String> newTab = new ArrayList<String>(driver.getWindowHandles());
        newTab.remove(oldTab);
        // change focus to new tab
        driver.switchTo().window(newTab.get(0));
        //assertAdvertisingBlog();

        // Do what you want here, you are in the new tab
        String actualTitle = driver.getTitle();
        System.out.println(actualTitle);
        Assert.assertEquals(actualTitle,"Get Quote - UAIS");

        //driver.close();
        // change focus back to old tab
        driver.switchTo().window(oldTab);

    }

    public void americanAccessPageTitle() throws InterruptedException {

        americanAccessBuyNowBtn.click();
        Thread.sleep(3000);

        // considering that there is only one tab opened in that point.
        String oldTab = driver.getWindowHandle();
        //driver.findElement(By.linkText("Twitter Advertising Blog")).click();
        ArrayList<String> newTab = new ArrayList<String>(driver.getWindowHandles());
        newTab.remove(oldTab);
        // change focus to new tab
        driver.switchTo().window(newTab.get(0));
        //assertAdvertisingBlog();

        // Do what you want here, you are in the new tab
        String actualTitle = driver.getTitle();
        System.out.println("Clicked Buy Now button carrier site is: "+actualTitle);
        Assert.assertEquals(actualTitle,"Get Quote - UAIS");

        //driver.close();
        // change focus back to old tab
        driver.switchTo().window(oldTab);

    }

    public void commonwealthGeneralPageTitle() throws InterruptedException {

        commonwealthGeneralBuyNowBtn.click();
        Thread.sleep(3000);

        // considering that there is only one tab opened in that point.
        String oldTab = driver.getWindowHandle();
        //driver.findElement(By.linkText("Twitter Advertising Blog")).click();
        ArrayList<String> newTab = new ArrayList<String>(driver.getWindowHandles());
        newTab.remove(oldTab);
        // change focus to new tab
        driver.switchTo().window(newTab.get(0));
        //assertAdvertisingBlog();

        // Do what you want here, you are in the new tab
        String actualTitle = driver.getTitle();
        System.out.println("Clicked Buy Now button carrier site is: "+ actualTitle);
        Assert.assertEquals(actualTitle,"A- Max Auto Insurance");

        //driver.close();
        // change focus back to old tab
        driver.switchTo().window(oldTab);

    }

}
