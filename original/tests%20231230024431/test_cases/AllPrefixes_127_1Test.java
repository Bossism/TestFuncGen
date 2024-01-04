package original;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.List;
import java.util.ArrayList;

public class AllPrefixes_127_1Test {

    @Test(timeout = 8000)
    public void testAllPrefixes() {
        // Test case 1: Non-empty string
        List<Object> expected1 = new ArrayList<>();
        expected1.add("a");
        expected1.add("ab");
        expected1.add("abc");
        assertEquals(expected1, AllPrefixes.allPrefixes("abc"));

        // Test case 2: Empty string
        List<Object> expected2 = new ArrayList<>();
        assertEquals(expected2, AllPrefixes.allPrefixes(""));

        // Test case 3: Non-empty string with different characters
        List<Object> expected3 = new ArrayList<>();
        expected3.add("a");
        expected3.add("as");
        expected3.add("asd");
        expected3.add("asdf");
        expected3.add("asdfg");
        expected3.add("asdfgh");
        assertEquals(expected3, AllPrefixes.allPrefixes("asdfgh"));

        // Test case 4: Non-empty string with same characters
        List<Object> expected4 = new ArrayList<>();
        expected4.add("W");
        expected4.add("WW");
        expected4.add("WWW");
        assertEquals(expected4, AllPrefixes.allPrefixes("WWW"));
    }
}