import junit.framework.TestCase;
import org.junit.Test;
import static org.junit.Assert.*;
public class DigitalWatchTest extends TestCase {
    @Test
    public void testcase1() {
        DigitalWatch d = new DigitalWatch();
        assertEquals("Turned On!", d.turnOn());
    }

    @Test
    public void testcase2() {
        DigitalWatch d = new DigitalWatch();
        assertEquals("Turned On!", d.turnOn());
        assertEquals("Already turned on", d.turnOn());
    }

    @Test
    public void testcase3() {
        DigitalWatch d = new DigitalWatch();
        assertEquals("Turned On!", d.turnOn());
        assertEquals("Already turned on", d.turnOn());
        assertEquals("Turned off", d.turn_Off());
    }

    @Test
    public void testcase4() {
        DigitalWatch d = new DigitalWatch();
        assertEquals("Turned On!", d.turnOn());
        assertEquals("Timer set", d.set_Timer(10));
    }

    @Test
    public void testcase5() {
        DigitalWatch d = new DigitalWatch();
        assertEquals("Turned On!", d.turnOn());
        assertEquals("Timer set", d.set_Timer(12));
        assertEquals("Wait for timer to end", d.doSthng());
    }
}

