package re.tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import re.base.BaseTest;
import re.base.TestBase;
import re.pages.GetQuoteManuallyPage;

public class GetQuoteManuallyTest extends BaseTest {

    public GetQuoteManuallyTest(){
        super();
    }

//    @BeforeMethod
//    public void setUp () {
//        initialization();
//        getQuoteManuallyPage = new GetQuoteManuallyPage();
//    }

    @Test
    public void getQuoteManually() throws InterruptedException {
        GetQuoteManuallyPage getQuoteManuallyPage = new GetQuoteManuallyPage();
        getQuoteManuallyPage.getQuoteManually();
    }
}
