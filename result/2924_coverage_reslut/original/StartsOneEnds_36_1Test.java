package original;

import org.junit.Test;
import static org.junit.Assert.*;

public class StartsOneEnds_36_1Test {

    @Test(timeout = 8000)
    public void testStartsOneEnds() {
        assertEquals(0, StartsOneEnds.startsOneEnds(0));
        assertEquals(1, StartsOneEnds.startsOneEnds(1));
        assertEquals(19, StartsOneEnds.startsOneEnds(2));
        assertEquals(271, StartsOneEnds.startsOneEnds(3));
        assertEquals(3439, StartsOneEnds.startsOneEnds(4));
        assertEquals(40951, StartsOneEnds.startsOneEnds(5));
        assertEquals(468559, StartsOneEnds.startsOneEnds(6));
        assertEquals(5202209, StartsOneEnds.startsOneEnds(7));
        assertEquals(57624271, StartsOneEnds.startsOneEnds(8));
        assertEquals(636867839, StartsOneEnds.startsOneEnds(9));
        assertEquals(7025546239L, StartsOneEnds.startsOneEnds(10));
    }
}