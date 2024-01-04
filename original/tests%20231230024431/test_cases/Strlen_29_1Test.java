package original;
import org.junit.Test;
import static org.junit.Assert.*;

public class Strlen_29_1Test {

    @Test(timeout = 8000)
    public void testStrlenWithEmptyString() {
        int result = Strlen.strlen("");
        assertEquals(0, result);
    }

    @Test(timeout = 8000)
    public void testStrlenWithNonEmptyString() {
        int result = Strlen.strlen("abc");
        assertEquals(3, result);
    }

    @Test(timeout = 8000)
    public void testStrlenWithSingleCharacterString() {
        int result = Strlen.strlen("x");
        assertEquals(1, result);
    }

    @Test(timeout = 8000)
    public void testStrlenWithLongString() {
        int result = Strlen.strlen("asdasnakj");
        assertEquals(9, result);
    }
}