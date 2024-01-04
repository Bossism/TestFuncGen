package original;
import org.junit.Test;
import static org.junit.Assert.*;

public class RightAngleTriangle_59_1Test {

    @Test(timeout = 8000)
    public void testRightAngleTriangle() {
        // Test case 1: a = 3, b = 4, c = 5 (Pythagorean triple)
        assertTrue(RightAngleTriangle.rightAngleTriangle(3, 4, 5));

        // Test case 2: a = 5, b = 12, c = 13 (Pythagorean triple)
        assertTrue(RightAngleTriangle.rightAngleTriangle(5, 12, 13));

        // Test case 3: a = 8, b = 15, c = 17 (Pythagorean triple)
        assertTrue(RightAngleTriangle.rightAngleTriangle(8, 15, 17));

        // Test case 4: a = 5, b = 5, c = 5 (not a right angle triangle)
        assertFalse(RightAngleTriangle.rightAngleTriangle(5, 5, 5));

        // Test case 5: a = 3, b = 4, c = 6 (not a right angle triangle)
        assertFalse(RightAngleTriangle.rightAngleTriangle(3, 4, 6));
    }
}