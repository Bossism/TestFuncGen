package original;

import org.junit.Test;
import static org.junit.Assert.*;

public class HexKey_32_1Test {

    @Test(timeout = 8000)
    public void testHexKey() {
        // Test case 1: hex contains no special characters
        Object num1 = 1234567890;
        int expected1 = 0;
        int result1 = HexKey.hexKey(num1);
        assertEquals(expected1, result1);

        // Test case 2: hex contains only special characters
        Object num2 = "BDBDBDBD";
        int expected2 = 8;
        int result2 = HexKey.hexKey(num2);
        assertEquals(expected2, result2);

        // Test case 3: hex contains a mix of special and non-special characters
        Object num3 = "123B567D9";
        int expected3 = 6;
        int result3 = HexKey.hexKey(num3);
        assertEquals(expected3, result3);
    }
}