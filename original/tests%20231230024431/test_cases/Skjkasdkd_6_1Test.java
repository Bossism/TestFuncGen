package original;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

public class Skjkasdkd_6_1Test {

    @Test(timeout = 8000)
    public void testSkjkasdkd() {
        List<Integer> lst1 = Arrays.asList(0, 3, 2, 1, 3, 5, 7, 4, 5, 5, 5, 2, 181, 32, 4, 32, 3, 2, 32, 324, 4, 3);
        assertEquals(10, Skjkasdkd.skjkasdkd(lst1));

        List<Integer> lst2 = Arrays.asList(1, 0, 1, 8, 2, 4597, 2, 1, 3, 40, 1, 2, 1, 2, 4, 2, 5, 1);
        assertEquals(25, Skjkasdkd.skjkasdkd(lst2));

        List<Integer> lst3 = Arrays.asList(1, 3, 1, 32, 5107, 34, 83278, 109, 163, 23, 2323, 32, 30, 1, 9, 3);
        assertEquals(13, Skjkasdkd.skjkasdkd(lst3));

        List<Integer> lst4 = Arrays.asList(0, 724, 32, 71, 99, 32, 6, 0, 5, 91, 83, 0, 5, 6);
        assertEquals(11, Skjkasdkd.skjkasdkd(lst4));

        List<Integer> lst5 = Arrays.asList(0, 81, 12, 3, 1, 21);
        assertEquals(3, Skjkasdkd.skjkasdkd(lst5));

        List<Integer> lst6 = Arrays.asList(0, 8, 1, 2, 1, 7);
        assertEquals(7, Skjkasdkd.skjkasdkd(lst6));

        List<Integer> lst7 = Arrays.asList(8191);
        assertEquals(19, Skjkasdkd.skjkasdkd(lst7));

        List<Integer> lst8 = Arrays.asList(8191, 123456, 127, 7);
        assertEquals(19, Skjkasdkd.skjkasdkd(lst8));

        List<Integer> lst9 = Arrays.asList(127, 97, 8192);
        assertEquals(10, Skjkasdkd.skjkasdkd(lst9));
    }
}