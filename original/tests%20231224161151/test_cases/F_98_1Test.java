package original;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

public class F_98_1Test {

    @Test(timeout = 8000)
    public void testSum() {
        int n = 5;
        int expected = 15;
        int actual = F.sum(n);
        assertEquals(expected, actual);
    }

    @Test(timeout = 8000)
    public void testSumWithZero() {
        int n = 0;
        int expected = 0;
        int actual = F.sum(n);
        assertEquals(expected, actual);
    }

    @Test(timeout = 8000)
    public void testSumWithNegativeNumber() {
        int n = -5;
        int expected = 0;
        int actual = F.sum(n);
        assertEquals(expected, actual);
    }

    @Test(timeout = 8000)
    public void testSumWithLargeNumber() {
        long n = 1000000L;
        long expected = 500000500000L;
        long actual = F.sum((int) n);
        assertEquals(expected, actual);
    }

    @Test(timeout = 8000)
    public void testSumWithMaxInteger() {
        int n = Integer.MAX_VALUE;
        long expected = 2305843005992468481L;
        long actual = F.sum(n);
        assertEquals(expected, actual);
    }

    @Test(timeout = 8000)
    public void testSumWithMinInteger() {
        int n = Integer.MIN_VALUE;
        int expected = 0;
        int actual = F.sum(n);
        assertEquals(expected, actual);
    }

    @Test(timeout = 8000)
    public void testSumWithOddNumber() {
        int n = 7;
        int expected = 28;
        int actual = F.sum(n);
        assertEquals(expected, actual);
    }

    @Test(timeout = 8000)
    public void testSumWithEvenNumber() {
        int n = 8;
        int expected = 36;
        int actual = F.sum(n);
        assertEquals(expected, actual);
    }

    @Test(timeout = 8000)
    public void testSumWithOne() {
        int n = 1;
        int expected = 1;
        int actual = F.sum(n);
        assertEquals(expected, actual);
    }
}