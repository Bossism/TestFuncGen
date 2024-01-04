package original;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.List;

public class Minsubarraysum_68_1Test {

    @Test(timeout = 8000)
    public void testMinsubarraysum() {
        List<Object> nums1 = Arrays.asList(2, 3, 4, 1, 2, 4);
        assertEquals(1, Minsubarraysum.minsubarraysum(nums1));

        List<Object> nums2 = Arrays.asList(-1, -2, -3);
        assertEquals(-6, Minsubarraysum.minsubarraysum(nums2));

        List<Object> nums3 = Arrays.asList(-1, -2, -3, 2, -10);
        assertEquals(-14, Minsubarraysum.minsubarraysum(nums3));

        List<Object> nums4 = Arrays.asList(-9999999999999999L);
        assertEquals(-9999999999999999L, Minsubarraysum.minsubarraysum(nums4));

        List<Object> nums5 = Arrays.asList(0, 10, 20, 1000000);
        assertEquals(0, Minsubarraysum.minsubarraysum(nums5));

        List<Object> nums6 = Arrays.asList(-1, -2, -3, 10, -5);
        assertEquals(-6, Minsubarraysum.minsubarraysum(nums6));

        List<Object> nums7 = Arrays.asList(100, -1, -2, -3, 10, -5);
        assertEquals(-6, Minsubarraysum.minsubarraysum(nums7));

        List<Object> nums8 = Arrays.asList(10, 11, 13, 8, 3, 4);
        assertEquals(3, Minsubarraysum.minsubarraysum(nums8));

        List<Object> nums9 = Arrays.asList(100, -33, 32, -1, 0, -2);
        assertEquals(-33, Minsubarraysum.minsubarraysum(nums9));

        List<Object> nums10 = Arrays.asList(-10);
        assertEquals(-10, Minsubarraysum.minsubarraysum(nums10));

        List<Object> nums11 = Arrays.asList(7);
        assertEquals(7, Minsubarraysum.minsubarraysum(nums11));

        List<Object> nums12 = Arrays.asList(1, -1);
        assertEquals(-1, Minsubarraysum.minsubarraysum(nums12));
    }
}