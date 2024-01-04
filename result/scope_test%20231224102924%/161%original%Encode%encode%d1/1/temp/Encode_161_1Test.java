package original;

import org.junit.Test;
import static org.junit.Assert.*;

public class Encode_161_1Test {

    @Test(timeout = 8000)
    public void testEncode() {
        // Test with lowercase letters
        String result1 = Encode.encode("hello");
        assertEquals("HELLO", result1);

        // Test with uppercase letters
        String result2 = Encode.encode("WORLD");
        assertEquals("world", result2);

        // Test with mixed case letters
        String result3 = Encode.encode("HeLLo");
        assertEquals("hEllO", result3);

        // Test with vowels
        String result4 = Encode.encode("aeiou");
        assertEquals("cgkqw", result4);

        // Test with vowels and uppercase letters
        String result5 = Encode.encode("AEIOU");
        assertEquals("CGKQW", result5);

        // Test with empty string
        String result6 = Encode.encode("");
        assertEquals("", result6);
    }
}