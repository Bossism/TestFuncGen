package original;
import org.junit.Test;
import static org.junit.Assert.*;

public class Digitsum_31_1Test {

    @Test(timeout = 8000)
    public void testDigitSum() {
        // Test case 1: Empty string
        String s1 = "";
        int expected1 = 0;
        int result1 = Digitsum.digitSum(s1);
        assertEquals(expected1, result1);

        // Test case 2: String with no uppercase letters
        String s2 = "abc123";
        int expected2 = 0;
        int result2 = Digitsum.digitSum(s2);
        assertEquals(expected2, result2);

        // Test case 3: String with uppercase letters
        String s3 = "AbC";
        int expected3 = 'A' + 'C'; // ASCII values of 'A' and 'C'
        int result3 = Digitsum.digitSum(s3);
        assertEquals(expected3, result3);

        // Test case 4: String with only uppercase letters
        String s4 = "XYZ";
        int expected4 = 'X' + 'Y' + 'Z'; // ASCII values of 'X', 'Y', and 'Z'
        int result4 = Digitsum.digitSum(s4);
        assertEquals(expected4, result4);
    }
}