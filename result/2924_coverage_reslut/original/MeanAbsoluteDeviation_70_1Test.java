package original;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.List;

public class MeanAbsoluteDeviation_70_1Test {

    @Test(timeout = 8000)
    public void testMeanAbsoluteDeviation() {
        List<Double> numbers = Arrays.asList(1.0, 2.0, 3.0, 4.0, 5.0);
        Double expected = 1.2;
        Double result = MeanAbsoluteDeviation.meanAbsoluteDeviation(numbers);
        assertEquals(expected, result, 0.001);
    }

    @Test(timeout = 8000)
    public void testMeanAbsoluteDeviationWithEmptyList() {
        List<Double> numbers = Arrays.asList();
        Double expected = 0.0;
        Double result = MeanAbsoluteDeviation.meanAbsoluteDeviation(numbers);
        assertEquals(expected, result, 0.0); // Updated delta value to 0.0
    }

    @Test(timeout = 8000)
    public void testMeanAbsoluteDeviationWithSingleNumber() {
        List<Double> numbers = Arrays.asList(1.0);
        Double expected = 0.0;
        Double result = MeanAbsoluteDeviation.meanAbsoluteDeviation(numbers);
        assertEquals(expected, result, 0.001);
    }

    @Test(timeout = 8000)
    public void testMeanAbsoluteDeviationWithNegativeNumbers() {
        List<Double> numbers = Arrays.asList(-1.0, -2.0, -3.0, -4.0, -5.0);
        Double expected = 1.2;
        Double result = MeanAbsoluteDeviation.meanAbsoluteDeviation(numbers);
        assertEquals(expected, result, 0.001);
    }
}