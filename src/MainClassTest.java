import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MainClassTest extends MainClass
{

    @Before
    public void textStartSession()
    {
        System.out.println("Session start");
    }

    @After
    public void textFinishtSession()
    {
        System.out.println("Session finished");
    }

    @Test
    public void testGetLocalNumber() {
        int expected = 14;
        int actual = this.getLocalNumber();
        System.out.println("Start first test");
        Assert.assertTrue("The number should be == 14, but your is " + actual, expected == actual);

    }


}
