package original;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;

public class FilterBySubstring_62_1Test {

    @Test(timeout = 8000)
    public void testFilterBySubstring_emptyList() {
        List<Object> strings = new ArrayList<>();
        String substring = "a";
        List<Object> result = FilterBySubstring.filterBySubstring(strings, substring);
        assertEquals(0, result.size());
    }

    @Test(timeout = 8000)
    public void testFilterBySubstring_matchingStrings() {
        List<Object> strings = new ArrayList<>();
        strings.add("abc");
        strings.add("bacd");
        strings.add("cde");
        strings.add("array");
        String substring = "a";
        List<Object> result = FilterBySubstring.filterBySubstring(strings, substring);
        assertEquals(3, result.size());
        assertTrue(result.contains("abc"));
        assertTrue(result.contains("bacd"));
        assertTrue(result.contains("array"));
    }

    @Test(timeout = 8000)
    public void testFilterBySubstring_noMatchingStrings() {
        List<Object> strings = new ArrayList<>();
        strings.add("xyz");
        strings.add("pqr");
        strings.add("lmn");
        String substring = "a";
        List<Object> result = FilterBySubstring.filterBySubstring(strings, substring);
        assertEquals(0, result.size());
    }

    @Test(timeout = 8000)
    public void testFilterBySubstring_multipleMatches() {
        List<Object> strings = new ArrayList<>();
        strings.add("xxx");
        strings.add("asd");
        strings.add("xxy");
        strings.add("john doe");
        strings.add("xxxAAA");
        strings.add("xxx");
        String substring = "xxx";
        List<Object> result = FilterBySubstring.filterBySubstring(strings, substring);
        assertEquals(3, result.size());
        assertTrue(result.contains("xxx"));
        assertTrue(result.contains("xxxAAA"));
        assertTrue(result.contains("xxx"));
    }

    @Test(timeout = 8000)
    public void testFilterBySubstring_partialMatches() {
        List<Object> strings = new ArrayList<>();
        strings.add("xxx");
        strings.add("asd");
        strings.add("aaaxxy");
        strings.add("john doe");
        strings.add("xxxAAA");
        strings.add("xxx");
        String substring = "xx";
        List<Object> result = FilterBySubstring.filterBySubstring(strings, substring);
        assertEquals(4, result.size());
        assertTrue(result.contains("xxx"));
        assertTrue(result.contains("aaaxxy"));
        assertTrue(result.contains("xxxAAA"));
        assertTrue(result.contains("xxx"));
    }

    @Test(timeout = 8000)
    public void testFilterBySubstring_caseSensitive() {
        List<Object> strings = new ArrayList<>();
        strings.add("grunt");
        strings.add("trumpet");
        strings.add("prune");
        strings.add("gruesome");
        String substring = "run";
        List<Object> result = FilterBySubstring.filterBySubstring(strings, substring);
        assertEquals(2, result.size());
        assertTrue(result.contains("grunt"));
        assertTrue(result.contains("prune"));
    }
}