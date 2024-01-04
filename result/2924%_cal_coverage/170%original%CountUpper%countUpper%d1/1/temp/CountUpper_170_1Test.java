package original;

import org.junit.Test;
import static org.junit.Assert.*;

public class CountUpper_170_1Test {

    @Test(timeout = 8000)
    public void testCountUpper() {
        // Test case 1: Empty string
        assertEquals(0, CountUpper.countUpper(""));

        // Test case 2: No uppercase vowels
        assertEquals(0, CountUpper.countUpper("hello"));

        // Test case 3: Uppercase vowels at even indices
        assertEquals(2, CountUpper.countUpper("aBcDeF"));

        // Test case 4: Uppercase vowels at odd indices
        assertEquals(1, CountUpper.countUpper("AbCdEf"));

        // Test case 5: Uppercase vowels at both even and odd indices
        assertEquals(3, CountUpper.countUpper("aBcDeFAbCdEf"));
    }
}