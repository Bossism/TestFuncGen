package original;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.List;

public class PairsSumToZero_44_1Test {

    @Test(timeout = 8000)
    public void testPairsSumToZero() {
        // Test case 1: List with two elements that sum to zero
        List<Integer> list1 = Arrays.asList(2, -2);
        assertTrue(PairsSumToZero.pairsSumToZero(list1));

        // Test case 2: List with two elements that do not sum to zero
        List<Integer> list2 = Arrays.asList(2, 3);
        assertFalse(PairsSumToZero.pairsSumToZero(list2));

        // Test case 3: List with three elements where two elements sum to zero
        List<Integer> list3 = Arrays.asList(2, -2, 3);
        assertTrue(PairsSumToZero.pairsSumToZero(list3));

        // Test case 4: List with three elements where no two elements sum to zero
        List<Integer> list4 = Arrays.asList(2, 3, 4);
        assertFalse(PairsSumToZero.pairsSumToZero(list4));

        // Test case 5: Empty list
        List<Integer> list5 = Arrays.asList();
        assertFalse(PairsSumToZero.pairsSumToZero(list5));
    }
}