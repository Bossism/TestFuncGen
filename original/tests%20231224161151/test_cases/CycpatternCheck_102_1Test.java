package original;

import org.junit.Test;
import static org.junit.Assert.*;

public class CycpatternCheck_102_1Test {

    @Test(timeout = 8000)
    public void testCycpatternCheck() {
        // Test case 1: a and b are empty strings
        assertFalse(CycpatternCheck.cycpatternCheck("", ""));

        // Test case 2: a is empty and b is not empty
        assertFalse(CycpatternCheck.cycpatternCheck("", "abc"));

        // Test case 3: a is not empty and b is empty
        assertFalse(CycpatternCheck.cycpatternCheck("abc", ""));

        // Test case 4: a and b are equal non-empty strings
        assertTrue(CycpatternCheck.cycpatternCheck("abc", "abc"));

        // Test case 5: a contains b as a cyclic pattern
        assertTrue(CycpatternCheck.cycpatternCheck("abcabcabc", "abc"));

        // Test case 6: a does not contain b as a cyclic pattern
        assertFalse(CycpatternCheck.cycpatternCheck("abcabcabc", "def"));
    }
}