package original;
package test;

import org.junit.Test;
import static org.junit.Assert.*;
import original.Intersperse;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Intersperse_39_1Test {

    @Test(timeout = 8000)
    public void testIntersperse() {
        List<Object> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        int delimiter = 0;
        List<Object> expected = new ArrayList<>(Arrays.asList(1, 0, 2, 0, 3, 0, 4, 0, 5));
        List<Object> result = Intersperse.intersperse(numbers, delimiter);
        assertEquals(expected, result);
    }

    @Test(timeout = 8000)
    public void testIntersperseWithEmptyList() {
        List<Object> numbers = new ArrayList<>();
        int delimiter = 0;
        List<Object> expected = new ArrayList<>();
        List<Object> result = Intersperse.intersperse(numbers, delimiter);
        assertEquals(expected, result);
    }

    @Test(timeout = 8000)
    public void testIntersperseWithSingleElementList() {
        List<Object> numbers = new ArrayList<>(Arrays.asList(1));
        int delimiter = 0;
        List<Object> expected = new ArrayList<>(Arrays.asList(1));
        List<Object> result = Intersperse.intersperse(numbers, delimiter);
        assertEquals(expected, result);
    }

    @Test(timeout = 8000)
    public void testIntersperseWithNegativeDelimiter() {
        List<Object> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        int delimiter = -1;
        List<Object> expected = new ArrayList<>(Arrays.asList(1, -1, 2, -1, 3, -1, 4, -1, 5));
        List<Object> result = Intersperse.intersperse(numbers, delimiter);
        assertEquals(expected, result);
    }
}