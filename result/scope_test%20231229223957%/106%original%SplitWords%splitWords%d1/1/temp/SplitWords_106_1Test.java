package original;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

public class SplitWords_106_1Test {

    @Test(timeout = 8000)
    public void testSplitWordsWithWhitespace() {
        String txt = "Hello world!";
        List<String> expected = Arrays.asList("Hello", "world!");
        assertEquals(expected, SplitWords.splitWords(txt));
    }

    @Test(timeout = 8000)
    public void testSplitWordsWithComma() {
        String txt = "Hello,world!";
        List<String> expected = Arrays.asList("Hello", "world!");
        assertEquals(expected, SplitWords.splitWords(txt));
    }

    @Test(timeout = 8000)
    public void testSplitWordsWithWhitespaceAndComma() {
        String txt = "Hello world,!";
        List<String> expected = Arrays.asList("Hello", "world,!");
        assertEquals(expected, SplitWords.splitWords(txt));
    }

    @Test(timeout = 8000)
    public void testSplitWordsWithMultipleCommas() {
        String txt = "Hello,Hello,world !";
        List<String> expected = Arrays.asList("Hello,Hello,world", "!");
        assertEquals(expected, SplitWords.splitWords(txt));
    }

    @Test(timeout = 8000)
    public void testSplitWordsWithNoWhitespaceOrComma() {
        String txt = "abcdef";
        int expected = 3;
        assertEquals(expected, SplitWords.splitWords(txt));
    }

    @Test(timeout = 8000)
    public void testSplitWordsWithNoWhitespaceOrCommaAndAllLowerCase() {
        String txt = "aaabb";
        int expected = 2;
        assertEquals(expected, SplitWords.splitWords(txt));
    }

    @Test(timeout = 8000)
    public void testSplitWordsWithNoWhitespaceOrCommaAndMixedCase() {
        String txt = "aaaBb";
        int expected = 1;
        assertEquals(expected, SplitWords.splitWords(txt));
    }

    @Test(timeout = 8000)
    public void testSplitWordsWithEmptyString() {
        String txt = "";
        int expected = 0;
        assertEquals(expected, SplitWords.splitWords(txt));
    }
}