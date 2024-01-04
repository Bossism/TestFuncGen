package original;
import org.junit.Test;
import static org.junit.Assert.*;

public class LargestDivisor_116_1Test {

    @Test(timeout = 8000)
    public void testLargestDivisor() {
        assertEquals(5, LargestDivisor.largestDivisor(15));
        assertEquals(1, LargestDivisor.largestDivisor(3));
        assertEquals(1, LargestDivisor.largestDivisor(7));
        assertEquals(5, LargestDivisor.largestDivisor(10));
        assertEquals(50, LargestDivisor.largestDivisor(100));
        assertEquals(7, LargestDivisor.largestDivisor(49));
    }
}