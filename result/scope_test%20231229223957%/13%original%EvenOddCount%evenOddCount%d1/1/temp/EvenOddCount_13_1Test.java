package original;
import java.util.Arrays;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import java.util.List;

public class EvenOddCount_13_1Test {

    @Test(timeout = 8000)
    public void testEvenOddCount() {
        // Test case 1: num = -12
        List<Integer> result1 = EvenOddCount.evenOddCount(-12);
        assertEquals(Arrays.asList(1, 1), result1);

        // Test case 2: num = 123
        List<Integer> result2 = EvenOddCount.evenOddCount(123);
        assertEquals(Arrays.asList(1, 2), result2);

        // Test case 3: num = 7
        List<Integer> result3 = EvenOddCount.evenOddCount(7);
        assertEquals(Arrays.asList(0, 1), result3);

        // Test case 4: num = -78
        List<Integer> result4 = EvenOddCount.evenOddCount(-78);
        assertEquals(Arrays.asList(1, 1), result4);

        // Test case 5: num = 3452
        List<Integer> result5 = EvenOddCount.evenOddCount(3452);
        assertEquals(Arrays.asList(2, 2), result5);

        // Test case 6: num = 346211
        List<Integer> result6 = EvenOddCount.evenOddCount(346211);
        assertEquals(Arrays.asList(3, 3), result6);

        // Test case 7: num = -345821
        List<Integer> result7 = EvenOddCount.evenOddCount(-345821);
        assertEquals(Arrays.asList(3, 3), result7);

        // Test case 8: num = -2
        List<Integer> result8 = EvenOddCount.evenOddCount(-2);
        assertEquals(Arrays.asList(1, 0), result8);

        // Test case 9: num = -45347
        List<Integer> result9 = EvenOddCount.evenOddCount(-45347);
        assertEquals(Arrays.asList(2, 3), result9);

        // Test case 10: num = 0
        List<Integer> result10 = EvenOddCount.evenOddCount(0);
        assertEquals(Arrays.asList(1, 0), result10);
    }
}