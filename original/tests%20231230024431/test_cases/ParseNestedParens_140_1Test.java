package original;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.List;
import java.util.ArrayList;

public class ParseNestedParens_140_1Test {

    @Test(timeout = 8000)
    public void testParseNestedParens() {
        List<Integer> expected1 = new ArrayList<>();
        expected1.add(2);
        expected1.add(3);
        expected1.add(1);
        expected1.add(3);
        assertEquals(expected1, ParseNestedParens.parseNestedParens("(()()) ((())) () ((())()())"));

        List<Integer> expected2 = new ArrayList<>();
        expected2.add(1);
        expected2.add(2);
        expected2.add(3);
        expected2.add(4);
        assertEquals(expected2, ParseNestedParens.parseNestedParens("() (()) ((())) (((())))"));

        List<Integer> expected3 = new ArrayList<>();
        expected3.add(4);
        assertEquals(expected3, ParseNestedParens.parseNestedParens("(()(())((())))"));
    }
}