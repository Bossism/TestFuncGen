package original;
import org.junit.Test;
import static org.junit.Assert.*;

public class CountDistinctCharacters_125_1Test {

    @Test(timeout = 8000)
    public void testCountDistinctCharacters() {
        // Test case 1: string with distinct characters
        String string1 = "xyzXYZ";
        int expected1 = 3;
        int actual1 = CountDistinctCharacters.countDistinctCharacters(string1);
        assertEquals(expected1, actual1);

        // Test case 2: string with all lowercase characters
        String string2 = "jerry";
        int expected2 = 4;
        int actual2 = CountDistinctCharacters.countDistinctCharacters(string2);
        assertEquals(expected2, actual2);

        // Test case 3: empty string
        String string3 = "";
        int expected3 = 0;
        int actual3 = CountDistinctCharacters.countDistinctCharacters(string3);
        assertEquals(expected3, actual3);

        // Test case 4: string with all distinct characters
        String string4 = "abcde";
        int expected4 = 5;
        int actual4 = CountDistinctCharacters.countDistinctCharacters(string4);
        assertEquals(expected4, actual4);

        // Test case 5: string with mixed case characters
        String string5 = "abcdecadeCADE";
        int expected5 = 5;
        int actual5 = CountDistinctCharacters.countDistinctCharacters(string5);
        assertEquals(expected5, actual5);

        // Test case 6: string with all same characters
        String string6 = "aaaaAAAAaaaa";
        int expected6 = 1;
        int actual6 = CountDistinctCharacters.countDistinctCharacters(string6);
        assertEquals(expected6, actual6);

        // Test case 7: string with mixed case characters and spaces
        String string7 = "Jerry jERRY JeRRRY";
        int expected7 = 5;
        int actual7 = CountDistinctCharacters.countDistinctCharacters(string7);
        assertEquals(expected7, actual7);
    }
}