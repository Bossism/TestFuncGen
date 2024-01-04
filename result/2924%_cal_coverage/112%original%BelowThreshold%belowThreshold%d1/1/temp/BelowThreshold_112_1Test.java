package original;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

public class BelowThreshold_112_1Test {

    @Test(timeout = 8000)
    public void testBelowThreshold() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        int threshold = 4;

        boolean result = BelowThreshold.belowThreshold(list, threshold);

        assertTrue(result);
    }

    @Test(timeout = 8000)
    public void testBelowThresholdWithEmptyList() {
        List<Integer> list = new ArrayList<>();
        int threshold = 4;

        boolean result = BelowThreshold.belowThreshold(list, threshold);

        assertTrue(result);
    }

    @Test(timeout = 8000)
    public void testBelowThresholdWithThresholdEqualToElement() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        int threshold = 3;

        boolean result = BelowThreshold.belowThreshold(list, threshold);

        assertFalse(result);
    }

    @Test(timeout = 8000)
    public void testBelowThresholdWithThresholdGreaterThanAllElements() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        int threshold = 5;

        boolean result = BelowThreshold.belowThreshold(list, threshold);

        assertTrue(result);
    }
}