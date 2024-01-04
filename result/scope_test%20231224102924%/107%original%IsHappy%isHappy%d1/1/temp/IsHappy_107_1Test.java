package original;
import org.junit.Test;
import static org.junit.Assert.*;

public class IsHappy_107_1Test {

    @Test(timeout = 8000)
    public void testIsHappy() {
        // Test case 1: s.length() < 3
        assertFalse(IsHappy.isHappy("ab"));
        
        // Test case 2: s.charAt(i) == s.charAt(i + 1)
        assertFalse(IsHappy.isHappy("aba"));
        
        // Test case 3: s.charAt(i) == s.charAt(i + 2)
        assertFalse(IsHappy.isHappy("abcba"));
        
        // Test case 4: s.charAt(i + 1) == s.charAt(i + 2)
        assertFalse(IsHappy.isHappy("abccb"));
        
        // Test case 5: All characters are distinct
        assertTrue(IsHappy.isHappy("abcd"));
        
        // Test case 6: All characters are distinct, but s.length() < 3
        assertFalse(IsHappy.isHappy("ab"));
    }
}