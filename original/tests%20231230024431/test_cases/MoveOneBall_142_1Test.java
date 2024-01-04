package original;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

public class MoveOneBall_142_1Test {

    @Test(timeout = 8000)
    public void testMoveOneBall() {
        // Test case 1: [3, 4, 5, 1, 2]
        List<Object> arr1 = Arrays.asList(3, 4, 5, 1, 2);
        assertTrue(MoveOneBall.moveOneBall(arr1));

        // Test case 2: [3, 5, 10, 1, 2]
        List<Object> arr2 = Arrays.asList(3, 5, 10, 1, 2);
        assertTrue(MoveOneBall.moveOneBall(arr2));

        // Test case 3: [4, 3, 1, 2]
        List<Object> arr3 = Arrays.asList(4, 3, 1, 2);
        assertFalse(MoveOneBall.moveOneBall(arr3));

        // Test case 4: [3, 5, 4, 1, 2]
        List<Object> arr4 = Arrays.asList(3, 5, 4, 1, 2);
        assertFalse(MoveOneBall.moveOneBall(arr4));

        // Test case 5: []
        List<Object> arr5 = Arrays.asList();
        assertTrue(MoveOneBall.moveOneBall(arr5));
    }
}