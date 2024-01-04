package original;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import java.util.Arrays;
import java.util.List;

public class MaxFill_119_1Test {

    @Test(timeout = 8000)
    public void testMaxFill() {
        List<List<Integer>> grid1 = Arrays.asList(
                Arrays.asList(0, 0, 1, 0),
                Arrays.asList(0, 1, 0, 0),
                Arrays.asList(1, 1, 1, 1)
        );
        int capacity1 = 1;
        int expected1 = 6;
        assertEquals(expected1, MaxFill.maxFill(grid1, capacity1));

        List<List<Integer>> grid2 = Arrays.asList(
                Arrays.asList(0, 0, 1, 1),
                Arrays.asList(0, 0, 0, 0),
                Arrays.asList(1, 1, 1, 1),
                Arrays.asList(0, 1, 1, 1)
        );
        int capacity2 = 2;
        int expected2 = 5;
        assertEquals(expected2, MaxFill.maxFill(grid2, capacity2));

        List<List<Integer>> grid3 = Arrays.asList(
                Arrays.asList(0, 0, 0),
                Arrays.asList(0, 0, 0)
        );
        int capacity3 = 5;
        int expected3 = 0;
        assertEquals(expected3, MaxFill.maxFill(grid3, capacity3));

        List<List<Integer>> grid4 = Arrays.asList(
                Arrays.asList(1, 1, 1, 1),
                Arrays.asList(1, 1, 1, 1)
        );
        int capacity4 = 2;
        int expected4 = 4;
        assertEquals(expected4, MaxFill.maxFill(grid4, capacity4));

        List<List<Integer>> grid5 = Arrays.asList(
                Arrays.asList(1, 1, 1, 1),
                Arrays.asList(1, 1, 1, 1)
        );
        int capacity5 = 9;
        int expected5 = 2;
        assertEquals(expected5, MaxFill.maxFill(grid5, capacity5));
    }
}