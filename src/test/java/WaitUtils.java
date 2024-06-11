import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WaitUtils {
//    private WebDriver driver;

    public static WebElement WaitUntilElementLoaded(WebDriver driver, WebElement element)
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.pollingEvery(Duration.ofMillis(200));
        return wait.until(ExpectedConditions.elementToBeClickable(element));


    }
}
