package original;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;

public class LargestSmallestIntegers_126_1Test {

    @Test(timeout = 8000)
    public void testLargestSmallestIntegers() {
        List<Object> lst = new ArrayList<>();
        lst.add(5);
        lst.add(-10);
        lst.add(3);
        lst.add(-7);
        lst.add(2);
        lst.add(0);
        
        List<Integer> expected = new ArrayList<>();
        expected.add(-7);
        expected.add(2);
        
        List<Integer> result = LargestSmallestIntegers.largestSmallestIntegers(lst);
        
        assertEquals(expected, result);
    }
    
    @Test(timeout = 8000)
    public void testLargestSmallestIntegersWithEmptyList() {
        List<Object> lst = new ArrayList<>();
        
        List<Integer> expected = new ArrayList<>();
        expected.add(null);
        expected.add(null);
        
        List<Integer> result = LargestSmallestIntegers.largestSmallestIntegers(lst);
        
        assertEquals(expected, result);
    }
    
    @Test(timeout = 8000)
    public void testLargestSmallestIntegersWithOnlyNegativeNumbers() {
        List<Object> lst = new ArrayList<>();
        lst.add(-5);
        lst.add(-10);
        lst.add(-3);
        lst.add(-7);
        
        List<Integer> expected = new ArrayList<>();
        expected.add(-3);
        expected.add(null);
        
        List<Integer> result = LargestSmallestIntegers.largestSmallestIntegers(lst);
        
        assertEquals(expected, result);
    }
    
    @Test(timeout = 8000)
    public void testLargestSmallestIntegersWithOnlyPositiveNumbers() {
        List<Object> lst = new ArrayList<>();
        lst.add(5);
        lst.add(10);
        lst.add(3);
        lst.add(7);
        
        List<Integer> expected = new ArrayList<>();
        expected.add(null);
        expected.add(3);
        
        List<Integer> result = LargestSmallestIntegers.largestSmallestIntegers(lst);
        
        assertEquals(expected, result);
    }
    
    @Test(timeout = 8000)
    public void testLargestSmallestIntegersWithZero() {
        List<Object> lst = new ArrayList<>();
        lst.add(0);
        
        List<Integer> expected = new ArrayList<>();
        expected.add(null);
        expected.add(null);
        
        List<Integer> result = LargestSmallestIntegers.largestSmallestIntegers(lst);
        
        assertEquals(expected, result);
    }
}