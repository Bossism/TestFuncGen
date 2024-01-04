package original;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GetPositive_52_1Test {

    @Test(timeout = 8000)
    public void testGetPositive() {
        // Test case 1: [-1, 2, -4, 5, 6]
        List<Object> input1 = new ArrayList<>(Arrays.asList(-1, 2, -4, 5, 6));
        List<Object> expected1 = new ArrayList<>(Arrays.asList(2, 5, 6));
        assertEquals(expected1, GetPositive.getPositive(input1));

        // Test case 2: [5, 3, -5, 2, -3, 3, 9, 0, 123, 1, -10]
        List<Object> input2 = new ArrayList<>(Arrays.asList(5, 3, -5, 2, -3, 3, 9, 0, 123, 1, -10));
        List<Object> expected2 = new ArrayList<>(Arrays.asList(5, 3, 2, 3, 9, 123, 1));
        assertEquals(expected2, GetPositive.getPositive(input2));

        // Test case 3: [-1, -2]
        List<Object> input3 = new ArrayList<>(Arrays.asList(-1, -2));
        List<Object> expected3 = new ArrayList<>();
        assertEquals(expected3, GetPositive.getPositive(input3));

        // Test case 4: []
        List<Object> input4 = new ArrayList<>();
        List<Object> expected4 = new ArrayList<>();
        assertEquals(expected4, GetPositive.getPositive(input4));
    }
}