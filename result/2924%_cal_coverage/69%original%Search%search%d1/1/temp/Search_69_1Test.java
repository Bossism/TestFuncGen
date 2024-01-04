package original;

import org.junit.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static org.junit.Assert.assertEquals;

public class Search_69_1Test {

    @Test(timeout = 8000)
    public void testSearch() {
        List<Integer> lst = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        int result = Search.search(lst);
        assertEquals(1, result);
    }

    @Test(timeout = 8000)
    public void testSearchWithDuplicates() {
        List<Integer> lst = new ArrayList<>(Arrays.asList(1, 1, 2, 2, 3, 3, 4, 4, 5, 5));
        int result = Search.search(lst);
        assertEquals(5, result);
    }

    @Test(timeout = 8000)
    public void testSearchWithNoValidNumber() {
        List<Integer> lst = new ArrayList<>(Arrays.asList(11, 12, 13, 14, 15, 16, 17, 18, 19, 20));
        int result = Search.search(lst);
        assertEquals(-1, result);
    }

    @Test(timeout = 8000)
    public void testSearchWithEmptyList() {
        List<Integer> lst = new ArrayList<>();
        int result = Search.search(lst);
        assertEquals(-1, result);
    }
}