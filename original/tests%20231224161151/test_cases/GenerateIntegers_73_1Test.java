package original;
import java.util.ArrayList;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.List;

public class GenerateIntegers_73_1Test {

    @Test(timeout = 8000)
    public void testGenerateIntegers() {
        List<Object> expected = List.of(2, 4, 6, 8);
        List<Object> actual = GenerateIntegers.generateIntegers(3, 7);
        assertEquals(expected, actual);
    }

    @Test(timeout = 8000)
    public void testGenerateIntegersWithSameValues() {
        List<Object> expected = List.of(2, 4, 6, 8);
        List<Object> actual = GenerateIntegers.generateIntegers(5, 5);
        assertEquals(expected, actual);
    }

    @Test(timeout = 8000)
    public void testGenerateIntegersWithReversedValues() {
        List<Object> expected = List.of(2, 4, 6, 8);
        List<Object> actual = GenerateIntegers.generateIntegers(7, 3);
        assertEquals(expected, actual);
    }

    @Test(timeout = 8000)
    public void testGenerateIntegersWithLowerValueGreaterThan8() {
        List<Object> expected = List.of();
        List<Object> actual = GenerateIntegers.generateIntegers(10, 7);
        assertEquals(expected, actual);
    }

    @Test(timeout = 8000)
    public void testGenerateIntegersWithUpperValueLessThan2() {
        List<Object> expected = List.of();
        List<Object> actual = GenerateIntegers.generateIntegers(1, 3);
        assertEquals(expected, actual);
    }
}