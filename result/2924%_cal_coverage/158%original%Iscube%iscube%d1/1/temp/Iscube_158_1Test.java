package original;

import org.junit.Test;
import static org.junit.Assert.*;

public class Iscube_158_1Test {

    @Test(timeout = 8000)
    public void testIscube() {
        // Test positive numbers
        assertTrue(Iscube.iscube(1));
        assertTrue(Iscube.iscube(8));
        assertTrue(Iscube.iscube(27));
        assertTrue(Iscube.iscube(64));
        assertTrue(Iscube.iscube(125));
        assertTrue(Iscube.iscube(216));
        assertTrue(Iscube.iscube(343));
        assertTrue(Iscube.iscube(512));
        assertTrue(Iscube.iscube(729));
        assertTrue(Iscube.iscube(1000));

        // Test negative numbers
        assertFalse(Iscube.iscube(-1));
        assertFalse(Iscube.iscube(-8));
        assertFalse(Iscube.iscube(-27));
        assertFalse(Iscube.iscube(-64));
        assertFalse(Iscube.iscube(-125));
        assertFalse(Iscube.iscube(-216));
        assertFalse(Iscube.iscube(-343));
        assertFalse(Iscube.iscube(-512));
        assertFalse(Iscube.iscube(-729));
        assertFalse(Iscube.iscube(-1000));

        // Test zero
        assertTrue(Iscube.iscube(0));
    }
}