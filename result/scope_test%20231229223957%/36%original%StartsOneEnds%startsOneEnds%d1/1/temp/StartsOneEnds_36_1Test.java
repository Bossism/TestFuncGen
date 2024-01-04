package original;
import org.junit.Test;
import static org.junit.Assert.*;

public class StartsOneEnds_36_1Test {

    @Test(timeout = 8000)
    public void testStartsOneEnds() {
        assertEquals(1, StartsOneEnds.startsOneEnds(1));
        assertEquals(18, StartsOneEnds.startsOneEnds(2));
        assertEquals(180, StartsOneEnds.startsOneEnds(3));
        assertEquals(1800, StartsOneEnds.startsOneEnds(4));
        assertEquals(18000, StartsOneEnds.startsOneEnds(5));
    }
}