package original;

import org.junit.Test;
import static org.junit.Assert.*;

public class FixSpaces_26_1Test {

    @Test(timeout = 8000)
    public void testFixSpaces() {
        String input = "a  b   c    d";
        String expectedOutput = "a-b-c-d";
        String actualOutput = FixSpaces.fixSpaces(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test(timeout = 8000)
    public void testFixSpaces_NoSpaces() {
        String input = "abcd";
        String expectedOutput = "abcd";
        String actualOutput = FixSpaces.fixSpaces(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test(timeout = 8000)
    public void testFixSpaces_SingleSpace() {
        String input = "a b c d";
        String expectedOutput = "a_b_c_d";
        String actualOutput = FixSpaces.fixSpaces(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test(timeout = 8000)
    public void testFixSpaces_MultipleSpaces() {
        String input = "a   b    c     d";
        String expectedOutput = "a-b-c-d";
        String actualOutput = FixSpaces.fixSpaces(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test(timeout = 8000)
    public void testFixSpaces_StartsWithSpace() {
        String input = " a b c d";
        String expectedOutput = "-a_b_c_d";
        String actualOutput = FixSpaces.fixSpaces(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test(timeout = 8000)
    public void testFixSpaces_EndsWithSpace() {
        String input = "a b c d ";
        String expectedOutput = "a_b_c_d";
        String actualOutput = FixSpaces.fixSpaces(input);
        assertEquals(expectedOutput, actualOutput);
    }
}