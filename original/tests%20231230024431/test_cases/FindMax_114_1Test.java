package original;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

public class FindMax_114_1Test {

    @Test(timeout = 8000)
    public void testFindMax() {
        // Test case 1
        List<String> words1 = Arrays.asList("name", "of", "string");
        String expected1 = "string";
        String actual1 = FindMax.findMax(words1);
        assertEquals(expected1, actual1);

        // Test case 2
        List<String> words2 = Arrays.asList("name", "enam", "game");
        String expected2 = "enam";
        String actual2 = FindMax.findMax(words2);
        assertEquals(expected2, actual2);

        // Test case 3
        List<String> words3 = Arrays.asList("aaaaaaa", "bb", "cc");
        String expected3 = "aaaaaaa";
        String actual3 = FindMax.findMax(words3);
        assertEquals(expected3, actual3);

        // Test case 4
        List<String> words4 = Arrays.asList("abc", "cba");
        String expected4 = "abc";
        String actual4 = FindMax.findMax(words4);
        assertEquals(expected4, actual4);

        // Test case 5
        List<String> words5 = Arrays.asList("play", "this", "game", "of", "footbott");
        String expected5 = "footbott";
        String actual5 = FindMax.findMax(words5);
        assertEquals(expected5, actual5);

        // Test case 6
        List<String> words6 = Arrays.asList("we", "are", "gonna", "rock");
        String expected6 = "gonna";
        String actual6 = FindMax.findMax(words6);
        assertEquals(expected6, actual6);

        // Test case 7
        List<String> words7 = Arrays.asList("we", "are", "a", "mad", "nation");
        String expected7 = "nation";
        String actual7 = FindMax.findMax(words7);
        assertEquals(expected7, actual7);

        // Test case 8
        List<String> words8 = Arrays.asList("this", "is", "a", "prrk");
        String expected8 = "this";
        String actual8 = FindMax.findMax(words8);
        assertEquals(expected8, actual8);

        // Test case 9
        List<String> words9 = Arrays.asList("b");
        String expected9 = "b";
        String actual9 = FindMax.findMax(words9);
        assertEquals(expected9, actual9);

        // Test case 10
        List<String> words10 = Arrays.asList("play", "play", "play");
        String expected10 = "play";
        String actual10 = FindMax.findMax(words10);
        assertEquals(expected10, actual10);
    }
}