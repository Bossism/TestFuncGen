package original;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.List;

public class Eat_138_1Test {

    @Test(timeout = 8000)
    public void testEatWithNeedLessThanOrEqualToRemaining() {
        List<Integer> expected = Arrays.asList(10, 5);
        List<Integer> actual = Eat.eat(5, 5, 10);
        assertEquals(expected, actual);
    }

    @Test(timeout = 8000)
    public void testEatWithNeedGreaterThanRemaining() {
        List<Integer> expected = Arrays.asList(15, 0);
        List<Integer> actual = Eat.eat(10, 7, 5);
        assertEquals(expected, actual);
    }
}