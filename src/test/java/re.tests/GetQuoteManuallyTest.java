package re.tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import re.base.TestBase;
import re.pages.GetQuoteManuallyPage;

public class GetQuoteManuallyTest extends TestBase {
    GetQuoteManuallyPage getQuoteManuallyPage;
    public GetQuoteManuallyTest(){
        super();
    }

    @BeforeMethod
    public void setUp () {
        initialization();
        getQuoteManuallyPage = new GetQuoteManuallyPage();
    }

    @Test
    public void getQuoteManuallyTest() throws InterruptedException {
        getQuoteManuallyPage.getQuoteManually();
    }
}
