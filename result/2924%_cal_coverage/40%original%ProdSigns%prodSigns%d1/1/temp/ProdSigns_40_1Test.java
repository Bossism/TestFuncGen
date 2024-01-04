package original;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProdSigns_40_1Test {

    @Test(timeout = 8000)
    public void testProdSigns_emptyList() {
        List<Object> arr = new ArrayList<>();
        Integer result = ProdSigns.prodSigns(arr);
        assertNull(result);
    }

    @Test(timeout = 8000)
    public void testProdSigns_positiveNumbers() {
        List<Object> arr = Arrays.asList(2, 4, 6);
        Integer result = ProdSigns.prodSigns(arr);
        assertEquals(Integer.valueOf(48), result);
    }

    @Test(timeout = 8000)
    public void testProdSigns_negativeNumbers() {
        List<Object> arr = Arrays.asList(-2, -4, -6);
        Integer result = ProdSigns.prodSigns(arr);
        assertEquals(Integer.valueOf(-48), result);
    }

    @Test(timeout = 8000)
    public void testProdSigns_mixedNumbers() {
        List<Object> arr = Arrays.asList(-2, 4, -6);
        Integer result = ProdSigns.prodSigns(arr);
        assertEquals(Integer.valueOf(-48), result);
    }

    @Test(timeout = 8000)
    public void testProdSigns_zeroNumbers() {
        List<Object> arr = Arrays.asList(0, 0, 0);
        Integer result = ProdSigns.prodSigns(arr);
        assertEquals(Integer.valueOf(0), result);
    }

    @Test(timeout = 8000)
    public void testProdSigns_nonIntegerValues() {
        List<Object> arr = Arrays.asList(2, "4", 6);
        Integer result = ProdSigns.prodSigns(arr);
        assertNull(result);
    }
}