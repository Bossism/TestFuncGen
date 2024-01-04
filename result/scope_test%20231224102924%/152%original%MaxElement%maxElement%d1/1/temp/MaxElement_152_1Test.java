package original;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.List;

public class MaxElement_152_1Test {

    @Test(timeout = 8000)
    public void testMaxElement() {
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
        assertEquals(5, MaxElement.maxElement(list1));

        List<Integer> list2 = Arrays.asList(10, 20, 30, 40, 50);
        assertEquals(50, MaxElement.maxElement(list2));

        List<Integer> list3 = Arrays.asList(-1, -2, -3, -4, -5);
        assertEquals(-1, MaxElement.maxElement(list3));

        List<Integer> list4 = Arrays.asList(5);
        assertEquals(5, MaxElement.maxElement(list4));

        List<Integer> list5 = Arrays.asList();
        try {
            MaxElement.maxElement(list5);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("List cannot be empty", e.getMessage());
        } catch (Exception e) {
            fail("Expected IllegalArgumentException");
        }
    }
}