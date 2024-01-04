package original;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.List;
import java.util.ArrayList;

public class MakeAPile_47_1Test {

    @Test(timeout = 8000)
    public void testMakeAPile() {
        List<Integer> expected = new ArrayList<>();
        expected.add(5);
        expected.add(7);
        expected.add(9);
        expected.add(11);
        expected.add(13);

        List<Integer> result = MakeAPile.makeAPile(5);

        assertEquals(expected, result);
    }
}