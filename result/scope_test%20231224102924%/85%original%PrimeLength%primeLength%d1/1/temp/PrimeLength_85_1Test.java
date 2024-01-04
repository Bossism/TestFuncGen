package original;
import org.junit.Test;
import static org.junit.Assert.*;

public class PrimeLength_85_1Test {

    @Test(timeout = 8000)
    public void testPrimeLength() {
        // Test case 1: Empty string
        assertFalse(PrimeLength.primeLength(""));

        // Test case 2: String with length 1
        assertFalse(PrimeLength.primeLength("a"));

        // Test case 3: String with length 2
        assertTrue(PrimeLength.primeLength("ab"));

        // Test case 4: String with length 3
        assertTrue(PrimeLength.primeLength("abc"));

        // Test case 5: String with length 4
        assertFalse(PrimeLength.primeLength("abcd"));

        // Test case 6: String with length 5
        assertTrue(PrimeLength.primeLength("abcde"));

        // Test case 7: String with length 6
        assertFalse(PrimeLength.primeLength("abcdef"));

        // Test case 8: String with length 7
        assertTrue(PrimeLength.primeLength("abcdefg"));
    }
}