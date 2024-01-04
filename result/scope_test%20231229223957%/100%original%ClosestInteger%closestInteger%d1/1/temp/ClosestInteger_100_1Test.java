package original;
import org.junit.Test;
import static org.junit.Assert.*;

public class ClosestInteger_100_1Test {

    @Test(timeout = 8000)
    public void testClosestInteger() {
        // Test cases
        assertEquals(10, ClosestInteger.closestInteger("10"));
        assertEquals(15, ClosestInteger.closestInteger("15.3"));
        assertEquals(15, ClosestInteger.closestInteger("14.5"));
        assertEquals(-16, ClosestInteger.closestInteger("-15.5"));
        assertEquals(0, ClosestInteger.closestInteger("0"));
    }
}