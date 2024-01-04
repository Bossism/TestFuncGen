package original;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;

public class FilterIntegers_92_1Test {

    @Test(timeout = 8000)
    public void testFilterIntegers() {
        // Test case 1: filterIntegers(["a", 3.14, 5])
        List<Object> values1 = new ArrayList<>();
        values1.add("a");
        values1.add(3.14);
        values1.add(5);
        List<Object> expected1 = new ArrayList<>();
        expected1.add(5);
        List<Object> result1 = FilterIntegers.filterIntegers(values1);
        assertEquals(expected1, result1);

        // Test case 2: filterIntegers([1, 2, 3, "abc", {}, []])
        List<Object> values2 = new ArrayList<>();
        values2.add(1);
        values2.add(2);
        values2.add(3);
        values2.add("abc");
        values2.add(new Object());
        values2.add(new ArrayList<>());
        List<Object> expected2 = new ArrayList<>();
        expected2.add(1);
        expected2.add(2);
        expected2.add(3);
        List<Object> result2 = FilterIntegers.filterIntegers(values2);
        assertEquals(expected2, result2);

        // Test case 3: filterIntegers([])
        List<Object> values3 = new ArrayList<>();
        List<Object> expected3 = new ArrayList<>();
        List<Object> result3 = FilterIntegers.filterIntegers(values3);
        assertEquals(expected3, result3);

        // Test case 4: filterIntegers([4, {}, [], 23.2, 9, "adasd"])
        List<Object> values4 = new ArrayList<>();
        values4.add(4);
        values4.add(new Object());
        values4.add(new ArrayList<>());
        values4.add(23.2);
        values4.add(9);
        values4.add("adasd");
        List<Object> expected4 = new ArrayList<>();
        expected4.add(4);
        expected4.add(9);
        List<Object> result4 = FilterIntegers.filterIntegers(values4);
        assertEquals(expected4, result4);

        // Test case 5: filterIntegers([3, "c", 3, 3, "a", "b"])
        List<Object> values5 = new ArrayList<>();
        values5.add(3);
        values5.add("c");
        values5.add(3);
        values5.add(3);
        values5.add("a");
        values5.add("b");
        List<Object> expected5 = new ArrayList<>();
        expected5.add(3);
        expected5.add(3);
        expected5.add(3);
        List<Object> result5 = FilterIntegers.filterIntegers(values5);
        assertEquals(expected5, result5);
    }
}