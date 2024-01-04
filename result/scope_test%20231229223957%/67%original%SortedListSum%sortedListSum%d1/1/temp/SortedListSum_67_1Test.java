package original;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.List;

public class SortedListSum_67_1Test {

    @Test(timeout = 8000)
    public void testSortedListSum() {
        List<String> input1 = Arrays.asList("aa", "a", "aaa");
        List<String> expected1 = Arrays.asList("aa");
        assertEquals(expected1, SortedListSum.sortedListSum(input1));

        List<String> input2 = Arrays.asList("ab", "a", "aaa", "cd");
        List<String> expected2 = Arrays.asList("ab", "cd");
        assertEquals(expected2, SortedListSum.sortedListSum(input2));

        List<String> input3 = Arrays.asList("school", "AI", "asdf", "b");
        List<String> expected3 = Arrays.asList("AI", "asdf", "school");
        assertEquals(expected3, SortedListSum.sortedListSum(input3));

        List<String> input4 = Arrays.asList("d", "b", "c", "a");
        List<String> expected4 = Arrays.asList();
        assertEquals(expected4, SortedListSum.sortedListSum(input4));

        List<String> input5 = Arrays.asList("d", "dcba", "abcd", "a");
        List<String> expected5 = Arrays.asList("abcd", "dcba");
        assertEquals(expected5, SortedListSum.sortedListSum(input5));

        List<String> input6 = Arrays.asList("AI", "ai", "au");
        List<String> expected6 = Arrays.asList("AI", "ai", "au");
        assertEquals(expected6, SortedListSum.sortedListSum(input6));

        List<String> input7 = Arrays.asList("a", "b", "b", "c", "c", "a");
        List<String> expected7 = Arrays.asList();
        assertEquals(expected7, SortedListSum.sortedListSum(input7));

        List<String> input8 = Arrays.asList("aaaa", "bbbb", "dd", "cc");
        List<String> expected8 = Arrays.asList("cc", "dd", "aaaa", "bbbb");
        assertEquals(expected8, SortedListSum.sortedListSum(input8));
    }
}