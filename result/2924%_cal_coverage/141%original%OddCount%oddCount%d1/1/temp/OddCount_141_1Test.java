package original;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;

public class OddCount_141_1Test {

    @Test(timeout = 8000)
    public void testOddCount() {
        List<String> input = new ArrayList<>();
        input.add("123");
        input.add("4567");
        input.add("89");

        List<String> expectedOutput = new ArrayList<>();
        expectedOutput.add("the number of odd elements 3 in the string 123 of the input.");
        expectedOutput.add("the number of odd elements 4 in the string 4567 of the input.");
        expectedOutput.add("the number of odd elements 2 in the string 89 of the input.");

        List<String> result = OddCount.oddCount(input);

        assertEquals(expectedOutput, result);
    }
}