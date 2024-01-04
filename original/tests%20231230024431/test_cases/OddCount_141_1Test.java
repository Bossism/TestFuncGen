package original;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;

public class OddCount_141_1Test {

    @Test(timeout = 8000)
    public void testOddCount() {
        List<String> input1 = new ArrayList<>();
        input1.add("1234567");
        List<String> expected1 = new ArrayList<>();
        expected1.add("the number of odd elements 4n the str4ng 4 of the 4nput.");
        assertEquals(expected1, OddCount.oddCount(input1));

        List<String> input2 = new ArrayList<>();
        input2.add("3");
        input2.add("11111111");
        List<String> expected2 = new ArrayList<>();
        expected2.add("the number of odd elements 1n the str1ng 1 of the 1nput.");
        expected2.add("the number of odd elements 8n the str8ng 8 of the 8nput.");
        assertEquals(expected2, OddCount.oddCount(input2));

        List<String> input3 = new ArrayList<>();
        input3.add("271");
        input3.add("137");
        input3.add("314");
        List<String> expected3 = new ArrayList<>();
        expected3.add("the number of odd elements 2n the str2ng 2 of the 2nput.");
        expected3.add("the number of odd elements 3n the str3ng 3 of the 3nput.");
        expected3.add("the number of odd elements 2n the str2ng 2 of the 2nput.");
        assertEquals(expected3, OddCount.oddCount(input3));
    }
}