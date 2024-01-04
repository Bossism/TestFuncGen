package original;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.List;
import java.util.ArrayList;

public class F_98_1Test {

    @Test(timeout = 8000)
    public void testSum() {
        assertEquals(1, F.f(1).get(0).intValue());
        assertEquals(2, F.f(2).get(1).intValue());
        assertEquals(6, F.f(3).get(2).intValue());
        assertEquals(24, F.f(4).get(3).intValue());
        assertEquals(15, F.f(5).get(4).intValue());
        assertEquals(720, F.f(6).get(5).intValue());
        assertEquals(28, F.f(7).get(6).intValue());
    }
}