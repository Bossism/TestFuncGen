package original;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Compare_130_1Test {

    @Test(timeout = 8000)
    public void testCompare() {
        List<Integer> game = Arrays.asList(1, 2, 3, 4, 5, 1);
        List<Integer> guess = Arrays.asList(1, 2, 3, 4, 2, -2);
        List<Integer> expected = Arrays.asList(0, 0, 0, 0, 3, 3);
        List<Integer> result = Compare.compare(game, guess);
        assertEquals(expected, result);
    }

    @Test(timeout = 8000)
    public void testCompareAllZeroes() {
        List<Integer> game = Arrays.asList(0, 0, 0, 0, 0, 0);
        List<Integer> guess = Arrays.asList(0, 0, 0, 0, 0, 0);
        List<Integer> expected = Arrays.asList(0, 0, 0, 0, 0, 0);
        List<Integer> result = Compare.compare(game, guess);
        assertEquals(expected, result);
    }

    @Test(timeout = 8000)
    public void testCompareNegativeGuess() {
        List<Integer> game = Arrays.asList(1, 2, 3);
        List<Integer> guess = Arrays.asList(-1, -2, -3);
        List<Integer> expected = Arrays.asList(2, 4, 6);
        List<Integer> result = Compare.compare(game, guess);
        assertEquals(expected, result);
    }

    @Test(timeout = 8000)
    public void testCompareMixedGuess() {
        List<Integer> game = Arrays.asList(1, 2, 3, 5);
        List<Integer> guess = Arrays.asList(-1, 2, 3, 4);
        List<Integer> expected = Arrays.asList(2, 0, 0, 1);
        List<Integer> result = Compare.compare(game, guess);
        assertEquals(expected, result);
    }
}