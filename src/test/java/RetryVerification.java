import org.testng.Assert;
import org.testng.annotations.Test;

public class RetryVerification {
    private int i = 0;

    @Test(retryAnalyzer = RetryAnalyser.class)
    public void test_retry_verification() {

        System.out.println("Executing flakyTest times:" + i);
        i++;
        if (i < 5) {
            System.out.println("Making assertion failure");
            Assert.assertTrue(false);
        } else {
            System.out.println("Making assertion success");
            Assert.assertTrue(true);
        }
    }
}
