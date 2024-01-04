package original;
import org.junit.Test;
import static org.junit.Assert.*;

public class SumToN_136_1Test {

    @Test(timeout = 8000)
    public void testSumToN() {
        // Test case 1: n = 5
        int result1 = SumToN.sumToN(5);
        assertEquals(15, result1);

        // Test case 2: n = 10
        int result2 = SumToN.sumToN(10);
        assertEquals(55, result2);

        // Test case 3: n = 1
        int result3 = SumToN.sumToN(1);
        assertEquals(1, result3);

        // Test case 4: n = 6
        int result4 = SumToN.sumToN(6);
        assertEquals(21, result4);

        // Test case 5: n = 11
        int result5 = SumToN.sumToN(11);
        assertEquals(66, result5);

        // Test case 6: n = 30
        int result6 = SumToN.sumToN(30);
        assertEquals(465, result6);

        // Test case 7: n = 100
        int result7 = SumToN.sumToN(100);
        assertEquals(5050, result7);
    }
}