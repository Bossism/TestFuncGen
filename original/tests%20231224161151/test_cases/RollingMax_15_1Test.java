package original;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RollingMax_15_1Test {

    @Test(timeout = 8000)
    public void testRollingMax() {
        List<Object> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        List<Object> expected = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        List<Object> result = RollingMax.rollingMax(numbers);
        assertEquals(expected, result);
    }

    @Test(timeout = 8000)
    public void testRollingMaxWithNull() {
        List<Object> numbers = new ArrayList<>(Arrays.asList(1, null, 3, 4, 5));
        List<Object> expected = new ArrayList<>(Arrays.asList(1, 1, 3, 4, 5));
        List<Object> result = RollingMax.rollingMax(numbers);
        assertEquals(expected, result);
    }

    @Test(timeout = 8000, expected = IllegalArgumentException.class)
    public void testRollingMaxWithInvalidType() {
        List<Object> numbers = new ArrayList<>(Arrays.asList(1, 2, "3", 4, 5));
        RollingMax.rollingMax(numbers);
    }
}