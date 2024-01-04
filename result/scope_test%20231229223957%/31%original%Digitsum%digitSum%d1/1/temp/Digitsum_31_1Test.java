package original;

import org.junit.Test;
import static org.junit.Assert.*;

public class Digitsum_31_1Test {

    @Test(timeout = 8000)
    public void testDigitSum_emptyString() {
        int result = Digitsum.digitSum("");
        assertEquals(0, result);
    }

    @Test(timeout = 8000)
    public void testDigitSum_onlyLowercase() {
        int result = Digitsum.digitSum("abc");
        assertEquals(0, result);
    }

    @Test(timeout = 8000)
    public void testDigitSum_onlyUppercase() {
        int result = Digitsum.digitSum("ABCD");
        assertEquals(326, result);
    }

    @Test(timeout = 8000)
    public void testDigitSum_mixedCase() {
        int result = Digitsum.digitSum("aAbBcCdD");
        assertEquals(326, result);
    }

    @Test(timeout = 8000)
    public void testDigitSum_specialCharacters() {
        int result = Digitsum.digitSum("!@#$%^&*()");
        assertEquals(0, result);
    }

    @Test(timeout = 8000)
    public void testDigitSum_numbers() {
        int result = Digitsum.digitSum("1234567890");
        assertEquals(0, result);
    }

    @Test(timeout = 8000)
    public void testDigitSum_mixedCaseWithNumbers() {
        int result = Digitsum.digitSum("aA1bB2cC3dD4");
        assertEquals(326, result);
    }
}