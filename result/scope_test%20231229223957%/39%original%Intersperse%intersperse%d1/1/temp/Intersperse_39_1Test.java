package original;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Intersperse_39_1Test {

    @Test(timeout = 8000)
    public void testIntersperseWithEmptyList() {
        List<Object> numbers = new ArrayList<>();
        int delimiter = 4;
        List<Object> expected = new ArrayList<>();
        List<Object> result = Intersperse.intersperse(numbers, delimiter);
        assertEquals(expected, result);
    }

    @Test(timeout = 8000)
    public void testIntersperseWithNonEmptyList() {
        List<Object> numbers = Arrays.asList(1, 2, 3);
        int delimiter = 4;
        List<Object> expected = Arrays.asList(1, 4, 2, 4, 3);
        List<Object> result = Intersperse.intersperse(numbers, delimiter);
        assertEquals(expected, result);
    }

    @Test(timeout = 8000)
    public void testIntersperseWithEmptyListAndDifferentDelimiter() {
        List<Object> numbers = new ArrayList<>();
        int delimiter = 7;
        List<Object> expected = new ArrayList<>();
        List<Object> result = Intersperse.intersperse(numbers, delimiter);
        assertEquals(expected, result);
    }

    @Test(timeout = 8000)
    public void testIntersperseWithNonEmptyListAndDifferentDelimiter() {
        List<Object> numbers = Arrays.asList(5, 6, 3, 2);
        int delimiter = 8;
        List<Object> expected = Arrays.asList(5, 8, 6, 8, 3, 8, 2);
        List<Object> result = Intersperse.intersperse(numbers, delimiter);
        assertEquals(expected, result);
    }

    @Test(timeout = 8000)
    public void testIntersperseWithSameNumberAndDelimiter() {
        List<Object> numbers = Arrays.asList(2, 2, 2);
        int delimiter = 2;
        List<Object> expected = Arrays.asList(2, 2, 2, 2, 2);
        List<Object> result = Intersperse.intersperse(numbers, delimiter);
        assertEquals(expected, result);
    }
}