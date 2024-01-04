package original;
import org.junit.Test;
import static org.junit.Assert.*;

public class HexKey_32_1Test {

    @Test(timeout = 8000)
    public void testHexKey() {
        // Test case 1
        assertEquals(1, HexKey.hexKey("AB"));

        // Test case 2
        assertEquals(2, HexKey.hexKey("1077E"));

        // Test case 3
        assertEquals(4, HexKey.hexKey("ABED1A33"));

        // Test case 4
        assertEquals(6, HexKey.hexKey("123456789ABCDEF0"));

        // Test case 5
        assertEquals(2, HexKey.hexKey("2020"));

        // Test case 6
        assertEquals(12, HexKey.hexKey("112233445566778899AABBCCDDEEFF00"));

        // Test case 7
        assertEquals(0, HexKey.hexKey(""));
    }
}