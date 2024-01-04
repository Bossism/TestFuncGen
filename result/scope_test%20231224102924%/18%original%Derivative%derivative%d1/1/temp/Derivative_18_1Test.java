package original;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Derivative_18_1Test {

    @Test(timeout = 8000)
    public void testDerivative() {
        List<Integer> xs = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        List<Object> expected = new ArrayList<>(Arrays.asList(2, 6, 12, 20));
        List<Object> result = Derivative.derivative(xs);
        assertEquals(expected, result);
    }

    @Test(timeout = 8000)
    public void testDerivativeWithEmptyList() {
        List<Integer> xs = new ArrayList<>();
        List<Object> expected = new ArrayList<>();
        List<Object> result = Derivative.derivative(xs);
        assertEquals(expected, result);
    }

    @Test(timeout = 8000)
    public void testDerivativeWithSingleElementList() {
        List<Integer> xs = new ArrayList<>(Arrays.asList(1));
        List<Object> expected = new ArrayList<>();
        List<Object> result = Derivative.derivative(xs);
        assertEquals(expected, result);
    }

    @Test(timeout = 8000)
    public void testDerivativeWithNegativeNumbers() {
        List<Integer> xs = new ArrayList<>(Arrays.asList(-1, -2, -3, -4, -5));
        List<Object> expected = new ArrayList<>(Arrays.asList(-2, -6, -12, -20));
        List<Object> result = Derivative.derivative(xs);
        assertEquals(expected, result);
    }
}