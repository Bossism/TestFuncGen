package original;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StrangeSortList_5_1Test {

    @Test(timeout = 8000)
    public void testStrangeSortList() {
        // Test case 1
        List<Object> input1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        List<Object> expected1 = new ArrayList<>(Arrays.asList(1, 4, 2, 3));
        assertEquals(expected1, StrangeSortList.strangeSortList(input1));

        // Test case 2
        List<Object> input2 = new ArrayList<>(Arrays.asList(5, 5, 5, 5));
        List<Object> expected2 = new ArrayList<>(Arrays.asList(5, 5, 5, 5));
        assertEquals(expected2, StrangeSortList.strangeSortList(input2));

        // Test case 3
        List<Object> input3 = new ArrayList<>();
        List<Object> expected3 = new ArrayList<>();
        assertEquals(expected3, StrangeSortList.strangeSortList(input3));

        // Test case 4
        List<Object> input4 = new ArrayList<>(Arrays.asList(5, 6, 7, 8, 9));
        List<Object> expected4 = new ArrayList<>(Arrays.asList(5, 9, 6, 8, 7));
        assertEquals(expected4, StrangeSortList.strangeSortList(input4));

        // Test case 5
        List<Object> input5 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        List<Object> expected5 = new ArrayList<>(Arrays.asList(1, 5, 2, 4, 3));
        assertEquals(expected5, StrangeSortList.strangeSortList(input5));

        // Test case 6
        List<Object> input6 = new ArrayList<>(Arrays.asList(5, 6, 7, 8, 9, 1));
        List<Object> expected6 = new ArrayList<>(Arrays.asList(1, 9, 5, 8, 6, 7));
        assertEquals(expected6, StrangeSortList.strangeSortList(input6));

        // Test case 7
        List<Object> input7 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8));
        List<Object> expected7 = new ArrayList<>(Arrays.asList(1, 8, 2, 7, 3, 6, 4, 5));
        assertEquals(expected7, StrangeSortList.strangeSortList(input7));

        // Test case 8
        List<Object> input8 = new ArrayList<>(Arrays.asList(0, 2, 2, 2, 5, 5, -5, -5));
        List<Object> expected8 = new ArrayList<>(Arrays.asList(-5, 5, -5, 5, 0, 2, 2, 2));
        assertEquals(expected8, StrangeSortList.strangeSortList(input8));

        // Test case 9
        List<Object> input9 = new ArrayList<>(Arrays.asList(111111));
        List<Object> expected9 = new ArrayList<>(Arrays.asList(111111));
        assertEquals(expected9, StrangeSortList.strangeSortList(input9));
    }
}