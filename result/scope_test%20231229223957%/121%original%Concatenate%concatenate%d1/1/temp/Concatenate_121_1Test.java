package original;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import java.util.Arrays;
import java.util.List;

public class Concatenate_121_1Test {

    @Test(timeout = 8000)
    public void testConcatenateWithEmptyList() {
        List<Object> strings = Arrays.asList();
        String result = Concatenate.concatenate(strings);
        assertEquals("", result);
    }

    @Test(timeout = 8000)
    public void testConcatenateWithNonEmptyList() {
        List<Object> strings = Arrays.asList("a", "b", "c");
        String result = Concatenate.concatenate(strings);
        assertEquals("abc", result);
    }

    @Test(timeout = 8000)
    public void testConcatenateWithEmptyString() {
        List<Object> strings = Arrays.asList("");
        String result = Concatenate.concatenate(strings);
        assertEquals("", result);
    }

    @Test(timeout = 8000)
    public void testConcatenateWithMultipleStrings() {
        List<Object> strings = Arrays.asList("x", "y", "z");
        String result = Concatenate.concatenate(strings);
        assertEquals("xyz", result);
    }

    @Test(timeout = 8000)
    public void testConcatenateWithLongList() {
        List<Object> strings = Arrays.asList("x", "y", "z", "w", "k");
        String result = Concatenate.concatenate(strings);
        assertEquals("xyzwk", result);
    }
}