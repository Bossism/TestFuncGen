package original;
import org.junit.Test;
import static org.junit.Assert.*;

public class Modp_156_1Test {

    @Test(timeout = 8000)
    public void testModp() {
        // Test case 1
        int result1 = Modp.modp(3, 5);
        assertEquals(3, result1);

        // Test case 2
        int result2 = Modp.modp(1101, 101);
        assertEquals(2, result2);

        // Test case 3
        int result3 = Modp.modp(0, 101);
        assertEquals(1, result3);

        // Test case 4
        int result4 = Modp.modp(3, 11);
        assertEquals(8, result4);

        // Test case 5
        int result5 = Modp.modp(100, 101);
        assertEquals(1, result5);

        // Test case 6
        int result6 = Modp.modp(30, 5);
        assertEquals(4, result6);

        // Test case 7
        int result7 = Modp.modp(31, 5);
        assertEquals(3, result7);
    }
}