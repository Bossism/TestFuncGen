package original;
import java.util.Arrays;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.List;

public class ReverseDelete_89_1Test {

    @Test(timeout = 8000)
    public void testReverseDelete() {
        // Test case 1
        List<Object> result1 = ReverseDelete.reverseDelete("abcde", "ae");
        assertEquals(Arrays.asList("bcd", false), result1);

        // Test case 2
        List<Object> result2 = ReverseDelete.reverseDelete("abcdef", "b");
        assertEquals(Arrays.asList("acdef", false), result2);

        // Test case 3
        List<Object> result3 = ReverseDelete.reverseDelete("abcdedcba", "ab");
        assertEquals(Arrays.asList("cdedc", true), result3);

        // Test case 4
        List<Object> result4 = ReverseDelete.reverseDelete("dwik", "w");
        assertEquals(Arrays.asList("dik", false), result4);

        // Test case 5
        List<Object> result5 = ReverseDelete.reverseDelete("a", "a");
        assertEquals(Arrays.asList("", true), result5);

        // Test case 6
        List<Object> result6 = ReverseDelete.reverseDelete("abcdedcba", "");
        assertEquals(Arrays.asList("abcdedcba", true), result6);

        // Test case 7
        List<Object> result7 = ReverseDelete.reverseDelete("abcdedcba", "v");
        assertEquals(Arrays.asList("abcdedcba", true), result7);

        // Test case 8
        List<Object> result8 = ReverseDelete.reverseDelete("vabba", "v");
        assertEquals(Arrays.asList("abba", true), result8);

        // Test case 9
        List<Object> result9 = ReverseDelete.reverseDelete("mamma", "mia");
        assertEquals(Arrays.asList("", true), result9);
    }
}