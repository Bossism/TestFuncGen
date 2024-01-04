package original;
import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.List;
import java.util.Arrays;

public class WordsString_63_1Test {

    @Test(timeout = 8000)
    public void testWordsString() {
        // Test case 1
        String input1 = "Hi, my name is John";
        List<Object> expected1 = Arrays.asList("Hi", "my", "name", "is", "John");
        assertEquals(expected1, WordsString.wordsString(input1));

        // Test case 2
        String input2 = "One, two, three, four, five, six";
        List<Object> expected2 = Arrays.asList("One", "two", "three", "four", "five", "six");
        assertEquals(expected2, WordsString.wordsString(input2));

        // Test case 3
        String input3 = "Hi, my name";
        List<Object> expected3 = Arrays.asList("Hi", "my", "name");
        assertEquals(expected3, WordsString.wordsString(input3));

        // Test case 4
        String input4 = "One,, two, three, four, five, six,";
        List<Object> expected4 = Arrays.asList("One", "two", "three", "four", "five", "six");
        assertEquals(expected4, WordsString.wordsString(input4));

        // Test case 5
        String input5 = "";
        List<Object> expected5 = new ArrayList<Object>();
        assertEquals(expected5, WordsString.wordsString(input5));

        // Test case 6
        String input6 = "ahmed     , gamal";
        List<Object> expected6 = Arrays.asList("ahmed", "gamal");
        assertEquals(expected6, WordsString.wordsString(input6));
    }
}