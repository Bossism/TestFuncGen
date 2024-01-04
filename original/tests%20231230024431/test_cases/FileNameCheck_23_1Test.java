package original;
import org.junit.Test;
import static org.junit.Assert.*;

public class FileNameCheck_23_1Test {

    @Test(timeout = 8000)
    public void testValidFileName() {
        assertEquals("Yes", FileNameCheck.fileNameCheck("example.txt"));
        assertEquals("Yes", FileNameCheck.fileNameCheck("K.dll"));
        assertEquals("Yes", FileNameCheck.fileNameCheck("MY16FILE3.exe"));
        assertEquals("Yes", FileNameCheck.fileNameCheck("Is3youfault.txt"));
        assertEquals("Yes", FileNameCheck.fileNameCheck("no_one#knows.dll"));
        assertEquals("Yes", FileNameCheck.fileNameCheck("I563_No.exe"));
    }

    @Test(timeout = 8000)
    public void testInvalidFileName() {
        assertEquals("No", FileNameCheck.fileNameCheck("1example.dll"));
        assertEquals("No", FileNameCheck.fileNameCheck("s1sdf3.asd"));
        assertEquals("No", FileNameCheck.fileNameCheck("His12FILE94.exe"));
        assertEquals("No", FileNameCheck.fileNameCheck("_Y.txt"));
        assertEquals("No", FileNameCheck.fileNameCheck("?aREYA.exe"));
        assertEquals("No", FileNameCheck.fileNameCheck("/this_is_valid.dll"));
        assertEquals("No", FileNameCheck.fileNameCheck("this_is_valid.wow"));
        assertEquals("No", FileNameCheck.fileNameCheck("this_is_valid.txtexe"));
        assertEquals("No", FileNameCheck.fileNameCheck("#this2_i4s_5valid.ten"));
        assertEquals("No", FileNameCheck.fileNameCheck("@this1_is6_valid.exe"));
        assertEquals("No", FileNameCheck.fileNameCheck("this_is_12valid.6exe4.txt"));
        assertEquals("No", FileNameCheck.fileNameCheck("all.exe.txt"));
        assertEquals("No", FileNameCheck.fileNameCheck("1I563_Yes3.exe"));
        assertEquals("No", FileNameCheck.fileNameCheck("I563_Yes3.txtt"));
        assertEquals("No", FileNameCheck.fileNameCheck("final..txt"));
        assertEquals("No", FileNameCheck.fileNameCheck("final132"));
        assertEquals("No", FileNameCheck.fileNameCheck("_f4indsartal132."));
        assertEquals("No", FileNameCheck.fileNameCheck(".txt"));
        assertEquals("No", FileNameCheck.fileNameCheck("s."));
    }
}