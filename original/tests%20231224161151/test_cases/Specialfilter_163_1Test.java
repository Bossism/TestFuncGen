package original;
import java.util.HashSet;
import java.util.Set;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.List;

public class Specialfilter_163_1Test {

    @Test(timeout = 8000)
    public void testSpecialfilter() {
        List<Object> nums = Arrays.asList(12, 15, 18, 21, 24, 27, 30);
        int result = Specialfilter.specialfilter(nums);
        assertEquals(3, result);
    }

    @Test(timeout = 8000)
    public void testSpecialfilterWithEmptyList() {
        List<Object> nums = Arrays.asList();
        int result = Specialfilter.specialfilter(nums);
        assertEquals(0, result);
    }

    @Test(timeout = 8000)
    public void testSpecialfilterWithNoNumbersGreaterThan10() {
        List<Object> nums = Arrays.asList(1, 2, 3, 4, 5);
        int result = Specialfilter.specialfilter(nums);
        assertEquals(0, result);
    }

    @Test(timeout = 8000)
    public void testSpecialfilterWithNumbersGreaterThan10ButNotSpecial() {
        List<Object> nums = Arrays.asList(12, 15, 18, 21, 24, 27, 30, 32);
        int result = Specialfilter.specialfilter(nums);
        assertEquals(0, result);
    }

    @Test(timeout = 8000)
    public void testSpecialfilterWithNumbersGreaterThan10AndSpecial() {
        List<Object> nums = Arrays.asList(12, 15, 18, 21, 24, 27, 30, 31);
        int result = Specialfilter.specialfilter(nums);
        assertEquals(1, result);
    }
}