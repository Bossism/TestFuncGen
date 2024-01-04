package original;
import org.junit.Test;
import static org.junit.Assert.*;

public class IsNested_42_1Test {

    @Test(timeout = 8000)
    public void testIsNested() {
        // Test case 1: No nested brackets
        String string1 = "abc";
        assertFalse(IsNested.isNested(string1));

        // Test case 2: Single pair of nested brackets
        String string2 = "a[b]c";
        assertFalse(IsNested.isNested(string2));

        // Test case 3: Two pairs of nested brackets
        String string3 = "a[b]c[d]e";
        assertTrue(IsNested.isNested(string3));

        // Test case 4: Multiple pairs of nested brackets
        String string4 = "a[b]c[d]e[f]g";
        assertTrue(IsNested.isNested(string4));

        // Test case 5: Nested brackets with non-bracket characters in between
        String string5 = "a[b]c[d]e[f]g[h]i";
        assertTrue(IsNested.isNested(string5));

        // Test case 6: Nested brackets with non-bracket characters before and after
        String string6 = "a[b]c[d]e[f]g[h]i[j]k";
        assertTrue(IsNested.isNested(string6));
    }
}