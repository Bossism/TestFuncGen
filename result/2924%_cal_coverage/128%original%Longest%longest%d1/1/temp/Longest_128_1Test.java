package original;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Longest_128_1Test {

    @Test(timeout = 8000)
    public void testLongest() {
        // Test case 1: Empty list
        List<Object> strings1 = new ArrayList<>();
        assertNull(Longest.longest(strings1));

        // Test case 2: List with one string
        List<Object> strings2 = Arrays.asList("hello");
        assertEquals("hello", Longest.longest(strings2));

        // Test case 3: List with multiple strings
        List<Object> strings3 = Arrays.asList("apple", "banana", "cherry");
        assertEquals("banana", Longest.longest(strings3));

        // Test case 4: List with strings of equal length
        List<Object> strings4 = Arrays.asList("cat", "dog", "rat");
        assertEquals("cat", Longest.longest(strings4));

        // Test case 5: List with null values
        List<Object> strings5 = Arrays.asList("hello", null, "world");
        assertEquals("hello", Longest.longest(strings5));
    }
}