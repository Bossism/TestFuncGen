package original;
import org.junit.Test;
import static org.junit.Assert.*;

public class CircularShift_144_1Test {

    @Test(timeout = 8000)
    public void testCircularShift_ShiftGreaterThanDigits() {
        String result = CircularShift.circularShift(100, 2);
        assertEquals("001", result);
    }

    @Test(timeout = 8000)
    public void testCircularShift_ShiftEqualsDigits() {
        String result = CircularShift.circularShift(12, 2);
        assertEquals("12", result);
    }

    @Test(timeout = 8000)
    public void testCircularShift_ShiftLessThanDigits() {
        String result = CircularShift.circularShift(97, 8);
        assertEquals("79", result);
    }

    @Test(timeout = 8000)
    public void testCircularShift_ShiftLessThanDigits2() {
        String result = CircularShift.circularShift(12, 1);
        assertEquals("21", result);
    }

    @Test(timeout = 8000)
    public void testCircularShift_ShiftGreaterThanDigits2() {
        String result = CircularShift.circularShift(11, 101);
        assertEquals("11", result);
    }
}