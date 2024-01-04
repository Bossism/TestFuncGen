package original;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

public class WillItFly_145_1Test {

    @Test(timeout = 8000)
    public void testWillItFly_balancedAndSumLessThanMaxWeight_returnsTrue() {
        List<Integer> q = Arrays.asList(3, 2, 3);
        int w = 9;
        assertTrue(WillItFly.willItFly(q, w));
    }

    @Test(timeout = 8000)
    public void testWillItFly_unbalanced_returnsFalse() {
        List<Integer> q = Arrays.asList(1, 2);
        int w = 5;
        assertFalse(WillItFly.willItFly(q, w));
    }

    @Test(timeout = 8000)
    public void testWillItFly_sumGreaterThanMaxWeight_returnsFalse() {
        List<Integer> q = Arrays.asList(3, 2, 3);
        int w = 1;
        assertFalse(WillItFly.willItFly(q, w));
    }

    @Test(timeout = 8000)
    public void testWillItFly_singleElementList_returnsTrue() {
        List<Integer> q = Arrays.asList(3);
        int w = 5;
        assertTrue(WillItFly.willItFly(q, w));
    }

    @Test(timeout = 8000)
    public void testWillItFly_emptyList_returnsTrue() {
        List<Integer> q = Arrays.asList();
        int w = 5;
        assertTrue(WillItFly.willItFly(q, w));
    }

    @Test(timeout = 8000)
    public void testWillItFly_palindromicListWithSumEqualToMaxWeight_returnsTrue() {
        List<Integer> q = Arrays.asList(1, 2, 1);
        int w = 4;
        assertTrue(WillItFly.willItFly(q, w));
    }

    @Test(timeout = 8000)
    public void testWillItFly_palindromicListWithSumGreaterThanMaxWeight_returnsFalse() {
        List<Integer> q = Arrays.asList(1, 2, 1);
        int w = 3;
        assertFalse(WillItFly.willItFly(q, w));
    }
}