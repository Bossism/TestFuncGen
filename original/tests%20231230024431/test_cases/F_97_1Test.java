package original;
import java.util.ArrayList;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.List;

public class F_97_1Test {

    @Test(timeout = 8000)
    public void testFactorial() {
        assertEquals(1, F.factorial(0));
        assertEquals(1, F.factorial(1));
        assertEquals(2, F.factorial(2));
        assertEquals(6, F.factorial(3));
        assertEquals(24, F.factorial(4));
        assertEquals(120, F.factorial(5));
    }

    @Test(timeout = 8000)
    public void testF() {
        List<Integer> result = F.f(5);
        assertEquals(5, result.size());
        assertEquals(1, (int) result.get(0));
        assertEquals(2, (int) result.get(1));
        assertEquals(6, (int) result.get(2));
        assertEquals(24, (int) result.get(3));
        assertEquals(15, (int) result.get(4));
    }

    @Test(timeout = 8000)
    public void testFWithNegativeInput() {
        List<Integer> result = F.f(-5);
        assertEquals(0, result.size());
    }

    @Test(timeout = 8000)
    public void testFWithZeroInput() {
        List<Integer> result = F.f(0);
        assertEquals(0, result.size());
    }

    @Test(timeout = 8000)
    public void testFWithPositiveInput() {
        List<Integer> result = F.f(7);
        assertEquals(7, result.size());
        assertEquals(1, (int) result.get(0));
        assertEquals(2, (int) result.get(1));
        assertEquals(6, (int) result.get(2));
        assertEquals(24, (int) result.get(3));
        assertEquals(15, (int) result.get(4));
        assertEquals(720, (int) result.get(5));
        assertEquals(28, (int) result.get(6));
    }

    @Test(timeout = 8000)
    public void testFWithSingleInput() {
        List<Integer> result = F.f(1);
        assertEquals(1, result.size());
        assertEquals(1, (int) result.get(0));
    }

    @Test(timeout = 8000)
    public void testFWithMultipleInput() {
        List<Integer> result = F.f(3);
        assertEquals(3, result.size());
        assertEquals(1, (int) result.get(0));
        assertEquals(2, (int) result.get(1));
        assertEquals(6, (int) result.get(2));
    }
}