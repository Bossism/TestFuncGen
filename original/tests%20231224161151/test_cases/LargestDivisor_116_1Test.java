package original;
import org.junit.Test;
import static org.junit.Assert.*;

public class LargestDivisor_116_1Test {

    @Test(timeout = 8000)
    public void testLargestDivisor() {
        // Test case 1: n = 12
        int result1 = LargestDivisor.largestDivisor(12);
        assertEquals(6, result1);

        // Test case 2: n = 17
        int result2 = LargestDivisor.largestDivisor(17);
        assertEquals(1, result2);

        // Test case 3: n = 30
        int result3 = LargestDivisor.largestDivisor(30);
        assertEquals(15, result3);

        // Test case 4: n = 1
        int result4 = LargestDivisor.largestDivisor(1);
        assertEquals(1, result4);
    }
}