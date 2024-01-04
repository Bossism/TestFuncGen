package original;
import org.junit.Test;
import static org.junit.Assert.*;

public class Multiply_75_1Test {

    @Test(timeout = 8000)
    public void testMultiply() {
        // Test case 1
        int result1 = Multiply.multiply(148, 412);
        assertEquals(16, result1);

        // Test case 2
        int result2 = Multiply.multiply(19, 28);
        assertEquals(72, result2);

        // Test case 3
        int result3 = Multiply.multiply(2020, 1851);
        assertEquals(0, result3);

        // Test case 4
        int result4 = Multiply.multiply(14, -15);
        assertEquals(20, result4);

        // Test case 5
        int result5 = Multiply.multiply(76, 67);
        assertEquals(42, result5);

        // Test case 6
        int result6 = Multiply.multiply(17, 27);
        assertEquals(49, result6);

        // Test case 7
        int result7 = Multiply.multiply(0, 1);
        assertEquals(0, result7);

        // Test case 8
        int result8 = Multiply.multiply(0, 0);
        assertEquals(0, result8);
    }
}