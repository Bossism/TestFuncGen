package original;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.List;
import java.util.Arrays;

public class MakeAPile_47_1Test {

    @Test(timeout = 8000)
    public void testMakeAPile() {
        // Test case 1
        List<Integer> expected1 = Arrays.asList(3, 5, 7);
        List<Integer> result1 = MakeAPile.makeAPile(3);
        assertEquals(expected1, result1);

        // Test case 2
        List<Integer> expected2 = Arrays.asList(4, 6, 8, 10);
        List<Integer> result2 = MakeAPile.makeAPile(4);
        assertEquals(expected2, result2);

        // Test case 3
        List<Integer> expected3 = Arrays.asList(5, 7, 9, 11, 13);
        List<Integer> result3 = MakeAPile.makeAPile(5);
        assertEquals(expected3, result3);

        // Test case 4
        List<Integer> expected4 = Arrays.asList(6, 8, 10, 12, 14, 16);
        List<Integer> result4 = MakeAPile.makeAPile(6);
        assertEquals(expected4, result4);

        // Test case 5
        List<Integer> expected5 = Arrays.asList(8, 10, 12, 14, 16, 18, 20, 22);
        List<Integer> result5 = MakeAPile.makeAPile(8);
        assertEquals(expected5, result5);
    }
}