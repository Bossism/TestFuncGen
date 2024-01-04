package original;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BelowZero_66_1Test {

    @Test(timeout = 8000)
    public void testBelowZero() {
        // Test case 1: [1, 2, 3]
        List<Object> operations1 = new ArrayList<>(Arrays.asList(1, 2, 3));
        assertFalse(BelowZero.belowZero(operations1));

        // Test case 2: [1, 2, -4, 5]
        List<Object> operations2 = new ArrayList<>(Arrays.asList(1, 2, -4, 5));
        assertTrue(BelowZero.belowZero(operations2));

        // Test case 3: []
        List<Object> operations3 = new ArrayList<>();
        assertFalse(BelowZero.belowZero(operations3));

        // Test case 4: [1, 2, -3, 1, 2, -3]
        List<Object> operations4 = new ArrayList<>(Arrays.asList(1, 2, -3, 1, 2, -3));
        assertFalse(BelowZero.belowZero(operations4));

        // Test case 5: [1, 2, -4, 5, 6]
        List<Object> operations5 = new ArrayList<>(Arrays.asList(1, 2, -4, 5, 6));
        assertTrue(BelowZero.belowZero(operations5));

        // Test case 6: [1, -1, 2, -2, 5, -5, 4, -4]
        List<Object> operations6 = new ArrayList<>(Arrays.asList(1, -1, 2, -2, 5, -5, 4, -4));
        assertFalse(BelowZero.belowZero(operations6));

        // Test case 7: [1, -1, 2, -2, 5, -5, 4, -5]
        List<Object> operations7 = new ArrayList<>(Arrays.asList(1, -1, 2, -2, 5, -5, 4, -5));
        assertTrue(BelowZero.belowZero(operations7));

        // Test case 8: [1, -2, 2, -2, 5, -5, 4, -4]
        List<Object> operations8 = new ArrayList<>(Arrays.asList(1, -2, 2, -2, 5, -5, 4, -4));
        assertTrue(BelowZero.belowZero(operations8));
    }
}