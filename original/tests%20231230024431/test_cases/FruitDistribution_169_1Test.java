package original;
import org.junit.Test;
import static org.junit.Assert.*;

public class FruitDistribution_169_1Test {

    @Test(timeout = 8000)
    public void testFruitDistribution() {
        // Test case 1
        String s1 = "5 apples and 6 oranges";
        int n1 = 19;
        int expected1 = 8;
        int result1 = FruitDistribution.fruitDistribution(s1, n1);
        assertEquals(expected1, result1);

        // Test case 2
        String s2 = "5 apples and 6 oranges";
        int n2 = 21;
        int expected2 = 10;
        int result2 = FruitDistribution.fruitDistribution(s2, n2);
        assertEquals(expected2, result2);

        // Test case 3
        String s3 = "0 apples and 1 oranges";
        int n3 = 3;
        int expected3 = 2;
        int result3 = FruitDistribution.fruitDistribution(s3, n3);
        assertEquals(expected3, result3);

        // Test case 4
        String s4 = "1 apples and 0 oranges";
        int n4 = 3;
        int expected4 = 2;
        int result4 = FruitDistribution.fruitDistribution(s4, n4);
        assertEquals(expected4, result4);

        // Test case 5
        String s5 = "2 apples and 3 oranges";
        int n5 = 100;
        int expected5 = 95;
        int result5 = FruitDistribution.fruitDistribution(s5, n5);
        assertEquals(expected5, result5);

        // Test case 6
        String s6 = "2 apples and 3 oranges";
        int n6 = 5;
        int expected6 = 0;
        int result6 = FruitDistribution.fruitDistribution(s6, n6);
        assertEquals(expected6, result6);

        // Test case 7
        String s7 = "1 apples and 100 oranges";
        int n7 = 120;
        int expected7 = 19;
        int result7 = FruitDistribution.fruitDistribution(s7, n7);
        assertEquals(expected7, result7);
    }
}