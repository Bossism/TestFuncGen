package original;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;

public class SumSquares1_78_1Test {

    @Test(timeout = 8000)
    public void testSumSquares() {
        // Test case 1
        List<Object> lst1 = new ArrayList<>();
        assertEquals(0, SumSquares1.sumSquares(lst1));

        // Test case 2
        List<Object> lst2 = new ArrayList<>();
        lst2.add(1);
        lst2.add(2);
        lst2.add(3);
        assertEquals(6, SumSquares1.sumSquares(lst2));

        // Test case 3
        List<Object> lst3 = new ArrayList<>();
        lst3.add(-1);
        lst3.add(-5);
        lst3.add(2);
        lst3.add(-1);
        lst3.add(-5);
        assertEquals(-126, SumSquares1.sumSquares(lst3));

        // Test case 4
        List<Object> lst4 = new ArrayList<>();
        lst4.add(1);
        lst4.add(1);
        lst4.add(1);
        lst4.add(1);
        lst4.add(1);
        lst4.add(1);
        lst4.add(1);
        lst4.add(1);
        lst4.add(1);
        assertEquals(9, SumSquares1.sumSquares(lst4));

        // Test case 5
        List<Object> lst5 = new ArrayList<>();
        lst5.add(-1);
        lst5.add(-1);
        lst5.add(-1);
        lst5.add(-1);
        lst5.add(-1);
        lst5.add(-1);
        lst5.add(-1);
        lst5.add(-1);
        lst5.add(-1);
        assertEquals(-3, SumSquares1.sumSquares(lst5));

        // Test case 6
        List<Object> lst6 = new ArrayList<>();
        lst6.add(0);
        assertEquals(0, SumSquares1.sumSquares(lst6));

        // Test case 7
        List<Object> lst7 = new ArrayList<>();
        lst7.add(-56);
        lst7.add(-99);
        lst7.add(1);
        lst7.add(0);
        lst7.add(-2);
        assertEquals(3030, SumSquares1.sumSquares(lst7));

        // Test case 8
        List<Object> lst8 = new ArrayList<>();
        lst8.add(-1);
        lst8.add(0);
        lst8.add(0);
        lst8.add(0);
        lst8.add(0);
        lst8.add(0);
        lst8.add(0);
        lst8.add(0);
        lst8.add(-1);
        assertEquals(0, SumSquares1.sumSquares(lst8));

        // Test case 9
        List<Object> lst9 = new ArrayList<>();
        lst9.add(-16);
        lst9.add(-9);
        lst9.add(-2);
        lst9.add(36);
        lst9.add(36);
        lst9.add(26);
        lst9.add(-20);
        lst9.add(25);
        lst9.add(-40);
        lst9.add(20);
        lst9.add(-4);
        lst9.add(12);
        lst9.add(-26);
        lst9.add(35);
        lst9.add(37);
        assertEquals(-14196, SumSquares1.sumSquares(lst9));

        // Test case 10
        List<Object> lst10 = new ArrayList<>();
        lst10.add(-1);
        lst10.add(-3);
        lst10.add(17);
        lst10.add(-1);
        lst10.add(-15);
        lst10.add(13);
        lst10.add(-1);
        lst10.add(14);
        lst10.add(-14);
        lst10.add(-12);
        lst10.add(-5);
        lst10.add(14);
        lst10.add(-14);
        lst10.add(6);
        lst10.add(13);
        lst10.add(11);
        lst10.add(16);
        lst10.add(16);
        lst10.add(4);
        lst10.add(10);
        assertEquals(-1448, SumSquares1.sumSquares(lst10));
    }
}