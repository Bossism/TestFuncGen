package original;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.List;

public class HasCloseElements_151_1Test {

    @Test(timeout = 8000)
    public void testHasCloseElements() {
        List<Double> numbers = Arrays.asList(1.0, 2.0, 3.0, 4.0, 5.0);
        Double threshold = 0.5;
        
        assertFalse(HasCloseElements.hasCloseElements(numbers, threshold));
    }
    
    @Test(timeout = 8000)
    public void testHasCloseElementsWithCloseElements() {
        List<Double> numbers = Arrays.asList(1.0, 2.0, 3.0, 4.0, 5.0);
        Double threshold = 2.0;
        
        assertTrue(HasCloseElements.hasCloseElements(numbers, threshold));
    }
    
    @Test(timeout = 8000)
    public void testHasCloseElementsWithEmptyList() {
        List<Double> numbers = Arrays.asList();
        Double threshold = 0.5;
        
        assertFalse(HasCloseElements.hasCloseElements(numbers, threshold));
    }
    
    @Test(timeout = 8000)
    public void testHasCloseElementsWithSingleElement() {
        List<Double> numbers = Arrays.asList(1.0);
        Double threshold = 0.5;
        
        assertFalse(HasCloseElements.hasCloseElements(numbers, threshold));
    }
    
    @Test(timeout = 8000)
    public void testHasCloseElementsWithNullList() {
        List<Double> numbers = null;
        Double threshold = 0.5;
        
        assertFalse(HasCloseElements.hasCloseElements(numbers, threshold));
    }
    
    @Test(timeout = 8000, expected = NullPointerException.class)
    public void testHasCloseElementsWithNullThreshold() {
        List<Double> numbers = Arrays.asList(1.0, 2.0, 3.0, 4.0, 5.0);
        Double threshold = null;
        
        HasCloseElements.hasCloseElements(numbers, threshold);
    }
}