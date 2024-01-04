package original;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.List;

public class ParseMusic_129_1Test {

    @Test(timeout = 8000)
    public void testParseMusic() {
        // Test case 1
        String musicString1 = "o o| .| o| o| .| .| .| .| o o";
        List<Object> expected1 = List.of(4, 2, 1, 2, 2, 1, 1, 1, 1, 4, 4);
        List<Object> result1 = ParseMusic.parseMusic(musicString1);
        assertEquals(expected1, result1);

        // Test case 2
        String musicString2 = "";
        List<Object> expected2 = List.of();
        List<Object> result2 = ParseMusic.parseMusic(musicString2);
        assertEquals(expected2, result2);

        // Test case 3
        String musicString3 = "o o o o";
        List<Object> expected3 = List.of(4, 4, 4, 4);
        List<Object> result3 = ParseMusic.parseMusic(musicString3);
        assertEquals(expected3, result3);

        // Test case 4
        String musicString4 = ".| .| .| .|";
        List<Object> expected4 = List.of(1, 1, 1, 1);
        List<Object> result4 = ParseMusic.parseMusic(musicString4);
        assertEquals(expected4, result4);

        // Test case 5
        String musicString5 = "o| o| .| .| o o o o";
        List<Object> expected5 = List.of(2, 2, 1, 1, 4, 4, 4, 4);
        List<Object> result5 = ParseMusic.parseMusic(musicString5);
        assertEquals(expected5, result5);

        // Test case 6
        String musicString6 = "o| .| o| .| o o| o o|";
        List<Object> expected6 = List.of(2, 1, 2, 1, 4, 2, 4, 2);
        List<Object> result6 = ParseMusic.parseMusic(musicString6);
        assertEquals(expected6, result6);
    }
}