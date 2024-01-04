package original;
import java.util.ArrayList;
import java.util.Collections;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.List;

public class GetOddCollatz_139_1Test {

    @Test(timeout = 8000)
    public void testGetOddCollatz() {
        List<Integer> expected = List.of(1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21, 23, 25, 27, 29, 31, 33, 35, 37, 39, 41, 43, 45, 47, 49, 51, 53, 55, 57, 59, 61, 63, 65, 67, 69, 71, 73, 75, 77, 79, 81, 83, 85, 87, 89, 91, 93, 95, 97, 99);
        List<Integer> result = GetOddCollatz.getOddCollatz(100);
        Collections.sort(result);
        assertEquals(expected, result);
    }

    @Test(timeout = 8000)
    public void testGetOddCollatzWithNegativeInput() {
        List<Integer> expected = List.of(1);
        List<Integer> result = GetOddCollatz.getOddCollatz(-5);
        assertEquals(expected, result);
    }

    @Test(timeout = 8000)
    public void testGetOddCollatzWithZeroInput() {
        List<Integer> expected = List.of(1);
        List<Integer> result = GetOddCollatz.getOddCollatz(0);
        assertEquals(expected, result);
    }

    @Test(timeout = 8000)
    public void testGetOddCollatzWithOneInput() {
        List<Integer> expected = List.of(1);
        List<Integer> result = GetOddCollatz.getOddCollatz(1);
        assertEquals(expected, result);
    }
}