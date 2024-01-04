package original;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.HashMap;
import java.util.Map;

public class Histogram_101_1Test {

    @Test(timeout = 8000)
    public void testHistogram() {
        // Test case 1: Empty string
        String input1 = "";
        Map<String, Integer> expected1 = new HashMap<>();
        assertEquals(expected1, Histogram.histogram(input1));

        // Test case 2: Single letter
        String input2 = "a";
        Map<String, Integer> expected2 = new HashMap<>();
        expected2.put("a", 1);
        assertEquals(expected2, Histogram.histogram(input2));

        // Test case 3: No repeated letters
        String input3 = "a b c";
        Map<String, Integer> expected3 = new HashMap<>();
        expected3.put("a", 1);
        expected3.put("b", 1);
        expected3.put("c", 1);
        assertEquals(expected3, Histogram.histogram(input3));

        // Test case 4: Multiple repeated letters
        String input4 = "a b b a";
        Map<String, Integer> expected4 = new HashMap<>();
        expected4.put("a", 2);
        expected4.put("b", 2);
        assertEquals(expected4, Histogram.histogram(input4));

        // Test case 5: Multiple repeated letters with same occurrence
        String input5 = "a b c a b";
        Map<String, Integer> expected5 = new HashMap<>();
        expected5.put("a", 2);
        expected5.put("b", 2);
        assertEquals(expected5, Histogram.histogram(input5));

        // Test case 6: Multiple repeated letters with different occurrence
        String input6 = "b b b b a";
        Map<String, Integer> expected6 = new HashMap<>();
        expected6.put("b", 4);
        assertEquals(expected6, Histogram.histogram(input6));
    }
}