package original;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

public class Skjkasdkd_7_1Test {

    @Test(timeout = 8000)
    public void testIsPrime() {
        assertTrue(Skjkasdkd.isPrime(2));
        assertTrue(Skjkasdkd.isPrime(3));
        assertTrue(Skjkasdkd.isPrime(5));
        assertTrue(Skjkasdkd.isPrime(7));
        assertTrue(Skjkasdkd.isPrime(11));
        assertTrue(Skjkasdkd.isPrime(13));
        assertTrue(Skjkasdkd.isPrime(17));
        assertTrue(Skjkasdkd.isPrime(19));
        assertTrue(Skjkasdkd.isPrime(23));
        assertTrue(Skjkasdkd.isPrime(29));
        assertTrue(Skjkasdkd.isPrime(31));
        assertTrue(Skjkasdkd.isPrime(37));
        assertTrue(Skjkasdkd.isPrime(41));
        assertTrue(Skjkasdkd.isPrime(43));
        assertTrue(Skjkasdkd.isPrime(47));
        assertTrue(Skjkasdkd.isPrime(53));
        assertTrue(Skjkasdkd.isPrime(59));
        assertTrue(Skjkasdkd.isPrime(61));
        assertTrue(Skjkasdkd.isPrime(67));
        assertTrue(Skjkasdkd.isPrime(71));
        assertTrue(Skjkasdkd.isPrime(73));
        assertTrue(Skjkasdkd.isPrime(79));
        assertTrue(Skjkasdkd.isPrime(83));
        assertTrue(Skjkasdkd.isPrime(89));
        assertTrue(Skjkasdkd.isPrime(97));
        
        assertFalse(Skjkasdkd.isPrime(0));
        assertFalse(Skjkasdkd.isPrime(1));
        assertFalse(Skjkasdkd.isPrime(4));
        assertFalse(Skjkasdkd.isPrime(6));
        assertFalse(Skjkasdkd.isPrime(8));
        assertFalse(Skjkasdkd.isPrime(9));
        assertFalse(Skjkasdkd.isPrime(10));
        assertFalse(Skjkasdkd.isPrime(12));
        assertFalse(Skjkasdkd.isPrime(14));
        assertFalse(Skjkasdkd.isPrime(15));
        assertFalse(Skjkasdkd.isPrime(16));
        assertFalse(Skjkasdkd.isPrime(18));
        assertFalse(Skjkasdkd.isPrime(20));
        assertFalse(Skjkasdkd.isPrime(21));
        assertFalse(Skjkasdkd.isPrime(22));
        assertFalse(Skjkasdkd.isPrime(24));
        assertFalse(Skjkasdkd.isPrime(25));
        assertFalse(Skjkasdkd.isPrime(26));
        assertFalse(Skjkasdkd.isPrime(27));
        assertFalse(Skjkasdkd.isPrime(28));
        assertFalse(Skjkasdkd.isPrime(30));
        assertFalse(Skjkasdkd.isPrime(32));
        assertFalse(Skjkasdkd.isPrime(33));
        assertFalse(Skjkasdkd.isPrime(34));
        assertFalse(Skjkasdkd.isPrime(35));
        assertFalse(Skjkasdkd.isPrime(36));
        assertFalse(Skjkasdkd.isPrime(38));
        assertFalse(Skjkasdkd.isPrime(39));
        assertFalse(Skjkasdkd.isPrime(40));
        assertFalse(Skjkasdkd.isPrime(42));
        assertFalse(Skjkasdkd.isPrime(44));
        assertFalse(Skjkasdkd.isPrime(45));
        assertFalse(Skjkasdkd.isPrime(46));
        assertFalse(Skjkasdkd.isPrime(48));
        assertFalse(Skjkasdkd.isPrime(49));
        assertFalse(Skjkasdkd.isPrime(50));
        assertFalse(Skjkasdkd.isPrime(51));
        assertFalse(Skjkasdkd.isPrime(52));
        assertFalse(Skjkasdkd.isPrime(54));
        assertFalse(Skjkasdkd.isPrime(55));
        assertFalse(Skjkasdkd.isPrime(56));
        assertFalse(Skjkasdkd.isPrime(57));
        assertFalse(Skjkasdkd.isPrime(58));
        assertFalse(Skjkasdkd.isPrime(60));
        assertFalse(Skjkasdkd.isPrime(62));
        assertFalse(Skjkasdkd.isPrime(63));
        assertFalse(Skjkasdkd.isPrime(64));
        assertFalse(Skjkasdkd.isPrime(65));
        assertFalse(Skjkasdkd.isPrime(66));
        assertFalse(Skjkasdkd.isPrime(68));
        assertFalse(Skjkasdkd.isPrime(69));
        assertFalse(Skjkasdkd.isPrime(70));
        assertFalse(Skjkasdkd.isPrime(72));
        assertFalse(Skjkasdkd.isPrime(74));
        assertFalse(Skjkasdkd.isPrime(75));
        assertFalse(Skjkasdkd.isPrime(76));
        assertFalse(Skjkasdkd.isPrime(77));
        assertFalse(Skjkasdkd.isPrime(78));
        assertFalse(Skjkasdkd.isPrime(80));
        assertFalse(Skjkasdkd.isPrime(81));
        assertFalse(Skjkasdkd.isPrime(82));
        assertFalse(Skjkasdkd.isPrime(84));
        assertFalse(Skjkasdkd.isPrime(85));
        assertFalse(Skjkasdkd.isPrime(86));
        assertFalse(Skjkasdkd.isPrime(87));
        assertFalse(Skjkasdkd.isPrime(88));
        assertFalse(Skjkasdkd.isPrime(90));
        assertFalse(Skjkasdkd.isPrime(91));
        assertFalse(Skjkasdkd.isPrime(92));
        assertFalse(Skjkasdkd.isPrime(93));
        assertFalse(Skjkasdkd.isPrime(94));
        assertFalse(Skjkasdkd.isPrime(95));
        assertFalse(Skjkasdkd.isPrime(96));
        assertFalse(Skjkasdkd.isPrime(98));
        assertFalse(Skjkasdkd.isPrime(99));
    }
    
    @Test(timeout = 8000)
    public void testSkjkasdkd() {
        List<Integer> lst = Arrays.asList(2, 3, 5, 7, 11);
        assertEquals(5, Skjkasdkd.skjkasdkd(lst));
    }
}