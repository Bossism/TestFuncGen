package original;
import org.junit.Test;
import static org.junit.Assert.*;

public class Fibfib_8_1Test {

    @Test(timeout = 8000)
    public void testFibfib() {
        // Test case 1: n = 0
        assertEquals(0, Fibfib.fibfib(0));

        // Test case 2: n = 1
        assertEquals(0, Fibfib.fibfib(1));

        // Test case 3: n = 2
        assertEquals(1, Fibfib.fibfib(2));

        // Test case 4: n = 3
        assertEquals(1, Fibfib.fibfib(3));

        // Test case 5: n = 4
        assertEquals(2, Fibfib.fibfib(4));

        // Test case 6: n = 5
        assertEquals(4, Fibfib.fibfib(5));

        // Test case 7: n = 6
        assertEquals(7, Fibfib.fibfib(6));

        // Test case 8: n = 7
        assertEquals(13, Fibfib.fibfib(7));
    }
}