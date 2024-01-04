package original;
import org.junit.Test;
import static org.junit.Assert.*;

public class RemoveVowels_46_1Test {

    @Test(timeout = 8000)
    public void testRemoveVowels() {
        // Test case 1: text with vowels
        String result1 = RemoveVowels.removeVowels("abcdef");
        assertEquals("bcdf", result1);

        // Test case 2: text with only vowels
        String result2 = RemoveVowels.removeVowels("aaaaa");
        assertEquals("", result2);

        // Test case 3: text with mixed case vowels
        String result3 = RemoveVowels.removeVowels("aaBAA");
        assertEquals("B", result3);

        // Test case 4: text without vowels
        String result4 = RemoveVowels.removeVowels("zbcd");
        assertEquals("zbcd", result4);

        // Test case 5: empty text
        String result5 = RemoveVowels.removeVowels("");
        assertEquals("", result5);

        // Test case 6: text with vowels and new line character
        String result6 = RemoveVowels.removeVowels("abcdef\nghijklm");
        assertEquals("bcdf\nghjklm", result6);

        // Test case 7: text with vowels in reverse order
        String result7 = RemoveVowels.removeVowels("fedcba");
        assertEquals("fdcb", result7);

        // Test case 8: text with only vowels
        String result8 = RemoveVowels.removeVowels("eeeee");
        assertEquals("", result8);

        // Test case 9: text with mixed case vowels
        String result9 = RemoveVowels.removeVowels("acBAA");
        assertEquals("cB", result9);

        // Test case 10: text with mixed case vowels
        String result10 = RemoveVowels.removeVowels("EcBOO");
        assertEquals("cB", result10);

        // Test case 11: text without vowels
        String result11 = RemoveVowels.removeVowels("ybcd");
        assertEquals("ybcd", result11);
    }
}