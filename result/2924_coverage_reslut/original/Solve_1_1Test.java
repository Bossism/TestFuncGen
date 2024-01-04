package original;
import org.junit.Test;
import static org.junit.Assert.*;

public class Solve_1_1Test {

    @Test(timeout = 8000)
    public void testSolve() {
        // Test case 1: input string contains only letters
        String input1 = "HelloWorld";
        String expected1 = "hELLOwORLD";
        String actual1 = Solve.solve(input1);
        assertEquals(expected1, actual1);

        // Test case 2: input string contains only non-letters
        String input2 = "12345";
        String expected2 = "54321";
        String actual2 = Solve.solve(input2);
        assertEquals(expected2, actual2);

        // Test case 3: input string contains both letters and non-letters
        String input3 = "Ab1Cd2Ef3";
        String expected3 = "aB1cD2eF3";
        String actual3 = Solve.solve(input3);
        assertEquals(expected3, actual3);

        // Test case 4: input string contains no letters
        String input4 = "12345";
        String expected4 = "54321";
        String actual4 = Solve.solve(input4);
        assertEquals(expected4, actual4);

        // Test case 5: input string is empty
        String input5 = "";
        String expected5 = "";
        String actual5 = Solve.solve(input5);
        assertEquals(expected5, actual5);
    }
}