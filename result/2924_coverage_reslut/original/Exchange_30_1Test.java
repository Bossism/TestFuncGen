package original;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;

public class Exchange_30_1Test {

    @Test(timeout = 8000)
    public void testExchangeWithEmptyLists() {
        List<Integer> lst1 = new ArrayList<>();
        List<Integer> lst2 = new ArrayList<>();
        String result = Exchange.exchange(lst1, lst2);
        assertEquals("YES", result);
    }

    @Test(timeout = 8000)
    public void testExchangeWithOddNumbersInLst1() {
        List<Integer> lst1 = new ArrayList<>();
        lst1.add(1);
        lst1.add(3);
        lst1.add(5);
        List<Integer> lst2 = new ArrayList<>();
        String result = Exchange.exchange(lst1, lst2);
        assertEquals("NO", result);
    }

    @Test(timeout = 8000)
    public void testExchangeWithEvenNumbersInLst2() {
        List<Integer> lst1 = new ArrayList<>();
        List<Integer> lst2 = new ArrayList<>();
        lst2.add(2);
        lst2.add(4);
        lst2.add(6);
        String result = Exchange.exchange(lst1, lst2);
        assertEquals("YES", result);
    }

    @Test(timeout = 8000)
    public void testExchangeWithOddNumbersInLst1AndEvenNumbersInLst2() {
        List<Integer> lst1 = new ArrayList<>();
        lst1.add(1);
        lst1.add(3);
        lst1.add(5);
        List<Integer> lst2 = new ArrayList<>();
        lst2.add(2);
        lst2.add(4);
        lst2.add(6);
        String result = Exchange.exchange(lst1, lst2);
        assertEquals("YES", result);
    }
}