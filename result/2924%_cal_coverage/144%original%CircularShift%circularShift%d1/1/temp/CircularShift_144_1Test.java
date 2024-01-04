package original;
import org.junit.Test;
import static org.junit.Assert.*;

public class CircularShift_144_1Test {

    @Test(timeout = 8000)
    public void testCircularShift_ShiftGreaterThanLength() {
        int x = 12345;
        int shift = 6;
        String expected = "54321";
        String result = CircularShift.circularShift(x, shift);
        assertEquals(expected, result);
    }

    @Test(timeout = 8000)
    public void testCircularShift_ShiftLessThanOrEqualToLength() {
        int x = 12345;
        int shift = 2;
        String expected = "45123";
        String result = CircularShift.circularShift(x, shift);
        assertEquals(expected, result);
    }
}