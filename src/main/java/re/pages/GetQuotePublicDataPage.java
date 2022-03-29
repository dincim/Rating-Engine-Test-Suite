package re.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import re.base.BaseTest;
import re.base.TestBase;

public class GetQuotePublicDataPage extends BaseTest {

    @FindBy(xpath = "//input[@id='form-text-1424848195']")
    WebElement zipCode;
    @FindBy(xpath = "//button[@id='form-button-314788994']")
    WebElement getQuoteBtn;

    @FindBy(xpath = "//input[@name='licenseId']")
    WebElement dlField;
    @FindBy(xpath = "//div[@class='pointer custom-checkbox']")
    WebElement checkBox;
    @FindBy(xpath = "//button[@class='c-btn-red custom-hover filled block']")
    WebElement nxtBtnfirstStep;

    @FindBy(xpath = "//button[@class='c-btn-red custom-hover filled block']")
    WebElement nextBtnSecondStep;

    @FindBy(xpath = "//*[@id=\"otherFields\"]/div/div[2]/div/div[1]/div/div/label[2]/div/div[1]")
    WebElement checkMarried;
    @FindBy(xpath = "//label[@for='id-gender-0']")
    WebElement checkGender;
    @FindBy(xpath = "//label[@for='id-isInsured-0']")
    WebElement checkInsuredYes;
    @FindBy(xpath = "//button[contains(text(),'Next')]")
    WebElement nextBtnNextThirdStep;

    @FindBy(xpath = "//button[contains(text(),'No, Next')]")
    WebElement noNextBtn;

    @FindBy(xpath = "//button[@class='list-group-item list-group-item-action carItemButton'][1]")
    WebElement selectCar;
    @FindBy(xpath = "//button[contains(text(),'Next')]")
    WebElement nextBtnAfterCarSelect;

    @FindBy(xpath = "//button[@class='c-btn-red custom-hover m-b-20 multiLine filled block']")
    WebElement nextBtnToQuote;

    @FindBy(xpath = "//input[@name='phone']")
    WebElement phoneField;
    @FindBy(xpath = "//input[@name='tests']")
    WebElement emailField;
    @FindBy(xpath = "//span[contains(text(),'Continue')]")
    WebElement continueBtn;

    @FindBy(xpath = "//button[@class='swal2-confirm swal2-styled']")
    WebElement okBtn;

    public GetQuotePublicDataPage(){
        PageFactory.initElements(driver,this);
    }

    public void getQuotePublicData() throws InterruptedException {

        zipCode.sendKeys("75062");
        getQuoteBtn.click();

        dlField.sendKeys("113");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();",checkBox);
        Thread.sleep(3000);
        js.executeScript("window.scrollBy(0,600)");
        nxtBtnfirstStep.click();
        nextBtnSecondStep.click();
        Thread.sleep(3000);
        js.executeScript("window.scrollBy(0,-400)");

        checkMarried.click();
        checkGender.click();
        checkInsuredYes.click();
        Thread.sleep(3000);
        nextBtnNextThirdStep.click();

        noNextBtn.click();

        selectCar.click();
        Thread.sleep(3000);
        nextBtnAfterCarSelect.click();
        Thread.sleep(3000);
        js.executeScript("window.scrollBy(0,600)");
       // js.executeScript("arguments[0].click();",nextBtnToQuote);
        nextBtnToQuote.click();

        WebDriverWait wait=new WebDriverWait(driver, 20);
        WebElement phone ;
        phone = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[name='phone']")));
        phone.sendKeys("0900900990");
        emailField.sendKeys("test@test.com");
        continueBtn.click();
        okBtn.click();
    }
}
