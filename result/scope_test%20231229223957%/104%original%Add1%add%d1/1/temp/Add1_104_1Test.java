package original;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.List;

public class Add1_104_1Test {

    @Test(timeout = 8000)
    public void testAdd() {
        List<Integer> lst1 = Arrays.asList(4, 2, 6, 7);
        assertEquals(2, Add1.add(lst1));

        List<Integer> lst2 = Arrays.asList(4, 88);
        assertEquals(88, Add1.add(lst2));

        List<Integer> lst3 = Arrays.asList(4, 5, 6, 7, 2, 122);
        assertEquals(122, Add1.add(lst3));

        List<Integer> lst4 = Arrays.asList(4, 0, 6, 7);
        assertEquals(0, Add1.add(lst4));

        List<Integer> lst5 = Arrays.asList(4, 4, 6, 8);
        assertEquals(12, Add1.add(lst5));
    }
}