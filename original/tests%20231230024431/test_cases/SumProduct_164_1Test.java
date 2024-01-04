package original;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

public class SumProduct_164_1Test {

    @Test(timeout = 8000)
    public void testSumProduct() {
        // Test case 1: [1, 2, 3, 4]
        List<Object> numbers1 = new ArrayList<>();
        numbers1.add(1);
        numbers1.add(2);
        numbers1.add(3);
        numbers1.add(4);
        List<Integer> expected1 = new ArrayList<>();
        expected1.add(10);
        expected1.add(24);
        assertEquals(expected1, SumProduct.sumProduct(numbers1));

        // Test case 2: []
        List<Object> numbers2 = new ArrayList<>();
        List<Integer> expected2 = new ArrayList<>();
        expected2.add(0);
        expected2.add(1);
        assertEquals(expected2, SumProduct.sumProduct(numbers2));

        // Test case 3: [1, 1, 1]
        List<Object> numbers3 = new ArrayList<>();
        numbers3.add(1);
        numbers3.add(1);
        numbers3.add(1);
        List<Integer> expected3 = new ArrayList<>();
        expected3.add(3);
        expected3.add(1);
        assertEquals(expected3, SumProduct.sumProduct(numbers3));

        // Test case 4: [100, 0]
        List<Object> numbers4 = new ArrayList<>();
        numbers4.add(100);
        numbers4.add(0);
        List<Integer> expected4 = new ArrayList<>();
        expected4.add(100);
        expected4.add(0);
        assertEquals(expected4, SumProduct.sumProduct(numbers4));

        // Test case 5: [3, 5, 7]
        List<Object> numbers5 = new ArrayList<>();
        numbers5.add(3);
        numbers5.add(5);
        numbers5.add(7);
        List<Integer> expected5 = new ArrayList<>();
        expected5.add(15);
        expected5.add(105);
        assertEquals(expected5, SumProduct.sumProduct(numbers5));

        // Test case 6: [10]
        List<Object> numbers6 = new ArrayList<>();
        numbers6.add(10);
        List<Integer> expected6 = new ArrayList<>();
        expected6.add(10);
        expected6.add(10);
        assertEquals(expected6, SumProduct.sumProduct(numbers6));
    }
}