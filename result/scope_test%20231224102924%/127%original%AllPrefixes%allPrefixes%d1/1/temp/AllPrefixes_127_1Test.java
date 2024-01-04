package original;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;

public class AllPrefixes_127_1Test {

    @Test(timeout = 8000)
    public void testAllPrefixes() {
        List<Object> expected = new ArrayList<>();
        expected.add("a");
        expected.add("ab");
        expected.add("abc");
        expected.add("abcd");
        expected.add("abcde");

        List<Object> result = AllPrefixes.allPrefixes("abcde");

        assertEquals(expected, result);
    }
}