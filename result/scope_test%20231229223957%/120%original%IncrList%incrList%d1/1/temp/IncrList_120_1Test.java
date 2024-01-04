package original;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IncrList_120_1Test {

    @Test(timeout = 8000)
    public void testIncrList() {
        // Test case 1: List with elements [1, 2, 3]
        List<Object> input1 = new ArrayList<>(Arrays.asList(1, 2, 3));
        List<Object> expected1 = new ArrayList<>(Arrays.asList(2, 3, 4));
        assertEquals(expected1, IncrList.incrList(input1));

        // Test case 2: List with elements [5, 3, 5, 2, 3, 3, 9, 0, 123]
        List<Object> input2 = new ArrayList<>(Arrays.asList(5, 3, 5, 2, 3, 3, 9, 0, 123));
        List<Object> expected2 = new ArrayList<>(Arrays.asList(6, 4, 6, 3, 4, 4, 10, 1, 124));
        assertEquals(expected2, IncrList.incrList(input2));

        // Test case 3: Empty list
        List<Object> input3 = new ArrayList<>();
        List<Object> expected3 = new ArrayList<>();
        assertEquals(expected3, IncrList.incrList(input3));

        // Test case 4: List with elements [3, 2, 1]
        List<Object> input4 = new ArrayList<>(Arrays.asList(3, 2, 1));
        List<Object> expected4 = new ArrayList<>(Arrays.asList(4, 3, 2));
        assertEquals(expected4, IncrList.incrList(input4));

        // Test case 5: List with elements [5, 2, 5, 2, 3, 3, 9, 0, 123]
        List<Object> input5 = new ArrayList<>(Arrays.asList(5, 2, 5, 2, 3, 3, 9, 0, 123));
        List<Object> expected5 = new ArrayList<>(Arrays.asList(6, 3, 6, 3, 4, 4, 10, 1, 124));
        assertEquals(expected5, IncrList.incrList(input5));
    }
}