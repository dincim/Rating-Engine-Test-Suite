package re.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import re.base.TestBase;
import re.pages.GetQuotePublicDataPage;

public class GetQuotePublicDataTest extends TestBase {

    GetQuotePublicDataPage getQuotePublicDataPage;

    public GetQuotePublicDataTest() {
        super();
    }
        @BeforeMethod
        public void setUp () {
            initialization();
            getQuotePublicDataPage = new GetQuotePublicDataPage();
        }
        @Test
        public void ratingEnginePDTest () throws InterruptedException {
            getQuotePublicDataPage.getQuotePublicData();
        }
//        @AfterMethod
//        public void tearDown () {
//            driver.quit();
//        }
    }



