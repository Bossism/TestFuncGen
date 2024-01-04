package original;
import org.junit.Test;
import static org.junit.Assert.*;

public class CycpatternCheck_102_1Test {

    @Test(timeout = 8000)
    public void testCycpatternCheck() {
        // Test cases from the given examples
        assertFalse(CycpatternCheck.cycpatternCheck("abcd", "abd"));
        assertTrue(CycpatternCheck.cycpatternCheck("hello", "ell"));
        assertFalse(CycpatternCheck.cycpatternCheck("whassup", "psus"));
        assertTrue(CycpatternCheck.cycpatternCheck("abab", "baa"));
        assertFalse(CycpatternCheck.cycpatternCheck("efef", "eeff"));
        assertTrue(CycpatternCheck.cycpatternCheck("himenss", "simen"));

        // Additional test cases
        assertFalse(CycpatternCheck.cycpatternCheck("xyzw", "xyw"));
        assertTrue(CycpatternCheck.cycpatternCheck("yello", "ell"));
        assertFalse(CycpatternCheck.cycpatternCheck("whattup", "ptut"));
        assertTrue(CycpatternCheck.cycpatternCheck("efef", "fee"));
        assertFalse(CycpatternCheck.cycpatternCheck("abab", "aabb"));
        assertTrue(CycpatternCheck.cycpatternCheck("winemtt", "tinem"));
    }
}