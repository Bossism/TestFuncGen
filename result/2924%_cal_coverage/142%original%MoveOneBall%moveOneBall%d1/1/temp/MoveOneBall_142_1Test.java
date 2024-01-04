package original;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;

public class MoveOneBall_142_1Test {

    @Test(timeout = 8000)
    public void testMoveOneBall_emptyList() {
        List<Object> arr = new ArrayList<>();
        assertTrue(MoveOneBall.moveOneBall(arr));
    }

    @Test(timeout = 8000)
    public void testMoveOneBall_singleElement() {
        List<Object> arr = new ArrayList<>();
        arr.add(5);
        assertTrue(MoveOneBall.moveOneBall(arr));
    }

    @Test(timeout = 8000)
    public void testMoveOneBall_sortedList() {
        List<Object> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        assertTrue(MoveOneBall.moveOneBall(arr));
    }

    @Test(timeout = 8000)
    public void testMoveOneBall_unsortedList() {
        List<Object> arr = new ArrayList<>();
        arr.add(3);
        arr.add(1);
        arr.add(2);
        assertTrue(MoveOneBall.moveOneBall(arr));
    }

    @Test(timeout = 8000)
    public void testMoveOneBall_multipleInversions() {
        List<Object> arr = new ArrayList<>();
        arr.add(3);
        arr.add(2);
        arr.add(1);
        assertFalse(MoveOneBall.moveOneBall(arr));
    }
}