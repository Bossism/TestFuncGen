package original;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

public class SplitWords_106_1Test {

    @Test(timeout = 8000)
    public void testSplitWordsWithSpace() {
        String txt = "Hello World";
        List<String> expected = Arrays.asList("Hello", "World");
        Object result = SplitWords.splitWords(txt);
        assertTrue(result instanceof List);
        assertEquals(expected, result);
    }

    @Test(timeout = 8000)
    public void testSplitWordsWithComma() {
        String txt = "Hello,World";
        List<String> expected = Arrays.asList("Hello", "World");
        Object result = SplitWords.splitWords(txt);
        assertTrue(result instanceof List);
        assertEquals(expected, result);
    }

    @Test(timeout = 8000)
    public void testSplitWordsWithoutDelimiter() {
        String txt = "HelloWorld";
        int expected = 5;
        Object result = SplitWords.splitWords(txt);
        assertTrue(result instanceof Integer);
        assertEquals(expected, result);
    }
}