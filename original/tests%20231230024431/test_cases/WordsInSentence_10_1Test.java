package original;
import org.junit.Test;
import static org.junit.Assert.*;

public class WordsInSentence_10_1Test {

    @Test(timeout = 8000)
    public void testWordsInSentence() {
        // Test case 1
        String sentence1 = "This is a test";
        String expected1 = "is";
        String result1 = WordsInSentence.wordsInSentence(sentence1);
        assertEquals(expected1, result1);

        // Test case 2
        String sentence2 = "lets go for swimming";
        String expected2 = "go for";
        String result2 = WordsInSentence.wordsInSentence(sentence2);
        assertEquals(expected2, result2);

        // Test case 3
        String sentence3 = "there is no place available here";
        String expected3 = "there is no place";
        String result3 = WordsInSentence.wordsInSentence(sentence3);
        assertEquals(expected3, result3);

        // Test case 4
        String sentence4 = "Hi I am Hussein";
        String expected4 = "Hi am Hussein";
        String result4 = WordsInSentence.wordsInSentence(sentence4);
        assertEquals(expected4, result4);

        // Test case 5
        String sentence5 = "go for it";
        String expected5 = "go for it";
        String result5 = WordsInSentence.wordsInSentence(sentence5);
        assertEquals(expected5, result5);

        // Test case 6
        String sentence6 = "here";
        String expected6 = "";
        String result6 = WordsInSentence.wordsInSentence(sentence6);
        assertEquals(expected6, result6);

        // Test case 7
        String sentence7 = "here is";
        String expected7 = "is";
        String result7 = WordsInSentence.wordsInSentence(sentence7);
        assertEquals(expected7, result7);
    }
}