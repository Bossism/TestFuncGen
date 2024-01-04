package original;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import java.util.Arrays;
import java.util.List;

public class SumSquares_50_1Test {

    @Test(timeout = 8000)
    public void testSumSquares() {
        List<Number> lst1 = Arrays.asList(1, 2, 3);
        assertEquals(14, SumSquares.sumSquares(lst1));

        List<Number> lst2 = Arrays.asList(1.0, 2, 3);
        assertEquals(14, SumSquares.sumSquares(lst2));

        List<Number> lst3 = Arrays.asList(1, 3, 5, 7);
        assertEquals(84, SumSquares.sumSquares(lst3));

        List<Number> lst4 = Arrays.asList(1.4, 4.2, 0);
        assertEquals(29, SumSquares.sumSquares(lst4));

        List<Number> lst5 = Arrays.asList(-2.4, 1, 1);
        assertEquals(6, SumSquares.sumSquares(lst5));

        List<Number> lst6 = Arrays.asList(100, 1, 15, 2);
        assertEquals(10230, SumSquares.sumSquares(lst6));

        List<Number> lst7 = Arrays.asList(10000, 10000);
        assertEquals(200000000, SumSquares.sumSquares(lst7));

        List<Number> lst8 = Arrays.asList(-1.4, 4.6, 6.3);
        assertEquals(75, SumSquares.sumSquares(lst8));

        List<Number> lst9 = Arrays.asList(-1.4, 17.9, 18.9, 19.9);
        assertEquals(1086, SumSquares.sumSquares(lst9));

        List<Number> lst10 = Arrays.asList(0);
        assertEquals(0, SumSquares.sumSquares(lst10));

        List<Number> lst11 = Arrays.asList(-1);
        assertEquals(1, SumSquares.sumSquares(lst11));

        List<Number> lst12 = Arrays.asList(-1, 1, 0);
        assertEquals(2, SumSquares.sumSquares(lst12));
    }
}