package original;
import org.junit.Test;
import static org.junit.Assert.*;

public class FizzBuzz_80_1Test {

    @Test(timeout = 8000)
    public void testFizzBuzz() {
        // Test case 1: n = 50
        assertEquals(0, FizzBuzz.fizzBuzz(50));

        // Test case 2: n = 78
        assertEquals(2, FizzBuzz.fizzBuzz(78));

        // Test case 3: n = 79
        assertEquals(3, FizzBuzz.fizzBuzz(79));

        // Test case 4: n = 100
        assertEquals(3, FizzBuzz.fizzBuzz(100));

        // Test case 5: n = 200
        assertEquals(6, FizzBuzz.fizzBuzz(200));

        // Test case 6: n = 4000
        assertEquals(192, FizzBuzz.fizzBuzz(4000));

        // Test case 7: n = 10000
        assertEquals(639, FizzBuzz.fizzBuzz(10000));

        // Test case 8: n = 100000
        assertEquals(8026, FizzBuzz.fizzBuzz(100000));
    }
}