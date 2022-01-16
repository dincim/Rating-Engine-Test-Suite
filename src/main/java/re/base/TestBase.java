package re.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import re.util.TestUtil;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class TestBase {
    // initialize all properties
    // basic init launching browser

    static public WebDriver driver;
    static public Properties prop;

    // create construction to read properties files
    public TestBase() {
        try {
            prop = new Properties();
            FileInputStream ip = new FileInputStream(
                    "C:\\Users\\Murat Dinc\\IdeaProjects\\RatingEngineTestAutomation" +
                            "\\src\\main\\java\\re\\config\\config.properties");
            prop.load(ip);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // create initialization method
    public static void initialization() {

        String browserName = prop.getProperty("browser");

        if (browserName.equals("chrome")) {
            System.setProperty("webdriver.chrome.driver",
                    "C:\\SeleniumDrivers\\chromedriver.exe");
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
}
