package original;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicates_86_1Test {

    @Test(timeout = 8000)
    public void testRemoveDuplicates() {
        List<Object> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(2);
        numbers.add(4);
        numbers.add(3);
        numbers.add(5);

        List<Object> expected = new ArrayList<>();
        expected.add(1);
        expected.add(4);
        expected.add(5);

        List<Object> result = RemoveDuplicates.removeDuplicates(numbers);

        assertEquals(expected, result);
    }
}