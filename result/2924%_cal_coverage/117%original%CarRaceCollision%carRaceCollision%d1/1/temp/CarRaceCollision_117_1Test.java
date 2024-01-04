package original;
import org.junit.Test;
import static org.junit.Assert.*;

public class CarRaceCollision_117_1Test {

    @Test(timeout = 8000)
    public void testCarRaceCollision() {
        int n = 5;
        int expectedCount = n * n;
        int actualCount = CarRaceCollision.carRaceCollision(n);
        assertEquals(expectedCount, actualCount);
    }
}