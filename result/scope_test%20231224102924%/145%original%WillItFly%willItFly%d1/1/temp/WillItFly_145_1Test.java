package original;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;

public class WillItFly_145_1Test {

    @Test(timeout = 8000)
    public void testWillItFly() {
        // Test case 1: sum of elements in the list is less than w
        List<Integer> q1 = new ArrayList<>();
        q1.add(1);
        q1.add(2);
        q1.add(3);
        int w1 = 10;
        assertTrue(WillItFly.willItFly(q1, w1));

        // Test case 2: sum of elements in the list is equal to w
        List<Integer> q2 = new ArrayList<>();
        q2.add(4);
        q2.add(5);
        q2.add(6);
        int w2 = 15;
        assertTrue(WillItFly.willItFly(q2, w2));

        // Test case 3: sum of elements in the list is greater than w
        List<Integer> q3 = new ArrayList<>();
        q3.add(7);
        q3.add(8);
        q3.add(9);
        int w3 = 20;
        assertFalse(WillItFly.willItFly(q3, w3));

        // Test case 4: list is not a palindrome
        List<Integer> q4 = new ArrayList<>();
        q4.add(1);
        q4.add(2);
        q4.add(3);
        int w4 = 6;
        assertFalse(WillItFly.willItFly(q4, w4));

        // Test case 5: list is a palindrome
        List<Integer> q5 = new ArrayList<>();
        q5.add(1);
        q5.add(2);
        q5.add(1);
        int w5 = 4;
        assertTrue(WillItFly.willItFly(q5, w5));
    }
}