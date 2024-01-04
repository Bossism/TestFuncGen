package original;
import org.junit.Test;
import static org.junit.Assert.*;

public class GreatestCommonDivisor_28_1Test {

    @Test(timeout = 8000)
    public void testGreatestCommonDivisor() {
        // Test cases from the provided information
        assertEquals(1, GreatestCommonDivisor.greatestCommonDivisor(3, 5));
        assertEquals(5, GreatestCommonDivisor.greatestCommonDivisor(25, 15));
        assertEquals(1, GreatestCommonDivisor.greatestCommonDivisor(3, 7));
        assertEquals(5, GreatestCommonDivisor.greatestCommonDivisor(10, 15));
        assertEquals(7, GreatestCommonDivisor.greatestCommonDivisor(49, 14));
        assertEquals(12, GreatestCommonDivisor.greatestCommonDivisor(144, 60));

        // Additional test cases
        assertEquals(3, GreatestCommonDivisor.greatestCommonDivisor(3, 0));
        assertEquals(3, GreatestCommonDivisor.greatestCommonDivisor(0, 3));
        assertEquals(0, GreatestCommonDivisor.greatestCommonDivisor(0, 0));
        assertEquals(1, GreatestCommonDivisor.greatestCommonDivisor(1, 1));
        assertEquals(1, GreatestCommonDivisor.greatestCommonDivisor(1, 100));
        assertEquals(1, GreatestCommonDivisor.greatestCommonDivisor(100, 1));
        assertEquals(100, GreatestCommonDivisor.greatestCommonDivisor(100, 100));
    }
}