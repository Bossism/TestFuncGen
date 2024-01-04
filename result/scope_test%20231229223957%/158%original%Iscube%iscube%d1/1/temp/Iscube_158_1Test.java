package original;
import org.junit.Test;
import static org.junit.Assert.*;

public class Iscube_158_1Test {

    @Test(timeout = 8000)
    public void testIscube() {
        // Test cases from the examples
        assertTrue(Iscube.iscube(1));
        assertFalse(Iscube.iscube(2));
        assertTrue(Iscube.iscube(-1));
        assertTrue(Iscube.iscube(64));
        assertTrue(Iscube.iscube(0));
        assertFalse(Iscube.iscube(180));

        // Additional test cases
        assertTrue(Iscube.iscube(1000));
        assertTrue(Iscube.iscube(1728));
        assertFalse(Iscube.iscube(1729));
    }
}