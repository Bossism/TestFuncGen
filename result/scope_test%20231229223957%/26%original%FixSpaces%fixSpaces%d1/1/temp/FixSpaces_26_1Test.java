package original;
import org.junit.Test;
import static org.junit.Assert.*;

public class FixSpaces_26_1Test {

    @Test(timeout = 8000)
    public void testFixSpaces_noSpaces() {
        String result = FixSpaces.fixSpaces("Example");
        assertEquals("Example", result);
    }

    @Test(timeout = 8000)
    public void testFixSpaces_singleSpace() {
        String result = FixSpaces.fixSpaces("Example 1");
        assertEquals("Example_1", result);
    }

    @Test(timeout = 8000)
    public void testFixSpaces_leadingSpace() {
        String result = FixSpaces.fixSpaces(" Example 2");
        assertEquals("_Example_2", result);
    }

    @Test(timeout = 8000)
    public void testFixSpaces_consecutiveSpaces() {
        String result = FixSpaces.fixSpaces(" Example   3");
        assertEquals("_Example-3", result);
    }

    @Test(timeout = 8000)
    public void testFixSpaces_multipleWords() {
        String result = FixSpaces.fixSpaces("Mudasir Hanif ");
        assertEquals("Mudasir_Hanif_", result);
    }

    @Test(timeout = 8000)
    public void testFixSpaces_multipleConsecutiveSpaces() {
        String result = FixSpaces.fixSpaces("Yellow Yellow  Dirty  Fellow");
        assertEquals("Yellow_Yellow__Dirty__Fellow", result);
    }

    @Test(timeout = 8000)
    public void testFixSpaces_multipleConsecutiveSpacesWithWord() {
        String result = FixSpaces.fixSpaces("Exa   mple");
        assertEquals("Exa-mple", result);
    }

    @Test(timeout = 8000)
    public void testFixSpaces_multipleConsecutiveSpacesWithNumbers() {
        String result = FixSpaces.fixSpaces("   Exa 1 2 2 mple");
        assertEquals("-Exa_1_2_2_mple", result);
    }
}