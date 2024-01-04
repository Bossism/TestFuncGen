package original;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.List;

public class MaxElement_152_1Test {

    @Test(timeout = 8000)
    public void testMaxElement() {
        List<Integer> list1 = Arrays.asList(1, 2, 3);
        assertEquals(3, MaxElement.maxElement(list1));

        List<Integer> list2 = Arrays.asList(5, 3, -5, 2, -3, 3, 9, 0, 123, 1, -10);
        assertEquals(123, MaxElement.maxElement(list2));

        List<Integer> list3 = Arrays.asList(1, 2, 3);
        assertEquals(3, MaxElement.maxElement(list3));

        List<Integer> list4 = Arrays.asList(5, 3, -5, 2, -3, 3, 9, 0, 124, 1, -10);
        assertEquals(124, MaxElement.maxElement(list4));
    }
}