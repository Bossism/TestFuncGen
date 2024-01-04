package original;
import org.junit.Test;
import static org.junit.Assert.*;

public class Solve1_82_1Test {

    @Test(timeout = 8000)
    public void testSolve() {
        // Test case 1
        int n1 = 1000;
        String expected1 = "1";
        String result1 = Solve1.solve(n1);
        assertEquals(expected1, result1);

        // Test case 2
        int n2 = 150;
        String expected2 = "110";
        String result2 = Solve1.solve(n2);
        assertEquals(expected2, result2);

        // Test case 3
        int n3 = 147;
        String expected3 = "1100";
        String result3 = Solve1.solve(n3);
        assertEquals(expected3, result3);

        // Test case 4
        int n4 = 333;
        String expected4 = "1001";
        String result4 = Solve1.solve(n4);
        assertEquals(expected4, result4);

        // Test case 5
        int n5 = 963;
        String expected5 = "10010";
        String result5 = Solve1.solve(n5);
        assertEquals(expected5, result5);
    }
}