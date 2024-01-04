package original;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

public class Specialfilter_163_1Test {

    @Test(timeout = 8000)
    public void testSpecialfilter() {
        List<Object> nums1 = Arrays.asList(5, -2, 1, -5);
        assertEquals(0, Specialfilter.specialfilter(nums1));

        List<Object> nums2 = Arrays.asList(15, -73, 14, -15);
        assertEquals(1, Specialfilter.specialfilter(nums2));

        List<Object> nums3 = Arrays.asList(33, -2, -3, 45, 21, 109);
        assertEquals(2, Specialfilter.specialfilter(nums3));

        List<Object> nums4 = Arrays.asList(43, -12, 93, 125, 121, 109);
        assertEquals(4, Specialfilter.specialfilter(nums4));

        List<Object> nums5 = Arrays.asList(71, -2, -33, 75, 21, 19);
        assertEquals(3, Specialfilter.specialfilter(nums5));

        List<Object> nums6 = Arrays.asList(1);
        assertEquals(0, Specialfilter.specialfilter(nums6));

        List<Object> nums7 = Arrays.asList();
        assertEquals(0, Specialfilter.specialfilter(nums7));
    }
}