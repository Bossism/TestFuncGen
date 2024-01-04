package original;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

public class F_97_1Test {

    @Test(timeout = 8000)
    public void testFactorial() {
        int result = F.factorial(5);
        assertEquals(120, result);
    }

    @Test(timeout = 8000)
    public void testFactorialWithZero() {
        int result = F.factorial(0);
        assertEquals(1, result);
    }

    @Test(timeout = 8000)
    public void testFactorialWithNegativeNumber() {
        int result = F.factorial(-5);
        assertEquals(1, result);
    }

    @Test(timeout = 8000)
    public void testFactorialWithLargeNumber() {
        int result = F.factorial(10);
        assertEquals(3628800, result);
    }

    @Test(timeout = 8000)
    public void testF() {
        List<Integer> result = F.f(5);
        List<Integer> expected = new ArrayList<>();
        expected.add(1);
        expected.add(3);
        expected.add(6);
        expected.add(10);
        expected.add(15);
        assertEquals(expected, result);
    }

    @Test(timeout = 8000)
    public void testFWithZero() {
        List<Integer> result = F.f(0);
        List<Integer> expected = new ArrayList<>();
        assertEquals(expected, result);
    }

    @Test(timeout = 8000)
    public void testFWithNegativeNumber() {
        List<Integer> result = F.f(-5);
        List<Integer> expected = new ArrayList<>();
        assertEquals(expected, result);
    }

    @Test(timeout = 8000)
    public void testFWithLargeNumber() {
        List<Integer> result = F.f(10);
        List<Integer> expected = new ArrayList<>();
        expected.add(1);
        expected.add(3);
        expected.add(6);
        expected.add(10);
        expected.add(15);
        expected.add(21);
        expected.add(28);
        expected.add(36);
        expected.add(45);
        expected.add(55);
        assertEquals(expected, result);
    }

    @Test(timeout = 8000)
    public void testSum() {
        int result = F.sum(5);
        assertEquals(15, result);
    }

    @Test(timeout = 8000)
    public void testSumWithZero() {
        int result = F.sum(0);
        assertEquals(0, result);
    }

    @Test(timeout = 8000)
    public void testSumWithNegativeNumber() {
        int result = F.sum(-5);
        assertEquals(0, result);
    }

    @Test(timeout = 8000)
    public void testSumWithLargeNumber() {
        int result = F.sum(10);
        assertEquals(55, result);
    }
}