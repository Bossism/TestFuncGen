package original;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DoubleTheDifference_56_1Test {

    @Test(timeout = 8000)
    public void testDoubleTheDifference() {
        // Test case 1
        List<Object> lst1 = new ArrayList<>(Arrays.asList(1, 3, 2, 0));
        int result1 = DoubleTheDifference.doubleTheDifference(lst1);
        assertEquals(10, result1);

        // Test case 2
        List<Object> lst2 = new ArrayList<>(Arrays.asList(-1, -2, 0));
        int result2 = DoubleTheDifference.doubleTheDifference(lst2);
        assertEquals(0, result2);

        // Test case 3
        List<Object> lst3 = new ArrayList<>(Arrays.asList(9, -2));
        int result3 = DoubleTheDifference.doubleTheDifference(lst3);
        assertEquals(81, result3);

        // Test case 4
        List<Object> lst4 = new ArrayList<>(Arrays.asList(0));
        int result4 = DoubleTheDifference.doubleTheDifference(lst4);
        assertEquals(0, result4);

        // Test case 5
        List<Object> lst5 = new ArrayList<>();
        int result5 = DoubleTheDifference.doubleTheDifference(lst5);
        assertEquals(0, result5);

        // Test case 6
        List<Object> lst6 = new ArrayList<>(Arrays.asList(5, 4));
        int result6 = DoubleTheDifference.doubleTheDifference(lst6);
        assertEquals(25, result6);

        // Test case 7
        List<Object> lst7 = new ArrayList<>(Arrays.asList(0.1, 0.2, 0.3));
        int result7 = DoubleTheDifference.doubleTheDifference(lst7);
        assertEquals(0, result7);

        // Test case 8
        List<Object> lst8 = new ArrayList<>(Arrays.asList(-10, -20, -30));
        int result8 = DoubleTheDifference.doubleTheDifference(lst8);
        assertEquals(0, result8);

        // Test case 9
        List<Object> lst9 = new ArrayList<>(Arrays.asList(-1, -2, 8));
        int result9 = DoubleTheDifference.doubleTheDifference(lst9);
        assertEquals(0, result9);

        // Test case 10
        List<Object> lst10 = new ArrayList<>(Arrays.asList(0.2, 3, 5));
        int result10 = DoubleTheDifference.doubleTheDifference(lst10);
        assertEquals(34, result10);

        // Test case 11
        List<Object> lst11 = new ArrayList<>(Arrays.asList(-99, -97, -95, -93, -91, -89, -87, -85, -83, -81, -79, -77, -75, -73, -71, -69, -67, -65, -63, -61, -59, -57, -55, -53, -51, -49, -47, -45, -43, -41, -39, -37, -35, -33, -31, -29, -27, -25, -23, -21, -19, -17, -15, -13, -11, -9, -7, -5, -3, -1, 1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21, 23, 25, 27, 29, 31, 33, 35, 37, 39, 41, 43, 45, 47, 49, 51, 53, 55, 57, 59, 61, 63, 65, 67, 69, 71, 73, 75, 77, 79, 81, 83, 85, 87, 89, 91, 93, 95, 97, 99));
        int result11 = DoubleTheDifference.doubleTheDifference(lst11);
        assertEquals(166650, result11);
    }
}