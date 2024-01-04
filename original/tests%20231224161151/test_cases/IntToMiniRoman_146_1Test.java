package original;

import org.junit.Test;
import static org.junit.Assert.*;

public class IntToMiniRoman_146_1Test {

    @Test(timeout = 8000)
    public void testIntToMiniRoman() {
        assertEquals("M", IntToMiniRoman.intToMiniRoman(1000));
        assertEquals("CM", IntToMiniRoman.intToMiniRoman(900));
        assertEquals("D", IntToMiniRoman.intToMiniRoman(500));
        assertEquals("CD", IntToMiniRoman.intToMiniRoman(400));
        assertEquals("C", IntToMiniRoman.intToMiniRoman(100));
        assertEquals("XC", IntToMiniRoman.intToMiniRoman(90));
        assertEquals("L", IntToMiniRoman.intToMiniRoman(50));
        assertEquals("XL", IntToMiniRoman.intToMiniRoman(40));
        assertEquals("X", IntToMiniRoman.intToMiniRoman(10));
        assertEquals("IX", IntToMiniRoman.intToMiniRoman(9));
        assertEquals("V", IntToMiniRoman.intToMiniRoman(5));
        assertEquals("IV", IntToMiniRoman.intToMiniRoman(4));
        assertEquals("I", IntToMiniRoman.intToMiniRoman(1));
    }
}