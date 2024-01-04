package original;
import org.junit.Test;
import static org.junit.Assert.*;

public class ValidDate_57_1Test {

    @Test(timeout = 8000)
    public void testValidDate() {
        // Test valid dates
        assertTrue(ValidDate.validDate("03-11-2000"));
        assertTrue(ValidDate.validDate("06-04-2020"));
        assertTrue(ValidDate.validDate("01-01-2007"));
        assertTrue(ValidDate.validDate("06-06-2005"));
        assertTrue(ValidDate.validDate("04-12-2003"));

        // Test invalid dates
        assertFalse(ValidDate.validDate("15-01-2012"));
        assertFalse(ValidDate.validDate("04-0-2040"));
        assertFalse(ValidDate.validDate("06/04/2020"));
        assertFalse(ValidDate.validDate("03-32-2011"));
        assertFalse(ValidDate.validDate(""));
        assertFalse(ValidDate.validDate("04-31-3000"));
        assertFalse(ValidDate.validDate("21-31-2000"));
        assertFalse(ValidDate.validDate("04122003"));
        assertFalse(ValidDate.validDate("20030412"));
        assertFalse(ValidDate.validDate("2003-04"));
        assertFalse(ValidDate.validDate("2003-04-12"));
        assertFalse(ValidDate.validDate("04-2003"));
    }
}