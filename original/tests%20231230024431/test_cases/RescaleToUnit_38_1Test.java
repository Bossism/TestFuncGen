package original;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;

public class RescaleToUnit_38_1Test {

    @Test(timeout = 8000)
    public void testRescaleToUnit() {
        List<Double> numbers = new ArrayList<>();
        numbers.add(1.0);
        numbers.add(2.0);
        numbers.add(3.0);
        numbers.add(4.0);
        numbers.add(5.0);

        List<Double> expected = new ArrayList<>();
        expected.add(0.0);
        expected.add(0.25);
        expected.add(0.5);
        expected.add(0.75);
        expected.add(1.0);

        List<Double> result = RescaleToUnit.rescaleToUnit(numbers);

        assertEquals(expected, result);
    }

    @Test(timeout = 8000)
    public void testRescaleToUnitWithTwoElements() {
        List<Double> numbers = new ArrayList<>();
        numbers.add(2.0);
        numbers.add(49.9);

        List<Double> expected = new ArrayList<>();
        expected.add(0.0);
        expected.add(1.0);

        List<Double> result = RescaleToUnit.rescaleToUnit(numbers);

        assertEquals(expected, result);
    }

    @Test(timeout = 8000)
    public void testRescaleToUnitWithReverseOrder() {
        List<Double> numbers = new ArrayList<>();
        numbers.add(100.0);
        numbers.add(49.9);

        List<Double> expected = new ArrayList<>();
        expected.add(1.0);
        expected.add(0.0);

        List<Double> result = RescaleToUnit.rescaleToUnit(numbers);

        assertEquals(expected, result);
    }

    @Test(timeout = 8000)
    public void testRescaleToUnitWithDuplicateElements() {
        List<Double> numbers = new ArrayList<>();
        numbers.add(1.0);
        numbers.add(2.0);
        numbers.add(3.0);
        numbers.add(4.0);
        numbers.add(5.0);

        List<Double> expected = new ArrayList<>();
        expected.add(0.0);
        expected.add(0.25);
        expected.add(0.5);
        expected.add(0.75);
        expected.add(1.0);

        List<Double> result = RescaleToUnit.rescaleToUnit(numbers);

        assertEquals(expected, result);
    }

    @Test(timeout = 8000)
    public void testRescaleToUnitWithUnorderedElements() {
        List<Double> numbers = new ArrayList<>();
        numbers.add(2.0);
        numbers.add(1.0);
        numbers.add(5.0);
        numbers.add(3.0);
        numbers.add(4.0);

        List<Double> expected = new ArrayList<>();
        expected.add(0.25);
        expected.add(0.0);
        expected.add(1.0);
        expected.add(0.5);
        expected.add(0.75);

        List<Double> result = RescaleToUnit.rescaleToUnit(numbers);

        assertEquals(expected, result);
    }

    @Test(timeout = 8000)
    public void testRescaleToUnitWithUnorderedElementsAndDuplicateValues() {
        List<Double> numbers = new ArrayList<>();
        numbers.add(12.0);
        numbers.add(11.0);
        numbers.add(15.0);
        numbers.add(13.0);
        numbers.add(14.0);

        List<Double> expected = new ArrayList<>();
        expected.add(0.25);
        expected.add(0.0);
        expected.add(1.0);
        expected.add(0.5);
        expected.add(0.75);

        List<Double> result = RescaleToUnit.rescaleToUnit(numbers);

        assertEquals(expected, result);
    }
}