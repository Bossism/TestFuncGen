package original;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.*;

public class Unique_41_1Test {

    @Test(timeout = 8000)
    public void testUnique() {
        List<Integer> input = Arrays.asList(5, 3, 5, 2, 3, 3, 9, 0, 123);
        List<Integer> expected = Arrays.asList(0, 2, 3, 5, 9, 123);
        List<Integer> result = Unique.unique(input);
        assertEquals(expected, result);
    }

    @Test(timeout = 8000)
    public void testUniqueWithEmptyList() {
        List<Integer> input = new ArrayList<>();
        List<Integer> expected = new ArrayList<>();
        List<Integer> result = Unique.unique(input);
        assertEquals(expected, result);
    }

    @Test(timeout = 8000)
    public void testUniqueWithSingleElement() {
        List<Integer> input = Arrays.asList(5);
        List<Integer> expected = Arrays.asList(5);
        List<Integer> result = Unique.unique(input);
        assertEquals(expected, result);
    }

    @Test(timeout = 8000)
    public void testUniqueWithDuplicateElements() {
        List<Integer> input = Arrays.asList(5, 5, 5, 5, 5);
        List<Integer> expected = Arrays.asList(5);
        List<Integer> result = Unique.unique(input);
        assertEquals(expected, result);
    }

    @Test(timeout = 8000)
    public void testUniqueWithNegativeElements() {
        List<Integer> input = Arrays.asList(-5, -3, -5, -2, -3, -3, -9, 0, -123);
        List<Integer> expected = Arrays.asList(-123, -9, -5, -3, -2, 0);
        List<Integer> result = Unique.unique(input);
        assertEquals(expected, result);
    }
}