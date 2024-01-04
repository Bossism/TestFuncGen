package original;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

public class Monotonic_22_1Test {

    @Test(timeout = 8000)
    public void testMonotonicIncreasing() {
        List<Integer> list = Arrays.asList(1, 2, 4, 10);
        assertTrue(Monotonic.monotonic(list));
    }

    @Test(timeout = 8000)
    public void testMonotonicDecreasing() {
        List<Integer> list = Arrays.asList(10, 4, 2, 1);
        assertTrue(Monotonic.monotonic(list));
    }

    @Test(timeout = 8000)
    public void testMonotonicMixed() {
        List<Integer> list = Arrays.asList(1, 20, 4, 10);
        assertFalse(Monotonic.monotonic(list));
    }

    @Test(timeout = 8000)
    public void testMonotonicEqual() {
        List<Integer> list = Arrays.asList(4, 4, 4, 4);
        assertTrue(Monotonic.monotonic(list));
    }

    @Test(timeout = 8000)
    public void testMonotonicNonMonotonic() {
        List<Integer> list = Arrays.asList(1, 2, 3, 2, 5, 60);
        assertFalse(Monotonic.monotonic(list));
    }

    @Test(timeout = 8000)
    public void testMonotonicEmptyList() {
        List<Integer> list = Arrays.asList();
        assertTrue(Monotonic.monotonic(list));
    }

    @Test(timeout = 8000)
    public void testMonotonicSingleElement() {
        List<Integer> list = Arrays.asList(5);
        assertTrue(Monotonic.monotonic(list));
    }
}