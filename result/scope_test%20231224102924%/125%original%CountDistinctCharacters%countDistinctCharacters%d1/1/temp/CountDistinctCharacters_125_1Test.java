package original;
import java.util.HashSet;
import java.util.Set;

import org.junit.Test;
import static org.junit.Assert.*;

public class CountDistinctCharacters_125_1Test {

    @Test(timeout = 8000)
    public void testCountDistinctCharacters() {
        String string = "Hello World";
        int expected = 8;
        int actual = CountDistinctCharacters.countDistinctCharacters(string);
        assertEquals(expected, actual);
    }

    @Test(timeout = 8000)
    public void testCountDistinctCharactersWithEmptyString() {
        String string = "";
        int expected = 0;
        int actual = CountDistinctCharacters.countDistinctCharacters(string);
        assertEquals(expected, actual);
    }

    @Test(timeout = 8000)
    public void testCountDistinctCharactersWithNullString() {
        String string = null;
        int expected = 0;
        int actual = CountDistinctCharacters.countDistinctCharacters(string);
        assertEquals(expected, actual);
    }

    @Test(timeout = 8000)
    public void testCountDistinctCharactersWithRepeatedCharacters() {
        String string = "Hello";
        int expected = 4;
        int actual = CountDistinctCharacters.countDistinctCharacters(string);
        assertEquals(expected, actual);
    }
}