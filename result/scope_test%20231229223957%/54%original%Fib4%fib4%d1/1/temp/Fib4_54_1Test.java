package original;
import org.junit.Test;
import static org.junit.Assert.*;

public class Fib4_54_1Test {

    @Test(timeout = 8000)
    public void testFib4() {
        assertEquals(0, Fib4.fib4(0));
        assertEquals(0, Fib4.fib4(1));
        assertEquals(2, Fib4.fib4(2));
        assertEquals(0, Fib4.fib4(3));
        assertEquals(4, Fib4.fib4(5));
        assertEquals(8, Fib4.fib4(6));
        assertEquals(14, Fib4.fib4(7));
        assertEquals(4, Fib4.fib4(5));
        assertEquals(28, Fib4.fib4(8));
        assertEquals(104, Fib4.fib4(10));
        assertEquals(386, Fib4.fib4(12));
    }
}