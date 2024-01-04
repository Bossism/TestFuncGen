package original;

import org.junit.Test;
import static org.junit.Assert.*;

public class ValidDate_57_1Test {

    @Test(timeout = 8000)
    public void testValidDate() {
        // Test valid date
        assertTrue(ValidDate.validDate("01-01-2022"));
        assertTrue(ValidDate.validDate("02-29-2020"));
        assertTrue(ValidDate.validDate("12-31-2023"));

        // Test invalid date
        assertFalse(ValidDate.validDate("00-01-2022")); // Invalid month
        assertFalse(ValidDate.validDate("13-01-2022")); // Invalid month
        assertFalse(ValidDate.validDate("01-00-2022")); // Invalid day
        assertFalse(ValidDate.validDate("01-32-2022")); // Invalid day
        assertFalse(ValidDate.validDate("02-30-2022")); // Invalid day for February
        assertFalse(ValidDate.validDate("04-31-2022")); // Invalid day for April
        assertFalse(ValidDate.validDate("06-31-2022")); // Invalid day for June
        assertFalse(ValidDate.validDate("09-31-2022")); // Invalid day for September
        assertFalse(ValidDate.validDate("11-31-2022")); // Invalid day for November
        assertFalse(ValidDate.validDate("01-01-22")); // Invalid year
        assertFalse(ValidDate.validDate("01-01-20222")); // Invalid year
        assertFalse(ValidDate.validDate("01-01-202a")); // Invalid year
        assertFalse(ValidDate.validDate("01-01-2022-")); // Invalid format
        assertFalse(ValidDate.validDate("01/01/2022")); // Invalid format
        assertFalse(ValidDate.validDate("01-01")); // Invalid format
        assertFalse(ValidDate.validDate("01-01-2022-01")); // Invalid format
    }
}