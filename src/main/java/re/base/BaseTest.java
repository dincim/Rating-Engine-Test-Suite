package re.base;

import org.apache.commons.mail.EmailException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

public class BaseTest extends TestBase{

    @BeforeClass
    public void setUp() {
        initialization();
    }

    @AfterMethod
   public void tearDown() throws EmailException {
        //driver.quit();
        sendEmail();
    }
}

