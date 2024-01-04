package original;

import org.junit.Test;
import static org.junit.Assert.*;

public class RemoveVowels_46_1Test {

    @Test(timeout = 8000)
    public void testRemoveVowels() {
        // Test case 1: input with vowels
        String input1 = "Hello World";
        String expected1 = "Hll Wrld";
        String actual1 = RemoveVowels.removeVowels(input1);
        assertEquals(expected1, actual1);

        // Test case 2: input without vowels
        String input2 = "BCDFGHJKLMNPQRSTVWXYZ";
        String expected2 = "BCDFGHJKLMNPQRSTVWXYZ";
        String actual2 = RemoveVowels.removeVowels(input2);
        assertEquals(expected2, actual2);

        // Test case 3: input with mixed case vowels
        String input3 = "aAbEeIiOoUu";
        String expected3 = "b";
        String actual3 = RemoveVowels.removeVowels(input3);
        assertEquals(expected3, actual3);

        // Test case 4: input with special characters
        String input4 = "!@#$%^&*()_+-={}[]:\";'<>?,./";
        String expected4 = "!@#$%^&*()_+-={}[]:\";'<>?,./";
        String actual4 = RemoveVowels.removeVowels(input4);
        assertEquals(expected4, actual4);
    }
}