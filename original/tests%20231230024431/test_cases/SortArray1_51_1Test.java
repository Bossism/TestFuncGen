package original;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortArray1_51_1Test {

    @Test(timeout = 8000)
    public void testSortArray_emptyArray() {
        List<Object> array = new ArrayList<>();
        List<Object> expected = new ArrayList<>();
        List<Object> result = SortArray1.sortArray(array);
        assertEquals(expected, result);
    }

    @Test(timeout = 8000)
    public void testSortArray_singleElementArray() {
        List<Object> array = new ArrayList<>(Arrays.asList(5));
        List<Object> expected = new ArrayList<>(Arrays.asList(5));
        List<Object> result = SortArray1.sortArray(array);
        assertEquals(expected, result);
    }

    @Test(timeout = 8000)
    public void testSortArray_oddSum() {
        List<Object> array = new ArrayList<>(Arrays.asList(2, 4, 3, 0, 1, 5));
        List<Object> expected = new ArrayList<>(Arrays.asList(0, 1, 2, 3, 4, 5));
        List<Object> result = SortArray1.sortArray(array);
        assertEquals(expected, result);
    }

    @Test(timeout = 8000)
    public void testSortArray_evenSum() {
        List<Object> array = new ArrayList<>(Arrays.asList(2, 4, 3, 0, 1, 5, 6));
        List<Object> expected = new ArrayList<>(Arrays.asList(6, 5, 4, 3, 2, 1, 0));
        List<Object> result = SortArray1.sortArray(array);
        assertEquals(expected, result);
    }

    @Test(timeout = 8000)
    public void testSortArray_twoElements() {
        List<Object> array = new ArrayList<>(Arrays.asList(2, 1));
        List<Object> expected = new ArrayList<>(Arrays.asList(1, 2));
        List<Object> result = SortArray1.sortArray(array);
        assertEquals(expected, result);
    }

    @Test(timeout = 8000)
    public void testSortArray_multipleElements() {
        List<Object> array = new ArrayList<>(Arrays.asList(15, 42, 87, 32, 11, 0));
        List<Object> expected = new ArrayList<>(Arrays.asList(0, 11, 15, 32, 42, 87));
        List<Object> result = SortArray1.sortArray(array);
        assertEquals(expected, result);
    }

    @Test(timeout = 8000)
    public void testSortArray_unsortedElements() {
        List<Object> array = new ArrayList<>(Arrays.asList(21, 14, 23, 11));
        List<Object> expected = new ArrayList<>(Arrays.asList(23, 21, 14, 11));
        List<Object> result = SortArray1.sortArray(array);
        assertEquals(expected, result);
    }
}