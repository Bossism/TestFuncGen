package original;

import org.junit.Test;
import static org.junit.Assert.*;

public class VowelsCount_167_1Test {

    @Test(timeout = 8000)
    public void testVowelsCount() {
        // Test case 1: Empty string
        assertEquals(0, VowelsCount.vowelsCount(""));

        // Test case 2: String with no vowels
        assertEquals(0, VowelsCount.vowelsCount("xyz"));

        // Test case 3: String with only lowercase vowels
        assertEquals(5, VowelsCount.vowelsCount("aeiou"));

        // Test case 4: String with only uppercase vowels
        assertEquals(5, VowelsCount.vowelsCount("AEIOU"));

        // Test case 5: String with mixed case vowels
        assertEquals(5, VowelsCount.vowelsCount("aEiOu"));

        // Test case 6: String with 'y' at the end
        assertEquals(1, VowelsCount.vowelsCount("y"));

        // Test case 7: String with 'Y' at the end
        assertEquals(1, VowelsCount.vowelsCount("Y"));

        // Test case 8: String with 'y' at the end and vowels in the middle
        assertEquals(6, VowelsCount.vowelsCount("abcdey"));

        // Test case 9: String with 'Y' at the end and vowels in the middle
        assertEquals(6, VowelsCount.vowelsCount("abcdeY"));
    }
}