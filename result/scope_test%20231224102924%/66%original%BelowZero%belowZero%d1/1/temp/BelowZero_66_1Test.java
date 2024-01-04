package original;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

public class BelowZero_66_1Test {

    @Test(timeout = 8000)
    public void testBelowZero() {
        List<Object> operations = new ArrayList<>();
        operations.add(10.0);
        operations.add(5);
        operations.add(-8.0);
        operations.add(3);

        boolean result = BelowZero.belowZero(operations);

        assertTrue(result);
    }

    @Test(timeout = 8000)
    public void testBelowZero_NoOperations() {
        List<Object> operations = new ArrayList<>();

        boolean result = BelowZero.belowZero(operations);

        assertFalse(result);
    }

    @Test(timeout = 8000, expected = IllegalArgumentException.class)
    public void testBelowZero_InvalidOperationType() {
        List<Object> operations = new ArrayList<>();
        operations.add("invalid");

        BelowZero.belowZero(operations);
    }
}