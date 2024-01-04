package original;
import java.util.ArrayList;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.List;

public class Bf_150_1Test {

    @Test(timeout = 8000)
    public void testBf() {
        List<Object> expected = List.of("Venus", "Earth", "Mars");
        List<Object> result = Bf.bf("Mercury", "Mars");
        assertEquals(expected, result);
    }

    @Test(timeout = 8000)
    public void testBfSamePlanet() {
        List<Object> expected = List.of();
        List<Object> result = Bf.bf("Earth", "Earth");
        assertEquals(expected, result);
    }

    @Test(timeout = 8000)
    public void testBfInvalidPlanets() {
        List<Object> expected = List.of();
        List<Object> result = Bf.bf("Pluto", "Mars");
        assertEquals(expected, result);
    }

    @Test(timeout = 8000)
    public void testBfInvalidOrder() {
        List<Object> expected = List.of("Mars", "Jupiter");
        List<Object> result = Bf.bf("Jupiter", "Mars");
        assertEquals(expected, result);
    }
}