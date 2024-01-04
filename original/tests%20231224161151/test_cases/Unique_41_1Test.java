package original;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.*;

public class Unique_41_1Test {

    @Test(timeout = 8000)
    public void testUnique() {
        List<Integer> input = Arrays.asList(3, 1, 2, 2, 3, 4, 5, 4);
        List<Integer> expected = Arrays.asList(1, 2, 3, 4, 5);
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
    public void testUniqueWithDuplicateElements() {
        List<Integer> input = Arrays.asList(1, 1, 1, 1, 1);
        List<Integer> expected = Arrays.asList(1);
        List<Integer> result = Unique.unique(input);
        assertEquals(expected, result);
    }

    @Test(timeout = 8000)
    public void testUniqueWithNegativeElements() {
        List<Integer> input = Arrays.asList(-3, -1, -2, -2, -3, -4, -5, -4);
        List<Integer> expected = Arrays.asList(-5, -4, -3, -2, -1);
        List<Integer> result = Unique.unique(input);
        assertEquals(expected, result);
    }
}