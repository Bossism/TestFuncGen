package original;
import org.junit.Test;
import static org.junit.Assert.*;

public class StringSequence_74_1Test {

    @Test(timeout = 8000)
    public void testStringSequenceWithZero() {
        String expected = "0";
        String actual = StringSequence.stringSequence(0);
        assertEquals(expected, actual);
    }

    @Test(timeout = 8000)
    public void testStringSequenceWithPositiveNumber() {
        String expected = "0 1 2 3 4 5";
        String actual = StringSequence.stringSequence(5);
        assertEquals(expected, actual);
    }

    @Test(timeout = 8000)
    public void testStringSequenceWithNegativeNumber() {
        String expected = "";
        String actual = StringSequence.stringSequence(-5);
        assertEquals(expected, actual);
    }

    @Test(timeout = 8000)
    public void testStringSequenceWithLargeNumber() {
        String expected = "0 1 2 3 4 5 6 7 8 9 10";
        String actual = StringSequence.stringSequence(10);
        assertEquals(expected, actual);
    }
}