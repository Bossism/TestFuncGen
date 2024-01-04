package original;
import java.util.ArrayList;
import java.util.Collections;

import org.junit.Test;
import static org.junit.Assert.*;

public class IsNested_42_1Test {

    @Test(timeout = 8000)
    public void testIsNestedWithValidNestedSubsequence() {
        assertTrue(IsNested.isNested("[[]]"));
        assertTrue(IsNested.isNested("[[[][]]]"));
        assertTrue(IsNested.isNested("[[[]]]"));
        assertTrue(IsNested.isNested("[[[][]]]"));
    }

    @Test(timeout = 8000)
    public void testIsNestedWithInvalidNestedSubsequence() {
        assertFalse(IsNested.isNested("[]]]]]]][[[[[]"));
        assertFalse(IsNested.isNested("[][]"));
        assertFalse(IsNested.isNested("[]"));
        assertFalse(IsNested.isNested("[[][]]"));
        assertFalse(IsNested.isNested("[[]][["));
    }

    @Test(timeout = 8000)
    public void testIsNestedWithEmptyString() {
        assertFalse(IsNested.isNested(""));
    }
}