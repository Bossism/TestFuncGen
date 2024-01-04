package original;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.List;

public class SeparateParenGroups_110_1Test {

    @Test(timeout = 8000)
    public void testSeparateParenGroups() {
        List<String> result = SeparateParenGroups.separateParenGroups("(()()) ((())) () ((())()())");
        assertEquals(4, result.size());
        assertEquals("(()())", result.get(0));
        assertEquals("((()))", result.get(1));
        assertEquals("()", result.get(2));
        assertEquals("((())()())", result.get(3));
    }

    @Test(timeout = 8000)
    public void testSeparateParenGroups2() {
        List<String> result = SeparateParenGroups.separateParenGroups("() (()) ((())) (((())))");
        assertEquals(4, result.size());
        assertEquals("()", result.get(0));
        assertEquals("(())", result.get(1));
        assertEquals("((()))", result.get(2));
        assertEquals("(((())))", result.get(3));
    }

    @Test(timeout = 8000)
    public void testSeparateParenGroups3() {
        List<String> result = SeparateParenGroups.separateParenGroups("(()(())((())))");
        assertEquals(1, result.size());
        assertEquals("(()(())((())))", result.get(0));
    }

    @Test(timeout = 8000)
    public void testSeparateParenGroups4() {
        List<String> result = SeparateParenGroups.separateParenGroups("( ) (( )) (( )( ))");
        assertEquals(3, result.size());
        assertEquals("()", result.get(0));
        assertEquals("(())", result.get(1));
        assertEquals("(()())", result.get(2));
    }
}