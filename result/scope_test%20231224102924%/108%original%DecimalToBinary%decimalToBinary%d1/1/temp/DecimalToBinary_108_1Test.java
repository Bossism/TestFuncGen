package original;

import org.junit.Test;
import static org.junit.Assert.*;

public class DecimalToBinary_108_1Test {

    @Test(timeout = 8000)
    public void testDecimalToBinaryWithZero() {
        int decimal = 0;
        String expected = "db0db";
        String actual = DecimalToBinary.decimalToBinary(decimal);
        assertEquals(expected, actual);
    }

    @Test(timeout = 8000)
    public void testDecimalToBinaryWithPositiveNumber() {
        int decimal = 10;
        String expected = "db1010db";
        String actual = DecimalToBinary.decimalToBinary(decimal);
        assertEquals(expected, actual);
    }

    @Test(timeout = 8000)
    public void testDecimalToBinaryWithNegativeNumber() {
        int decimal = -5;
        String expected = "db-101db";
        String actual = DecimalToBinary.decimalToBinary(decimal);
        assertEquals(expected, actual);
    }
}