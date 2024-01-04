package original;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;

public class NumericalLetterGrade_55_1Test {

    @Test(timeout = 8000)
    public void testNumericalLetterGrade() {
        List<Number> grades = new ArrayList<>();
        grades.add(4.0);
        grades.add(3.8);
        grades.add(3.5);
        grades.add(2.9);
        grades.add(2.6);
        grades.add(2.2);
        grades.add(1.8);
        grades.add(1.4);
        grades.add(1.1);
        grades.add(0.8);
        grades.add(0.5);
        grades.add(0.0);

        List<String> expected = new ArrayList<>();
        expected.add("A+");
        expected.add("A");
        expected.add("A-");
        expected.add("B+");
        expected.add("B");
        expected.add("B-");
        expected.add("C+");
        expected.add("C");
        expected.add("C-");
        expected.add("D+");
        expected.add("D");
        expected.add("D-");

        List<String> result = NumericalLetterGrade.numericalLetterGrade(grades);

        assertEquals(expected, result);
    }
}