package original;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Minpath_25_1Test {

    @Test(timeout = 8000)
    public void testMinpath() {
        List<List<Integer>> grid = new ArrayList<>();
        grid.add(Arrays.asList(0, 1, 0));
        grid.add(Arrays.asList(1, 0, 1));
        grid.add(Arrays.asList(0, 1, 0));

        int k = 5;

        List<Integer> expected = Arrays.asList(1, 0, 1, 0, 1);
        List<Integer> result = Minpath.minpath(grid, k);

        assertEquals(expected, result);
    }
}