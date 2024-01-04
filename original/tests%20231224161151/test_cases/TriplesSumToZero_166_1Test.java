package original;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.List;

public class TriplesSumToZero_166_1Test {

    @Test(timeout = 8000)
    public void testTriplesSumToZero() {
        // Test case 1: List with no elements
        List<Integer> emptyList = Arrays.asList();
        assertFalse(TriplesSumToZero.triplesSumToZero(emptyList));

        // Test case 2: List with one element
        List<Integer> singleElementList = Arrays.asList(1);
        assertFalse(TriplesSumToZero.triplesSumToZero(singleElementList));

        // Test case 3: List with three elements summing to zero
        List<Integer> sumZeroList = Arrays.asList(-1, 0, 1);
        assertTrue(TriplesSumToZero.triplesSumToZero(sumZeroList));

        // Test case 4: List with three elements not summing to zero
        List<Integer> nonSumZeroList = Arrays.asList(-1, 0, 2);
        assertFalse(TriplesSumToZero.triplesSumToZero(nonSumZeroList));

        // Test case 5: List with more than three elements summing to zero
        List<Integer> moreThanThreeSumZeroList = Arrays.asList(-1, 0, 1, 2, -2);
        assertTrue(TriplesSumToZero.triplesSumToZero(moreThanThreeSumZeroList));

        // Test case 6: List with more than three elements not summing to zero
        List<Integer> moreThanThreeNonSumZeroList = Arrays.asList(-1, 0, 1, 2, 3);
        assertFalse(TriplesSumToZero.triplesSumToZero(moreThanThreeNonSumZeroList));
    }
}