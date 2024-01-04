package original;

import org.junit.Test;
import static org.junit.Assert.*;

public class WordsInSentence_10_1Test {

    @Test(timeout = 8000)
    public void testWordsInSentence() {
        String sentence = "This is a test sentence";
        String expected = "This is a";
        String result = WordsInSentence.wordsInSentence(sentence);
        assertEquals(expected, result);
    }

    @Test(timeout = 8000)
    public void testWordsInSentence_EmptySentence() {
        String sentence = "";
        String expected = "";
        String result = WordsInSentence.wordsInSentence(sentence);
        assertEquals(expected, result);
    }

    @Test(timeout = 8000)
    public void testWordsInSentence_NoPrimeLengthWords() {
        String sentence = "This is not a prime length words test";
        String expected = "";
        String result = WordsInSentence.wordsInSentence(sentence);
        assertEquals(expected, result);
    }

    @Test(timeout = 8000)
    public void testWordsInSentence_AllPrimeLengthWords() {
        String sentence = "a aa aaa aaaa";
        String expected = "a aa aaa aaaa";
        String result = WordsInSentence.wordsInSentence(sentence);
        assertEquals(expected, result);
    }

    @Test(timeout = 8000)
    public void testWordsInSentence_MixedPrimeAndNonPrimeLengthWords() {
        String sentence = "This is a test sentence with prime length words";
        String expected = "This is a test with prime words";
        String result = WordsInSentence.wordsInSentence(sentence);
        assertEquals(expected, result);
    }
}