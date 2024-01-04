package original;
import org.junit.Test;
import static org.junit.Assert.*;

public class IsEqualToSumEven_58_1Test {

    @Test(timeout = 8000)
    public void testIsEqualToSumEven() {
        // Test case 1: n is less than 8
        assertFalse(IsEqualToSumEven.isEqualToSumEven(7));

        // Test case 2: n is even and greater than or equal to 8
        assertTrue(IsEqualToSumEven.isEqualToSumEven(8));

        // Test case 3: n is odd and greater than or equal to 8
        assertFalse(IsEqualToSumEven.isEqualToSumEven(9));
    }
}