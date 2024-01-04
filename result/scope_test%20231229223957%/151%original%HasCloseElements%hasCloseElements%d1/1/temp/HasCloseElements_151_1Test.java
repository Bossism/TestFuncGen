package original;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

public class HasCloseElements_151_1Test {

    @Test(timeout = 8000)
    public void testHasCloseElements() {
        List<Double> numbers1 = Arrays.asList(1.0, 2.0, 3.0);
        assertFalse(HasCloseElements.hasCloseElements(numbers1, 0.5));

        List<Double> numbers2 = Arrays.asList(1.0, 2.8, 3.0, 4.0, 5.0, 2.0);
        assertTrue(HasCloseElements.hasCloseElements(numbers2, 0.3));

        List<Double> numbers3 = Arrays.asList(1.0, 2.0, 3.9, 4.0, 5.0, 2.2);
        assertTrue(HasCloseElements.hasCloseElements(numbers3, 0.3));

        List<Double> numbers4 = Arrays.asList(1.0, 2.0, 3.9, 4.0, 5.0, 2.2);
        assertFalse(HasCloseElements.hasCloseElements(numbers4, 0.05));

        List<Double> numbers5 = Arrays.asList(1.0, 2.0, 5.9, 4.0, 5.0);
        assertTrue(HasCloseElements.hasCloseElements(numbers5, 0.95));

        List<Double> numbers6 = Arrays.asList(1.0, 2.0, 5.9, 4.0, 5.0);
        assertFalse(HasCloseElements.hasCloseElements(numbers6, 0.8));

        List<Double> numbers7 = Arrays.asList(1.0, 2.0, 3.0, 4.0, 5.0, 2.0);
        assertTrue(HasCloseElements.hasCloseElements(numbers7, 0.1));

        List<Double> numbers8 = Arrays.asList(1.1, 2.2, 3.1, 4.1, 5.1);
        assertTrue(HasCloseElements.hasCloseElements(numbers8, 1.0));

        List<Double> numbers9 = Arrays.asList(1.1, 2.2, 3.1, 4.1, 5.1);
        assertFalse(HasCloseElements.hasCloseElements(numbers9, 0.5));
    }
}