package original;
import org.junit.Test;
import static org.junit.Assert.*;

public class MakePalindrome_95_1Test {

    @Test(timeout = 8000)
    public void testMakePalindrome_emptyString() {
        String result = MakePalindrome.makePalindrome("");
        assertEquals("", result);
    }

    @Test(timeout = 8000)
    public void testMakePalindrome_singleCharacter() {
        String result = MakePalindrome.makePalindrome("x");
        assertEquals("x", result);
    }

    @Test(timeout = 8000)
    public void testMakePalindrome_palindromeSuffix() {
        String result = MakePalindrome.makePalindrome("cat");
        assertEquals("catac", result);
    }

    @Test(timeout = 8000)
    public void testMakePalindrome_nonPalindromeSuffix() {
        String result = MakePalindrome.makePalindrome("cata");
        assertEquals("catac", result);
    }

    @Test(timeout = 8000)
    public void testMakePalindrome_longestPalindromeSuffix() {
        String result = MakePalindrome.makePalindrome("xyz");
        assertEquals("xyzyx", result);
    }

    @Test(timeout = 8000)
    public void testMakePalindrome_noPalindromeSuffix() {
        String result = MakePalindrome.makePalindrome("jerry");
        assertEquals("jerryrrej", result);
    }
}