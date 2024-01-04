package original;
import org.junit.Test;
import static org.junit.Assert.*;

public class GetClosestVowel_155_1Test {

    @Test(timeout = 8000)
    public void testGetClosestVowel() {
        // Test cases from the example
        assertEquals("u", GetClosestVowel.getClosestVowel("yogurt"));
        assertEquals("U", GetClosestVowel.getClosestVowel("FULL"));
        assertEquals("", GetClosestVowel.getClosestVowel("quick"));
        assertEquals("", GetClosestVowel.getClosestVowel("ab"));

        // Additional test cases
        assertEquals("", GetClosestVowel.getClosestVowel("easy"));
        assertEquals("", GetClosestVowel.getClosestVowel("eAsy"));
        assertEquals("", GetClosestVowel.getClosestVowel("ali"));
        assertEquals("a", GetClosestVowel.getClosestVowel("bad"));
        assertEquals("o", GetClosestVowel.getClosestVowel("most"));
        assertEquals("", GetClosestVowel.getClosestVowel("ba"));
        assertEquals("", GetClosestVowel.getClosestVowel("quick"));
        assertEquals("i", GetClosestVowel.getClosestVowel("anime"));
        assertEquals("", GetClosestVowel.getClosestVowel("Asia"));
        assertEquals("o", GetClosestVowel.getClosestVowel("Above"));
    }
}