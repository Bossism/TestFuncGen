package original;

import org.junit.Test;
import static org.junit.Assert.*;

public class Encrypt_64_1Test {

    @Test(timeout = 8000)
    public void testEncrypt() {
        // Test case 1: input string with lowercase letters only
        String input1 = "abcxyz";
        String expected1 = "cdezbv";
        String actual1 = Encrypt.encrypt(input1);
        assertEquals(expected1, actual1);

        // Test case 2: input string with uppercase letters only
        String input2 = "ABCXYZ";
        String expected2 = "CDEZBV";
        String actual2 = Encrypt.encrypt(input2);
        assertEquals(expected2, actual2);

        // Test case 3: input string with mixed case letters
        String input3 = "aBcXyZ";
        String expected3 = "cDeZbV";
        String actual3 = Encrypt.encrypt(input3);
        assertEquals(expected3, actual3);

        // Test case 4: input string with non-alphabetic characters
        String input4 = "123!@#";
        String expected4 = "123!@#";
        String actual4 = Encrypt.encrypt(input4);
        assertEquals(expected4, actual4);
    }
}