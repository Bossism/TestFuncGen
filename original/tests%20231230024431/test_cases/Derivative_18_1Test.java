package original;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Derivative_18_1Test {

    @Test(timeout = 8000)
    public void testDerivative() {
        // Test case 1
        List<Integer> xs1 = Arrays.asList(3, 1, 2, 4, 5);
        List<Object> expected1 = Arrays.asList(1, 4, 12, 20);
        assertEquals(expected1, Derivative.derivative(xs1));

        // Test case 2
        List<Integer> xs2 = Arrays.asList(1, 2, 3);
        List<Object> expected2 = Arrays.asList(2, 6);
        assertEquals(expected2, Derivative.derivative(xs2));

        // Test case 3
        List<Integer> xs3 = Arrays.asList(3, 2, 1);
        List<Object> expected3 = Arrays.asList(2, 2);
        assertEquals(expected3, Derivative.derivative(xs3));

        // Test case 4
        List<Integer> xs4 = Arrays.asList(3, 2, 1, 0, 4);
        List<Object> expected4 = Arrays.asList(2, 2, 0, 16);
        assertEquals(expected4, Derivative.derivative(xs4));

        // Test case 5
        List<Integer> xs5 = Arrays.asList(1);
        List<Object> expected5 = new ArrayList<>();
        assertEquals(expected5, Derivative.derivative(xs5));
    }
}