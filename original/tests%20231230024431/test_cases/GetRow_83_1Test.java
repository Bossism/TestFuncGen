package original;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GetRow_83_1Test {

    @Test(timeout = 8000)
    public void testGetRow() {
        List<Object> lst = new ArrayList<>();
        lst.add(Arrays.asList(1, 2, 3, 4, 5, 6));
        lst.add(Arrays.asList(1, 2, 3, 4, 1, 6));
        lst.add(Arrays.asList(1, 2, 3, 4, 5, 1));

        List<Object> expected = new ArrayList<>();
        expected.add(Arrays.asList(0, 0));
        expected.add(Arrays.asList(1, 4));
        expected.add(Arrays.asList(1, 0));
        expected.add(Arrays.asList(2, 5));
        expected.add(Arrays.asList(2, 0));

        assertEquals(expected, GetRow.getRow(lst, 1));
    }

    @Test(timeout = 8000)
    public void testGetRowEmptyList() {
        List<Object> lst = new ArrayList<>();

        List<Object> expected = new ArrayList<>();

        assertEquals(expected, GetRow.getRow(lst, 1));
    }

    @Test(timeout = 8000)
    public void testGetRowNoMatches() {
        List<Object> lst = new ArrayList<>();
        lst.add(new ArrayList<>());
        lst.add(Arrays.asList(1));
        lst.add(Arrays.asList(1, 2, 3));

        List<Object> expected = new ArrayList<>();
        expected.add(Arrays.asList(2, 2));

        assertEquals(expected, GetRow.getRow(lst, 3));
    }
}