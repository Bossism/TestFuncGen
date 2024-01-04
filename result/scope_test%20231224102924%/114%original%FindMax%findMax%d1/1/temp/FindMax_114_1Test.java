package original;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindMax_114_1Test {

    @Test(timeout = 8000)
    public void testFindMax() {
        List<String> words = new ArrayList<>(Arrays.asList("apple", "banana", "cat", "dog", "elephant"));

        String result = FindMax.findMax(words);

        assertEquals("elephant", result);
    }

    @Test(timeout = 8000)
    public void testFindMaxWithEmptyList() {
        List<String> words = new ArrayList<>();

        String result = FindMax.findMax(words);

        assertNull(result);
    }

    @Test(timeout = 8000)
    public void testFindMaxWithNullList() {
        List<String> words = null;

        String result = FindMax.findMax(words);

        assertNull(result);
    }

    @Test(timeout = 8000)
    public void testFindMaxWithEqualUniqueCharacters() {
        List<String> words = new ArrayList<>(Arrays.asList("apple", "banana", "cat", "dog", "elephant"));

        String result = FindMax.findMax(words);

        assertEquals("elephant", result);
    }
}