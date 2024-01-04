package original;
package test;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;
import original.FilterByPrefix;

public class FilterByPrefix_53_1Test {

    @Test(timeout = 8000)
    public void testFilterByPrefix() {
        List<Object> strings = new ArrayList<>();
        strings.add("apple");
        strings.add("banana");
        strings.add("orange");
        strings.add("grape");
        
        String prefix = "a";
        
        List<Object> expected = new ArrayList<>();
        expected.add("apple");
        
        List<Object> result = FilterByPrefix.filterByPrefix(strings, prefix);
        
        assertEquals(expected, result);
    }
    
    @Test(timeout = 8000)
    public void testFilterByPrefix_NoMatch() {
        List<Object> strings = new ArrayList<>();
        strings.add("apple");
        strings.add("banana");
        strings.add("orange");
        strings.add("grape");
        
        String prefix = "z";
        
        List<Object> expected = new ArrayList<>();
        
        List<Object> result = FilterByPrefix.filterByPrefix(strings, prefix);
        
        assertEquals(expected, result);
    }
    
    @Test(timeout = 8000)
    public void testFilterByPrefix_EmptyList() {
        List<Object> strings = new ArrayList<>();
        
        String prefix = "a";
        
        List<Object> expected = new ArrayList<>();
        
        List<Object> result = FilterByPrefix.filterByPrefix(strings, prefix);
        
        assertEquals(expected, result);
    }
    
    @Test(timeout = 8000)
    public void testFilterByPrefix_EmptyPrefix() {
        List<Object> strings = new ArrayList<>();
        strings.add("apple");
        strings.add("banana");
        strings.add("orange");
        strings.add("grape");
        
        String prefix = "";
        
        List<Object> expected = new ArrayList<>();
        
        List<Object> result = FilterByPrefix.filterByPrefix(strings, prefix);
        
        assertEquals(expected, result);
    }
}