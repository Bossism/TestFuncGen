package original;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Add1_104_1Test {

    @Test(timeout = 8000)
    public void testAdd() {
        List<Integer> lst = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        int result = Add1.add(lst);
        assertEquals(12, result);
    }

    @Test(timeout = 8000)
    public void testAddEmptyList() {
        List<Integer> lst = new ArrayList<>();
        int result = Add1.add(lst);
        assertEquals(0, result);
    }

    @Test(timeout = 8000)
    public void testAddNoEvenNumbers() {
        List<Integer> lst = new ArrayList<>(Arrays.asList(1, 3, 5));
        int result = Add1.add(lst);
        assertEquals(0, result);
    }

    @Test(timeout = 8000)
    public void testAddNoOddIndices() {
        List<Integer> lst = new ArrayList<>(Arrays.asList(2, 4, 6));
        int result = Add1.add(lst);
        assertEquals(0, result);
    }

    @Test(timeout = 8000)
    public void testAddNullList() {
        List<Integer> lst = null;
        int result = Add1.add(lst);
        assertEquals(0, result);
    }
}