package original;
import org.junit.Test;
import static org.junit.Assert.*;

public class DecimalToBinary_108_1Test {

    @Test(timeout = 8000)
    public void testDecimalToBinaryWithZero() {
        assertEquals("db0db", DecimalToBinary.decimalToBinary(0));
    }

    @Test(timeout = 8000)
    public void testDecimalToBinaryWithPositiveNumber() {
        assertEquals("db1111db", DecimalToBinary.decimalToBinary(15));
        assertEquals("db100000db", DecimalToBinary.decimalToBinary(32));
        assertEquals("db1100111db", DecimalToBinary.decimalToBinary(103));
    }
}