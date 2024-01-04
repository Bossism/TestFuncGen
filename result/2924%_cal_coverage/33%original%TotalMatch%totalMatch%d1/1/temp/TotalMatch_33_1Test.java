package original;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TotalMatch_33_1Test {

    @Test(timeout = 8000)
    public void testTotalMatch() {
        List<Object> lst1 = new ArrayList<>(Arrays.asList("abc", "def", 123));
        List<Object> lst2 = new ArrayList<>(Arrays.asList("ghi", "jkl", "mno"));
        
        List<Object> result = TotalMatch.totalMatch(lst1, lst2);
        
        assertEquals(lst1, result);
    }
    
    @Test(timeout = 8000)
    public void testTotalMatchWithEmptyLists() {
        List<Object> lst1 = new ArrayList<>();
        List<Object> lst2 = new ArrayList<>();
        
        List<Object> result = TotalMatch.totalMatch(lst1, lst2);
        
        assertEquals(lst1, result);
    }
    
    @Test(timeout = 8000)
    public void testTotalMatchWithOnlyStrings() {
        List<Object> lst1 = new ArrayList<>(Arrays.asList("abc", "def", "ghi"));
        List<Object> lst2 = new ArrayList<>(Arrays.asList("jkl", "mno", "pqr"));
        
        List<Object> result = TotalMatch.totalMatch(lst1, lst2);
        
        assertEquals(lst1, result);
    }
    
    @Test(timeout = 8000)
    public void testTotalMatchWithOnlyIntegers() {
        List<Object> lst1 = new ArrayList<>(Arrays.asList(1, 2, 3));
        List<Object> lst2 = new ArrayList<>(Arrays.asList(4, 5, 6));
        
        List<Object> result = TotalMatch.totalMatch(lst1, lst2);
        
        assertEquals(lst1, result);
    }
}