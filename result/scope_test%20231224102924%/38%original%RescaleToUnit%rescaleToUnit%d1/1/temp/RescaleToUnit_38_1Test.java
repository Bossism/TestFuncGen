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
        
        List<Double> expected = new ArrayList<>();
        expected.add(0.0);
        expected.add(0.3333333333333333);
        expected.add(0.6666666666666666);
        expected.add(1.0);
        
        List<Double> result = RescaleToUnit.rescaleToUnit(numbers);
        
        assertEquals(expected, result);
    }
}