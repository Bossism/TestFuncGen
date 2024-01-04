package original;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;

public class AddElements_165_1Test {

    @Test(timeout = 8000)
    public void testAddElements() {
        List<Integer> arr = new ArrayList<>();
        arr.add(50);
        arr.add(150);
        arr.add(75);
        arr.add(200);
        arr.add(100);

        int k = 3;
        int expectedSum = 125;

        int actualSum = AddElements.addElements(arr, k);

        assertEquals(expectedSum, actualSum);
    }

    @Test(timeout = 8000)
    public void testAddElementsWithEmptyList() {
        List<Integer> arr = new ArrayList<>();
        int k = 5;
        int expectedSum = 0;

        int actualSum = AddElements.addElements(arr, k);

        assertEquals(expectedSum, actualSum);
    }

    @Test(timeout = 8000)
    public void testAddElementsWithZeroK() {
        List<Integer> arr = new ArrayList<>();
        arr.add(50);
        arr.add(150);
        arr.add(75);
        arr.add(200);
        arr.add(100);

        int k = 0;
        int expectedSum = 0;

        int actualSum = AddElements.addElements(arr, k);

        assertEquals(expectedSum, actualSum);
    }

    @Test(timeout = 8000)
    public void testAddElementsWithNegativeK() {
        List<Integer> arr = new ArrayList<>();
        arr.add(50);
        arr.add(150);
        arr.add(75);
        arr.add(200);
        arr.add(100);

        int k = -2;
        int expectedSum = 0;

        int actualSum = AddElements.addElements(arr, k);

        assertEquals(expectedSum, actualSum);
    }

    @Test(timeout = 8000)
    public void testAddElementsWithKGreaterThanListSize() {
        List<Integer> arr = new ArrayList<>();
        arr.add(50);
        arr.add(150);
        arr.add(75);
        arr.add(200);
        arr.add(100);

        int k = arr.size();
        int expectedSum = 425;

        int actualSum = AddElements.addElements(arr, k);

        assertEquals(expectedSum, actualSum);
    }

    @Test(timeout = 8000)
    public void testAddElementsWithAllElementsGreaterThan100() {
        List<Integer> arr = new ArrayList<>();
        arr.add(150);
        arr.add(200);
        arr.add(175);
        arr.add(250);
        arr.add(300);

        int k = 5;
        int expectedSum = 0;

        int actualSum = AddElements.addElements(arr, k);

        assertEquals(expectedSum, actualSum);
    }
}