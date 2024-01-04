package original;

import org.junit.Test;
import static org.junit.Assert.*;

public class ChangeBase_122_1Test {

    @Test(timeout = 8000)
    public void testChangeBase() {
        // Test case 1: x = 10, base = 2
        int x1 = 10;
        int base1 = 2;
        String expected1 = "1010";
        String result1 = ChangeBase.changeBase(x1, base1);
        assertEquals(expected1, result1);

        // Test case 2: x = 15, base = 16
        int x2 = 15;
        int base2 = 16;
        String expected2 = "F";
        String result2 = ChangeBase.changeBase(x2, base2);
        assertEquals(expected2, result2.toUpperCase());

        // Test case 3: x = 100, base = 10
        int x3 = 100;
        int base3 = 10;
        String expected3 = "100";
        String result3 = ChangeBase.changeBase(x3, base3);
        assertEquals(expected3, result3);
    }
}