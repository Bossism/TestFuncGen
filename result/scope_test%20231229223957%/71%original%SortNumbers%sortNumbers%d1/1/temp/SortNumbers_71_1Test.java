package original;
import org.junit.Test;
import static org.junit.Assert.*;

public class SortNumbers_71_1Test {

    @Test(timeout = 8000)
    public void testSortNumbers() {
        // Test case 1: Sorting numbers "three one five"
        String result1 = SortNumbers.sortNumbers("three one five");
        assertEquals("one three five", result1);

        // Test case 2: Sorting an empty string
        String result2 = SortNumbers.sortNumbers("");
        assertEquals("", result2);

        // Test case 3: Sorting a single number "three"
        String result3 = SortNumbers.sortNumbers("three");
        assertEquals("three", result3);

        // Test case 4: Sorting numbers "three five nine"
        String result4 = SortNumbers.sortNumbers("three five nine");
        assertEquals("three five nine", result4);

        // Test case 5: Sorting numbers "five zero four seven nine eight"
        String result5 = SortNumbers.sortNumbers("five zero four seven nine eight");
        assertEquals("zero four five seven eight nine", result5);

        // Test case 6: Sorting numbers "six five four three two one zero"
        String result6 = SortNumbers.sortNumbers("six five four three two one zero");
        assertEquals("zero one two three four five six", result6);
    }
}