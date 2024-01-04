package original;

import org.junit.Test;
import static org.junit.Assert.*;

public class VowelsCount_167_1Test {

    @Test(timeout = 8000)
    public void testVowelsCount() {
        // Test cases from the given examples
        assertEquals(2, VowelsCount.vowelsCount("abcde"));
        assertEquals(3, VowelsCount.vowelsCount("Alone"));
        assertEquals(2, VowelsCount.vowelsCount("key"));
        assertEquals(1, VowelsCount.vowelsCount("bye"));
        assertEquals(2, VowelsCount.vowelsCount("keY"));
        assertEquals(1, VowelsCount.vowelsCount("bYe"));
        assertEquals(3, VowelsCount.vowelsCount("ACEDY"));

        // Additional test cases
        assertEquals(0, VowelsCount.vowelsCount(""));
        assertEquals(0, VowelsCount.vowelsCount("bcd"));
        assertEquals(0, VowelsCount.vowelsCount("y"));
        assertEquals(0, VowelsCount.vowelsCount("Y"));
        assertEquals(0, VowelsCount.vowelsCount("xyz"));
        assertEquals(1, VowelsCount.vowelsCount("xyzY"));
        assertEquals(2, VowelsCount.vowelsCount("xyzYY"));
        assertEquals(1, VowelsCount.vowelsCount("xyzYYy"));
    }
}