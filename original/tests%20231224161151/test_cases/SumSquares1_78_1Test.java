package original;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;

public class SumSquares1_78_1Test {

    @Test(timeout = 8000)
    public void testSumSquares() {
        List<Object> lst = new ArrayList<>();
        lst.add(2);
        lst.add(3);
        lst.add(4);
        lst.add(5);
        lst.add(6);
        lst.add(7);
        lst.add(8);
        lst.add(9);
        
        int result = SumSquares1.sumSquares(lst);
        
        assertEquals(2*2 + 3*3 + 4*4 + 5*5 + 6*6 + 7*7 + 8*8 + 9*9, result);
    }
    
    @Test(timeout = 8000)
    public void testSumSquaresEmptyList() {
        List<Object> lst = new ArrayList<>();
        
        int result = SumSquares1.sumSquares(lst);
        
        assertEquals(0, result);
    }
    
    @Test(timeout = 8000)
    public void testSumSquaresNegativeNumbers() {
        List<Object> lst = new ArrayList<>();
        lst.add(-2);
        lst.add(-3);
        lst.add(-4);
        
        int result = SumSquares1.sumSquares(lst);
        
        assertEquals((-2)*(-2) + (-3)*(-3) + (-4)*(-4), result);
    }
    
    @Test(timeout = 8000)
    public void testSumSquaresMixedNumbers() {
        List<Object> lst = new ArrayList<>();
        lst.add(2);
        lst.add(-3);
        lst.add(4);
        lst.add(-5);
        
        int result = SumSquares1.sumSquares(lst);
        
        assertEquals(2*2 + (-3)*(-3) + 4*4 + (-5)*(-5), result);
    }
}