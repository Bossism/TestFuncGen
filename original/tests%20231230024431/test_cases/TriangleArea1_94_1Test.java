package original;
import org.junit.Test;
import static org.junit.Assert.*;

public class TriangleArea1_94_1Test {

    @Test(timeout = 8000)
    public void testTriangleAreaValidTriangle() {
        // Test valid triangles
        assertEquals(6.0, TriangleArea1.triangleArea(3, 4, 5));
        assertEquals(8.18, TriangleArea1.triangleArea(4, 8, 5));
        assertEquals(1.73, TriangleArea1.triangleArea(2, 2, 2));
        assertEquals(16.25, TriangleArea1.triangleArea(10, 5, 7));
        assertEquals(0.43, TriangleArea1.triangleArea(1, 1, 1));
    }

    @Test(timeout = 8000)
    public void testTriangleAreaInvalidTriangle() {
        // Test invalid triangles
        assertEquals(-1, TriangleArea1.triangleArea(1, 2, 10));
        assertEquals(-1, TriangleArea1.triangleArea(1, 2, 3));
        assertEquals(-1, TriangleArea1.triangleArea(2, 6, 3));
        assertEquals(-1, TriangleArea1.triangleArea(2, 2, 10));
    }
}