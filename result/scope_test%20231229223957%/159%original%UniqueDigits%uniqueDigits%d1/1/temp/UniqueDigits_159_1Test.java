package original;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.List;

public class UniqueDigits_159_1Test {

    @Test(timeout = 8000)
    public void testUniqueDigits() {
        List<Integer> input1 = Arrays.asList(15, 33, 1422, 1);
        List<Integer> expected1 = Arrays.asList(1, 15, 33);
        assertEquals(expected1, UniqueDigits.uniqueDigits(input1));

        List<Integer> input2 = Arrays.asList(152, 323, 1422, 10);
        List<Integer> expected2 = Arrays.asList();
        assertEquals(expected2, UniqueDigits.uniqueDigits(input2));

        List<Integer> input3 = Arrays.asList(12345, 2033, 111, 151);
        List<Integer> expected3 = Arrays.asList(111, 151);
        assertEquals(expected3, UniqueDigits.uniqueDigits(input3));

        List<Integer> input4 = Arrays.asList(135, 103, 31);
        List<Integer> expected4 = Arrays.asList(31, 135);
        assertEquals(expected4, UniqueDigits.uniqueDigits(input4));
    }
}