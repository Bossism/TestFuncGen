package original;
import org.junit.Test;
import static org.junit.Assert.*;

public class IsPalindrome_99_1Test {

    @Test(timeout = 8000)
    public void testIsPalindrome_emptyString() {
        assertTrue(IsPalindrome.isPalindrome(""));
    }

    @Test(timeout = 8000)
    public void testIsPalindrome_singleCharacter() {
        assertTrue(IsPalindrome.isPalindrome("a"));
    }

    @Test(timeout = 8000)
    public void testIsPalindrome_palindromeString() {
        assertTrue(IsPalindrome.isPalindrome("aba"));
    }

    @Test(timeout = 8000)
    public void testIsPalindrome_nonPalindromeString() {
        assertFalse(IsPalindrome.isPalindrome("zbcd"));
    }

    @Test(timeout = 8000)
    public void testIsPalindrome_evenLengthPalindromeString() {
        assertTrue(IsPalindrome.isPalindrome("xywyx"));
    }

    @Test(timeout = 8000)
    public void testIsPalindrome_oddLengthPalindromeString() {
        assertTrue(IsPalindrome.isPalindrome("aaaaa"));
    }

    @Test(timeout = 8000)
    public void testIsPalindrome_oddLengthNonPalindromeString() {
        assertFalse(IsPalindrome.isPalindrome("xywyz"));
    }

    @Test(timeout = 8000)
    public void testIsPalindrome_evenLengthNonPalindromeString() {
        assertFalse(IsPalindrome.isPalindrome("xywzx"));
    }
}