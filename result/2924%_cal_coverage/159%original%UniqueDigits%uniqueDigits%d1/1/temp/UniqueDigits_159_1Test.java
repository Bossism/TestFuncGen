package original;
import java.util.Collections;
import java.util.Comparator;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UniqueDigits_159_1Test {

    @Test(timeout = 8000)
    public void testUniqueDigits() {
        List<Integer> input = new ArrayList<>(Arrays.asList(123, 456, 789, 246, 135));
        List<Object> expected = new ArrayList<>(Arrays.asList(135, 789));
        List<Object> result = UniqueDigits.uniqueDigits(input);
        assertEquals(expected, result);
    }

    @Test(timeout = 8000)
    public void testUniqueDigits_NoEvenDigits() {
        List<Integer> input = new ArrayList<>(Arrays.asList(111, 333, 555));
        List<Object> expected = new ArrayList<>(Arrays.asList(111, 333, 555));
        List<Object> result = UniqueDigits.uniqueDigits(input);
        assertEquals(expected, result);
    }

    @Test(timeout = 8000)
    public void testUniqueDigits_EmptyList() {
        List<Integer> input = new ArrayList<>();
        List<Object> expected = new ArrayList<>();
        List<Object> result = UniqueDigits.uniqueDigits(input);
        assertEquals(expected, result);
    }

    @Test(timeout = 8000)
    public void testUniqueDigits_SingleElement() {
        List<Integer> input = new ArrayList<>(Arrays.asList(246));
        List<Object> expected = new ArrayList<>(Arrays.asList(246));
        List<Object> result = UniqueDigits.uniqueDigits(input);
        assertEquals(expected, result);
    }
}