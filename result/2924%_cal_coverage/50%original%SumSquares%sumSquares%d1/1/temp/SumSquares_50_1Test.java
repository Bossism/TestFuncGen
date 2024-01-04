package original;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;

public class SumSquares_50_1Test {

    @Test(timeout = 8000)
    public void testSumSquares() {
        List<Number> lst = new ArrayList<>();
        lst.add(2);
        lst.add(3.5);
        lst.add(4.2);

        double result = SumSquares.sumSquares(lst);

        assertEquals(45.49, result, 0.001);
    }
}