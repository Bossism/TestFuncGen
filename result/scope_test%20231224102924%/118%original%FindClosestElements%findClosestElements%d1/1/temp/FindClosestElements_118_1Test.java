package original;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindClosestElements_118_1Test {

    @Test(timeout = 8000)
    public void testFindClosestElements() {
        List<Double> numbers = new ArrayList<>(Arrays.asList(1.5, 2.5, 3.5, 4.5, 5.5));
        List<Double> expected = new ArrayList<>(Arrays.asList(1.5, 2.5));
        List<Double> result = FindClosestElements.findClosestElements(numbers);
        assertEquals(expected, result);
    }

    @Test(timeout = 8000)
    public void testFindClosestElements_EmptyList() {
        List<Double> numbers = new ArrayList<>();
        List<Double> expected = new ArrayList<>();
        List<Double> result = FindClosestElements.findClosestElements(numbers);
        assertEquals(expected, result);
    }

    @Test(timeout = 8000)
    public void testFindClosestElements_SingleElement() {
        List<Double> numbers = new ArrayList<>(Arrays.asList(1.5));
        List<Double> expected = new ArrayList<>();
        List<Double> result = FindClosestElements.findClosestElements(numbers);
        assertEquals(expected, result);
    }

    @Test(timeout = 8000)
    public void testFindClosestElements_DuplicateElements() {
        List<Double> numbers = new ArrayList<>(Arrays.asList(1.5, 2.5, 2.5, 3.5, 4.5, 5.5));
        List<Double> expected = new ArrayList<>(Arrays.asList(2.5, 2.5));
        List<Double> result = FindClosestElements.findClosestElements(numbers);
        assertEquals(expected, result);
    }
}