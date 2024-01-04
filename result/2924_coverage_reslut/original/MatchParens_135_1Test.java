package original;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

public class MatchParens_135_1Test {

    @Test(timeout = 8000)
    public void testMatchParens_Yes() {
        List<String> lst = Arrays.asList("(", ")");
        String result = MatchParens.matchParens(lst);
        assertEquals("Yes", result);
    }

    @Test(timeout = 8000)
    public void testMatchParens_No() {
        List<String> lst = Arrays.asList("(", "(");
        String result = MatchParens.matchParens(lst);
        assertEquals("No", result);
    }

    @Test(timeout = 8000)
    public void testMatchParens_Yes_No() {
        List<String> lst = Arrays.asList("(", "())");
        String result = MatchParens.matchParens(lst);
        assertEquals("Yes", result);
    }

    @Test(timeout = 8000)
    public void testMatchParens_No_Yes() {
        List<String> lst = Arrays.asList("()", "(");
        String result = MatchParens.matchParens(lst);
        assertEquals("No", result);
    }

    @Test(timeout = 8000)
    public void testMatchParens_No_No() {
        List<String> lst = Arrays.asList("(", "(");
        String result = MatchParens.matchParens(lst);
        assertEquals("No", result);
    }
}