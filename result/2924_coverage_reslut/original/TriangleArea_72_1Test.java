package original;
import org.junit.Test;
import static org.junit.Assert.*;

public class TriangleArea_72_1Test {

    @Test(timeout = 8000)
    public void testTriangleArea() {
        // Test case 1: a = 5, h = 4
        int a1 = 5;
        int h1 = 4;
        double expected1 = 10.0;
        double result1 = TriangleArea.triangleArea(a1, h1);
        assertEquals(expected1, result1, 0.001);

        // Test case 2: a = 10, h = 3
        int a2 = 10;
        int h2 = 3;
        double expected2 = 15.0;
        double result2 = TriangleArea.triangleArea(a2, h2);
        assertEquals(expected2, result2, 0.001);

        // Test case 3: a = 7, h = 7
        int a3 = 7;
        int h3 = 7;
        double expected3 = 24.5;
        double result3 = TriangleArea.triangleArea(a3, h3);
        assertEquals(expected3, result3, 0.001);
    }
}