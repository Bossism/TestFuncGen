package original;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.*;

public class Maximum1_9_1Test {

    @Test(timeout = 8000)
    public void testMaximum() {
        List<Integer> arr = Arrays.asList(5, 2, 8, 1, 9);
        int k = 3;
        
        List<Object> expected = Arrays.asList(5, 8, 9);
        List<Object> result = Maximum1.maximum(arr, k);
        
        assertEquals(expected, result);
    }
    
    @Test(timeout = 8000)
    public void testMaximumWithEmptyList() {
        List<Integer> arr = new ArrayList<>();
        int k = 3;
        
        List<Object> expected = new ArrayList<>();
        List<Object> result = Maximum1.maximum(arr, k);
        
        assertEquals(expected, result);
    }
    
    @Test(timeout = 8000)
    public void testMaximumWithZeroK() {
        List<Integer> arr = Arrays.asList(5, 2, 8, 1, 9);
        int k = 0;
        
        List<Object> expected = new ArrayList<>();
        List<Object> result = Maximum1.maximum(arr, k);
        
        assertEquals(expected, result);
    }
    
    @Test(timeout = 8000)
    public void testMaximumWithNLessThanOrEqualToK() {
        List<Integer> arr = Arrays.asList(5, 2, 8, 1, 9);
        int k = 10;
        
        List<Object> expected = Arrays.asList(1, 2, 5, 8, 9);
        List<Object> result = Maximum1.maximum(arr, k);
        
        assertEquals(expected, result);
    }
}