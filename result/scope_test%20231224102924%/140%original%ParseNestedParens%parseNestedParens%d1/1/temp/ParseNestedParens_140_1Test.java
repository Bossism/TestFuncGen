package original;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.List;
import java.util.ArrayList;

public class ParseNestedParens_140_1Test {

    @Test(timeout = 8000)
    public void testParseNestedParens() {
        List<Integer> expected = new ArrayList<>();
        expected.add(2);
        expected.add(1);
        expected.add(3);

        List<Integer> result = ParseNestedParens.parseNestedParens("((())())");

        assertEquals(expected, result);
    }

    @Test(timeout = 8000)
    public void testParseNestedParens_EmptyString() {
        List<Integer> expected = new ArrayList<>();

        List<Integer> result = ParseNestedParens.parseNestedParens("");

        assertEquals(expected, result);
    }

    @Test(timeout = 8000)
    public void testParseNestedParens_NoNestedParens() {
        List<Integer> expected = new ArrayList<>();
        expected.add(0);

        List<Integer> result = ParseNestedParens.parseNestedParens("()()()");

        assertEquals(expected, result);
    }

    @Test(timeout = 8000)
    public void testParseNestedParens_SingleNestedParen() {
        List<Integer> expected = new ArrayList<>();
        expected.add(2);

        List<Integer> result = ParseNestedParens.parseNestedParens("(()())");

        assertEquals(expected, result);
    }
}