package original;
import java.util.ArrayList;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.List;

public class EvenOddPalindrome_90_1Test {

    @Test(timeout = 8000)
    public void testEvenOddPalindrome() {
        List<Integer> result = EvenOddPalindrome.evenOddPalindrome(10);
        assertEquals(4, (int) result.get(0));
        assertEquals(5, (int) result.get(1));
    }

    @Test(timeout = 8000)
    public void testEvenOddPalindromeWithZero() {
        List<Integer> result = EvenOddPalindrome.evenOddPalindrome(0);
        assertEquals(1, (int) result.get(0));
        assertEquals(0, (int) result.get(1));
    }

    @Test(timeout = 8000)
    public void testEvenOddPalindromeWithNegativeNumber() {
        List<Integer> result = EvenOddPalindrome.evenOddPalindrome(-10);
        assertEquals(0, (int) result.get(0));
        assertEquals(0, (int) result.get(1));
    }

    @Test(timeout = 8000)
    public void testEvenOddPalindromeWithLargeNumber() {
        List<Integer> result = EvenOddPalindrome.evenOddPalindrome(1000);
        assertEquals(48, (int) result.get(0));
        assertEquals(55, (int) result.get(1));
    }
}