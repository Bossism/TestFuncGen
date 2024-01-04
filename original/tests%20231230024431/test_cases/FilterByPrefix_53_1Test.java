package original;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;

public class FilterByPrefix_53_1Test {

    @Test(timeout = 8000)
    public void testFilterByPrefix_emptyList() {
        List<Object> strings = new ArrayList<>();
        String prefix = "a";
        List<Object> result = FilterByPrefix.filterByPrefix(strings, prefix);
        assertTrue(result.isEmpty());
    }

    @Test(timeout = 8000)
    public void testFilterByPrefix_matchingPrefix() {
        List<Object> strings = new ArrayList<>();
        strings.add("abc");
        strings.add("bcd");
        strings.add("cde");
        strings.add("array");
        String prefix = "a";
        List<Object> result = FilterByPrefix.filterByPrefix(strings, prefix);
        assertEquals(2, result.size());
        assertTrue(result.contains("abc"));
        assertTrue(result.contains("array"));
    }

    @Test(timeout = 8000)
    public void testFilterByPrefix_noMatchingPrefix() {
        List<Object> strings = new ArrayList<>();
        strings.add("abc");
        strings.add("bcd");
        strings.add("cde");
        strings.add("array");
        String prefix = "john";
        List<Object> result = FilterByPrefix.filterByPrefix(strings, prefix);
        assertTrue(result.isEmpty());
    }

    @Test(timeout = 8000)
    public void testFilterByPrefix_multipleMatchingPrefix() {
        List<Object> strings = new ArrayList<>();
        strings.add("xxx");
        strings.add("asd");
        strings.add("xxy");
        strings.add("john doe");
        strings.add("xxxAAA");
        strings.add("xxx");
        String prefix = "xxx";
        List<Object> result = FilterByPrefix.filterByPrefix(strings, prefix);
        assertEquals(3, result.size());
        assertTrue(result.contains("xxx"));
        assertTrue(result.contains("xxxAAA"));
        assertTrue(result.contains("xxx"));
    }
}