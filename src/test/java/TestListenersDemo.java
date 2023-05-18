import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(TestListeners.class)
public class TestListenersDemo {

    @Test
    public void testPrint()
    {
        System.out.println("This is a main function test print");
    }


}
