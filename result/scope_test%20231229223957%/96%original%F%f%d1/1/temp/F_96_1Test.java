package original;
import java.util.ArrayList;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.List;
import java.util.Arrays;

public class F_96_1Test {

    @Test(timeout = 8000)
    public void testF() {
        // Test case 1
        List<Integer> expected1 = Arrays.asList(1, 2, 6, 24, 15);
        List<Integer> result1 = F.f(5);
        assertEquals(expected1, result1);

        // Test case 2
        List<Integer> expected2 = Arrays.asList(1, 2, 6, 24, 15, 720, 28);
        List<Integer> result2 = F.f(7);
        assertEquals(expected2, result2);

        // Test case 3
        List<Integer> expected3 = Arrays.asList(1);
        List<Integer> result3 = F.f(1);
        assertEquals(expected3, result3);

        // Test case 4
        List<Integer> expected4 = Arrays.asList(1, 2, 6);
        List<Integer> result4 = F.f(3);
        assertEquals(expected4, result4);
    }

    @Test(timeout = 8000)
    public void testFactorial() {
        // Test case 1
        int expected1 = 2;
        int result1 = F.factorial(2);
        assertEquals(expected1, result1);

        // Test case 2
        int expected2 = 6;
        int result2 = F.factorial(3);
        assertEquals(expected2, result2);

        // Test case 3
        int expected3 = 24;
        int result3 = F.factorial(4);
        assertEquals(expected3, result3);
    }

    @Test(timeout = 8000)
    public void testSum() {
        // Test case 1
        int expected1 = 1;
        int result1 = F.sum(1);
        assertEquals(expected1, result1);

        // Test case 2
        int expected2 = 3;
        int result2 = F.sum(2);
        assertEquals(expected2, result2);

        // Test case 3
        int expected3 = 6;
        int result3 = F.sum(3);
        assertEquals(expected3, result3);
    }
}