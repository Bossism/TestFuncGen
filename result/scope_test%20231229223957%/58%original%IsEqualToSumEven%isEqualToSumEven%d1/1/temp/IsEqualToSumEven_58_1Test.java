package original;
import org.junit.Test;
import static org.junit.Assert.*;

public class IsEqualToSumEven_58_1Test {

    @Test(timeout = 8000)
    public void testIsEqualToSumEven() {
        // Test cases
        assertFalse(IsEqualToSumEven.isEqualToSumEven(4));
        assertFalse(IsEqualToSumEven.isEqualToSumEven(6));
        assertTrue(IsEqualToSumEven.isEqualToSumEven(8));
        assertTrue(IsEqualToSumEven.isEqualToSumEven(10));
        assertFalse(IsEqualToSumEven.isEqualToSumEven(11));
        assertTrue(IsEqualToSumEven.isEqualToSumEven(12));
        assertFalse(IsEqualToSumEven.isEqualToSumEven(13));
        assertTrue(IsEqualToSumEven.isEqualToSumEven(16));
    }

    @Test(timeout = 8000)
    public void testIsEqualToSumEvenWithNegativeNumber() {
        assertFalse(IsEqualToSumEven.isEqualToSumEven(-4));
    }

    @Test(timeout = 8000)
    public void testIsEqualToSumEvenWithZero() {
        assertFalse(IsEqualToSumEven.isEqualToSumEven(0));
    }

    @Test(timeout = 8000)
    public void testIsEqualToSumEvenWithPositiveOddNumber() {
        assertFalse(IsEqualToSumEven.isEqualToSumEven(7));
        assertFalse(IsEqualToSumEven.isEqualToSumEven(9));
        assertFalse(IsEqualToSumEven.isEqualToSumEven(15));
    }
}