package original;

import org.junit.Test;
import static org.junit.Assert.*;

public class Digits_87_1Test {

    @Test(timeout = 8000)
    public void testDigitsWithSingleOddDigit() {
        int result = Digits.digits(5);
        assertEquals(5, result);
    }

    @Test(timeout = 8000)
    public void testDigitsWithSingleEvenDigit() {
        int result = Digits.digits(4);
        assertEquals(0, result);
    }

    @Test(timeout = 8000)
    public void testDigitsWithMultipleDigitsAndOddDigits() {
        int result = Digits.digits(235);
        assertEquals(15, result);
    }

    @Test(timeout = 8000)
    public void testDigitsWithMultipleDigitsAndNoOddDigits() {
        int result = Digits.digits(2468);
        assertEquals(0, result);
    }

    @Test(timeout = 8000)
    public void testDigitsWithMultipleDigitsAndOddDigitsInDifferentPositions() {
        int result = Digits.digits(98765);
        assertEquals(315, result);
    }

    @Test(timeout = 8000)
    public void testDigitsWithMultipleDigitsAndOddDigitsInDifferentPositions2() {
        int result = Digits.digits(5576543);
        assertEquals(2625, result);
    }

    @Test(timeout = 8000)
    public void testDigitsWithLeadingZeros() {
        int result = Digits.digits(120);
        assertEquals(1, result);
    }
}