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
        grades.add(3);
        grades.add(1.7);
        grades.add(2);
        grades.add(3.5);

        List<String> expected = new ArrayList<>();
        expected.add("A+");
        expected.add("B");
        expected.add("C-");
        expected.add("C");
        expected.add("A-");

        List<String> result = NumericalLetterGrade.numericalLetterGrade(grades);

        assertEquals(expected, result);
    }

    @Test(timeout = 8000)
    public void testNumericalLetterGrade_singleGrade() {
        List<Number> grades = new ArrayList<>();
        grades.add(1.2);

        List<String> expected = new ArrayList<>();
        expected.add("D+");

        List<String> result = NumericalLetterGrade.numericalLetterGrade(grades);

        assertEquals(expected, result);
    }

    @Test(timeout = 8000)
    public void testNumericalLetterGrade_zeroGrade() {
        List<Number> grades = new ArrayList<>();
        grades.add(0.5);

        List<String> expected = new ArrayList<>();
        expected.add("D-");

        List<String> result = NumericalLetterGrade.numericalLetterGrade(grades);

        assertEquals(expected, result);
    }

    @Test(timeout = 8000)
    public void testNumericalLetterGrade_noGrade() {
        List<Number> grades = new ArrayList<>();
        grades.add(0.0);

        List<String> expected = new ArrayList<>();
        expected.add("E");

        List<String> result = NumericalLetterGrade.numericalLetterGrade(grades);

        assertEquals(expected, result);
    }

    @Test(timeout = 8000)
    public void testNumericalLetterGrade_multipleGrades() {
        List<Number> grades = new ArrayList<>();
        grades.add(1);
        grades.add(0.3);
        grades.add(1.5);
        grades.add(2.8);
        grades.add(3.3);

        List<String> expected = new ArrayList<>();
        expected.add("D");
        expected.add("D-");
        expected.add("C-");
        expected.add("B");
        expected.add("B+");

        List<String> result = NumericalLetterGrade.numericalLetterGrade(grades);

        assertEquals(expected, result);
    }

    @Test(timeout = 8000)
    public void testNumericalLetterGrade_zeroAndNonZeroGrades() {
        List<Number> grades = new ArrayList<>();
        grades.add(0);
        grades.add(0.7);

        List<String> expected = new ArrayList<>();
        expected.add("E");
        expected.add("D-");

        List<String> result = NumericalLetterGrade.numericalLetterGrade(grades);

        assertEquals(expected, result);
    }
}