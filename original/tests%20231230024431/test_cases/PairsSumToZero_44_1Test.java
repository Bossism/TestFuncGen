package original;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

public class PairsSumToZero_44_1Test {

    @Test(timeout = 8000)
    public void testPairsSumToZero() {
        // Test case 1: No pairs sum to zero
        List<Integer> list1 = Arrays.asList(1, 3, 5, 0);
        assertFalse(PairsSumToZero.pairsSumToZero(list1));

        // Test case 2: No pairs sum to zero
        List<Integer> list2 = Arrays.asList(1, 3, -2, 1);
        assertFalse(PairsSumToZero.pairsSumToZero(list2));

        // Test case 3: No pairs sum to zero
        List<Integer> list3 = Arrays.asList(1, 2, 3, 7);
        assertFalse(PairsSumToZero.pairsSumToZero(list3));

        // Test case 4: Pairs sum to zero
        List<Integer> list4 = Arrays.asList(2, 4, -5, 3, 5, 7);
        assertTrue(PairsSumToZero.pairsSumToZero(list4));

        // Test case 5: No pairs sum to zero
        List<Integer> list5 = Arrays.asList(1);
        assertFalse(PairsSumToZero.pairsSumToZero(list5));

        // Test case 6: Pairs sum to zero
        List<Integer> list6 = Arrays.asList(-3, 9, -1, 3, 2, 30);
        assertTrue(PairsSumToZero.pairsSumToZero(list6));

        // Test case 7: Pairs sum to zero
        List<Integer> list7 = Arrays.asList(-3, 9, -1, 3, 2, 31);
        assertTrue(PairsSumToZero.pairsSumToZero(list7));

        // Test case 8: No pairs sum to zero
        List<Integer> list8 = Arrays.asList(-3, 9, -1, 4, 2, 30);
        assertFalse(PairsSumToZero.pairsSumToZero(list8));

        // Test case 9: No pairs sum to zero
        List<Integer> list9 = Arrays.asList(-3, 9, -1, 4, 2, 31);
        assertFalse(PairsSumToZero.pairsSumToZero(list9));
    }
}