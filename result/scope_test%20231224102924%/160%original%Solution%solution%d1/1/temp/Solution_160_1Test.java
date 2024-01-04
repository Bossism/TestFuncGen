package original;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution_160_1Test {

    @Test(timeout = 8000)
    public void testSolution() {
        List<Integer> lst = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        int result = Solution.solution(lst);
        assertEquals(25, result);
    }

    @Test(timeout = 8000)
    public void testSolutionWithEmptyList() {
        List<Integer> lst = new ArrayList<>();
        int result = Solution.solution(lst);
        assertEquals(0, result);
    }

    @Test(timeout = 8000)
    public void testSolutionWithNoOddNumbers() {
        List<Integer> lst = new ArrayList<>(Arrays.asList(2, 4, 6, 8, 10));
        int result = Solution.solution(lst);
        assertEquals(0, result);
    }

    @Test(timeout = 8000)
    public void testSolutionWithNoEvenIndices() {
        List<Integer> lst = new ArrayList<>(Arrays.asList(1, 3, 5, 7, 9));
        int result = Solution.solution(lst);
        assertEquals(0, result);
    }

    @Test(timeout = 8000)
    public void testSolutionWithNegativeNumbers() {
        List<Integer> lst = new ArrayList<>(Arrays.asList(-1, -2, -3, -4, -5, -6, -7, -8, -9, -10));
        int result = Solution.solution(lst);
        assertEquals(-25, result);
    }
}