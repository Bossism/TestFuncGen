package original;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;

public class DoubleTheDifference_56_1Test {

    @Test(timeout = 8000)
    public void testDoubleTheDifference() {
        List<Object> lst = new ArrayList<>();
        lst.add(1);
        lst.add(2);
        lst.add(3);
        lst.add(4);
        lst.add(5);

        int result = DoubleTheDifference.doubleTheDifference(lst);

        assertEquals(26, result);
    }

    @Test(timeout = 8000)
    public void testDoubleTheDifferenceWithEmptyList() {
        List<Object> lst = new ArrayList<>();

        int result = DoubleTheDifference.doubleTheDifference(lst);

        assertEquals(0, result);
    }

    @Test(timeout = 8000)
    public void testDoubleTheDifferenceWithNegativeNumbers() {
        List<Object> lst = new ArrayList<>();
        lst.add(-1);
        lst.add(-2);
        lst.add(-3);
        lst.add(-4);
        lst.add(-5);

        int result = DoubleTheDifference.doubleTheDifference(lst);

        assertEquals(0, result);
    }

    @Test(timeout = 8000)
    public void testDoubleTheDifferenceWithMixedNumbers() {
        List<Object> lst = new ArrayList<>();
        lst.add(-1);
        lst.add(2);
        lst.add(3);
        lst.add(-4);
        lst.add(5);

        int result = DoubleTheDifference.doubleTheDifference(lst);

        assertEquals(34, result);
    }

    @Test(timeout = 8000)
    public void testDoubleTheDifferenceWithNonIntegerElements() {
        List<Object> lst = new ArrayList<>();
        lst.add(1);
        lst.add("two");
        lst.add(3);
        lst.add(4);
        lst.add(5);

        int result = DoubleTheDifference.doubleTheDifference(lst);

        assertEquals(26, result);
    }
}