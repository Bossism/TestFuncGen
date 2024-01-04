package original;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import java.util.Arrays;
import java.util.List;

public class Solution_160_1Test {

    @Test(timeout = 8000)
    public void testSolution() {
        List<Integer> lst1 = Arrays.asList(5, 8, 7, 1);
        assertEquals(12, Solution.solution(lst1));

        List<Integer> lst2 = Arrays.asList(3, 3, 3, 3, 3);
        assertEquals(9, Solution.solution(lst2));

        List<Integer> lst3 = Arrays.asList(30, 13, 24, 321);
        assertEquals(0, Solution.solution(lst3));

        List<Integer> lst4 = Arrays.asList(5, 9);
        assertEquals(5, Solution.solution(lst4));

        List<Integer> lst5 = Arrays.asList(2, 4, 8);
        assertEquals(0, Solution.solution(lst5));

        List<Integer> lst6 = Arrays.asList(30, 13, 23, 32);
        assertEquals(23, Solution.solution(lst6));

        List<Integer> lst7 = Arrays.asList(3, 13, 2, 9);
        assertEquals(3, Solution.solution(lst7));
    }
}