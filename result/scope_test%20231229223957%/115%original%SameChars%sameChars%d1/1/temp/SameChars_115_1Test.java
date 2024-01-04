package original;
import org.junit.Test;
import static org.junit.Assert.*;

public class SameChars_115_1Test {

    @Test(timeout = 8000)
    public void testSameChars() {
        // Test case 1
        assertFalse(SameChars.sameChars("abcd", "dddddddabce"));

        // Test case 2
        assertTrue(SameChars.sameChars("eabcdzzzz", "dddzzzzzzzddeddabc"));

        // Test case 3
        assertTrue(SameChars.sameChars("abcd", "dddddddabc"));

        // Test case 4
        assertTrue(SameChars.sameChars("dddddddabc", "abcd"));

        // Test case 5
        assertFalse(SameChars.sameChars("eabcd", "dddddddabc"));

        // Test case 6
        assertFalse(SameChars.sameChars("abcd", "dddddddabcf"));

        // Test case 7
        assertFalse(SameChars.sameChars("eabcdzzzz", "dddzzzzzzzddddabc"));

        // Test case 8
        assertFalse(SameChars.sameChars("aabb", "aaccc"));
    }
}