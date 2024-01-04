package original;

import org.junit.Test;
import static org.junit.Assert.*;

public class CompareOne_76_1Test {

    @Test(timeout = 8000)
    public void testCompareOneWithIntegers() {
        Object result = CompareOne.compareOne(1, 2);
        assertEquals(2, result);
    }

    @Test(timeout = 8000)
    public void testCompareOneWithFloats() {
        Object result = CompareOne.compareOne(1, 2.5);
        assertEquals(2.5, result);
    }

    @Test(timeout = 8000)
    public void testCompareOneWithStrings() {
        Object result = CompareOne.compareOne("1", "2");
        assertEquals("2", result);
    }

    @Test(timeout = 8000)
    public void testCompareOneWithEqualValues() {
        Object result = CompareOne.compareOne(1, 1);
        assertNull(result);
    }

    @Test(timeout = 8000)
    public void testCompareOneWithCommaFloatString() {
        Object result = CompareOne.compareOne(1, "2,3");
        assertEquals("2,3", result);
    }

    @Test(timeout = 8000)
    public void testCompareOneWithCommaFloatStringAndInteger() {
        Object result = CompareOne.compareOne("5,1", "6");
        assertEquals("6", result);
    }
}