package original;
import org.junit.Test;
import static org.junit.Assert.*;

public class IsSimplePower_60_1Test {

    @Test(timeout = 8000)
    public void testIsSimplePower() {
        // Test cases from the provided examples
        assertTrue(IsSimplePower.isSimplePower(1, 4));
        assertTrue(IsSimplePower.isSimplePower(2, 2));
        assertTrue(IsSimplePower.isSimplePower(8, 2));
        assertFalse(IsSimplePower.isSimplePower(3, 2));
        assertFalse(IsSimplePower.isSimplePower(3, 1));
        assertFalse(IsSimplePower.isSimplePower(5, 3));

        // Additional test cases
        assertTrue(IsSimplePower.isSimplePower(16, 2));
        assertFalse(IsSimplePower.isSimplePower(143214, 16));
        assertTrue(IsSimplePower.isSimplePower(4, 2));
        assertTrue(IsSimplePower.isSimplePower(9, 3));
        assertTrue(IsSimplePower.isSimplePower(16, 4));
        assertFalse(IsSimplePower.isSimplePower(24, 2));
        assertFalse(IsSimplePower.isSimplePower(128, 4));
        assertFalse(IsSimplePower.isSimplePower(12, 6));
        assertTrue(IsSimplePower.isSimplePower(1, 1));
        assertTrue(IsSimplePower.isSimplePower(1, 12));
    }
}