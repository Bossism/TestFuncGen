package original;
import org.junit.Test;
import static org.junit.Assert.*;

public class CountUpper_170_1Test {

    @Test(timeout = 8000)
    public void testCountUpper() {
        // Test case 1: countUpper('aBCdEf') returns 1
        assertEquals(1, CountUpper.countUpper("aBCdEf"));

        // Test case 2: countUpper('abcdefg') returns 0
        assertEquals(0, CountUpper.countUpper("abcdefg"));

        // Test case 3: countUpper('dBBE') returns 0
        assertEquals(0, CountUpper.countUpper("dBBE"));

        // Test case 4: countUpper("") returns 0
        assertEquals(0, CountUpper.countUpper(""));

        // Test case 5: countUpper("EEEE") returns 2
        assertEquals(2, CountUpper.countUpper("EEEE"));
    }
}