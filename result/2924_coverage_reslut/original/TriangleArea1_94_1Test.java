package original;

import org.junit.Test;
import static org.junit.Assert.*;

public class TriangleArea1_94_1Test {

    @Test(timeout = 8000)
    public void testTriangleArea() {
        // Test case 1: Valid triangle
        int a1 = 3;
        int b1 = 4;
        int c1 = 5;
        double expected1 = 6.0;
        double actual1 = TriangleArea1.triangleArea(a1, b1, c1).doubleValue();
        assertEquals(expected1, actual1, 0.01);

        // Test case 2: Invalid triangle
        int a2 = 1;
        int b2 = 2;
        int c2 = 3;
        double expected2 = -1.0;
        double actual2 = TriangleArea1.triangleArea(a2, b2, c2).doubleValue();
        assertEquals(expected2, actual2, 0.01);

        // Test case 3: Equilateral triangle
        int a3 = 5;
        int b3 = 5;
        int c3 = 5;
        double expected3 = 10.83;
        double actual3 = TriangleArea1.triangleArea(a3, b3, c3).doubleValue();
        assertEquals(expected3, actual3, 0.01);

        // Test case 4: Isosceles triangle
        int a4 = 4;
        int b4 = 4;
        int c4 = 6;
        double expected4 = 7.81;
        double actual4 = TriangleArea1.triangleArea(a4, b4, c4).doubleValue();
        assertEquals(expected4, actual4, 0.01);

        // Test case 5: Scalene triangle
        int a5 = 7;
        int b5 = 9;
        int c5 = 12;
        double expected5 = 31.64;
        double actual5 = TriangleArea1.triangleArea(a5, b5, c5).doubleValue();
        assertEquals(expected5, actual5, 0.01);
    }
}