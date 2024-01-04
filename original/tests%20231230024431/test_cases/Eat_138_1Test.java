package original;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.List;
import java.util.Arrays;

public class Eat_138_1Test {

    @Test(timeout = 8000)
    public void testEatEnoughCarrots() {
        List<Integer> result = Eat.eat(5, 6, 10);
        assertEquals(Arrays.asList(11, 4), result);
    }

    @Test(timeout = 8000)
    public void testEatNotEnoughCarrots() {
        List<Integer> result = Eat.eat(4, 8, 9);
        assertEquals(Arrays.asList(12, 1), result);
    }

    @Test(timeout = 8000)
    public void testEatExactlyEnoughCarrots() {
        List<Integer> result = Eat.eat(1, 10, 10);
        assertEquals(Arrays.asList(11, 0), result);
    }

    @Test(timeout = 8000)
    public void testEatMoreCarrotsThanRemaining() {
        List<Integer> result = Eat.eat(2, 11, 5);
        assertEquals(Arrays.asList(7, 0), result);
    }

    @Test(timeout = 8000)
    public void testEatSomeCarrots() {
        List<Integer> result = Eat.eat(4, 5, 7);
        assertEquals(Arrays.asList(9, 2), result);
    }

    @Test(timeout = 8000)
    public void testEatNoRemainingCarrots() {
        List<Integer> result = Eat.eat(4, 5, 1);
        assertEquals(Arrays.asList(5, 0), result);
    }
}