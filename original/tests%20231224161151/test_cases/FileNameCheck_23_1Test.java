package original;
import org.junit.Test;
import static org.junit.Assert.*;

public class FileNameCheck_23_1Test {

    @Test(timeout = 8000)
    public void testFileNameCheck() {
        // Test case 1: Valid file name
        String fileName1 = "file.txt";
        assertEquals("Yes", FileNameCheck.fileNameCheck(fileName1));

        // Test case 2: Invalid file name - no extension
        String fileName2 = "file";
        assertEquals("No", FileNameCheck.fileNameCheck(fileName2));

        // Test case 3: Invalid file name - invalid extension
        String fileName3 = "file.jpg";
        assertEquals("No", FileNameCheck.fileNameCheck(fileName3));

        // Test case 4: Invalid file name - empty file name
        String fileName4 = ".txt";
        assertEquals("No", FileNameCheck.fileNameCheck(fileName4));

        // Test case 5: Invalid file name - non-letter first character
        String fileName5 = "1file.txt";
        assertEquals("No", FileNameCheck.fileNameCheck(fileName5));

        // Test case 6: Invalid file name - more than 3 digits in file name
        String fileName6 = "file1234.txt";
        assertEquals("No", FileNameCheck.fileNameCheck(fileName6));
    }
}