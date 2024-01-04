package original;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NextSmallest_131_1Test {

    @Test(timeout = 8000)
    public void testNextSmallest() {
        // Test case 1: Empty list
        List<Object> emptyList = new ArrayList<>();
        assertNull(NextSmallest.nextSmallest(emptyList));

        // Test case 2: List with one element
        List<Object> singleElementList = Arrays.asList(5);
        assertNull(NextSmallest.nextSmallest(singleElementList));

        // Test case 3: List with two elements
        List<Object> twoElementList = Arrays.asList(5, 3);
        assertEquals(5, (int) NextSmallest.nextSmallest(twoElementList));

        // Test case 4: List with multiple elements
        List<Object> multipleElementList = Arrays.asList(5, 3, 7, 2, 9, 1);
        assertEquals(2, (int) NextSmallest.nextSmallest(multipleElementList));

        // Test case 5: List with multiple elements, smallest and next smallest are the same
        List<Object> sameSmallestList = Arrays.asList(5, 5, 7, 2, 9, 1);
        assertEquals(2, (int) NextSmallest.nextSmallest(sameSmallestList));

        // Test case 6: List with multiple elements, next smallest is null
        List<Object> nullNextSmallestList = Arrays.asList(5, 1, 7, 2, 9, 1);
        assertEquals(2, (int) NextSmallest.nextSmallest(nullNextSmallestList));
    }
}