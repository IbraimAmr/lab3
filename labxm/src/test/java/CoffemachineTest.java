import junit.framework.TestCase;
import static org.junit.Assert.*;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;
public class CoffemachineTest extends TestCase {
    @Test
    public void testcase1(){
        Coffemachine c = new Coffemachine();
        assertEquals("Power on" + "lights on",c.openmachine());
    }
    @Test
    public void testcase2(){
        Coffemachine c= new Coffemachine();
        c.power_on = true;
        assertEquals("Error",c.openmachine());
    }

    @Test
    public void testcase3(){
        Coffemachine c = new Coffemachine();
        c.openmachine();
        assertEquals("added coins Successfully ",c.addcoins(30));
    }





}