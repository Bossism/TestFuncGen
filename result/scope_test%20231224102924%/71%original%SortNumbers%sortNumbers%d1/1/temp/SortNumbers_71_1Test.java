package original;
import java.util.Arrays;

import org.junit.Test;
import static org.junit.Assert.*;

public class SortNumbers_71_1Test {

    @Test(timeout = 8000)
    public void testSortNumbers() {
        String numbers = "one three two";
        String expected = "one two three";
        String result = SortNumbers.sortNumbers(numbers);
        assertEquals(expected, result);
    }

    @Test(timeout = 8000)
    public void testSortNumbersWithDuplicates() {
        String numbers = "one one two two three three";
        String expected = "one one two two three three";
        String result = SortNumbers.sortNumbers(numbers);
        assertEquals(expected, result);
    }

    @Test(timeout = 8000)
    public void testSortNumbersWithInvalidInput() {
        String numbers = "one two invalid";
        String expected = "invalid one two";
        String result = SortNumbers.sortNumbers(numbers);
        assertEquals(expected, result);
    }

    @Test(timeout = 8000)
    public void testSortNumbersWithEmptyInput() {
        String numbers = "";
        String expected = "";
        String result = SortNumbers.sortNumbers(numbers);
        assertEquals(expected, result);
    }
}