package original;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;

public class Factorize_49_1Test {

    @Test(timeout = 8000)
    public void testFactorize() {
        // Test case 1: n = 0
        int n1 = 0;
        List<Integer> expected1 = new ArrayList<>();
        List<Integer> result1 = Factorize.factorize(n1);
        assertEquals(expected1, result1);

        // Test case 2: n = 1
        int n2 = 1;
        List<Integer> expected2 = new ArrayList<>();
        List<Integer> result2 = Factorize.factorize(n2);
        assertEquals(expected2, result2);

        // Test case 3: n = 2
        int n3 = 2;
        List<Integer> expected3 = new ArrayList<>();
        expected3.add(2);
        List<Integer> result3 = Factorize.factorize(n3);
        assertEquals(expected3, result3);

        // Test case 4: n = 10
        int n4 = 10;
        List<Integer> expected4 = new ArrayList<>();
        expected4.add(2);
        expected4.add(5);
        List<Integer> result4 = Factorize.factorize(n4);
        assertEquals(expected4, result4);

        // Test case 5: n = 100
        int n5 = 100;
        List<Integer> expected5 = new ArrayList<>();
        expected5.add(2);
        expected5.add(2);
        expected5.add(5);
        expected5.add(5);
        List<Integer> result5 = Factorize.factorize(n5);
        assertEquals(expected5, result5);
    }
}