package original;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;

public class FilterBySubstring_62_1Test {

    @Test(timeout = 8000)
    public void testFilterBySubstring() {
        List<Object> strings = new ArrayList<>();
        strings.add("apple");
        strings.add("banana");
        strings.add("orange");
        strings.add("grape");
        strings.add("kiwi");

        String substring = "an";

        List<Object> expected = new ArrayList<>();
        expected.add("banana");
        expected.add("orange");
        expected.add("grape");

        List<Object> result = FilterBySubstring.filterBySubstring(strings, substring);

        assertEquals(expected, result);
    }
}