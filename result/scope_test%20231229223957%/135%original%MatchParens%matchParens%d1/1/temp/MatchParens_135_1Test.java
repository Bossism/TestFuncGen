package original;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

public class MatchParens_135_1Test {

    @Test(timeout = 8000)
    public void testMatchParens() {
        List<String> lst1 = Arrays.asList("()(", ")");
        assertEquals("Yes", MatchParens.matchParens(lst1));

        List<String> lst2 = Arrays.asList(")", ")");
        assertEquals("No", MatchParens.matchParens(lst2));

        List<String> lst3 = Arrays.asList("(()(())", "())())");
        assertEquals("No", MatchParens.matchParens(lst3));

        List<String> lst4 = Arrays.asList(")())", "(()()(");
        assertEquals("Yes", MatchParens.matchParens(lst4));

        List<String> lst5 = Arrays.asList("(())))", "(()())((");
        assertEquals("Yes", MatchParens.matchParens(lst5));

        List<String> lst6 = Arrays.asList("()", "())");
        assertEquals("No", MatchParens.matchParens(lst6));

        List<String> lst7 = Arrays.asList("(()(", "()))()");
        assertEquals("Yes", MatchParens.matchParens(lst7));

        List<String> lst8 = Arrays.asList("((((", "((())");
        assertEquals("No", MatchParens.matchParens(lst8));

        List<String> lst9 = Arrays.asList(")(()", "(()(");
        assertEquals("No", MatchParens.matchParens(lst9));

        List<String> lst10 = Arrays.asList(")(", ")(");
        assertEquals("No", MatchParens.matchParens(lst10));

        List<String> lst11 = Arrays.asList("(", ")");
        assertEquals("Yes", MatchParens.matchParens(lst11));

        List<String> lst12 = Arrays.asList(")", "(");
        assertEquals("Yes", MatchParens.matchParens(lst12));
    }
}