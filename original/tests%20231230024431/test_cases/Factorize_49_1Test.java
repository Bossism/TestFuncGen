package original;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.List;
import java.util.Arrays;

public class Factorize_49_1Test {

    @Test(timeout = 8000)
    public void testFactorize() {
        // Test case 1
        List<Integer> expected1 = Arrays.asList(2, 2, 2);
        List<Integer> result1 = Factorize.factorize(8);
        assertEquals(expected1, result1);

        // Test case 2
        List<Integer> expected2 = Arrays.asList(5, 5);
        List<Integer> result2 = Factorize.factorize(25);
        assertEquals(expected2, result2);

        // Test case 3
        List<Integer> expected3 = Arrays.asList(2, 5, 7);
        List<Integer> result3 = Factorize.factorize(70);
        assertEquals(expected3, result3);

        // Test case 4
        List<Integer> expected4 = Arrays.asList(2);
        List<Integer> result4 = Factorize.factorize(2);
        assertEquals(expected4, result4);

        // Test case 5
        List<Integer> expected5 = Arrays.asList(2, 2);
        List<Integer> result5 = Factorize.factorize(4);
        assertEquals(expected5, result5);

        // Test case 6
        List<Integer> expected6 = Arrays.asList(2, 2, 2);
        List<Integer> result6 = Factorize.factorize(8);
        assertEquals(expected6, result6);

        // Test case 7
        List<Integer> expected7 = Arrays.asList(3, 19);
        List<Integer> result7 = Factorize.factorize(57);
        assertEquals(expected7, result7);

        // Test case 8
        List<Integer> expected8 = Arrays.asList(3, 3, 19, 19);
        List<Integer> result8 = Factorize.factorize(3249);
        assertEquals(expected8, result8);

        // Test case 9
        List<Integer> expected9 = Arrays.asList(3, 3, 3, 19, 19, 19);
        List<Integer> result9 = Factorize.factorize(185193);
        assertEquals(expected9, result9);

        // Test case 10
        List<Integer> expected10 = Arrays.asList(3, 19, 19, 19);
        List<Integer> result10 = Factorize.factorize(20577);
        assertEquals(expected10, result10);

        // Test case 11
        List<Integer> expected11 = Arrays.asList(2, 3, 3);
        List<Integer> result11 = Factorize.factorize(18);
        assertEquals(expected11, result11);
    }
}