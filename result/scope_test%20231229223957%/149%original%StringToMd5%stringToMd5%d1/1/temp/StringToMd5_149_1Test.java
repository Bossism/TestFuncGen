package original;
import org.junit.Test;
import static org.junit.Assert.*;

public class StringToMd5_149_1Test {

    @Test(timeout = 8000)
    public void testStringToMd5() {
        // Test case 1: Non-empty string
        String input1 = "Hello world";
        String expectedOutput1 = "3e25960a79dbc69b674cd4ec67a72c62";
        assertEquals(expectedOutput1, StringToMd5.stringToMd5(input1));

        // Test case 2: Empty string
        String input2 = "";
        assertNull(StringToMd5.stringToMd5(input2));

        // Test case 3: String with spaces
        String input3 = "A B C";
        String expectedOutput3 = "0ef78513b0cb8cef12743f5aeb35f888";
        assertEquals(expectedOutput3, StringToMd5.stringToMd5(input3));

        // Test case 4: String with lowercase letters
        String input4 = "password";
        String expectedOutput4 = "5f4dcc3b5aa765d61d8327deb882cf99";
        assertEquals(expectedOutput4, StringToMd5.stringToMd5(input4));
    }
}