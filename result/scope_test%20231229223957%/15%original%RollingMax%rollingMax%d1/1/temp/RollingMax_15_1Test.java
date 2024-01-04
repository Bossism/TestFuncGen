package original;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RollingMax_15_1Test {

    @Test(timeout = 8000)
    public void testRollingMax() {
        // Test case 1: [1, 2, 3, 2, 3, 4, 2]
        List<Object> numbers1 = new ArrayList<>(Arrays.asList(1, 2, 3, 2, 3, 4, 2));
        List<Object> expected1 = new ArrayList<>(Arrays.asList(1, 2, 3, 3, 3, 4, 4));
        List<Object> result1 = RollingMax.rollingMax(numbers1);
        assertEquals(expected1, result1);

        // Test case 2: []
        List<Object> numbers2 = new ArrayList<>();
        List<Object> expected2 = new ArrayList<>();
        List<Object> result2 = RollingMax.rollingMax(numbers2);
        assertEquals(expected2, result2);

        // Test case 3: [1, 2, 3, 4]
        List<Object> numbers3 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        List<Object> expected3 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        List<Object> result3 = RollingMax.rollingMax(numbers3);
        assertEquals(expected3, result3);

        // Test case 4: [4, 3, 2, 1]
        List<Object> numbers4 = new ArrayList<>(Arrays.asList(4, 3, 2, 1));
        List<Object> expected4 = new ArrayList<>(Arrays.asList(4, 4, 4, 4));
        List<Object> result4 = RollingMax.rollingMax(numbers4);
        assertEquals(expected4, result4);

        // Test case 5: [3, 2, 3, 100, 3]
        List<Object> numbers5 = new ArrayList<>(Arrays.asList(3, 2, 3, 100, 3));
        List<Object> expected5 = new ArrayList<>(Arrays.asList(3, 3, 3, 100, 100));
        List<Object> result5 = RollingMax.rollingMax(numbers5);
        assertEquals(expected5, result5);
    }
}