package original;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

public class ReverseDelete_89_1Test {

    @Test(timeout = 8000)
    public void testReverseDelete() {
        String s = "hello";
        String c = "l";
        List<Object> expected = Arrays.asList("heo", false);

        List<Object> actual = ReverseDelete.reverseDelete(s, c);

        assertEquals(expected, actual);
    }

    @Test(timeout = 8000)
    public void testReverseDeleteWithEmptyString() {
        String s = "";
        String c = "l";
        List<Object> expected = Arrays.asList("", true);

        List<Object> actual = ReverseDelete.reverseDelete(s, c);

        assertEquals(expected, actual);
    }

    @Test(timeout = 8000)
    public void testReverseDeleteWithEmptyCharacters() {
        String s = "hello";
        String c = "";
        List<Object> expected = Arrays.asList("hello", true);

        List<Object> actual = ReverseDelete.reverseDelete(s, c);

        assertEquals(expected, actual);
    }

    @Test(timeout = 8000)
    public void testReverseDeleteWithPalindrome() {
        String s = "level";
        String c = "l";
        List<Object> expected = Arrays.asList("eve", true);

        List<Object> actual = ReverseDelete.reverseDelete(s, c);

        assertEquals(expected, actual);
    }
}