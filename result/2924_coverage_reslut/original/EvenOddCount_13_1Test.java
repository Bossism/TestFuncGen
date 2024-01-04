package original;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import java.util.Arrays;
import java.util.List;

public class EvenOddCount_13_1Test {

    @Test(timeout = 8000)
    public void testEvenOddCount() {
        // Test case 1: num = 0
        int num1 = 0;
        List<Integer> result1 = EvenOddCount.evenOddCount(num1);
        assertEquals(Arrays.asList(1, 0), result1);

        // Test case 2: num = 123456
        int num2 = 123456;
        List<Integer> result2 = EvenOddCount.evenOddCount(num2);
        assertEquals(Arrays.asList(3, 3), result2);

        // Test case 3: num = -987654321
        int num3 = -987654321;
        List<Integer> result3 = EvenOddCount.evenOddCount(num3);
        assertEquals(Arrays.asList(4, 5), result3);
    }
}