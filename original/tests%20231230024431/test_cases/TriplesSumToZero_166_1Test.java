package original;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

public class TriplesSumToZero_166_1Test {

    @Test(timeout = 8000)
    public void testTriplesSumToZero() {
        // Test case 1: No triple sum to zero
        List<Integer> list1 = Arrays.asList(1, 3, 5, 0);
        assertFalse(TriplesSumToZero.triplesSumToZero(list1));

        // Test case 2: No triple sum to zero
        List<Integer> list2 = Arrays.asList(1, 3, 5, -1);
        assertFalse(TriplesSumToZero.triplesSumToZero(list2));

        // Test case 3: Triple sum to zero
        List<Integer> list3 = Arrays.asList(1, 3, -2, 1);
        assertTrue(TriplesSumToZero.triplesSumToZero(list3));

        // Test case 4: No triple sum to zero
        List<Integer> list4 = Arrays.asList(1, 2, 3, 7);
        assertFalse(TriplesSumToZero.triplesSumToZero(list4));

        // Test case 5: No triple sum to zero
        List<Integer> list5 = Arrays.asList(1, 2, 5, 7);
        assertFalse(TriplesSumToZero.triplesSumToZero(list5));

        // Test case 6: Triple sum to zero
        List<Integer> list6 = Arrays.asList(2, 4, -5, 3, 9, 7);
        assertTrue(TriplesSumToZero.triplesSumToZero(list6));

        // Test case 7: No triple sum to zero
        List<Integer> list7 = Arrays.asList(1);
        assertFalse(TriplesSumToZero.triplesSumToZero(list7));

        // Test case 8: No triple sum to zero
        List<Integer> list8 = Arrays.asList(1, 3, 5, -100);
        assertFalse(TriplesSumToZero.triplesSumToZero(list8));

        // Test case 9: No triple sum to zero
        List<Integer> list9 = Arrays.asList(100, 3, 5, -100);
        assertFalse(TriplesSumToZero.triplesSumToZero(list9));
    }
}