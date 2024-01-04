package original;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;

public class GetPositive_52_1Test {

    @Test(timeout = 8000)
    public void testGetPositive() {
        List<Object> input = new ArrayList<>();
        input.add(-5);
        input.add(10);
        input.add(0);
        input.add(7);
        input.add("hello");
        input.add(3.14);

        List<Object> expectedOutput = new ArrayList<>();
        expectedOutput.add(10);
        expectedOutput.add(7);

        List<Object> actualOutput = GetPositive.getPositive(input);

        assertEquals(expectedOutput, actualOutput);
    }
}