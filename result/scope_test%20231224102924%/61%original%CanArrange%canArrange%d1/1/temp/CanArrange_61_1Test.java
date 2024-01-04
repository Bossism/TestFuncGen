package original;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;

public class CanArrange_61_1Test {

    @Test(timeout = 8000)
    public void testCanArrange() {
        List<Object> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);

        int result = CanArrange.canArrange(arr);

        assertEquals(-1, result);
    }

    @Test(timeout = 8000)
    public void testCanArrangeWithDescendingOrder() {
        List<Object> arr = new ArrayList<>();
        arr.add(5);
        arr.add(4);
        arr.add(3);
        arr.add(2);
        arr.add(1);

        int result = CanArrange.canArrange(arr);

        assertEquals(4, result);
    }

    @Test(timeout = 8000)
    public void testCanArrangeWithMixedOrder() {
        List<Object> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);

        int result = CanArrange.canArrange(arr);

        assertEquals(-1, result);
    }

    @Test(timeout = 8000)
    public void testCanArrangeWithEmptyList() {
        List<Object> arr = new ArrayList<>();

        int result = CanArrange.canArrange(arr);

        assertEquals(-1, result);
    }

    @Test(timeout = 8000)
    public void testCanArrangeWithNonIntegerElements() {
        List<Object> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);

        int result = CanArrange.canArrange(arr);

        assertEquals(-1, result);
    }
}