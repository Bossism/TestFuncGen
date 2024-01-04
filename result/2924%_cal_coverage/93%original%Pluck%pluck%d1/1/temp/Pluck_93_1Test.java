package original;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Pluck_93_1Test {

    @Test(timeout = 8000)
    public void testPluck() {
        List<Object> arr = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        List<Object> expected = new ArrayList<>(Arrays.asList(2, 1));
        List<Object> result = Pluck.pluck(arr);
        assertEquals(expected, result);
    }

    @Test(timeout = 8000)
    public void testPluck_NoEvenNumbers() {
        List<Object> arr = new ArrayList<>(Arrays.asList(1, 3, 5));
        List<Object> expected = new ArrayList<>();
        List<Object> result = Pluck.pluck(arr);
        assertEquals(expected, result);
    }

    @Test(timeout = 8000)
    public void testPluck_EmptyList() {
        List<Object> arr = new ArrayList<>();
        List<Object> expected = new ArrayList<>();
        List<Object> result = Pluck.pluck(arr);
        assertEquals(expected, result);
    }

    @Test(timeout = 8000)
    public void testPluck_AllEvenNumbers() {
        List<Object> arr = new ArrayList<>(Arrays.asList(2, 4, 6, 8));
        List<Object> expected = new ArrayList<>(Arrays.asList(2, 0));
        List<Object> result = Pluck.pluck(arr);
        assertEquals(expected, result);
    }
}