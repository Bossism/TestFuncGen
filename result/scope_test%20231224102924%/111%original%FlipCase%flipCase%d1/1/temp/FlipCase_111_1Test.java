package original;
import org.junit.Test;
import static org.junit.Assert.*;

public class FlipCase_111_1Test {

    @Test(timeout = 8000)
    public void testFlipCase() {
        // Test with all lowercase letters
        String input1 = "hello";
        String expected1 = "HELLO";
        assertEquals(expected1, FlipCase.flipCase(input1));

        // Test with all uppercase letters
        String input2 = "WORLD";
        String expected2 = "world";
        assertEquals(expected2, FlipCase.flipCase(input2));

        // Test with mixed case letters
        String input3 = "HeLlO";
        String expected3 = "hElLo";
        assertEquals(expected3, FlipCase.flipCase(input3));

        // Test with empty string
        String input4 = "";
        String expected4 = "";
        assertEquals(expected4, FlipCase.flipCase(input4));
    }
}