package original;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import static org.junit.Assert.*;

public class EvenOddPalindrome_91_1Test {

    @Test(timeout = 8000)
    public void testIsPalindrome() {
        assertTrue(EvenOddPalindrome.isPalindrome(121));
        assertTrue(EvenOddPalindrome.isPalindrome(12321));
        assertTrue(EvenOddPalindrome.isPalindrome(1234321));
        assertFalse(EvenOddPalindrome.isPalindrome(12345));
        assertFalse(EvenOddPalindrome.isPalindrome(123456));
    }
}