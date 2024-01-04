package original;
import org.junit.Test;
import static org.junit.Assert.*;

public class ChangeBase_122_1Test {

    @Test(timeout = 8000)
    public void testChangeBase() {
        assertEquals("22", ChangeBase.changeBase(8, 3));
        assertEquals("1000", ChangeBase.changeBase(8, 2));
        assertEquals("111", ChangeBase.changeBase(7, 2));
        assertEquals("22", ChangeBase.changeBase(8, 3));
        assertEquals("100", ChangeBase.changeBase(9, 3));
        assertEquals("11101010", ChangeBase.changeBase(234, 2));
        assertEquals("10000", ChangeBase.changeBase(16, 2));
        assertEquals("1000", ChangeBase.changeBase(8, 2));
        assertEquals("111", ChangeBase.changeBase(7, 2));
        assertEquals("2", ChangeBase.changeBase(2, 3));
        assertEquals("3", ChangeBase.changeBase(3, 4));
        assertEquals("4", ChangeBase.changeBase(4, 5));
        assertEquals("5", ChangeBase.changeBase(5, 6));
        assertEquals("6", ChangeBase.changeBase(6, 7));
        assertEquals("7", ChangeBase.changeBase(7, 8));
    }
}