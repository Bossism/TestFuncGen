package original;
import org.junit.Test;
import static org.junit.Assert.*;

public class CorrectBracketing1_2_1Test {

    @Test(timeout = 8000)
    public void testCorrectBracketing() {
        // Test cases with correct bracketing
        assertTrue(CorrectBracketing1.correctBracketing("()"));
        assertTrue(CorrectBracketing1.correctBracketing("(()())"));
        assertTrue(CorrectBracketing1.correctBracketing("()()(()())()"));
        assertTrue(CorrectBracketing1.correctBracketing("()()((()()())())(()()(()))"));

        // Test cases with incorrect bracketing
        assertFalse(CorrectBracketing1.correctBracketing("((()())))"));
        assertFalse(CorrectBracketing1.correctBracketing(")(()"));
        assertFalse(CorrectBracketing1.correctBracketing("("));
        assertFalse(CorrectBracketing1.correctBracketing("(((("));
        assertFalse(CorrectBracketing1.correctBracketing(")"));
        assertFalse(CorrectBracketing1.correctBracketing("(()"));
        assertFalse(CorrectBracketing1.correctBracketing("()()(()())())(()"));
        assertFalse(CorrectBracketing1.correctBracketing("()()(()())()))()"));
    }
}