package original;

import org.junit.Test;
import static org.junit.Assert.*;

public class ChooseNum_19_1Test {

    @Test(timeout = 8000)
    public void testChooseNum() {
        int result = ChooseNum.chooseNum(1, 10);
        assertEquals(10, result);
    }

    @Test(timeout = 8000)
    public void testChooseNumWithNegativeNumbers() {
        int result = ChooseNum.chooseNum(-10, -1);
        assertEquals(-2, result);
    }

    @Test(timeout = 8000)
    public void testChooseNumWithNoEvenNumbers() {
        int result = ChooseNum.chooseNum(1, 5);
        assertEquals(-1, result);
    }

    @Test(timeout = 8000)
    public void testChooseNumWithSingleNumber() {
        int result = ChooseNum.chooseNum(5, 5);
        assertEquals(-1, result);
    }

    @Test(timeout = 8000)
    public void testChooseNumWithDescendingRange() {
        int result = ChooseNum.chooseNum(10, 1);
        assertEquals(-1, result);
    }
}