package original;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.List;

public class EvenOddPalindrome_90_1Test {

    @Test(timeout = 8000)
    public void testEvenOddPalindrome() {
        List<Integer> result = EvenOddPalindrome.evenOddPalindrome(3);
        assertEquals(1, (int) result.get(0));
        assertEquals(2, (int) result.get(1));

        result = EvenOddPalindrome.evenOddPalindrome(12);
        assertEquals(4, (int) result.get(0));
        assertEquals(6, (int) result.get(1));

        result = EvenOddPalindrome.evenOddPalindrome(123);
        assertEquals(8, (int) result.get(0));
        assertEquals(13, (int) result.get(1));

        result = EvenOddPalindrome.evenOddPalindrome(63);
        assertEquals(6, (int) result.get(0));
        assertEquals(8, (int) result.get(1));

        result = EvenOddPalindrome.evenOddPalindrome(25);
        assertEquals(5, (int) result.get(0));
        assertEquals(6, (int) result.get(1));

        result = EvenOddPalindrome.evenOddPalindrome(19);
        assertEquals(4, (int) result.get(0));
        assertEquals(6, (int) result.get(1));

        result = EvenOddPalindrome.evenOddPalindrome(9);
        assertEquals(4, (int) result.get(0));
        assertEquals(5, (int) result.get(1));

        result = EvenOddPalindrome.evenOddPalindrome(1);
        assertEquals(0, (int) result.get(0));
        assertEquals(1, (int) result.get(1));
    }
}