package original;
import org.junit.Test;
import static org.junit.Assert.*;

public class CorrectBracketing_43_1Test {

    @Test(timeout = 8000)
    public void testCorrectBracketing() {
        assertTrue(CorrectBracketing.correctBracketing(""));
        assertTrue(CorrectBracketing.correctBracketing("<>"));
        assertTrue(CorrectBracketing.correctBracketing("<<>>"));
        assertTrue(CorrectBracketing.correctBracketing("<<<>>>"));
        assertTrue(CorrectBracketing.correctBracketing("<<<<>>>>"));
        assertFalse(CorrectBracketing.correctBracketing("<"));
        assertFalse(CorrectBracketing.correctBracketing(">"));
        assertFalse(CorrectBracketing.correctBracketing("><"));
        assertFalse(CorrectBracketing.correctBracketing("<<>"));
        assertFalse(CorrectBracketing.correctBracketing("<>>"));
        assertFalse(CorrectBracketing.correctBracketing("<<>>><"));
    }
}