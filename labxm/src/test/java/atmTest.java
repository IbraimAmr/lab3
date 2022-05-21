import junit.framework.TestCase;
import static org.junit.Assert.*;
import org.junit.Test;
public class atmTest extends TestCase {
    @Test
    public void testcase1(){
        atm a = new atm();
        a.isValidatedCard = false;
        assertEquals("Card not validated",a.enterCard());
    }
    @Test
    public void testcase2(){
        atm a = new atm();
        assertEquals("Validated card",a.enterCard());
    }
    @Test
    public void testcase3(){
        atm a = new atm();
        assertEquals("Successful login",a.enterPassword());
    }
    @Test
    public void testcase4(){
        atm a = new atm();
        assertEquals("Validated card",a.enterCard());
        a.isValidPassword = false;
        assertEquals("Wrong password",a.enterPassword());
    }
    @Test
    public void testcase5(){
        atm a = new atm();
        assertEquals("Validated card",a.enterCard());
        assertEquals("Successful login",a.enterPassword());
        assertEquals("Not enough balance",a.withdraw(50));
    }}
