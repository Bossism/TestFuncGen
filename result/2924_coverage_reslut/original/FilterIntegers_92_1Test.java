package original;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;

public class FilterIntegers_92_1Test {

    @Test(timeout = 8000)
    public void testFilterIntegers() {
        List<Object> values = new ArrayList<>();
        values.add(1);
        values.add("two");
        values.add(3);
        values.add("four");
        values.add(5);

        List<Object> expected = new ArrayList<>();
        expected.add(1);
        expected.add(3);
        expected.add(5);

        List<Object> result = FilterIntegers.filterIntegers(values);

        assertEquals(expected, result);
    }
}