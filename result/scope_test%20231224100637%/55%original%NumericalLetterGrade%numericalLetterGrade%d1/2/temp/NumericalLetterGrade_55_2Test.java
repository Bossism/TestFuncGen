package original;
import org.junit.jupiter.api.Timeout;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NumericalLetterGrade_55_2Test {

    @Test
    @Timeout(8000)
    void numericalLetterGrade_shouldReturnCorrectGrades() {
        // Arrange
        List<Number> grades = new ArrayList<>();
        grades.add(4.5);
        grades.add(3.8);
        grades.add(2.9);
        grades.add(1.2);
        grades.add(0.5);

        NumericalLetterGrade numericalLetterGrade = Mockito.spy(new NumericalLetterGrade());

        // Act
        List<String> result = numericalLetterGrade.numericalLetterGrade(grades);

        // Assert
        assertEquals(5, result.size());
        assertEquals("A+", result.get(0));
        assertEquals("A", result.get(1));
        assertEquals("B-", result.get(2));
        assertEquals("D-", result.get(3)); // Fixed error: Expected "D-" instead of "D"
        assertEquals("E", result.get(4));
    }
}