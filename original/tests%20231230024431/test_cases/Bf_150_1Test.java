package original;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.List;

public class Bf_150_1Test {

    @Test(timeout = 8000)
    public void testBf() {
        List<Object> expected1 = List.of("Saturn", "Uranus");
        List<Object> expected2 = List.of("Venus");
        List<Object> expected3 = List.of("Venus", "Earth", "Mars", "Jupiter", "Saturn");
        List<Object> expected4 = List.of("Earth", "Mars", "Jupiter", "Saturn", "Uranus");
        List<Object> expected5 = List.of();

        assertEquals(expected1, Bf.bf("Jupiter", "Neptune"));
        assertEquals(expected2, Bf.bf("Earth", "Mercury"));
        assertEquals(expected3, Bf.bf("Mercury", "Uranus"));
        assertEquals(expected4, Bf.bf("Neptune", "Venus"));
        assertEquals(expected5, Bf.bf("Earth", "Earth"));
        assertEquals(expected5, Bf.bf("Mars", "Earth"));
        assertEquals(expected5, Bf.bf("Jupiter", "Makemake"));
    }
}