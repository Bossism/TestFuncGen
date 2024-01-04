package original;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

public class BelowThreshold_112_1Test {

    @Test(timeout = 8000)
    public void testBelowThreshold_AllNumbersBelowThreshold_ReturnsTrue() {
        List<Integer> l = Arrays.asList(1, 2, 4, 10);
        int t = 100;
        assertTrue(BelowThreshold.belowThreshold(l, t));
    }

    @Test(timeout = 8000)
    public void testBelowThreshold_SomeNumbersAboveThreshold_ReturnsFalse() {
        List<Integer> l = Arrays.asList(1, 20, 4, 10);
        int t = 5;
        assertFalse(BelowThreshold.belowThreshold(l, t));
    }

    @Test(timeout = 8000)
    public void testBelowThreshold_AllNumbersAboveThreshold_ReturnsTrue() {
        List<Integer> l = Arrays.asList(1, 20, 4, 10);
        int t = 21;
        assertTrue(BelowThreshold.belowThreshold(l, t));
    }

    @Test(timeout = 8000)
    public void testBelowThreshold_AllNumbersAboveThreshold_ReturnsTrue2() {
        List<Integer> l = Arrays.asList(1, 20, 4, 10);
        int t = 22;
        assertTrue(BelowThreshold.belowThreshold(l, t));
    }

    @Test(timeout = 8000)
    public void testBelowThreshold_SomeNumbersAboveThreshold_ReturnsTrue2() {
        List<Integer> l = Arrays.asList(1, 8, 4, 10);
        int t = 11;
        assertTrue(BelowThreshold.belowThreshold(l, t));
    }

    @Test(timeout = 8000)
    public void testBelowThreshold_SomeNumbersAboveThreshold_ReturnsFalse2() {
        List<Integer> l = Arrays.asList(1, 8, 4, 10);
        int t = 10;
        assertFalse(BelowThreshold.belowThreshold(l, t));
    }
}