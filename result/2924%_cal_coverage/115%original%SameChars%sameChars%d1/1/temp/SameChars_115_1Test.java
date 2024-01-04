package original;
import org.junit.Test;
import static org.junit.Assert.*;

public class SameChars_115_1Test {

    @Test(timeout = 8000)
    public void testSameChars() {
        assertTrue(SameChars.sameChars("abc", "cba"));
        assertTrue(SameChars.sameChars("hello", "olleh"));
        assertFalse(SameChars.sameChars("abc", "def"));
        assertFalse(SameChars.sameChars("hello", "world"));
    }
}