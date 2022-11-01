package re.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import re.base.BaseTest;
import re.base.TestBase;

public class GetQuoteManuallyPage extends BaseTest {

    @FindBy(xpath = "//*[@id=\"container-b6c3c4c729\"]/div/div[1]/div/input")
    WebElement zipCode;
    @FindBy(xpath = "//*[@id=\"container-b6c3c4c729\"]/div/div[2]/button")
    WebElement getQuoteBtn;

    @FindBy(id = "driver-firstname")
    WebElement driverFirstName;
    @FindBy(id = "driver-lastname")
    WebElement driverLastName;
    @FindBy(id = "dateofbirth")
    WebElement circleBtn;

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

    @FindBy(xpath = "//*[@id='driver-driveraddress']")
    WebElement driverAddress;

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


    public GetQuoteManuallyPage(){
        PageFactory.initElements(driver,this);
    }

    public void getQuoteManually() throws InterruptedException {
        zipCode.sendKeys("75074");
        getQuoteBtn.click();
        Thread.sleep(2000);

        driverFirstName.sendKeys("Murat");
        driverLastName.sendKeys("Tester");
        circleBtn.sendKeys("01012000");
        Thread.sleep(2000);

        JavascriptExecutor j = (JavascriptExecutor) driver;
        j.executeScript("window.scrollBy(0,350)", "");

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();",startBtn);
        //startBtn.click();
        Thread.sleep(2000);


        driverEmail.sendKeys("test@mail.com");
        driverPhone.sendKeys("1111111111");
        policyCheckBox.click();
        Thread.sleep(2000);
        nextBtn.click();

        driverAddress.sendKeys("61 Plano");
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

        buyNowBtn.click();

        buyNowAmaxLogo.isDisplayed();


    }

}
