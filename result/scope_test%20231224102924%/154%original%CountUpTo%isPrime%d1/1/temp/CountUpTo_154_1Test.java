package original;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

public class CountUpTo_154_1Test {

    @Test(timeout = 8000)
    public void testIsPrime() {
        assertTrue(CountUpTo.isPrime(2));
        assertTrue(CountUpTo.isPrime(3));
        assertTrue(CountUpTo.isPrime(5));
        assertTrue(CountUpTo.isPrime(7));
        assertTrue(CountUpTo.isPrime(11));
        assertTrue(CountUpTo.isPrime(13));
        assertTrue(CountUpTo.isPrime(17));
        assertTrue(CountUpTo.isPrime(19));
        assertTrue(CountUpTo.isPrime(23));
        assertTrue(CountUpTo.isPrime(29));
        assertTrue(CountUpTo.isPrime(31));
        assertTrue(CountUpTo.isPrime(37));
        assertTrue(CountUpTo.isPrime(41));
        assertTrue(CountUpTo.isPrime(43));
        assertTrue(CountUpTo.isPrime(47));
        assertTrue(CountUpTo.isPrime(53));
        assertTrue(CountUpTo.isPrime(59));
        assertTrue(CountUpTo.isPrime(61));
        assertTrue(CountUpTo.isPrime(67));
        assertTrue(CountUpTo.isPrime(71));
        assertTrue(CountUpTo.isPrime(73));
        assertTrue(CountUpTo.isPrime(79));
        assertTrue(CountUpTo.isPrime(83));
        assertTrue(CountUpTo.isPrime(89));
        assertTrue(CountUpTo.isPrime(97));
        assertFalse(CountUpTo.isPrime(1));
        assertFalse(CountUpTo.isPrime(4));
        assertFalse(CountUpTo.isPrime(6));
        assertFalse(CountUpTo.isPrime(8));
        assertFalse(CountUpTo.isPrime(9));
        assertFalse(CountUpTo.isPrime(10));
        assertFalse(CountUpTo.isPrime(12));
        assertFalse(CountUpTo.isPrime(14));
        assertFalse(CountUpTo.isPrime(15));
        assertFalse(CountUpTo.isPrime(16));
        assertFalse(CountUpTo.isPrime(18));
        assertFalse(CountUpTo.isPrime(20));
        assertFalse(CountUpTo.isPrime(21));
        assertFalse(CountUpTo.isPrime(22));
        assertFalse(CountUpTo.isPrime(24));
        assertFalse(CountUpTo.isPrime(25));
        assertFalse(CountUpTo.isPrime(26));
        assertFalse(CountUpTo.isPrime(27));
        assertFalse(CountUpTo.isPrime(28));
        assertFalse(CountUpTo.isPrime(30));
        assertFalse(CountUpTo.isPrime(32));
        assertFalse(CountUpTo.isPrime(33));
        assertFalse(CountUpTo.isPrime(34));
        assertFalse(CountUpTo.isPrime(35));
        assertFalse(CountUpTo.isPrime(36));
        assertFalse(CountUpTo.isPrime(38));
        assertFalse(CountUpTo.isPrime(39));
        assertFalse(CountUpTo.isPrime(40));
        assertFalse(CountUpTo.isPrime(42));
        assertFalse(CountUpTo.isPrime(44));
        assertFalse(CountUpTo.isPrime(45));
        assertFalse(CountUpTo.isPrime(46));
        assertFalse(CountUpTo.isPrime(48));
        assertFalse(CountUpTo.isPrime(49));
        assertFalse(CountUpTo.isPrime(50));
        assertFalse(CountUpTo.isPrime(51));
        assertFalse(CountUpTo.isPrime(52));
        assertFalse(CountUpTo.isPrime(54));
        assertFalse(CountUpTo.isPrime(55));
        assertFalse(CountUpTo.isPrime(56));
        assertFalse(CountUpTo.isPrime(57));
        assertFalse(CountUpTo.isPrime(58));
        assertFalse(CountUpTo.isPrime(60));
        assertFalse(CountUpTo.isPrime(62));
        assertFalse(CountUpTo.isPrime(63));
        assertFalse(CountUpTo.isPrime(64));
        assertFalse(CountUpTo.isPrime(65));
        assertFalse(CountUpTo.isPrime(66));
        assertFalse(CountUpTo.isPrime(68));
        assertFalse(CountUpTo.isPrime(69));
        assertFalse(CountUpTo.isPrime(70));
        assertFalse(CountUpTo.isPrime(72));
        assertFalse(CountUpTo.isPrime(74));
        assertFalse(CountUpTo.isPrime(75));
        assertFalse(CountUpTo.isPrime(76));
        assertFalse(CountUpTo.isPrime(77));
        assertFalse(CountUpTo.isPrime(78));
        assertFalse(CountUpTo.isPrime(80));
        assertFalse(CountUpTo.isPrime(81));
        assertFalse(CountUpTo.isPrime(82));
        assertFalse(CountUpTo.isPrime(84));
        assertFalse(CountUpTo.isPrime(85));
        assertFalse(CountUpTo.isPrime(86));
        assertFalse(CountUpTo.isPrime(87));
        assertFalse(CountUpTo.isPrime(88));
        assertFalse(CountUpTo.isPrime(90));
        assertFalse(CountUpTo.isPrime(91));
        assertFalse(CountUpTo.isPrime(92));
        assertFalse(CountUpTo.isPrime(93));
        assertFalse(CountUpTo.isPrime(94));
        assertFalse(CountUpTo.isPrime(95));
        assertFalse(CountUpTo.isPrime(96));
        assertFalse(CountUpTo.isPrime(98));
        assertFalse(CountUpTo.isPrime(99));
        assertFalse(CountUpTo.isPrime(100));
    }

