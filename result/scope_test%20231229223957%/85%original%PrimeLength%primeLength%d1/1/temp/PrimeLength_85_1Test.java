package original;
import org.junit.Test;
import static org.junit.Assert.*;

public class PrimeLength_85_1Test {

    @Test(timeout = 8000)
    public void testPrimeLength() {
        // Test cases from the examples
        assertTrue(PrimeLength.primeLength("Hello"));
        assertTrue(PrimeLength.primeLength("abcdcba"));
        assertTrue(PrimeLength.primeLength("kittens"));
        assertFalse(PrimeLength.primeLength("orange"));

        // Additional test cases
        assertTrue(PrimeLength.primeLength("wow"));
        assertTrue(PrimeLength.primeLength("world"));
        assertTrue(PrimeLength.primeLength("MadaM"));
        assertTrue(PrimeLength.primeLength("Wow"));
        assertFalse(PrimeLength.primeLength(""));
        assertTrue(PrimeLength.primeLength("HI"));
        assertTrue(PrimeLength.primeLength("go"));
        assertFalse(PrimeLength.primeLength("gogo"));
        assertFalse(PrimeLength.primeLength("aaaaaaaaaaaaaaa"));
        assertTrue(PrimeLength.primeLength("Madam"));
        assertFalse(PrimeLength.primeLength("M"));
        assertFalse(PrimeLength.primeLength("0"));
    }
}