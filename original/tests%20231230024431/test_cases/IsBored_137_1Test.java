package original;
import org.junit.Test;
import static org.junit.Assert.*;

public class IsBored_137_1Test {

    @Test(timeout = 8000)
    public void testIsBored_noBoredoms() {
        String s = "Hello world";
        int expected = 0;
        int actual = IsBored.isBored(s);
        assertEquals(expected, actual);
    }

    @Test(timeout = 8000)
    public void testIsBored_oneBoredom() {
        String s = "The sky is blue. The sun is shining. I love this weather";
        int expected = 1;
        int actual = IsBored.isBored(s);
        assertEquals(expected, actual);
    }

    @Test(timeout = 8000)
    public void testIsBored_multipleBoredoms() {
        String s = "I feel good today. I will be productive. will kill It";
        int expected = 2;
        int actual = IsBored.isBored(s);
        assertEquals(expected, actual);
    }

    @Test(timeout = 8000)
    public void testIsBored_noBoredomsWithQuestionMark() {
        String s = "Is the sky blue?";
        int expected = 0;
        int actual = IsBored.isBored(s);
        assertEquals(expected, actual);
    }

    @Test(timeout = 8000)
    public void testIsBored_oneBoredomWithExclamationMark() {
        String s = "I love It !";
        int expected = 1;
        int actual = IsBored.isBored(s);
        assertEquals(expected, actual);
    }

    @Test(timeout = 8000)
    public void testIsBored_noBoredomsWithSingleWord() {
        String s = "bIt";
        int expected = 0;
        int actual = IsBored.isBored(s);
        assertEquals(expected, actual);
    }

    @Test(timeout = 8000)
    public void testIsBored_noBoredomsWithMultipleSentences() {
        String s = "You and I are going for a walk";
        int expected = 0;
        int actual = IsBored.isBored(s);
        assertEquals(expected, actual);
    }
}