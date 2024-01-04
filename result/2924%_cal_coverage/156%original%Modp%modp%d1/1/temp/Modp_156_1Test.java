package original;

import org.junit.Test;
import static org.junit.Assert.*;

public class Modp_156_1Test {

    @Test(timeout = 8000)
    public void testModp() {
        // Test case 1
        int result1 = Modp.modp(5, 7);
        assertEquals(4, result1);

        // Test case 2
        int result2 = Modp.modp(10, 13);
        assertEquals(10, result2);

        // Test case 3
        int result3 = Modp.modp(0, 5);
        assertEquals(1, result3);
    }
}