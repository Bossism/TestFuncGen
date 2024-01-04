package original;
import org.junit.Test;
import static org.junit.Assert.*;

public class HowManyTimes_88_1Test {

    @Test(timeout = 8000)
    public void testHowManyTimes_emptyString() {
        int result = HowManyTimes.howManyTimes("", "a");
        assertEquals(0, result);
    }

    @Test(timeout = 8000)
    public void testHowManyTimes_singleCharacterSubstring() {
        int result = HowManyTimes.howManyTimes("aaa", "a");
        assertEquals(3, result);
    }

    @Test(timeout = 8000)
    public void testHowManyTimes_multipleCharacterSubstring() {
        int result = HowManyTimes.howManyTimes("aaaa", "aa");
        assertEquals(3, result);
    }

    @Test(timeout = 8000)
    public void testHowManyTimes_emptyStringWithDifferentSubstring() {
        int result = HowManyTimes.howManyTimes("", "x");
        assertEquals(0, result);
    }

    @Test(timeout = 8000)
    public void testHowManyTimes_multipleOccurrences() {
        int result = HowManyTimes.howManyTimes("xyxyxyx", "x");
        assertEquals(4, result);
    }

    @Test(timeout = 8000)
    public void testHowManyTimes_overlappingOccurrences() {
        int result = HowManyTimes.howManyTimes("cacacacac", "cac");
        assertEquals(4, result);
    }

    @Test(timeout = 8000)
    public void testHowManyTimes_singleOccurrence() {
        int result = HowManyTimes.howManyTimes("john doe", "john");
        assertEquals(1, result);
    }
}