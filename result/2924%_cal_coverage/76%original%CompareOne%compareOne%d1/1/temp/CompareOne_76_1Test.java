package original;
import org.junit.Test;
import static org.junit.Assert.*;

public class CompareOne_76_1Test {

    @Test(timeout = 8000)
    public void testCompareOne() {
        // Test case 1: a and b are equal
        Object a1 = 10;
        Object b1 = 10;
        assertNull(CompareOne.compareOne(a1, b1));

        // Test case 2: a is greater than b
        Object a2 = 20;
        Object b2 = 10;
        assertEquals(a2, CompareOne.compareOne(a2, b2));

        // Test case 3: b is greater than a
        Object a3 = 10;
        Object b3 = 20;
        assertEquals(b3, CompareOne.compareOne(a3, b3));

        // Test case 4: a and b are strings with equal float values
        Object a4 = "10.0";
        Object b4 = "10,0";
        assertNull(CompareOne.compareOne(a4, b4));

        // Test case 5: a is a string with greater float value than b
        Object a5 = "20.0";
        Object b5 = "10,0";
        assertEquals(a5, CompareOne.compareOne(a5, b5));

        // Test case 6: b is a string with greater float value than a
        Object a6 = "10.0";
        Object b6 = "20,0";
        assertEquals(b6, CompareOne.compareOne(a6, b6));
    }
}