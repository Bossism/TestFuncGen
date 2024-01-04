package original;

import org.junit.Test;
import static org.junit.Assert.*;

public class IsBored_137_1Test {

    @Test(timeout = 8000)
    public void testIsBored() {
        String s = "I am bored. Are you bored? I am not bored!";
        int expectedCount = 2;
        int actualCount = IsBored.isBored(s);
        assertEquals(expectedCount, actualCount);
    }

    @Test(timeout = 8000)
    public void testIsBored_NoBoredOccurrences() {
        String s = "This is a test sentence.";
        int expectedCount = 0;
        int actualCount = IsBored.isBored(s);
        assertEquals(expectedCount, actualCount);
    }

    @Test(timeout = 8000)
    public void testIsBored_EmptyString() {
        String s = "";
        int expectedCount = 0;
        int actualCount = IsBored.isBored(s);
        assertEquals(expectedCount, actualCount);
    }

    @Test(timeout = 8000)
    public void testIsBored_NullString() {
        String s = null;
        int expectedCount = 0;
        int actualCount = IsBored.isBored(s);
        assertEquals(expectedCount, actualCount);
    }

    @Test(timeout = 8000)
    public void testIsBored_MultipleBoredOccurrences() {
        String s = "I am bored. Are you bored? I am bored too!";
        int expectedCount = 2;
        int actualCount = IsBored.isBored(s);
        assertEquals(expectedCount, actualCount);
    }
}