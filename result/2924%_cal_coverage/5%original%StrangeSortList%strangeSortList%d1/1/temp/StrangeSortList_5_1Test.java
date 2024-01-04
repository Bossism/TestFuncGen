package original;
import java.util.Collections;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StrangeSortList_5_1Test {

    @Test(timeout = 8000)
    public void testStrangeSortList() {
        List<Object> input = new ArrayList<>(Arrays.asList(5, "hello", 3, "world", 1));
        List<Object> expectedOutput = new ArrayList<>(Arrays.asList(1, 3, 5));
        
        List<Object> result = StrangeSortList.strangeSortList(input);
        
        assertEquals(expectedOutput, result);
    }
    
    @Test(timeout = 8000)
    public void testStrangeSortListWithEmptyList() {
        List<Object> input = new ArrayList<>();
        List<Object> expectedOutput = new ArrayList<>();
        
        List<Object> result = StrangeSortList.strangeSortList(input);
        
        assertEquals(expectedOutput, result);
    }
    
    @Test(timeout = 8000)
    public void testStrangeSortListWithNoIntegers() {
        List<Object> input = new ArrayList<>(Arrays.asList("hello", "world"));
        List<Object> expectedOutput = new ArrayList<>();
        
        List<Object> result = StrangeSortList.strangeSortList(input);
        
        assertEquals(expectedOutput, result);
    }
    
    @Test(timeout = 8000)
    public void testStrangeSortListWithAllIntegers() {
        List<Object> input = new ArrayList<>(Arrays.asList(5, 3, 1));
        List<Object> expectedOutput = new ArrayList<>(Arrays.asList(1, 3, 5));
        
        List<Object> result = StrangeSortList.strangeSortList(input);
        
        assertEquals(expectedOutput, result);
    }
}