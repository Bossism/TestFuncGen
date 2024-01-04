package original;

import org.junit.Test;
import static org.junit.Assert.*;

public class Simplify_45_1Test {

    @Test(timeout = 8000)
    public void testSimplify() {
        // Test cases from the problem description
        assertTrue(Simplify.simplify("1/5", "5/1"));
        assertFalse(Simplify.simplify("1/6", "2/1"));
        assertFalse(Simplify.simplify("7/10", "10/2"));

        // Additional test cases
        assertFalse(Simplify.simplify("5/1", "3/1"));
        assertTrue(Simplify.simplify("2/10", "50/10"));
        assertTrue(Simplify.simplify("7/2", "4/2"));
        assertTrue(Simplify.simplify("11/6", "6/1"));
        assertFalse(Simplify.simplify("2/3", "5/2"));
        assertFalse(Simplify.simplify("5/2", "3/5"));
        assertTrue(Simplify.simplify("2/4", "8/4"));
        assertTrue(Simplify.simplify("2/4", "4/2"));
        assertTrue(Simplify.simplify("1/5", "5/1"));
        assertFalse(Simplify.simplify("1/5", "1/5"));
    }
}