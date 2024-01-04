package original;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.List;

public class GenerateIntegers_73_1Test {

    @Test(timeout = 8000)
    public void testGenerateIntegers() {
        // Test case 1: a = 2, b = 8
        List<Object> result1 = GenerateIntegers.generateIntegers(2, 8);
        assertEquals(4, result1.size());
        assertTrue(result1.contains(2));
        assertTrue(result1.contains(4));
        assertTrue(result1.contains(6));
        assertTrue(result1.contains(8));

        // Test case 2: a = 8, b = 2
        List<Object> result2 = GenerateIntegers.generateIntegers(8, 2);
        assertEquals(4, result2.size());
        assertTrue(result2.contains(2));
        assertTrue(result2.contains(4));
        assertTrue(result2.contains(6));
        assertTrue(result2.contains(8));

        // Test case 3: a = 10, b = 14
        List<Object> result3 = GenerateIntegers.generateIntegers(10, 14);
        assertEquals(0, result3.size());

        // Test case 4: a = 2, b = 10
        List<Object> result4 = GenerateIntegers.generateIntegers(2, 10);
        assertEquals(4, result4.size());
        assertTrue(result4.contains(2));
        assertTrue(result4.contains(4));
        assertTrue(result4.contains(6));
        assertTrue(result4.contains(8));

        // Test case 5: a = 10, b = 2
        List<Object> result5 = GenerateIntegers.generateIntegers(10, 2);
        assertEquals(4, result5.size());
        assertTrue(result5.contains(2));
        assertTrue(result5.contains(4));
        assertTrue(result5.contains(6));
        assertTrue(result5.contains(8));

        // Test case 6: a = 132, b = 2
        List<Object> result6 = GenerateIntegers.generateIntegers(132, 2);
        assertEquals(4, result6.size());
        assertTrue(result6.contains(2));
        assertTrue(result6.contains(4));
        assertTrue(result6.contains(6));
        assertTrue(result6.contains(8));

        // Test case 7: a = 17, b = 89
        List<Object> result7 = GenerateIntegers.generateIntegers(17, 89);
        assertEquals(0, result7.size());
    }
}