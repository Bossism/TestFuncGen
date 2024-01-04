package original;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SumProduct_164_1Test {

    @Test(timeout = 8000)
    public void testSumProduct() {
        List<Object> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        List<Integer> expected = new ArrayList<>(Arrays.asList(15, 120));
        List<Integer> result = SumProduct.sumProduct(numbers);
        assertEquals(expected, result);
    }

    @Test(timeout = 8000, expected = IllegalArgumentException.class)
    public void testSumProductWithInvalidNumberType() {
        List<Object> numbers = new ArrayList<>(Arrays.asList(1, 2, "3", 4, 5));
        SumProduct.sumProduct(numbers);
    }
}