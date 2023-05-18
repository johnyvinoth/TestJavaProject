import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;


public class TestListeners implements ITestListener {
    @Override
    public void onTestStart(ITestResult result) {
        System.out.println("Inside the listener onTestStart and the function name is :"+result.getName());
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("Inside the listener onTestSuccess and the function name is :"+result.getName());
    }

    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("Inside the listener onTestFailure and the function name is :"+result.getName());
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        System.out.println("Inside the listener onTestSkipped and the function name is :"+result.getName());
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        System.out.println("Inside the listener onTestFailedButWithinSuccessPercentage and the function name is :"+result.getName());
    }

    @Override
    public void onTestFailedWithTimeout(ITestResult result) {
        System.out.println("Inside the listener onTestFailedWithTimeout and the function name is :"+result.getName());
    }

    @Override
    public void onStart(ITestContext context) {
        System.out.println("Inside the listener onStart and the function name is :"+context.getName());
    }

    @Override
    public void onFinish(ITestContext context) {
        System.out.println("Inside the listener onFinish and the function name is :"+context.getName());
    }
}
