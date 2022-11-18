package re.base;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import re.util.TestUtil;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class TestBase {
    // initialize all properties
    // basic init launching browser

     public static WebDriver driver;
     public static Properties prop;

    // create construction to read properties files
    public TestBase() {

//        this.driver = driver;
//        PageFactory.initElements(this.driver,this);

        try {
            prop = new Properties();
            FileInputStream ip = new FileInputStream(
                    "/Users/mattdinc/Documents/Rating-Engine-Test-Suite/src/main/java/re/config/config.properties");
            prop.load(ip);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // create initialization method
    public void initialization() {

        String browserName = prop.getProperty("browser");

        if (browserName.equals("chrome")) {
            System.setProperty("webdriver.chrome.driver",
                    "/Users/mattdinc/Documents/drivers/chromedriver");
            driver = new ChromeDriver();
        }else if(browserName.equals("FF")) {
            System.setProperty("webdriver.gecko.driver",
                    "C:\\SeleniumDrivers\\geckodriver.exe");
            driver = new FirefoxDriver();
        }

        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);

        driver.get(prop.getProperty("url"));

    }
    public static void sendEmail() throws EmailException {
        Email email = new SimpleEmail();
        email.setHostName("smtp.gmail.com");
        email.setSmtpPort(465);
        email.setAuthenticator(new DefaultAuthenticator("dincautotest@gmail.com", "zwtjvkyhouvymhwm"));
        email.setSSLOnConnect(true);
        email.setFrom("dincmurad@gmail.com");
        email.setSubject("Amax Automation Test Report");
        email.setMsg("This is a test mail ... :-)");
        email.addTo("dincmurad@gmail.com");
        email.send();
    }
}
