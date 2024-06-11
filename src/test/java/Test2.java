import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.Duration;
import java.util.List;

public class Test2 {
    public static WebDriver driver;

    @BeforeClass
    public void init() throws IOException, InterruptedException {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
//        String url="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
//        String url1="https://profile.w3schools.com/sign-up?redirect_url=https%3A%2F%2Fmy-learning.w3schools.com%2F";
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
//        driver.get(url);

        driver.manage().window().maximize();


    }

    @Test (enabled = false)
    public void navigationTest() throws InterruptedException {
//        System.out.println("Navingation Test");
        String url1="https://profile.w3schools.com/sign-up?redirect_url=https%3A%2F%2Fmy-learning.w3schools.com%2F";
        driver.get(url1);
        List<WebElement> inputFields = driver.findElements(By.tagName("input"));
        for (WebElement inputField : inputFields) {
            String type = inputField.getAttribute("type");
            if(!"checkbox".equals(type))
            {
                String id = inputField.getAttribute("id");
               if (id.contains("username"))
               {
                   inputField.sendKeys("Test@gmail.com");
               } else if (id.contains("password")) {
                   inputField.sendKeys("password");
               }

            }
//            System.out.println(id);
        }


        Thread.sleep(1000);
        driver.quit();
    }
    @Test()
    public void testOrangeHRM()
    {
        String url="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
        driver.get(url);
        WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(20));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.tagName("input")));
        List<WebElement> inputFields= driver.findElements(By.tagName("input"));
        if(inputFields.size()!=0)
        {
            for (WebElement inputField : inputFields) {
                String id = inputField.getAttribute("id");
                String name = inputField.getAttribute("name");
                System.out.println("The element name is : " + name + " and its id is : " + id);
                Reporter.log("The element name is : " + name + " and its id is : " + id);
            }
        }
        else
        {
            System.out.println("There is no element grabbed.");
        }
    }
    @Test
    public static void test()
    {
        System.out.println("Testing");

    }
    @AfterClass
    public void teardown()
    {
        driver.quit();
    }
}
