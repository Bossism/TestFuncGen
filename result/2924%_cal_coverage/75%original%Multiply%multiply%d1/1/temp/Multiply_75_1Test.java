package original;
import org.junit.Test;
import static org.junit.Assert.*;

public class Multiply_75_1Test {

    @Test(timeout = 8000)
    public void testMultiplyPositiveNumbers() {
        int result = Multiply.multiply(5, 6);
        assertEquals(30, result);
    }

    @Test(timeout = 8000)
    public void testMultiplyNegativeNumbers() {
        int result = Multiply.multiply(-5, -6);
        assertEquals(30, result);
    }

    @Test(timeout = 8000)
    public void testMultiplyPositiveAndNegativeNumbers() {
        int result = Multiply.multiply(-5, 6);
        assertEquals(30, result);
    }

    @Test(timeout = 8000)
    public void testMultiplyZero() {
        int result = Multiply.multiply(0, 6);
        assertEquals(0, result);
    }

    @Test(timeout = 8000)
    public void testMultiplyNegativeZero() {
        int result = Multiply.multiply(0, -6);
        assertEquals(0, result);
    }
}