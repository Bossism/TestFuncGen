package original;
import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.List;

public class CountUpTo_153_1Test {

    @Test(timeout = 8000)
    public void testCountUpTo() {
        List<Object> expected = new ArrayList<>();
        expected.add(2);
        expected.add(3);
        expected.add(5);
        expected.add(7);
        expected.add(11);
        
        List<Object> result = CountUpTo.countUpTo(12);
        
        assertEquals(expected, result);
    }
    
    @Test(timeout = 8000)
    public void testCountUpToWithNegativeNumber() {
        List<Object> expected = new ArrayList<>();
        
        List<Object> result = CountUpTo.countUpTo(-5);
        
        assertEquals(expected, result);
    }
    
    @Test(timeout = 8000)
    public void testCountUpToWithZero() {
        List<Object> expected = new ArrayList<>();
        
        List<Object> result = CountUpTo.countUpTo(0);
        
        assertEquals(expected, result);
    }
    
    @Test(timeout = 8000)
    public void testCountUpToWithOne() {
        List<Object> expected = new ArrayList<>();
        
        List<Object> result = CountUpTo.countUpTo(1);
        
        assertEquals(expected, result);
    }
}