package original;
import org.junit.Test;
import static org.junit.Assert.*;

public class TruncateNumber_113_1Test {

    @Test(timeout = 8000)
    public void testTruncateNumber() {
        // Test case 1: number = 3.5
        Double number1 = 3.5;
        Double expected1 = 0.5;
        Double result1 = TruncateNumber.truncateNumber(number1);
        assertEquals(expected1, result1);

        // Test case 2: number = 1.33
        Double number2 = 1.33;
        Double expected2 = 0.33;
        Double result2 = TruncateNumber.truncateNumber(number2);
        assertEquals(expected2, result2);

        // Test case 3: number = 123.456
        Double number3 = 123.456;
        Double expected3 = 0.456;
        Double result3 = TruncateNumber.truncateNumber(number3);
        assertEquals(expected3, result3);
    }
}