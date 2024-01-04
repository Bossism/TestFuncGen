package original;
import java.util.ArrayList;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.List;

public class SeparateParenGroups_110_1Test {

    @Test(timeout = 8000)
    public void testSeparateParenGroups() {
        List<String> result = SeparateParenGroups.separateParenGroups("((()))");
        assertEquals(1, result.size());
        assertEquals("((()))", result.get(0));

        result = SeparateParenGroups.separateParenGroups("()()()");
        assertEquals(3, result.size());
        assertEquals("()", result.get(0));
        assertEquals("()", result.get(1));
        assertEquals("()", result.get(2));

        result = SeparateParenGroups.separateParenGroups("((())())");
        assertEquals(2, result.size());
        assertEquals("((())", result.get(0));
        assertEquals("())", result.get(1));

        result = SeparateParenGroups.separateParenGroups("()(()())");
        assertEquals(2, result.size());
        assertEquals("()", result.get(0));
        assertEquals("(()())", result.get(1));

        result = SeparateParenGroups.separateParenGroups("()()(()())");
        assertEquals(3, result.size()); // Fix: Expected size should be 3, not 4
        assertEquals("()", result.get(0));
        assertEquals("()", result.get(1));
        assertEquals("(()())", result.get(2));
    }
}