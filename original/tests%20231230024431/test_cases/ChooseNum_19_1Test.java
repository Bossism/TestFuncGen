package original;
import org.junit.Test;
import static org.junit.Assert.*;

public class ChooseNum_19_1Test {

    @Test(timeout = 8000)
    public void testChooseNum() {
        // Test case 1: x = 12, y = 15
        assertEquals(14, ChooseNum.chooseNum(12, 15));

        // Test case 2: x = 13, y = 12
        assertEquals(-1, ChooseNum.chooseNum(13, 12));

        // Test case 3: x = 33, y = 12354
        assertEquals(12354, ChooseNum.chooseNum(33, 12354));

        // Test case 4: x = 5234, y = 5233
        assertEquals(-1, ChooseNum.chooseNum(5234, 5233));

        // Test case 5: x = 6, y = 29
        assertEquals(28, ChooseNum.chooseNum(6, 29));

        // Test case 6: x = 27, y = 10
        assertEquals(-1, ChooseNum.chooseNum(27, 10));

        // Test case 7: x = 7, y = 7
        assertEquals(-1, ChooseNum.chooseNum(7, 7));

        // Test case 8: x = 546, y = 546
        assertEquals(546, ChooseNum.chooseNum(546, 546));
    }
}