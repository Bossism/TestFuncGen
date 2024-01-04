package original;
import org.junit.Test;
import static org.junit.Assert.*;

public class SumToN_136_1Test {

    @Test(timeout = 8000)
    public void testSumToN() {
        // Test case 1: n = 0
        int result1 = SumToN.sumToN(0);
        assertEquals(0, result1);

        // Test case 2: n = 1
        int result2 = SumToN.sumToN(1);
        assertEquals(1, result2);

        // Test case 3: n = 5
        int result3 = SumToN.sumToN(5);
        assertEquals(15, result3);

        // Test case 4: n = 10
        int result4 = SumToN.sumToN(10);
        assertEquals(55, result4);
    }
}