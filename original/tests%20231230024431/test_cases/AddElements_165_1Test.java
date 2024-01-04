package original;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.List;

public class AddElements_165_1Test {

    @Test(timeout = 8000)
    public void testAddElements() {
        List<Integer> arr = Arrays.asList(111, 21, 3, 4000, 5, 6, 7, 8, 9);
        int k = 4;
        int expected = 24;
        int result = AddElements.addElements(arr, k);
        assertEquals(expected, result);
    }

    @Test(timeout = 8000)
    public void testAddElementsWithNegativeNumbers() {
        List<Integer> arr = Arrays.asList(1, -2, -3, 41, 57, 76, 87, 88, 99);
        int k = 3;
        int expected = -4;
        int result = AddElements.addElements(arr, k);
        assertEquals(expected, result);
    }

    @Test(timeout = 8000)
    public void testAddElementsWithNoElements() {
        List<Integer> arr = Arrays.asList();
        int k = 0;
        int expected = 0;
        int result = AddElements.addElements(arr, k);
        assertEquals(expected, result);
    }

    @Test(timeout = 8000)
    public void testAddElementsWithSingleElement() {
        List<Integer> arr = Arrays.asList(1);
        int k = 1;
        int expected = 1;
        int result = AddElements.addElements(arr, k);
        assertEquals(expected, result);
    }

    @Test(timeout = 8000)
    public void testAddElementsWithAllElements() {
        List<Integer> arr = Arrays.asList(111, 121, 3, 4000, 5, 6);
        int k = 6;
        int expected = 0;
        int result = AddElements.addElements(arr, k);
        assertEquals(expected, result);
    }
}