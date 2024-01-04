package original;

import org.junit.Test;
import static org.junit.Assert.*;

public class IsHappy_107_1Test {

    @Test(timeout = 8000)
    public void testIsHappyWithShortString() {
        assertFalse(IsHappy.isHappy("a"));
        assertFalse(IsHappy.isHappy("aa"));
    }

    @Test(timeout = 8000)
    public void testIsHappyWithDistinctConsecutiveLetters() {
        assertTrue(IsHappy.isHappy("abcd"));
        assertTrue(IsHappy.isHappy("adb"));
        assertTrue(IsHappy.isHappy("iopaxpoi"));
    }

    @Test(timeout = 8000)
    public void testIsHappyWithNonDistinctConsecutiveLetters() {
        assertFalse(IsHappy.isHappy("aabb"));
        assertFalse(IsHappy.isHappy("xyy"));
        assertFalse(IsHappy.isHappy("iopaxioi"));
    }

    @Test(timeout = 8000)
    public void testIsHappyWithEmptyString() {
        assertFalse(IsHappy.isHappy(""));
    }

    @Test(timeout = 8000)
    public void testIsHappyWithNullString() {
        assertFalse(IsHappy.isHappy(null));
    }
}