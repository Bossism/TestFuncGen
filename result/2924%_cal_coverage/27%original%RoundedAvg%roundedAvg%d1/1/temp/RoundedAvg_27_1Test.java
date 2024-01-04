package original;

import org.junit.Test;
import static org.junit.Assert.*;

public class RoundedAvg_27_1Test {

    @Test(timeout = 8000)
    public void testRoundedAvg() {
        // Test case 1: n = 1, m = 5
        Object result1 = RoundedAvg.roundedAvg(1, 5);
        assertEquals("0b101", result1);

        // Test case 2: n = 0, m = 10
        Object result2 = RoundedAvg.roundedAvg(0, 10);
        assertEquals("0b101", result2);

        // Test case 3: n = 5, m = 5
        Object result3 = RoundedAvg.roundedAvg(5, 5);
        assertEquals("0b101", result3);

        // Test case 4: n = 10, m = 5
        Object result4 = RoundedAvg.roundedAvg(10, 5);
        assertEquals(-1, result4);
    }
}