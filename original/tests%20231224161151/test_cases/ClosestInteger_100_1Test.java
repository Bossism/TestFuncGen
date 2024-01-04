package original;
import org.junit.Test;
import static org.junit.Assert.*;

public class ClosestInteger_100_1Test {

    @Test(timeout = 8000)
    public void testClosestIntegerPositive() {
        String value = "3.7";
        int expected = 4;
        int actual = ClosestInteger.closestInteger(value);
        assertEquals(expected, actual);
    }

    @Test(timeout = 8000)
    public void testClosestIntegerNegative() {
        String value = "-2.3";
        int expected = -2;
        int actual = ClosestInteger.closestInteger(value);
        assertEquals(expected, actual);
    }
}