    @Test(timeout = 8000)
    public void testCountUpTo() {
        List<Object> expected1 = new ArrayList<>();
        expected1.add(2);
        expected1.add(3);
        expected1.add(5);
        expected1.add(7);
        expected1.add(11);
        expected1.add(13);
        expected1.add(17);
        expected1.add(19);
        expected1.add(23);
        expected1.add(29);
        expected1.add(31);
        expected1.add(37);
        expected1.add(41);
        expected1.add(43);
        expected1.add(47);
        expected1.add(53);
        expected1.add(59);
        expected1.add(61);
        expected1.add(67);
        expected1.add(71);
        expected1.add(73);
        expected1.add(79);
        expected1.add(83);
        expected1.add(89);
        expected1.add(97);
        assertEquals(expected1, CountUpTo.countUpTo(100));

        List<Object> expected2 = new ArrayList<>();
        expected2.add(2);
        expected2.add(3);
        expected2.add(5);
        expected2.add(7);
        expected2.add(11);
        expected2.add(13);
        expected2.add(17);
        expected2.add(19);
        expected2.add(23);
        expected2.add(29);
        expected2.add(31);
        expected2.add(37);
        expected2.add(41);
        expected2.add(43);
        expected2.add(47);
        expected2.add(53);
        expected2.add(59);
        expected2.add(61);
        expected2.add(67);
        expected2.add(71);
        expected2.add(73);
        expected2.add(79);
        expected2.add(83);
        expected2.add(89);
        expected2.add(97);
        assertEquals(expected2, CountUpTo.countUpTo(101));

        List<Object> expected3 = new ArrayList<>();
        expected3.add(2);
        expected3.add(3);
        expected3.add(5);
        expected3.add(7);
        expected3.add(11);
        expected3.add(13);
        expected3.add(17);
        expected3.add(19);
        expected3.add(23);
        expected3.add(29);
        expected3.add(31);
        expected3.add(37);
        expected3.add(41);
        expected3.add(43);
        expected3.add(47);
        expected3.add(53);
        expected3.add(59);
        expected3.add(61);
        expected3.add(67);
        expected3.add(71);
        expected3.add(73);
        expected3.add(79);
        expected3.add(83);
        expected3.add(89);
        expected3.add(97);
        assertEquals(expected3, CountUpTo.countUpTo(102));
    }
}