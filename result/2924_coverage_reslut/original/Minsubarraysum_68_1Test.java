package original;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Minsubarraysum_68_1Test {

    @Test(timeout = 8000)
    public void testMinsubarraysum() {
        List<Object> nums = new ArrayList<>(Arrays.asList(1, -2, 3, -4, 5));
        long result = Minsubarraysum.minsubarraysum(nums);
        assertEquals(-4, result);
    }

    @Test(timeout = 8000)
    public void testMinsubarraysumWithAllPositiveNumbers() {
        List<Object> nums = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        long result = Minsubarraysum.minsubarraysum(nums);
        assertEquals(1, result);
    }

    @Test(timeout = 8000)
    public void testMinsubarraysumWithAllNegativeNumbers() {
        List<Object> nums = new ArrayList<>(Arrays.asList(-1, -2, -3, -4, -5));
        long result = Minsubarraysum.minsubarraysum(nums);
        assertEquals(-15, result);
    }

    @Test(timeout = 8000)
    public void testMinsubarraysumWithEmptyList() {
        List<Object> nums = new ArrayList<>();
        long result = Minsubarraysum.minsubarraysum(nums);
        assertEquals(0, result);
    }
}