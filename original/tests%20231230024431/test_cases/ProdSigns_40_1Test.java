package original;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProdSigns_40_1Test {

    @Test(timeout = 8000)
    public void testProdSigns() {
        // Test case 1
        List<Object> arr1 = Arrays.asList(1, 2, 2, -4);
        Integer result1 = ProdSigns.prodSigns(arr1);
        assertEquals(Integer.valueOf(-9), result1);

        // Test case 2
        List<Object> arr2 = Arrays.asList(0, 1);
        Integer result2 = ProdSigns.prodSigns(arr2);
        assertEquals(Integer.valueOf(0), result2);

        // Test case 3
        List<Object> arr3 = new ArrayList<>();
        Integer result3 = ProdSigns.prodSigns(arr3);
        assertNull(result3);

        // Test case 4
        List<Object> arr4 = Arrays.asList(1, 1, 1, 2, 3, -1, 1);
        Integer result4 = ProdSigns.prodSigns(arr4);
        assertEquals(Integer.valueOf(-10), result4);

        // Test case 5
        List<Object> arr5 = Arrays.asList(2, 4, 1, 2, -1, -1, 9);
        Integer result5 = ProdSigns.prodSigns(arr5);
        assertEquals(Integer.valueOf(20), result5);

        // Test case 6
        List<Object> arr6 = Arrays.asList(-1, 1, -1, 1);
        Integer result6 = ProdSigns.prodSigns(arr6);
        assertEquals(Integer.valueOf(4), result6);

        // Test case 7
        List<Object> arr7 = Arrays.asList(-1, 1, 1, 1);
        Integer result7 = ProdSigns.prodSigns(arr7);
        assertEquals(Integer.valueOf(-4), result7);

        // Test case 8
        List<Object> arr8 = Arrays.asList(-1, 1, 1, 0);
        Integer result8 = ProdSigns.prodSigns(arr8);
        assertEquals(Integer.valueOf(0), result8);
    }
}