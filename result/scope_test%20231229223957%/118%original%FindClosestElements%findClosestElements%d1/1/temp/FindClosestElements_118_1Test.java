package original;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindClosestElements_118_1Test {

    @Test(timeout = 8000)
    public void testFindClosestElements() {
        List<Double> numbers = new ArrayList<>(Arrays.asList(1.0, 2.0, 3.9, 4.0, 5.0, 2.2));
        List<Double> expected = new ArrayList<>(Arrays.asList(3.9, 4.0));
        List<Double> result = FindClosestElements.findClosestElements(numbers);
        assertEquals(expected, result);
    }

    @Test(timeout = 8000)
    public void testFindClosestElementsWithDuplicateNumbers() {
        List<Double> numbers = new ArrayList<>(Arrays.asList(1.0, 2.0, 3.0, 4.0, 5.0, 2.0));
        List<Double> expected = new ArrayList<>(Arrays.asList(2.0, 2.0));
        List<Double> result = FindClosestElements.findClosestElements(numbers);
        assertEquals(expected, result);
    }

    @Test(timeout = 8000)
    public void testFindClosestElementsWithNegativeNumbers() {
        List<Double> numbers = new ArrayList<>(Arrays.asList(-1.0, -2.0, -3.9, -4.0, -5.0, -2.2));
        List<Double> expected = new ArrayList<>(Arrays.asList(-4.0, -3.9));
        List<Double> result = FindClosestElements.findClosestElements(numbers);
        assertEquals(expected, result);
    }

    @Test(timeout = 8000)
    public void testFindClosestElementsWithEmptyList() {
        List<Double> numbers = new ArrayList<>();
        List<Double> expected = new ArrayList<>();
        List<Double> result = FindClosestElements.findClosestElements(numbers);
        assertEquals(expected, result);
    }

    @Test(timeout = 8000)
    public void testFindClosestElementsWithSingleNumber() {
        List<Double> numbers = new ArrayList<>(Arrays.asList(1.0));
        List<Double> expected = new ArrayList<>();
        List<Double> result = FindClosestElements.findClosestElements(numbers);
        assertEquals(expected, result);
    }
}