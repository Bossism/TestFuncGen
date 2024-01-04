package original;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;

public class Concatenate_121_1Test {

    @Test(timeout = 8000)
    public void testConcatenate() {
        List<Object> strings = new ArrayList<>();
        strings.add("Hello");
        strings.add(" ");
        strings.add("World");

        String result = Concatenate.concatenate(strings);

        assertEquals("Hello World", result);
    }

    @Test(timeout = 8000)
    public void testConcatenateWithEmptyList() {
        List<Object> strings = new ArrayList<>();

        String result = Concatenate.concatenate(strings);

        assertEquals("", result);
    }

    @Test(timeout = 8000)
    public void testConcatenateWithNullValues() {
        List<Object> strings = new ArrayList<>();
        strings.add(null);
        strings.add("Hello");
        strings.add(null);
        strings.add("World");

        String result = Concatenate.concatenate(strings);

        assertEquals("nullHellonullWorld", result);
    }
}