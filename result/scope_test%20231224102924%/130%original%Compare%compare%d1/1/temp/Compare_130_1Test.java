package original;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;

public class Compare_130_1Test {

    @Test(timeout = 8000)
    public void testCompare() {
        List<Integer> game = new ArrayList<>();
        game.add(1);
        game.add(2);
        game.add(3);

        List<Integer> guess = new ArrayList<>();
        guess.add(4);
        guess.add(2);
        guess.add(1);

        List<Integer> expected = new ArrayList<>();
        expected.add(3);
        expected.add(0);
        expected.add(2);

        List<Integer> result = Compare.compare(game, guess);

        assertEquals(expected, result);
    }
}