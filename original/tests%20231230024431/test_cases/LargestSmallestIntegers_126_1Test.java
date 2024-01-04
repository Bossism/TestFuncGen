package original;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

public class LargestSmallestIntegers_126_1Test {

    @Test(timeout = 8000)
    public void testLargestSmallestIntegers() {
        // Test case 1: List with positive integers
        List<Object> lst1 = new ArrayList<>();
        lst1.add(2);
        lst1.add(4);
        lst1.add(1);
        lst1.add(3);
        lst1.add(5);
        lst1.add(7);
        List<Integer> result1 = LargestSmallestIntegers.largestSmallestIntegers(lst1);
        assertNull(result1.get(0));
        assertEquals(Integer.valueOf(1), result1.get(1));

        // Test case 2: Empty list
        List<Object> lst2 = new ArrayList<>();
        List<Integer> result2 = LargestSmallestIntegers.largestSmallestIntegers(lst2);
        assertNull(result2.get(0));
        assertNull(result2.get(1));

        // Test case 3: List with only zero
        List<Object> lst3 = new ArrayList<>();
        lst3.add(0);
        List<Integer> result3 = LargestSmallestIntegers.largestSmallestIntegers(lst3);
        assertNull(result3.get(0));
        assertNull(result3.get(1));

        // Test case 4: List with negative integers
        List<Object> lst4 = new ArrayList<>();
        lst4.add(1);
        lst4.add(3);
        lst4.add(2);
        lst4.add(4);
        lst4.add(5);
        lst4.add(6);
        lst4.add(-2);
        List<Integer> result4 = LargestSmallestIntegers.largestSmallestIntegers(lst4);
        assertEquals(Integer.valueOf(-2), result4.get(0));
        assertEquals(Integer.valueOf(1), result4.get(1));

        // Test case 5: List with both negative and positive integers
        List<Object> lst5 = new ArrayList<>();
        lst5.add(4);
        lst5.add(5);
        lst5.add(3);
        lst5.add(6);
        lst5.add(2);
        lst5.add(7);
        lst5.add(-7);
        List<Integer> result5 = LargestSmallestIntegers.largestSmallestIntegers(lst5);
        assertEquals(Integer.valueOf(-7), result5.get(0));
        assertEquals(Integer.valueOf(2), result5.get(1));

        // Test case 6: List with both negative and positive integers, including zero
        List<Object> lst6 = new ArrayList<>();
        lst6.add(7);
        lst6.add(3);
        lst6.add(8);
        lst6.add(4);
        lst6.add(9);
        lst6.add(2);
        lst6.add(5);
        lst6.add(-9);
        List<Integer> result6 = LargestSmallestIntegers.largestSmallestIntegers(lst6);
        assertEquals(Integer.valueOf(-9), result6.get(0));
        assertEquals(Integer.valueOf(2), result6.get(1));

        // Test case 7: Empty list
        List<Object> lst7 = new ArrayList<>();
        List<Integer> result7 = LargestSmallestIntegers.largestSmallestIntegers(lst7);
        assertNull(result7.get(0));
        assertNull(result7.get(1));

        // Test case 8: List with only zero
        List<Object> lst8 = new ArrayList<>();
        lst8.add(0);
        List<Integer> result8 = LargestSmallestIntegers.largestSmallestIntegers(lst8);
        assertNull(result8.get(0));
        assertNull(result8.get(1));

        // Test case 9: List with only negative integers
        List<Object> lst9 = new ArrayList<>();
        lst9.add(-1);
        lst9.add(-3);
        lst9.add(-5);
        lst9.add(-6);
        List<Integer> result9 = LargestSmallestIntegers.largestSmallestIntegers(lst9);
        assertEquals(Integer.valueOf(-1), result9.get(0));
        assertNull(result9.get(1));

        // Test case 10: List with both negative and positive integers, including zero
        List<Object> lst10 = new ArrayList<>();
        lst10.add(-1);
        lst10.add(-3);
        lst10.add(-5);
        lst10.add(-6);
        lst10.add(0);
        List<Integer> result10 = LargestSmallestIntegers.largestSmallestIntegers(lst10);
        assertEquals(Integer.valueOf(-1), result10.get(0));
        assertNull(result10.get(1));

        // Test case 11: List with both negative and positive integers, including zero
        List<Object> lst11 = new ArrayList<>();
        lst11.add(-6);
        lst11.add(-4);
        lst11.add(-4);
        lst11.add(-3);
        lst11.add(1);
        List<Integer> result11 = LargestSmallestIntegers.largestSmallestIntegers(lst11);
        assertEquals(Integer.valueOf(-3), result11.get(0));
        assertEquals(Integer.valueOf(1), result11.get(1));

        // Test case 12: List with both negative and positive integers, including zero
        List<Object> lst12 = new ArrayList<>();
        lst12.add(-6);
        lst12.add(-4);
        lst12.add(-4);
        lst12.add(-3);
        lst12.add(-100);
        lst12.add(1);
        List<Integer> result12 = LargestSmallestIntegers.largestSmallestIntegers(lst12);
        assertEquals(Integer.valueOf(-3), result12.get(0));
        assertEquals(Integer.valueOf(1), result12.get(1));
    }
}