package original;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Longest_128_1Test {

    @Test(timeout = 8000)
    public void testLongest() {
        // Test case 1: List with multiple strings
        List<Object> strings1 = new ArrayList<>(Arrays.asList("a", "b", "c"));
        assertEquals("a", Longest.longest(strings1));

        // Test case 2: List with multiple strings of different lengths
        List<Object> strings2 = new ArrayList<>(Arrays.asList("a", "bb", "ccc"));
        assertEquals("ccc", Longest.longest(strings2));

        // Test case 3: Empty list
        List<Object> strings3 = new ArrayList<>();
        assertNull(Longest.longest(strings3));

        // Test case 4: List with multiple strings of the same length
        List<Object> strings4 = new ArrayList<>(Arrays.asList("x", "y", "z"));
        assertEquals("x", Longest.longest(strings4));

        // Test case 5: List with multiple strings of different lengths
        List<Object> strings5 = new ArrayList<>(Arrays.asList("x", "yyy", "zzzz", "www", "kkkk", "abc"));
        assertEquals("zzzz", Longest.longest(strings5));
    }
}