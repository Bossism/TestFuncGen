package original;
import org.junit.Test;
import static org.junit.Assert.*;

public class StringToMd5_149_1Test {

    @Test(timeout = 8000)
    public void testStringToMd5() {
        String input = "Hello World";
        String expectedOutput = "b10a8db164e0754105b7a99be72e3fe5";

        String actualOutput = StringToMd5.stringToMd5(input);

        assertEquals(expectedOutput, actualOutput);
    }

    @Test(timeout = 8000)
    public void testStringToMd5WithEmptyString() {
        String input = "";
        String expectedOutput = null;

        String actualOutput = StringToMd5.stringToMd5(input);

        assertEquals(expectedOutput, actualOutput);
    }
}