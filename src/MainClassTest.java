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
        int value = 45;
        int actual = this.getLocalNumber();
        System.out.println("Start first test");
        Assert.assertTrue("The number should be > 45, but your is " + actual, actual > value);
    }


    @Test
    public void testGetClassString()
    {
        String text = this.getClass_string();
        if (text.contains("hello"))
        {
            System.out.println("ok");
        } else if (text.contains("Hello"))
        {
            System.out.println("ok");
        } else
        {
            Assert.fail("There are no Hello or hello in str");
        }
    }

}
