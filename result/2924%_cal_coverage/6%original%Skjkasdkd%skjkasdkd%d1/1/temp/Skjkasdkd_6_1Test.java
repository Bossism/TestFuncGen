package original;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.List;

public class Skjkasdkd_6_1Test {

    @Test(timeout = 8000)
    public void testSkjkasdkd() {
        List<Integer> lst = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29);
        int expected = 2 + 3 + 5 + 7 + 1 + 1 + 3 + 1 + 7 + 1 + 9 + 2 + 3 + 2 + 9;
        int result = Skjkasdkd.skjkasdkd(lst);
        assertEquals(expected, result);
    }

    @Test(timeout = 8000)
    public void testSkjkasdkdEmptyList() {
        List<Integer> lst = Arrays.asList();
        int expected = 0;
        int result = Skjkasdkd.skjkasdkd(lst);
        assertEquals(expected, result);
    }

    @Test(timeout = 8000)
    public void testSkjkasdkdNoPrimes() {
        List<Integer> lst = Arrays.asList(4, 6, 8, 9, 10);
        int expected = 0;
        int result = Skjkasdkd.skjkasdkd(lst);
        assertEquals(expected, result);
    }

    @Test(timeout = 8000)
    public void testSkjkasdkdNegativeNumbers() {
        List<Integer> lst = Arrays.asList(-2, -3, -5, -7, -11, -13, -17, -19, -23, -29);
        int expected = 0;
        int result = Skjkasdkd.skjkasdkd(lst);
        assertEquals(expected, result);
    }
}