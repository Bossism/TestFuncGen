package original;
import java.util.Arrays;

import org.junit.Test;
import static org.junit.Assert.*;

public class AntiShuffle_16_1Test {

    @Test(timeout = 8000)
    public void testAntiShuffle() {
        String input = "hello world";
        String expectedOutput = "ehllo dlrow";

        String actualOutput = AntiShuffle.antiShuffle(input);

        assertEquals(expectedOutput, actualOutput);
    }

    @Test(timeout = 8000)
    public void testAntiShuffleWithEmptyString() {
        String input = "";
        String expectedOutput = "";

        String actualOutput = AntiShuffle.antiShuffle(input);

        assertEquals(expectedOutput, actualOutput);
    }

    @Test(timeout = 8000)
    public void testAntiShuffleWithSingleWord() {
        String input = "hello";
        String expectedOutput = "ehllo";

        String actualOutput = AntiShuffle.antiShuffle(input);

        assertEquals(expectedOutput, actualOutput);
    }

    @Test(timeout = 8000)
    public void testAntiShuffleWithMultipleWords() {
        String input = "hello world how are you";
        String expectedOutput = "ehllo dlrow woh era uoy";

        String actualOutput = AntiShuffle.antiShuffle(input);

        assertEquals(expectedOutput, actualOutput);
    }
}