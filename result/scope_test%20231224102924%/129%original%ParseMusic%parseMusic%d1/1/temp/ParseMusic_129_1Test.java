package original;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.List;
import java.util.ArrayList;

public class ParseMusic_129_1Test {

    @Test(timeout = 8000)
    public void testParseMusic() {
        String musicString = "o|o.o";
        List<Object> expected = new ArrayList<>();
        expected.add(4);
        expected.add(2);
        expected.add(1);

        List<Object> result = ParseMusic.parseMusic(musicString);

        assertEquals(expected, result);
    }

    @Test(timeout = 8000)
    public void testParseMusicWithEmptyString() {
        String musicString = "";
        List<Object> expected = new ArrayList<>();

        List<Object> result = ParseMusic.parseMusic(musicString);

        assertEquals(expected, result);
    }

    @Test(timeout = 8000)
    public void testParseMusicWithNoSpecialCharacters() {
        String musicString = "abcdefg";
        List<Object> expected = new ArrayList<>();

        List<Object> result = ParseMusic.parseMusic(musicString);

        assertEquals(expected, result);
    }

    @Test(timeout = 8000)
    public void testParseMusicWithOnlyDots() {
        String musicString = ".....";
        List<Object> expected = new ArrayList<>();
        expected.add(1);
        expected.add(1);
        expected.add(1);
        expected.add(1);
        expected.add(1);

        List<Object> result = ParseMusic.parseMusic(musicString);

        assertEquals(expected, result);
    }
}