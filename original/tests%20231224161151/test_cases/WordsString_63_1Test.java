package original;
import org.junit.jupiter.api.Timeout;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class WordsString_63_1Test {

    @Test
    @Timeout(8000)
    void testWordsString_emptyString() {
        String s = "";
        List<Object> expected = new ArrayList<>();
        List<Object> result = WordsString.wordsString(s);
        assertEquals(expected, result);
    }

    @Test
    @Timeout(8000)
    void testWordsString_singleWord() {
        String s = "Hello";
        List<Object> expected = Arrays.asList("Hello");
        List<Object> result = WordsString.wordsString(s);
        assertEquals(expected, result);
    }

    @Test
    @Timeout(8000)
    void testWordsString_multipleWords() {
        String s = "Hello, World";
        List<Object> expected = Arrays.asList("Hello", "World");
        List<Object> result = WordsString.wordsString(s);
        assertEquals(expected, result);
    }

    @Test
    @Timeout(8000)
    void testWordsString_multipleWordsWithExtraSpaces() {
        String s = "  Hello,   World  ";
        List<Object> expected = Arrays.asList("Hello", "World");
        List<Object> result = WordsString.wordsString(s);
        assertEquals(expected, result);
    }
}