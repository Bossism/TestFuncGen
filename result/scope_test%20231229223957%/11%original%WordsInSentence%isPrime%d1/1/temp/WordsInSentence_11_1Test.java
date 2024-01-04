package original;

import org.junit.Test;
import static org.junit.Assert.*;

public class WordsInSentence_11_1Test {

    @Test(timeout = 8000)
    public void testWordsInSentence() {
        assertEquals("", WordsInSentence.wordsInSentence("here"));
        assertEquals("is", WordsInSentence.wordsInSentence("here is"));
        assertEquals("is", WordsInSentence.wordsInSentence("This is a test"));
        assertEquals("go for", WordsInSentence.wordsInSentence("lets go for swimming"));
        assertEquals("there is no place", WordsInSentence.wordsInSentence("there is no place available here"));
        assertEquals("Hi am Hussein", WordsInSentence.wordsInSentence("Hi I am Hussein"));
        assertEquals("go for it", WordsInSentence.wordsInSentence("go for it"));
    }
}