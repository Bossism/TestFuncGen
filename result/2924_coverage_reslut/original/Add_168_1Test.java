package original;
import org.junit.Test;
import static org.junit.Assert.*;

public class Add_168_1Test {

    @Test(timeout = 8000)
    public void testAdd() {
        int result = Add.add(2, 3);
        assertEquals(5, result);
    }
}