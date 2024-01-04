package original;
import java.util.Collections;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ByLength_132_1Test {

    @Test(timeout = 8000)
    public void testByLength() {
        List<Object> input = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
        List<Object> expected = new ArrayList<>(Arrays.asList("Nine", "Eight", "Seven", "Six", "Five", "Four", "Three", "Two", "One"));
        List<Object> result = ByLength.byLength(input);
        assertEquals(expected, result);
    }

    @Test(timeout = 8000)
    public void testByLengthWithNonIntegerValues() {
        List<Object> input = new ArrayList<>(Arrays.asList(1, "Two", 3.14, "Four", 5, "Six", 7.8, "Eight", 9));
        List<Object> expected = new ArrayList<>(Arrays.asList("Nine", "Eight", "Six", "Four", "Two", "One"));
        List<Object> result = ByLength.byLength(input);
        assertEquals(expected, result);
    }

    @Test(timeout = 8000)
    public void testByLengthWithEmptyList() {
        List<Object> input = new ArrayList<>();
        List<Object> expected = new ArrayList<>();
        List<Object> result = ByLength.byLength(input);
        assertEquals(expected, result);
    }

    @Test(timeout = 8000)
    public void testByLengthWithNoValidValues() {
        List<Object> input = new ArrayList<>(Arrays.asList(10, 11, 12));
        List<Object> expected = new ArrayList<>();
        List<Object> result = ByLength.byLength(input);
        assertEquals(expected, result);
    }
}