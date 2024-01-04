package original;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;

public class IncrList_120_1Test {

    @Test(timeout = 8000)
    public void testIncrList() {
        List<Object> inputList = new ArrayList<>();
        inputList.add(1);
        inputList.add(2);
        inputList.add("3");
        inputList.add(4);

        List<Object> expectedList = new ArrayList<>();
        expectedList.add(2);
        expectedList.add(3);
        expectedList.add(5);

        List<Object> resultList = IncrList.incrList(inputList);

        assertEquals(expectedList, resultList);
    }
}