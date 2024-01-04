package original;
import org.junit.Test;
import static org.junit.Assert.*;

public class CarRaceCollision_117_1Test {

    @Test(timeout = 8000)
    public void testCarRaceCollision() {
        // Test case 1: n = 2
        int result1 = CarRaceCollision.carRaceCollision(2);
        assertEquals(4, result1);

        // Test case 2: n = 3
        int result2 = CarRaceCollision.carRaceCollision(3);
        assertEquals(9, result2);

        // Test case 3: n = 4
        int result3 = CarRaceCollision.carRaceCollision(4);
        assertEquals(16, result3);

        // Test case 4: n = 8
        int result4 = CarRaceCollision.carRaceCollision(8);
        assertEquals(64, result4);

        // Test case 5: n = 10
        int result5 = CarRaceCollision.carRaceCollision(10);
        assertEquals(100, result5);
    }
}