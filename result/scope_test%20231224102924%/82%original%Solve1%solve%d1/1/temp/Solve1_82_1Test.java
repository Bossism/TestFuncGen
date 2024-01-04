package original;

import org.junit.Test;
import static org.junit.Assert.*;

public class Solve1_82_1Test {

    @Test(timeout = 8000)
    public void testSolve() {
        // Test case 1
        int n1 = 12345;
        String expected1 = "101";
        String result1 = Solve1.solve(n1);
        assertEquals(expected1, result1);

        // Test case 2
        int n2 = 987654321;
        String expected2 = "101";
        String result2 = Solve1.solve(n2);
        assertEquals(expected2, result2);

        // Test case 3
        int n3 = 0;
        String expected3 = "0";
        String result3 = Solve1.solve(n3);
        assertEquals(expected3, result3);
    }
}