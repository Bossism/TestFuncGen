package original;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.List;

public class CountUpTo_153_1Test {

    @Test(timeout = 8000)
    public void testCountUpTo() {
        // Test case 1: n = 5
        List<Object> result1 = CountUpTo.countUpTo(5);
        assertEquals(2, result1.size());
        assertEquals(2, result1.get(0));
        assertEquals(3, result1.get(1));

        // Test case 2: n = 11
        List<Object> result2 = CountUpTo.countUpTo(11);
        assertEquals(4, result2.size());
        assertEquals(2, result2.get(0));
        assertEquals(3, result2.get(1));
        assertEquals(5, result2.get(2));
        assertEquals(7, result2.get(3));

        // Test case 3: n = 0
        List<Object> result3 = CountUpTo.countUpTo(0);
        assertEquals(0, result3.size());

        // Test case 4: n = 20
        List<Object> result4 = CountUpTo.countUpTo(20);
        assertEquals(8, result4.size());
        assertEquals(2, result4.get(0));
        assertEquals(3, result4.get(1));
        assertEquals(5, result4.get(2));
        assertEquals(7, result4.get(3));
        assertEquals(11, result4.get(4));
        assertEquals(13, result4.get(5));
        assertEquals(17, result4.get(6));
        assertEquals(19, result4.get(7));

        // Test case 5: n = 1
        List<Object> result5 = CountUpTo.countUpTo(1);
        assertEquals(0, result5.size());

        // Test case 6: n = 18
        List<Object> result6 = CountUpTo.countUpTo(18);
        assertEquals(7, result6.size());
        assertEquals(2, result6.get(0));
        assertEquals(3, result6.get(1));
        assertEquals(5, result6.get(2));
        assertEquals(7, result6.get(3));
        assertEquals(11, result6.get(4));
        assertEquals(13, result6.get(5));
        assertEquals(17, result6.get(6));
    }
}