package original;
import org.junit.Test;
import static org.junit.Assert.*;

public class GreatestCommonDivisor_28_1Test {

    @Test(timeout = 8000)
    public void testGreatestCommonDivisor() {
        // Test case 1: a = 0, b = 10
        int result1 = GreatestCommonDivisor.greatestCommonDivisor(0, 10);
        assertEquals(10, result1);

        // Test case 2: a = 10, b = 0
        int result2 = GreatestCommonDivisor.greatestCommonDivisor(10, 0);
        assertEquals(10, result2);

        // Test case 3: a = 10, b = 5
        int result3 = GreatestCommonDivisor.greatestCommonDivisor(10, 5);
        assertEquals(5, result3);

        // Test case 4: a = 15, b = 10
        int result4 = GreatestCommonDivisor.greatestCommonDivisor(15, 10);
        assertEquals(5, result4);

        // Test case 5: a = 21, b = 14
        int result5 = GreatestCommonDivisor.greatestCommonDivisor(21, 14);
        assertEquals(7, result5);
    }
}