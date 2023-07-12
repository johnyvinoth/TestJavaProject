import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
@Listeners(TestListeners.class)
public class TestListenersDemo {

    @Test
    public void testPrint()
    {
        System.out.println("This is a main function test print");
    }


}
