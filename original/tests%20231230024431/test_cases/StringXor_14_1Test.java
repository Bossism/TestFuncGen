package original;
import org.junit.Test;
import static org.junit.Assert.*;

public class StringXor_14_1Test {

    @Test(timeout = 8000)
    public void testStringXor() {
        // Test case 1
        String a1 = "010";
        String b1 = "110";
        String expected1 = "100";
        String result1 = StringXor.stringXor(a1, b1);
        assertEquals(expected1, result1);

        // Test case 2
        String a2 = "111000";
        String b2 = "101010";
        String expected2 = "010010";
        String result2 = StringXor.stringXor(a2, b2);
        assertEquals(expected2, result2);

        // Test case 3
        String a3 = "1";
        String b3 = "1";
        String expected3 = "0";
        String result3 = StringXor.stringXor(a3, b3);
        assertEquals(expected3, result3);

        // Test case 4
        String a4 = "0101";
        String b4 = "0000";
        String expected4 = "0101";
        String result4 = StringXor.stringXor(a4, b4);
        assertEquals(expected4, result4);
    }
}