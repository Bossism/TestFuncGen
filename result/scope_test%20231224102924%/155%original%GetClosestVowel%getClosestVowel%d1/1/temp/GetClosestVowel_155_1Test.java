package original;

import org.junit.Test;
import static org.junit.Assert.*;

public class GetClosestVowel_155_1Test {

    @Test(timeout = 8000)
    public void testGetClosestVowel() {
        // Test case 1: word contains a vowel surrounded by consonants
        String word1 = "hello";
        String expected1 = "e";
        String actual1 = GetClosestVowel.getClosestVowel(word1);
        assertEquals(expected1, actual1);

        // Test case 2: word contains a vowel at the beginning
        String word2 = "apple";
        String expected2 = "a";
        String actual2 = GetClosestVowel.getClosestVowel(word2);
        assertEquals(expected2, actual2);

        // Test case 3: word contains a vowel at the end
        String word3 = "banana";
        String expected3 = "a";
        String actual3 = GetClosestVowel.getClosestVowel(word3);
        assertEquals(expected3, actual3);

        // Test case 4: word contains no vowels
        String word4 = "xyz";
        String expected4 = "";
        String actual4 = GetClosestVowel.getClosestVowel(word4);
        assertEquals(expected4, actual4);

        // Test case 5: word contains only vowels
        String word5 = "aeiou";
        String expected5 = "a";
        String actual5 = GetClosestVowel.getClosestVowel(word5);
        assertEquals(expected5, actual5);
    }
}