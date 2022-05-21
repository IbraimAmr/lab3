import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class EocheckerTest {
    @Test
    public void test1() {
        var c = new Eochecker();
        assertEquals("even",c.checker(2));
    }
    @Test
    public void test2() {
        var c = new Eochecker();
        assertEquals("even",c.checker(100));
    }
   @Test
   public void test3() {
       var c = new Eochecker();
       assertEquals("odd",c.checker(5));
   }
    @Test
    public void test4() {
        var c = new Eochecker();
        assertEquals("even",c.checker(5));
    }
}