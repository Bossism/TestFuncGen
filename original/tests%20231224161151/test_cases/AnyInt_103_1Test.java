package original;
import org.junit.Test;
import static org.junit.Assert.*;

public class AnyInt_103_1Test {

    @Test(timeout = 8000)
    public void testAnyInt() {
        // Test case 1: All numbers are integers and satisfy the condition
        assertTrue(AnyInt.anyInt(2, 1, 1));

        // Test case 2: All numbers are integers but do not satisfy the condition
        assertFalse(AnyInt.anyInt(2, 1, 2));

        // Test case 3: At least one number is not an integer
        assertFalse(AnyInt.anyInt(2, 1.5, 1));

        // Test case 4: All numbers are integers but none of them satisfy the condition
        assertFalse(AnyInt.anyInt(2, 3, 4));
    }
}