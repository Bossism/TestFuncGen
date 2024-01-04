package original;
import org.junit.Test;
import static org.junit.Assert.*;

public class RightAngleTriangle_59_1Test {

    @Test(timeout = 8000)
    public void testRightAngleTriangle() {
        // Test case 1: right-angled triangle
        assertTrue(RightAngleTriangle.rightAngleTriangle(3, 4, 5));

        // Test case 2: not a right-angled triangle
        assertFalse(RightAngleTriangle.rightAngleTriangle(1, 2, 3));

        // Test case 3: right-angled triangle
        assertTrue(RightAngleTriangle.rightAngleTriangle(10, 6, 8));

        // Test case 4: not a right-angled triangle
        assertFalse(RightAngleTriangle.rightAngleTriangle(2, 2, 2));

        // Test case 5: right-angled triangle
        assertTrue(RightAngleTriangle.rightAngleTriangle(7, 24, 25));

        // Test case 6: not a right-angled triangle
        assertFalse(RightAngleTriangle.rightAngleTriangle(10, 5, 7));

        // Test case 7: right-angled triangle
        assertTrue(RightAngleTriangle.rightAngleTriangle(5, 12, 13));

        // Test case 8: right-angled triangle
        assertTrue(RightAngleTriangle.rightAngleTriangle(15, 8, 17));

        // Test case 9: right-angled triangle
        assertTrue(RightAngleTriangle.rightAngleTriangle(48, 55, 73));

        // Test case 10: not a right-angled triangle
        assertFalse(RightAngleTriangle.rightAngleTriangle(1, 1, 1));

        // Test case 11: not a right-angled triangle
        assertFalse(RightAngleTriangle.rightAngleTriangle(2, 2, 10));
    }
}