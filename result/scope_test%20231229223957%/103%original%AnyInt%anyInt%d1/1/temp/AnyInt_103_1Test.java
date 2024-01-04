package original;
import org.junit.Test;
import static org.junit.Assert.*;

public class AnyInt_103_1Test {

    @Test(timeout = 8000)
    public void testAnyInt() {
        // Test case 1: all numbers are integers and one number is equal to the sum of the other two
        assertTrue(AnyInt.anyInt(5, 2, 7));

        // Test case 2: all numbers are integers but no number is equal to the sum of the other two
        assertFalse(AnyInt.anyInt(3, 2, 2));

        // Test case 3: all numbers are integers and one number is equal to the sum of the other two
        assertTrue(AnyInt.anyInt(3, -2, 1));

        // Test case 4: one number is not an integer
        assertFalse(AnyInt.anyInt(3.6, -2.2, 2));

        // Test case 5: all numbers are integers and one number is equal to the sum of the other two
        assertTrue(AnyInt.anyInt(2, 3, 1));

        // Test case 6: one number is not an integer
        assertFalse(AnyInt.anyInt(2.5, 2, 3));

        // Test case 7: one number is not an integer
        assertFalse(AnyInt.anyInt(1.5, 5, 3.5));

        // Test case 8: all numbers are integers but no number is equal to the sum of the other two
        assertFalse(AnyInt.anyInt(2, 6, 2));

        // Test case 9: all numbers are integers and one number is equal to the sum of the other two
        assertTrue(AnyInt.anyInt(4, 2, 2));

        // Test case 10: all numbers are not integers
        assertFalse(AnyInt.anyInt(2.2, 2.2, 2.2));

        // Test case 11: all numbers are integers and one number is equal to the sum of the other two
        assertTrue(AnyInt.anyInt(-4, 6, 2));

        // Test case 12: all numbers are integers and one number is equal to the sum of the other two
        assertTrue(AnyInt.anyInt(2, 1, 1));

        // Test case 13: all numbers are integers and one number is equal to the sum of the other two
        assertTrue(AnyInt.anyInt(3, 4, 7));

        // Test case 14: one number is not an integer
        assertFalse(AnyInt.anyInt(3.0, 4, 7));
    }
}