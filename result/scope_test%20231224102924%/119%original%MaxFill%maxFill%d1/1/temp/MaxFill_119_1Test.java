package original;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MaxFill_119_1Test {

    @Test(timeout = 8000)
    public void testMaxFill() {
        List<List<Integer>> grid = new ArrayList<>();
        grid.add(Arrays.asList(1, 2, 3));
        grid.add(Arrays.asList(4, 5, 6));
        grid.add(Arrays.asList(7, 8, 9));

        int capacity = 3;

        int result = MaxFill.maxFill(grid, capacity);

        assertEquals(15, result);
    }

    @Test(timeout = 8000)
    public void testMaxFillWithEmptyGrid() {
        List<List<Integer>> grid = new ArrayList<>();

        int capacity = 3;

        int result = MaxFill.maxFill(grid, capacity);

        assertEquals(0, result);
    }

    @Test(timeout = 8000)
    public void testMaxFillWithZeroCapacity() {
        List<List<Integer>> grid = new ArrayList<>();
        grid.add(Arrays.asList(1, 2, 3));
        grid.add(Arrays.asList(4, 5, 6));
        grid.add(Arrays.asList(7, 8, 9));

        int capacity = 0;

        int result = MaxFill.maxFill(grid, capacity);

        assertEquals(0, result);
    }

    @Test(timeout = 8000)
    public void testMaxFillWithNegativeCapacity() {
        List<List<Integer>> grid = new ArrayList<>();
        grid.add(Arrays.asList(1, 2, 3));
        grid.add(Arrays.asList(4, 5, 6));
        grid.add(Arrays.asList(7, 8, 9));

        int capacity = -3;

        int result = MaxFill.maxFill(grid, capacity);

        assertEquals(0, result);
    }
}