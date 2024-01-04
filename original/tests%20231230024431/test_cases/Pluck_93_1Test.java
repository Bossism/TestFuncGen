package original;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Pluck_93_1Test {

    @Test(timeout = 8000)
    public void testPluck() {
        // Test case 1
        List<Object> arr1 = new ArrayList<>(Arrays.asList(4, 2, 3));
        List<Object> expected1 = new ArrayList<>(Arrays.asList(2, 1));
        assertEquals(expected1, Pluck.pluck(arr1));

        // Test case 2
        List<Object> arr2 = new ArrayList<>(Arrays.asList(1, 2, 3));
        List<Object> expected2 = new ArrayList<>(Arrays.asList(2, 1));
        assertEquals(expected2, Pluck.pluck(arr2));

        // Test case 3
        List<Object> arr3 = new ArrayList<>();
        List<Object> expected3 = new ArrayList<>();
        assertEquals(expected3, Pluck.pluck(arr3));

        // Test case 4
        List<Object> arr4 = new ArrayList<>(Arrays.asList(5, 0, 3, 0, 4, 2));
        List<Object> expected4 = new ArrayList<>(Arrays.asList(0, 1));
        assertEquals(expected4, Pluck.pluck(arr4));

        // Test case 5
        List<Object> arr5 = new ArrayList<>(Arrays.asList(1, 2, 3, 0, 5, 3));
        List<Object> expected5 = new ArrayList<>(Arrays.asList(0, 3));
        assertEquals(expected5, Pluck.pluck(arr5));

        // Test case 6
        List<Object> arr6 = new ArrayList<>(Arrays.asList(5, 4, 8, 4, 8));
        List<Object> expected6 = new ArrayList<>(Arrays.asList(4, 1));
        assertEquals(expected6, Pluck.pluck(arr6));

        // Test case 7
        List<Object> arr7 = new ArrayList<>(Arrays.asList(7, 6, 7, 1));
        List<Object> expected7 = new ArrayList<>(Arrays.asList(6, 1));
        assertEquals(expected7, Pluck.pluck(arr7));

        // Test case 8
        List<Object> arr8 = new ArrayList<>(Arrays.asList(7, 9, 7, 1));
        List<Object> expected8 = new ArrayList<>();
        assertEquals(expected8, Pluck.pluck(arr8));
    }
}