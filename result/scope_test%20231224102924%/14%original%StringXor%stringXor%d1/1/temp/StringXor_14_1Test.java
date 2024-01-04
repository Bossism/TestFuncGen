package original;

import org.junit.Test;
import static org.junit.Assert.*;

public class StringXor_14_1Test {

    @Test(timeout = 8000)
    public void testStringXor() {
        String a = "101010";
        String b = "110011";
        String expected = "011001";
        String result = StringXor.stringXor(a, b);
        assertEquals(expected, result);
    }

    @Test(timeout = 8000)
    public void testStringXorWithEmptyStrings() {
        String a = "";
        String b = "";
        String expected = "";
        String result = StringXor.stringXor(a, b);
        assertEquals(expected, result);
    }

    @Test(timeout = 8000)
    public void testStringXorWithDifferentLengths() {
        String a = "101010";
        String b = "1100";
        String expected = "";
        String result = StringXor.stringXor(a, b);
        assertEquals(expected, result);
    }

    @Test(timeout = 8000)
    public void testStringXorWithNullStrings() {
        String a = null;
        String b = null;
        String expected = null;
        try {
            String result = StringXor.stringXor(a, b);
            assertNull(result);
        } catch (NullPointerException e) {
            assertNull(a);
            assertNull(b);
        }
    }
}