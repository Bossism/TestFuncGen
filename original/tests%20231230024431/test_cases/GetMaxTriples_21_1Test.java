package original;
import org.junit.Test;
import static org.junit.Assert.*;

public class GetMaxTriples_21_1Test {

    @Test(timeout = 8000)
    public void testGetMaxTriples() {
        // Test case 1
        int result1 = GetMaxTriples.getMaxTriples(5);
        assertEquals(1, result1);

        // Test case 2
        int result2 = GetMaxTriples.getMaxTriples(6);
        assertEquals(4, result2);

        // Test case 3
        int result3 = GetMaxTriples.getMaxTriples(10);
        assertEquals(36, result3);

        // Test case 4
        int result4 = GetMaxTriples.getMaxTriples(100);
        assertEquals(53361, result4);
    }
}