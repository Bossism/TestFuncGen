package original;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.HashMap;
import java.util.Map;

public class Histogram_101_1Test {

    @Test(timeout = 8000)
    public void testHistogram() {
        // Test case 1: Empty string
        String test1 = "";
        Map<String, Integer> expected1 = new HashMap<>();
        assertEquals(expected1, Histogram.histogram(test1));

        // Test case 2: String with one word
        String test2 = "hello";
        Map<String, Integer> expected2 = new HashMap<>();
        expected2.put("hello", 1);
        assertEquals(expected2, Histogram.histogram(test2));

        // Test case 3: String with multiple words
        String test3 = "hello world hello";
        Map<String, Integer> expected3 = new HashMap<>();
        expected3.put("hello", 2);
        expected3.put("world", 1);
        assertEquals(expected3, Histogram.histogram(test3));

        // Test case 4: String with multiple words and multiple words with same frequency
        String test4 = "hello world hello world";
        Map<String, Integer> expected4 = new HashMap<>();
        expected4.put("hello", 2);
        expected4.put("world", 2);
        assertEquals(expected4, Histogram.histogram(test4));
    }
}