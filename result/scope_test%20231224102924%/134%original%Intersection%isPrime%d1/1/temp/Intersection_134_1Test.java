package original;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

public class Intersection_134_1Test {

    @Test(timeout = 8000)
    public void testIsPrime() {
        assertTrue(Intersection.isPrime(2));
        assertTrue(Intersection.isPrime(3));
        assertTrue(Intersection.isPrime(5));
        assertTrue(Intersection.isPrime(7));
        assertTrue(Intersection.isPrime(11));
        assertTrue(Intersection.isPrime(13));
        assertTrue(Intersection.isPrime(17));
        assertTrue(Intersection.isPrime(19));
        assertTrue(Intersection.isPrime(23));
        assertTrue(Intersection.isPrime(29));
        assertTrue(Intersection.isPrime(31));
        assertTrue(Intersection.isPrime(37));
        assertTrue(Intersection.isPrime(41));
        assertTrue(Intersection.isPrime(43));
        assertTrue(Intersection.isPrime(47));
        assertTrue(Intersection.isPrime(53));
        assertTrue(Intersection.isPrime(59));
        assertTrue(Intersection.isPrime(61));
        assertTrue(Intersection.isPrime(67));
        assertTrue(Intersection.isPrime(71));
        assertTrue(Intersection.isPrime(73));
        assertTrue(Intersection.isPrime(79));
        assertTrue(Intersection.isPrime(83));
        assertTrue(Intersection.isPrime(89));
        assertTrue(Intersection.isPrime(97));
        assertFalse(Intersection.isPrime(1));
        assertFalse(Intersection.isPrime(4));
        assertFalse(Intersection.isPrime(6));
        assertFalse(Intersection.isPrime(8));
        assertFalse(Intersection.isPrime(9));
        assertFalse(Intersection.isPrime(10));
        assertFalse(Intersection.isPrime(12));
        assertFalse(Intersection.isPrime(14));
        assertFalse(Intersection.isPrime(15));
        assertFalse(Intersection.isPrime(16));
        assertFalse(Intersection.isPrime(18));
        assertFalse(Intersection.isPrime(20));
        assertFalse(Intersection.isPrime(21));
        assertFalse(Intersection.isPrime(22));
        assertFalse(Intersection.isPrime(24));
        assertFalse(Intersection.isPrime(25));
        assertFalse(Intersection.isPrime(26));
        assertFalse(Intersection.isPrime(27));
        assertFalse(Intersection.isPrime(28));
        assertFalse(Intersection.isPrime(30));
        assertFalse(Intersection.isPrime(32));
        assertFalse(Intersection.isPrime(33));
        assertFalse(Intersection.isPrime(34));
        assertFalse(Intersection.isPrime(35));
        assertFalse(Intersection.isPrime(36));
        assertFalse(Intersection.isPrime(38));
        assertFalse(Intersection.isPrime(39));
        assertFalse(Intersection.isPrime(40));
        assertFalse(Intersection.isPrime(42));
        assertFalse(Intersection.isPrime(44));
        assertFalse(Intersection.isPrime(45));
        assertFalse(Intersection.isPrime(46));
        assertFalse(Intersection.isPrime(48));
        assertFalse(Intersection.isPrime(49));
        assertFalse(Intersection.isPrime(50));
        assertFalse(Intersection.isPrime(51));
        assertFalse(Intersection.isPrime(52));
        assertFalse(Intersection.isPrime(54));
        assertFalse(Intersection.isPrime(55));
        assertFalse(Intersection.isPrime(56));
        assertFalse(Intersection.isPrime(57));
        assertFalse(Intersection.isPrime(58));
        assertFalse(Intersection.isPrime(60));
        assertFalse(Intersection.isPrime(62));
        assertFalse(Intersection.isPrime(63));
        assertFalse(Intersection.isPrime(64));
        assertFalse(Intersection.isPrime(65));
        assertFalse(Intersection.isPrime(66));
        assertFalse(Intersection.isPrime(68));
        assertFalse(Intersection.isPrime(69));
        assertFalse(Intersection.isPrime(70));
        assertFalse(Intersection.isPrime(72));
        assertFalse(Intersection.isPrime(74));
        assertFalse(Intersection.isPrime(75));
        assertFalse(Intersection.isPrime(76));
        assertFalse(Intersection.isPrime(77));
        assertFalse(Intersection.isPrime(78));
        assertFalse(Intersection.isPrime(80));
        assertFalse(Intersection.isPrime(81));
        assertFalse(Intersection.isPrime(82));
        assertFalse(Intersection.isPrime(84));
        assertFalse(Intersection.isPrime(85));
        assertFalse(Intersection.isPrime(86));
        assertFalse(Intersection.isPrime(87));
        assertFalse(Intersection.isPrime(88));
        assertFalse(Intersection.isPrime(90));
        assertFalse(Intersection.isPrime(91));
        assertFalse(Intersection.isPrime(92));
        assertFalse(Intersection.isPrime(93));
        assertFalse(Intersection.isPrime(94));
        assertFalse(Intersection.isPrime(95));
        assertFalse(Intersection.isPrime(96));
        assertFalse(Intersection.isPrime(98));
        assertFalse(Intersection.isPrime(99));
        assertFalse(Intersection.isPrime(100));
    }

    @Test(timeout = 8000)
    public void testIntersection() {
        List<Integer> interval1 = Arrays.asList(1, 10);
        List<Integer> interval2 = Arrays.asList(5, 15);
        assertEquals("5, 6, 7, 8, 9, 10", Intersection.intersection(interval1, interval2));
        
        interval1 = Arrays.asList(1, 10);
        interval2 = Arrays.asList(11, 20);
        assertEquals("", Intersection.intersection(interval1, interval2));
        
        interval1 = Arrays.asList(1, 10);
        interval2 = Arrays.asList(10, 20);
        assertEquals("10", Intersection.intersection(interval1, interval2));
        
        interval1 = Arrays.asList(1, 10);
        interval2 = Arrays.asList(1, 10);
        assertEquals("1, 2, 3, 4, 5, 6, 7, 8, 9, 10", Intersection.intersection(interval1, interval2));
        
        interval1 = Arrays.asList(1, 10);
        interval2 = Arrays.asList(5, 5);
        assertEquals("5", Intersection.intersection(interval1, interval2));
        
        interval1 = Arrays.asList(1, 10);
        interval2 = Arrays.asList(10, 10);
        assertEquals("10", Intersection.intersection(interval1, interval2));
        
        interval1 = Arrays.asList(1, 10);
        interval2 = Arrays.asList(11, 11);
        assertEquals("", Intersection.intersection(interval1, interval2));
    }
}