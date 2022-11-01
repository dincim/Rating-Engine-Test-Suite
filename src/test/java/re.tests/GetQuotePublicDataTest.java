package re.tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import re.base.BaseTest;
import re.base.TestBase;
import re.pages.GetQuotePublicDataPage;

import java.util.ArrayList;

public class GetQuotePublicDataTest extends BaseTest {

    public GetQuotePublicDataTest() {
        super();
    }
//        @BeforeMethod
//        public void setUp () {
//            initialization();
//            getQuotePublicDataPage = new GetQuotePublicDataPage();
//        }
        @Test
        public void getQuotePublicData () throws InterruptedException {
            GetQuotePublicDataPage getQuotePublicDataPage = new GetQuotePublicDataPage();
            getQuotePublicDataPage.getQuotePublicData();
            getQuotePublicDataPage.getSeaHarborPageTitle();
            getQuotePublicDataPage.getUAICPageTitle();

    }

    }
//        @AfterMethod
//        public void tearDown () {
//            driver.quit();
//  }




