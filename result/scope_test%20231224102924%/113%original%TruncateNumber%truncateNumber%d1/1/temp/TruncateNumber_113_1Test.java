package original;
import org.junit.Test;
import static org.junit.Assert.*;

public class TruncateNumber_113_1Test {

    @Test(timeout = 8000)
    public void testTruncateNumber() {
        // Test case 1: Positive number
        Double number1 = 3.14159;
        Double expected1 = 0.142;
        Double result1 = TruncateNumber.truncateNumber(number1);
        assertEquals(expected1, result1, 0.001);

        // Test case 2: Negative number
        Double number2 = -2.71828;
        Double expected2 = 0.282;
        Double result2 = TruncateNumber.truncateNumber(number2);
        assertEquals(expected2, result2, 0.001);

        // Test case 3: Zero
        Double number3 = 0.0;
        Double expected3 = 0.0;
        Double result3 = TruncateNumber.truncateNumber(number3);
        assertEquals(expected3, result3, 0.001);
    }
}