package re.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import re.base.BaseTest;
import re.base.TestBase;

public class GetQuoteManuallyPage extends BaseTest {

    @FindBy(xpath = "//input[@id='form-text-1424848195']")
    WebElement zipCode;
    @FindBy(xpath = "//button[@id='form-button-314788994']")
    WebElement getQuoteBtn;


    @FindBy(xpath = "//input[@name='name']")
    WebElement nameInput;
    @FindBy(xpath = "//input[@name='surname']")
    WebElement lNameInput;
    @FindBy(xpath = "//button[@class='circle-button']")
    WebElement circleBtn;

    @FindBy(xpath = "//select[@class='react-datepicker__month-select']")
    WebElement monthSelect;
    @FindBy(xpath = "//select[@class='react-datepicker__year-select']")
    WebElement yearSelect;
    @FindBy(xpath = "//div[@class='react-datepicker__day react-datepicker__day--010']")
    WebElement daySelect;
    @FindBy(xpath = "//div[@class='pointer custom-checkbox']")
    WebElement checkBox;
    @FindBy(xpath = "//button[@class='c-btn-red custom-hover filled block']")
    WebElement nxtBtnfirstStep;

    @FindBy(xpath = "//input[@name='detail']")
    WebElement addressInput;
    @FindBy(xpath = "//button[@class='c-btn-red custom-hover filled block']")
    WebElement nextBtnSecondStep;

    @FindBy(xpath = "//label[@for='id-maritalStatus-1']")
    WebElement checkMarried;
    @FindBy(xpath = "//label[@for='id-gender-0']")
    WebElement checkGender;
    @FindBy(xpath = "//label[@for='id-isInsured-0']")
    WebElement checkInsuredYes;
    @FindBy(xpath = "//button[contains(text(),'Next')]")
    WebElement nextBtnNextThirdStep;

    @FindBy(xpath = "//button[@class='list-group-item list-group-item-action'][4]")
    WebElement selectCarYear;
    @FindBy(xpath = "//button[@class='list-group-item list-group-item-action'][15]")
    WebElement selectCarMake;
    @FindBy(xpath = "//button[@class='list-group-item list-group-item-action'][3]")
    WebElement selectCarModel;
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

    public GetQuoteManuallyPage(){
        PageFactory.initElements(driver,this);
    }

    public void getQuoteManually() throws InterruptedException {
        zipCode.sendKeys("75074");
        getQuoteBtn.click();

        nameInput.sendKeys("Murat");
        lNameInput.sendKeys("Tester");
        circleBtn.click();
        Thread.sleep(2000);

        Select dobMonth = new Select(monthSelect);
        dobMonth.selectByVisibleText("January");

        Select dobYear = new Select(yearSelect);
        dobYear.selectByValue("2000");
        daySelect.click();
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,300)");
        Thread.sleep(1000);
        checkBox.click();
        Thread.sleep(2000);
        nxtBtnfirstStep.click();

        js.executeScript("window.scrollBy(0,-200)");
        addressInput.sendKeys("380 Vistacourt Dr");
        nextBtnSecondStep.click();

        Thread.sleep(3000);
        js.executeScript("window.scrollBy(0,-400)");
        checkMarried.click();
        checkGender.click();
        checkInsuredYes.click();
        Thread.sleep(3000);
        nextBtnNextThirdStep.click();

        selectCarYear.click();
        Thread.sleep(1000);
        selectCarMake.click();
        Thread.sleep(1000);
        selectCarModel.click();
        Thread.sleep(1000);
        nextBtnAfterCarSelect.click();
        Thread.sleep(3000);
        js.executeScript("window.scrollBy(0,600)");
        nextBtnToQuote.click();

        WebDriverWait wait=new WebDriverWait(driver, 20);
        WebElement phone ;
        phone = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[name='phone']")));
        phone.sendKeys("11111111111");
        emailField.sendKeys("tester@test.co");
        continueBtn.click();
        okBtn.click();
    }

}
