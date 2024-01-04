package original;
import org.junit.Test;
import static org.junit.Assert.*;

public class Encode_161_1Test {

    @Test(timeout = 8000)
    public void testEncode() {
        // Test case 1: message = "test"
        String message1 = "test";
        String expected1 = "TGST";
        String actual1 = Encode.encode(message1);
        assertEquals(expected1, actual1);

        // Test case 2: message = "This is a message"
        String message2 = "This is a message";
        String expected2 = "tHKS KS C MGSSCGG";
        String actual2 = Encode.encode(message2);
        assertEquals(expected2, actual2);

        // Test case 3: message = "TEST"
        String message3 = "TEST";
        String expected3 = "tgst";
        String actual3 = Encode.encode(message3);
        assertEquals(expected3, actual3);

        // Test case 4: message = "Mudasir"
        String message4 = "Mudasir";
        String expected4 = "mWDCSKR";
        String actual4 = Encode.encode(message4);
        assertEquals(expected4, actual4);

        // Test case 5: message = "YES"
        String message5 = "YES";
        String expected5 = "ygs";
        String actual5 = Encode.encode(message5);
        assertEquals(expected5, actual5);

        // Test case 6: message = "I DoNt KnOw WhAt tO WrItE"
        String message6 = "I DoNt KnOw WhAt tO WrItE";
        String expected6 = "k dQnT kNqW wHcT Tq wRkTg";
        String actual6 = Encode.encode(message6);
        assertEquals(expected6, actual6);
    }
}