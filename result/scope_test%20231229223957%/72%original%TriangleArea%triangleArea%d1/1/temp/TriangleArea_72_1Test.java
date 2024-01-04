package original;
import org.junit.Test;
import static org.junit.Assert.*;

public class TriangleArea_72_1Test {

    @Test(timeout = 8000)
    public void testTriangleArea() {
        // Test case 1: a = 5, h = 3
        int a1 = 5;
        int h1 = 3;
        double expected1 = 7.5;
        double result1 = TriangleArea.triangleArea(a1, h1);
        assertEquals(expected1, result1, 0.001);

        // Test case 2: a = 2, h = 2
        int a2 = 2;
        int h2 = 2;
        double expected2 = 2.0;
        double result2 = TriangleArea.triangleArea(a2, h2);
        assertEquals(expected2, result2, 0.001);

        // Test case 3: a = 10, h = 8
        int a3 = 10;
        int h3 = 8;
        double expected3 = 40.0;
        double result3 = TriangleArea.triangleArea(a3, h3);
        assertEquals(expected3, result3, 0.001);
    }
}