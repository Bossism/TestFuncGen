package original;
import org.junit.Test;
import static org.junit.Assert.*;

public class AntiShuffle_16_1Test {

    @Test(timeout = 8000)
    public void testAntiShuffle() {
        // Test case 1: Single word input
        String input1 = "Hi";
        String expectedOutput1 = "Hi";
        assertEquals(expectedOutput1, AntiShuffle.antiShuffle(input1));

        // Test case 2: Single word input with characters in descending order
        String input2 = "hello";
        String expectedOutput2 = "ehllo";
        assertEquals(expectedOutput2, AntiShuffle.antiShuffle(input2));

        // Test case 3: Multiple words input with special characters
        String input3 = "Hello World!!!";
        String expectedOutput3 = "Hello !!!Wdlor";
        assertEquals(expectedOutput3, AntiShuffle.antiShuffle(input3));

        // Test case 4: Single word input with characters in ascending order
        String input4 = "number";
        String expectedOutput4 = "bemnru";
        assertEquals(expectedOutput4, AntiShuffle.antiShuffle(input4));

        // Test case 5: Single word input with characters in alphabetical order
        String input5 = "abcd";
        String expectedOutput5 = "abcd";
        assertEquals(expectedOutput5, AntiShuffle.antiShuffle(input5));

        // Test case 6: Empty input
        String input6 = "";
        String expectedOutput6 = "";
        assertEquals(expectedOutput6, AntiShuffle.antiShuffle(input6));

        // Test case 7: Multiple words input with special characters and spaces
        String input7 = "Hi. My name is Mister Robot. How are you?";
        String expectedOutput7 = ".Hi My aemn is Meirst .Rboot How aer ?ouy";
        assertEquals(expectedOutput7, AntiShuffle.antiShuffle(input7));
    }
}