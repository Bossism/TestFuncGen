package original;

import org.junit.Test;
import static org.junit.Assert.*;

public class AntiShuffle_17_1Test {

    @Test(timeout = 8000)
    public void testSortString() {
        // Test case 1: Single word
        String input1 = "Hi";
        String expected1 = "Hi";
        String result1 = AntiShuffle.antiShuffle(input1);
        assertEquals(expected1, result1);

        // Test case 2: Single word with shuffled characters
        String input2 = "hello";
        String expected2 = "ehllo";
        String result2 = AntiShuffle.antiShuffle(input2);
        assertEquals(expected2, result2);

        // Test case 3: Multiple words with shuffled characters
        String input3 = "Hello World!!!";
        String expected3 = "Hello !!!Wdlor";
        String result3 = AntiShuffle.antiShuffle(input3);
        assertEquals(expected3, result3);

        // Test case 4: Empty string
        String input4 = "";
        String expected4 = "";
        String result4 = AntiShuffle.antiShuffle(input4);
        assertEquals(expected4, result4);

        // Test case 5: String with special characters and spaces
        String input5 = "Hi. My name is Mister Robot. How are you?";
        String expected5 = ".Hi My aemn is Meirst .Rboot How aer ?ouy";
        String result5 = AntiShuffle.antiShuffle(input5);
        assertEquals(expected5, result5);
    }
}