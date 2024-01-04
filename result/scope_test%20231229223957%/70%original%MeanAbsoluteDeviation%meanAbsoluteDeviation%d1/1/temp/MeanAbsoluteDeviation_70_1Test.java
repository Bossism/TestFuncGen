package original;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.List;

public class MeanAbsoluteDeviation_70_1Test {

    @Test(timeout = 8000)
    public void testMeanAbsoluteDeviation() {
        List<Double> numbers1 = Arrays.asList(1.0, 2.0, 3.0);
        assertEquals(0.6666666666666666, MeanAbsoluteDeviation.meanAbsoluteDeviation(numbers1), 0.0001);

        List<Double> numbers2 = Arrays.asList(1.0, 2.0, 3.0, 4.0);
        assertEquals(1.0, MeanAbsoluteDeviation.meanAbsoluteDeviation(numbers2), 0.0001);

        List<Double> numbers3 = Arrays.asList(1.0, 2.0, 3.0, 4.0, 5.0);
        assertEquals(1.2, MeanAbsoluteDeviation.meanAbsoluteDeviation(numbers3), 0.0001);
    }
}