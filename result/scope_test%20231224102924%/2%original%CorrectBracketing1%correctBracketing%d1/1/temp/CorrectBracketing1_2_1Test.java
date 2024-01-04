package original;
import org.junit.Test;
import static org.junit.Assert.*;

public class CorrectBracketing1_2_1Test {

    @Test(timeout = 8000)
    public void testCorrectBracketing() {
        // Test case 1: Valid bracketing
        assertTrue(CorrectBracketing1.correctBracketing("()"));
        
        // Test case 2: Valid bracketing with nested brackets
        assertTrue(CorrectBracketing1.correctBracketing("((()))"));
        
        // Test case 3: Invalid bracketing with extra closing bracket
        assertFalse(CorrectBracketing1.correctBracketing("())"));
        
        // Test case 4: Invalid bracketing with extra opening bracket
        assertFalse(CorrectBracketing1.correctBracketing("(()"));
        
        // Test case 5: Invalid bracketing with mismatched brackets
        assertFalse(CorrectBracketing1.correctBracketing(")("));
    }
}