package original;
import java.util.ArrayList;
import java.util.Arrays;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.List;

public class Tri_20_1Test {

    @Test(timeout = 8000)
    public void testTri() {
        // Test case 1
        List<Number> result1 = Tri.tri(3);
        assertEquals(Arrays.asList(1, 3, 2.0, 8.0), result1);

        // Test case 2
        List<Number> result2 = Tri.tri(4);
        assertEquals(Arrays.asList(1, 3, 2.0, 8.0, 3.0), result2);

        // Test case 3
        List<Number> result3 = Tri.tri(5);
        assertEquals(Arrays.asList(1, 3, 2.0, 8.0, 3.0, 15.0), result3);

        // Test case 4
        List<Number> result4 = Tri.tri(6);
        assertEquals(Arrays.asList(1, 3, 2.0, 8.0, 3.0, 15.0, 4.0), result4);

        // Test case 5
        List<Number> result5 = Tri.tri(7);
        assertEquals(Arrays.asList(1, 3, 2.0, 8.0, 3.0, 15.0, 4.0, 24.0), result5);

        // Test case 6
        List<Number> result6 = Tri.tri(8);
        assertEquals(Arrays.asList(1, 3, 2.0, 8.0, 3.0, 15.0, 4.0, 24.0, 5.0), result6);

        // Test case 7
        List<Number> result7 = Tri.tri(9);
        assertEquals(Arrays.asList(1, 3, 2.0, 8.0, 3.0, 15.0, 4.0, 24.0, 5.0, 35.0), result7);

        // Test case 8
        List<Number> result8 = Tri.tri(20);
        assertEquals(Arrays.asList(1, 3, 2.0, 8.0, 3.0, 15.0, 4.0, 24.0, 5.0, 35.0, 6.0, 48.0, 7.0, 63.0, 8.0, 80.0, 9.0, 99.0, 10.0, 120.0, 11.0), result8);

        // Test case 9
        List<Number> result9 = Tri.tri(0);
        assertEquals(Arrays.asList(1), result9);

        // Test case 10
        List<Number> result10 = Tri.tri(1);
        assertEquals(Arrays.asList(1, 3), result10);
    }
}