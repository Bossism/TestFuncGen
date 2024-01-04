package original;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.List;

public class GetOddCollatz_139_1Test {

    @Test(timeout = 8000)
    public void testGetOddCollatz() {
        // Test case 1
        int n1 = 5;
        List<Integer> expected1 = List.of(1, 5);
        List<Integer> result1 = GetOddCollatz.getOddCollatz(n1);
        assertEquals(expected1, result1);

        // Test case 2
        int n2 = 14;
        List<Integer> expected2 = List.of(1, 5, 7, 11, 13, 17);
        List<Integer> result2 = GetOddCollatz.getOddCollatz(n2);
        assertEquals(expected2, result2);

        // Test case 3
        int n3 = 12;
        List<Integer> expected3 = List.of(1, 3, 5);
        List<Integer> result3 = GetOddCollatz.getOddCollatz(n3);
        assertEquals(expected3, result3);

        // Test case 4
        int n4 = 1;
        List<Integer> expected4 = List.of(1);
        List<Integer> result4 = GetOddCollatz.getOddCollatz(n4);
        assertEquals(expected4, result4);
    }
}