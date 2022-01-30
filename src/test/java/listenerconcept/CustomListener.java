package listenerconcept;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.internal.annotations.IListeners;
import re.base.BaseTest;

import static org.bouncycastle.util.test.SimpleTestResult.failed;

public class CustomListener extends BaseTest implements ITestListener {
    @Override
    public void onTestStart(ITestResult result) {

    }
    @Override
    public void onTestSuccess(ITestResult result) {

    }
    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("FAILED Test");
        failed(result.getMethod().getMethodName());

    }

    private void failed(String methodName) {
    }

    @Override
    public void onTestSkipped(ITestResult result) {

    }
}
