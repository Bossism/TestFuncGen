package original;

import org.junit.Test;
import static org.junit.Assert.*;

public class FizzBuzz_80_1Test {

    @Test(timeout = 8000)
    public void testFizzBuzz() {
        // Test case 1: n = 20
        int result1 = FizzBuzz.fizzBuzz(20);
        assertEquals(0, result1);

        // Test case 2: n = 100
        int result2 = FizzBuzz.fizzBuzz(100);
        assertEquals(1, result2);

        // Test case 3: n = 200
        int result3 = FizzBuzz.fizzBuzz(200);
        assertEquals(2, result3);
    }
}