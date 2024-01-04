package original;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.List;
import java.util.ArrayList;

public class F_96_1Test {

    @Test(timeout = 8000)
    public void testF() {
        List<Integer> expected = new ArrayList<>();
        expected.add(1);
        expected.add(2);
        expected.add(6);
        expected.add(24);
        expected.add(120);
        expected.add(720);
        expected.add(5040);
        expected.add(40320);
        expected.add(362880);
        expected.add(3628800);

        List<Integer> result = F.f(10);

        assertEquals(expected, result);
    }

    @Test(timeout = 8000)
    public void testFWithNegativeInput() {
        List<Integer> expected = new ArrayList<>();

        List<Integer> result = F.f(-5);

        assertEquals(expected, result);
    }

    @Test(timeout = 8000)
    public void testFWithZeroInput() {
        List<Integer> expected = new ArrayList<>();

        List<Integer> result = F.f(0);

        assertEquals(expected, result);
    }
}