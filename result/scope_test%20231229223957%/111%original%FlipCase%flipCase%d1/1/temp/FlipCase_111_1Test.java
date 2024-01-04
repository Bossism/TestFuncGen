package original;
import org.junit.Test;
import static org.junit.Assert.*;

public class FlipCase_111_1Test {

    @Test(timeout = 8000)
    public void testFlipCase() {
        // Test case 1: flipCase("Hello")
        String result1 = FlipCase.flipCase("Hello");
        assertEquals("hELLO", result1);

        // Test case 2: flipCase("")
        String result2 = FlipCase.flipCase("");
        assertEquals("", result2);

        // Test case 3: flipCase("Hello!")
        String result3 = FlipCase.flipCase("Hello!");
        assertEquals("hELLO!", result3);

        // Test case 4: flipCase("These violent delights have violent ends")
        String result4 = FlipCase.flipCase("These violent delights have violent ends");
        assertEquals("tHESE VIOLENT DELIGHTS HAVE VIOLENT ENDS", result4);
    }
}