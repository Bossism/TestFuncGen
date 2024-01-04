package original;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.*;

public class Maximum1_9_1Test {

    @Test(timeout = 8000)
    public void testMaximum() {
        // Test case 1
        List<Integer> arr1 = Arrays.asList(-3, -4, 5);
        int k1 = 3;
        List<Object> expected1 = Arrays.asList(-4, -3, 5);
        List<Object> result1 = Maximum1.maximum(arr1, k1);
        assertEquals(expected1, result1);

        // Test case 2
        List<Integer> arr2 = Arrays.asList(4, -4, 4);
        int k2 = 2;
        List<Object> expected2 = Arrays.asList(4, 4);
        List<Object> result2 = Maximum1.maximum(arr2, k2);
        assertEquals(expected2, result2);

        // Test case 3
        List<Integer> arr3 = Arrays.asList(-3, 2, 1, 2, -1, -2, 1);
        int k3 = 1;
        List<Object> expected3 = Arrays.asList(2);
        List<Object> result3 = Maximum1.maximum(arr3, k3);
        assertEquals(expected3, result3);

        // Test case 4
        List<Integer> arr4 = Arrays.asList(123, -123, 20, 0, 1, 2, -3);
        int k4 = 3;
        List<Object> expected4 = Arrays.asList(2, 20, 123);
        List<Object> result4 = Maximum1.maximum(arr4, k4);
        assertEquals(expected4, result4);

        // Test case 5
        List<Integer> arr5 = Arrays.asList(-123, 20, 0, 1, 2, -3);
        int k5 = 4;
        List<Object> expected5 = Arrays.asList(0, 1, 2, 20);
        List<Object> result5 = Maximum1.maximum(arr5, k5);
        assertEquals(expected5, result5);

        // Test case 6
        List<Integer> arr6 = Arrays.asList(5, 15, 0, 3, -13, -8, 0);
        int k6 = 7;
        List<Object> expected6 = Arrays.asList(-13, -8, 0, 0, 3, 5, 15);
        List<Object> result6 = Maximum1.maximum(arr6, k6);
        assertEquals(expected6, result6);

        // Test case 7
        List<Integer> arr7 = Arrays.asList(-1, 0, 2, 5, 3, -10);
        int k7 = 2;
        List<Object> expected7 = Arrays.asList(3, 5);
        List<Object> result7 = Maximum1.maximum(arr7, k7);
        assertEquals(expected7, result7);

        // Test case 8
        List<Integer> arr8 = Arrays.asList(1, 0, 5, -7);
        int k8 = 1;
        List<Object> expected8 = Arrays.asList(5);
        List<Object> result8 = Maximum1.maximum(arr8, k8);
        assertEquals(expected8, result8);

        // Test case 9
        List<Integer> arr9 = Arrays.asList(4, -4);
        int k9 = 2;
        List<Object> expected9 = Arrays.asList(-4, 4);
        List<Object> result9 = Maximum1.maximum(arr9, k9);
        assertEquals(expected9, result9);

        // Test case 10
        List<Integer> arr10 = Arrays.asList(-10, 10);
        int k10 = 2;
        List<Object> expected10 = Arrays.asList(-10, 10);
        List<Object> result10 = Maximum1.maximum(arr10, k10);
        assertEquals(expected10, result10);

        // Test case 11
        List<Integer> arr11 = Arrays.asList(1, 2, 3, -23, 243, -400, 0);
        int k11 = 0;
        List<Object> expected11 = new ArrayList<>();
        List<Object> result11 = Maximum1.maximum(arr11, k11);
        assertEquals(expected11, result11);
    }
}