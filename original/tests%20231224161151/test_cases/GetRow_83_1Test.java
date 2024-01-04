package original;
import java.util.Collections;
import java.util.Comparator;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GetRow_83_1Test {

    @Test(timeout = 8000)
    public void testGetRow() {
        List<Object> lst = new ArrayList<>();
        lst.add(Arrays.asList(1, 2, 3));
        lst.add(Arrays.asList(4, 5, 6));
        lst.add(Arrays.asList(7, 8, 9));

        List<Object> expected = new ArrayList<>();
        expected.add(Arrays.asList(1, 1));
        expected.add(Arrays.asList(2, 1));

        List<Object> result = GetRow.getRow(lst, 5);

        assertEquals(expected, result);
    }

    @Test(timeout = 8000)
    public void testGetRow_NoMatches() {
        List<Object> lst = new ArrayList<>();
        lst.add(Arrays.asList(1, 2, 3));
        lst.add(Arrays.asList(4, 5, 6));
        lst.add(Arrays.asList(7, 8, 9));

        List<Object> expected = new ArrayList<>();

        List<Object> result = GetRow.getRow(lst, 10);

        assertEquals(expected, result);
    }

    @Test(timeout = 8000)
    public void testGetRow_EmptyList() {
        List<Object> lst = new ArrayList<>();

        List<Object> expected = new ArrayList<>();

        List<Object> result = GetRow.getRow(lst, 5);

        assertEquals(expected, result);
    }
}