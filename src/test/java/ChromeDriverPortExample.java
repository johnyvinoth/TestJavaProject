import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

public class ChromeDriverPortExample {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();

        // Create ChromeDriverService instance
        ChromeDriverService service = ChromeDriverService.createDefaultService();

        // Create ChromeDriver with the service
        WebDriver driver = new ChromeDriver(service);

        // Retrieve the port from ChromeDriverService
        int port = service.getUrl().getPort();
        System.out.println("ChromeDriver is running on port: " + port);

        // Rest of your code...

        // Quit the driver and service
        driver.quit();
        service.stop();
    }
}
