package original;

import org.junit.Test;
import static org.junit.Assert.*;

public class IsPalindrome_99_1Test {

    @Test(timeout = 8000)
    public void testIsPalindrome() {
        // Test case 1: Palindrome string
        String palindrome = "madam";
        assertTrue(IsPalindrome.isPalindrome(palindrome));

        // Test case 2: Non-palindrome string
        String nonPalindrome = "hello";
        assertFalse(IsPalindrome.isPalindrome(nonPalindrome));

        // Test case 3: Empty string
        String emptyString = "";
        assertTrue(IsPalindrome.isPalindrome(emptyString));

        // Test case 4: Single character string
        String singleChar = "a";
        assertTrue(IsPalindrome.isPalindrome(singleChar));

        // Test case 5: String with spaces
        String stringWithSpaces = "race car";
        assertTrue(IsPalindrome.isPalindrome(stringWithSpaces));

        // Test case 6: String with special characters
        String specialChars = "A man, a plan, a canal: Panama!";
        assertTrue(IsPalindrome.isPalindrome(specialChars.toLowerCase()));
    }
}