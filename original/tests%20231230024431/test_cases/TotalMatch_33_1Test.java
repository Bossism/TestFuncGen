package original;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.List;

public class TotalMatch_33_1Test {

    @Test(timeout = 8000)
    public void testTotalMatch_emptyLists() {
        List<Object> lst1 = Arrays.asList();
        List<Object> lst2 = Arrays.asList();
        List<Object> expected = Arrays.asList();
        List<Object> result = TotalMatch.totalMatch(lst1, lst2);
        assertEquals(expected, result);
    }

    @Test(timeout = 8000)
    public void testTotalMatch_sameTotalChars() {
        List<Object> lst1 = Arrays.asList("hi", "admin");
        List<Object> lst2 = Arrays.asList("hi", "hi");
        List<Object> expected = Arrays.asList("hi", "hi");
        List<Object> result = TotalMatch.totalMatch(lst1, lst2);
        assertEquals(expected, result);
    }

    @Test(timeout = 8000)
    public void testTotalMatch_lst1LessTotalChars() {
        List<Object> lst1 = Arrays.asList("hi", "admin");
        List<Object> lst2 = Arrays.asList("hi", "hi", "admin", "project");
        List<Object> expected = Arrays.asList("hi", "admin");
        List<Object> result = TotalMatch.totalMatch(lst1, lst2);
        assertEquals(expected, result);
    }

    @Test(timeout = 8000)
    public void testTotalMatch_lst2LessTotalChars() {
        List<Object> lst1 = Arrays.asList("hi", "admin");
        List<Object> lst2 = Arrays.asList("hI", "Hi");
        List<Object> expected = Arrays.asList("hI", "Hi");
        List<Object> result = TotalMatch.totalMatch(lst1, lst2);
        assertEquals(expected, result);
    }

    @Test(timeout = 8000)
    public void testTotalMatch_singleElementLists() {
        List<Object> lst1 = Arrays.asList("4");
        List<Object> lst2 = Arrays.asList("1", "2", "3", "4", "5");
        List<Object> expected = Arrays.asList("4");
        List<Object> result = TotalMatch.totalMatch(lst1, lst2);
        assertEquals(expected, result);
    }
}