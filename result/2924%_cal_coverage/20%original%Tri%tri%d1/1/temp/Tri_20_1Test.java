package original;
import java.util.ArrayList;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.List;
import java.util.Arrays;

public class Tri_20_1Test {

    @Test(timeout = 8000)
    public void testTriWithZero() {
        List<Number> expected = Arrays.asList(1);
        List<Number> result = Tri.tri(0);
        assertEquals(expected, result);
    }

    @Test(timeout = 8000)
    public void testTriWithPositiveNumber() {
        List<Number> expected = Arrays.asList(1, 3, 2.0, 8.0, 3.0);
        List<Number> result = Tri.tri(4);
        assertEquals(expected, result);
    }

    @Test(timeout = 8000)
    public void testTriWithNegativeNumber() {
        List<Number> expected = Arrays.asList(1, 3, 2.0, 8.0, 3.0, 11.0, 18.0, 20.5);
        List<Number> result = Tri.tri(-6);
        assertEquals(expected, result);
    }
}