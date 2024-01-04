package original;
import org.junit.Test;
import static org.junit.Assert.*;

public class StringSequence_74_1Test {

    @Test(timeout = 8000)
    public void testStringSequence() {
        // Test case 1: n = 0
        int n1 = 0;
        String expected1 = "0";
        String result1 = StringSequence.stringSequence(n1);
        assertEquals(expected1, result1);

        // Test case 2: n = 5
        int n2 = 5;
        String expected2 = "0 1 2 3 4 5";
        String result2 = StringSequence.stringSequence(n2);
        assertEquals(expected2, result2);
    }
}