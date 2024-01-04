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
        String result = MakePalindrome.makePalindrome("a");
        assertEquals("a", result);
    }

    @Test(timeout = 8000)
    public void testMakePalindrome_evenLengthString() {
        String result = MakePalindrome.makePalindrome("abcd");
        assertEquals("abcddcba", result);
    }

    @Test(timeout = 8000)
    public void testMakePalindrome_oddLengthString() {
        String result = MakePalindrome.makePalindrome("abcde");
        assertEquals("abcdeedcba", result);
    }

    @Test(timeout = 8000)
    public void testMakePalindrome_noPalindrome() {
        String result = MakePalindrome.makePalindrome("abcdef");
        assertNull(result);
    }
}