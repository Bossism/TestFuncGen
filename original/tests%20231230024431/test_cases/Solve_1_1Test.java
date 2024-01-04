package original;
import org.junit.Test;
import static org.junit.Assert.*;

public class Solve_1_1Test {

    @Test(timeout = 8000)
    public void testSolve_noLetters() {
        String result = Solve.solve("1234");
        assertEquals("4321", result);
    }

    @Test(timeout = 8000)
    public void testSolve_allLetters() {
        String result = Solve.solve("ab");
        assertEquals("AB", result);
    }

    @Test(timeout = 8000)
    public void testSolve_mixedLetters() {
        String result = Solve.solve("#a@C");
        assertEquals("#A@c", result);
    }

    @Test(timeout = 8000)
    public void testSolve_uppercaseLetters() {
        String result = Solve.solve("AsDf");
        assertEquals("aSdF", result);
    }

    @Test(timeout = 8000)
    public void testSolve_mixedCharacters() {
        String result = Solve.solve("#AsdfW^45");
        assertEquals("#aSDFw^45", result);
    }

    @Test(timeout = 8000)
    public void testSolve_specialCharacters() {
        String result = Solve.solve("#6@2");
        assertEquals("2@6#", result);
    }

    @Test(timeout = 8000)
    public void testSolve_mixedCaseSpecialCharacters() {
        String result = Solve.solve("#$a^D");
        assertEquals("#$A^d", result);
    }

    @Test(timeout = 8000)
    public void testSolve_allSameLetters() {
        String result = Solve.solve("#ccc");
        assertEquals("#CCC", result);
    }
}