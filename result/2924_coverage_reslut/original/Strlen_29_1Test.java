package original;
import org.junit.Test;
import static org.junit.Assert.*;

public class Strlen_29_1Test {

    @Test(timeout = 8000)
    public void testStrlen() {
        // Test case 1: Empty string
        String str1 = "";
        int result1 = Strlen.strlen(str1);
        assertEquals(0, result1);

        // Test case 2: String with one character
        String str2 = "a";
        int result2 = Strlen.strlen(str2);
        assertEquals(1, result2);

        // Test case 3: String with multiple characters
        String str3 = "Hello, World!";
        int result3 = Strlen.strlen(str3);
        assertEquals(13, result3);
    }
}