package original;
import org.junit.Test;
import static org.junit.Assert.*;

public class HowManyTimes_88_1Test {

    @Test(timeout = 8000)
    public void testHowManyTimes() {
        // Test case 1: substring is present multiple times in the string
        String string1 = "Hello, Hello, Hello";
        String substring1 = "Hello";
        int expected1 = 3;
        int result1 = HowManyTimes.howManyTimes(string1, substring1);
        assertEquals(expected1, result1);

        // Test case 2: substring is not present in the string
        String string2 = "This is a test";
        String substring2 = "Hello";
        int expected2 = 0;
        int result2 = HowManyTimes.howManyTimes(string2, substring2);
        assertEquals(expected2, result2);

        // Test case 3: substring is present only once in the string
        String string3 = "Hello, World!";
        String substring3 = "World";
        int expected3 = 1;
        int result3 = HowManyTimes.howManyTimes(string3, substring3);
        assertEquals(expected3, result3);

        // Test case 4: empty string and substring
        String string4 = "";
        String substring4 = "";
        int expected4 = 0;
        int result4 = HowManyTimes.howManyTimes(string4, substring4);
        assertEquals(expected4, result4);
    }
}