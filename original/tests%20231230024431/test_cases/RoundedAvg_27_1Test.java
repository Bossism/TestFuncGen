package original;
import org.junit.Test;
import static org.junit.Assert.*;

public class RoundedAvg_27_1Test {

    @Test(timeout = 8000)
    public void testRoundedAvg() {
        // Test case 1
        assertEquals("0b11", RoundedAvg.roundedAvg(1, 5));

        // Test case 2
        assertEquals(-1, RoundedAvg.roundedAvg(7, 5));

        // Test case 3
        assertEquals("0b1111", RoundedAvg.roundedAvg(10, 20));

        // Test case 4
        assertEquals("0b11010", RoundedAvg.roundedAvg(20, 33));

        // Test case 5
        assertEquals("0b1010", RoundedAvg.roundedAvg(7, 13));

        // Test case 6
        assertEquals("0b1111001010", RoundedAvg.roundedAvg(964, 977));

        // Test case 7
        assertEquals("0b1111100100", RoundedAvg.roundedAvg(996, 997));

        // Test case 8
        assertEquals("0b1011000010", RoundedAvg.roundedAvg(560, 851));

        // Test case 9
        assertEquals("0b101101110", RoundedAvg.roundedAvg(185, 546));

        // Test case 10
        assertEquals("0b110101101", RoundedAvg.roundedAvg(362, 496));

        // Test case 11
        assertEquals("0b1001110010", RoundedAvg.roundedAvg(350, 902));

        // Test case 12
        assertEquals("0b11010111", RoundedAvg.roundedAvg(197, 233));

        // Test case 13
        assertEquals(-1, RoundedAvg.roundedAvg(7, 5));

        // Test case 14
        assertEquals(-1, RoundedAvg.roundedAvg(5, 1));

        // Test case 15
        assertEquals("0b101", RoundedAvg.roundedAvg(5, 5));
    }
}