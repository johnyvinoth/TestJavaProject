import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;
import org.testng.asserts.*;

import javax.swing.*;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;

@Listeners(TestListeners.class)
public class Test1 {
private static WebDriver driver;
    public static void main(String[] args) {

        System.out.println("Hello World");
        String url="";
//        WebElement txtBox=driver.findElement(By.xpath("//a[normalize-space()='For Public']"));

//            System.setProperties("webdriver.chrome.driver","/Users/johnyvinothxavier/Johny/JavaProjects/Dependent Files");
        driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");

//        PATH="/usr/local/bin/chromedriver.exe";
//        driver=webdriver.
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(2));
        driver.get("https://ultimateqa.com/fake-landing-page#");
        driver.manage().window().maximize();
//        WebElement btn= driver.findElement(By.xpath("//a[normalize-space()='For Public']"));
//        Actions action= new Actions(driver);
//        action.moveToElement(btn).build().perform();
//        btn.click();
        List<WebElement> links= driver.findElements(By.tagName("a"));
        Iterator<WebElement> it=links.listIterator();
        while(it.hasNext())
        {
            url=it.next().getAttribute("href");

            System.out.println("Links list:"+url);
        }
        driver.quit();




    }

    @BeforeSuite
    public void befSuite(){
        System.out.println("Before Suite");
        driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");

    //        PATH="/usr/local/bin/chromedriver.exe";
    //        driver=webdriver.
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(2));
        driver.get("https://ultimateqa.com/fake-landing-page#");
        driver.manage().window().maximize();
    }
    @BeforeClass
    public void befClass(){
        System.out.println("Before Class");
    }

    @BeforeTest
    public void befTest(){
        System.out.println("Before Test");
    }
    @BeforeMethod
    public void befMethod(){
        System.out.println("Before Method");
    }

    @Test
   @Parameters("TestParam")
    public void testSample(String TestParam){

        System.out.println("Testng Print");
        System.out.println("Test Param is: "+TestParam);
        String str="Test";
        String url="";
       List<WebElement> links= driver.findElements(By.tagName("a"));
       Iterator<WebElement> it=links.listIterator();
       while(it.hasNext())
       {
           url=it.next().getAttribute("href");

           System.out.println("Links list:"+url);
       }
    }

    @AfterSuite
    public void aftSuite(){
        driver.quit();
    }
}
