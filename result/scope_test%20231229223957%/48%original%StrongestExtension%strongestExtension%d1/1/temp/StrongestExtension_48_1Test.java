package original;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

public class StrongestExtension_48_1Test {

    @Test(timeout = 8000)
    public void testStrongestExtension() {
        // Test case 1
        String className1 = "my_class";
        List<String> extensions1 = Arrays.asList("AA", "Be", "CC");
        String expected1 = "my_class.AA";
        assertEquals(expected1, StrongestExtension.strongestExtension(className1, extensions1));

        // Test case 2
        String className2 = "Watashi";
        List<String> extensions2 = Arrays.asList("tEN", "niNE", "eIGHt8OKe");
        String expected2 = "Watashi.eIGHt8OKe";
        assertEquals(expected2, StrongestExtension.strongestExtension(className2, extensions2));

        // Test case 3
        String className3 = "Boku123";
        List<String> extensions3 = Arrays.asList("nani", "NazeDa", "YEs.WeCaNe", "32145tggg");
        String expected3 = "Boku123.YEs.WeCaNe";
        assertEquals(expected3, StrongestExtension.strongestExtension(className3, extensions3));

        // Test case 4
        String className4 = "__YESIMHERE";
        List<String> extensions4 = Arrays.asList("t", "eMptY", "nothing", "zeR00", "NuLl__", "123NoooneB321");
        String expected4 = "__YESIMHERE.NuLl__";
        assertEquals(expected4, StrongestExtension.strongestExtension(className4, extensions4));

        // Test case 5
        String className5 = "K";
        List<String> extensions5 = Arrays.asList("Ta", "TAR", "t234An", "cosSo");
        String expected5 = "K.TAR";
        assertEquals(expected5, StrongestExtension.strongestExtension(className5, extensions5));

        // Test case 6
        String className6 = "__HAHA";
        List<String> extensions6 = Arrays.asList("Tab", "123", "781345", "-_-");
        String expected6 = "__HAHA.123";
        assertEquals(expected6, StrongestExtension.strongestExtension(className6, extensions6));

        // Test case 7
        String className7 = "YameRore";
        List<String> extensions7 = Arrays.asList("HhAas", "okIWILL123", "WorkOut", "Fails", "-_-");
        String expected7 = "YameRore.okIWILL123";
        assertEquals(expected7, StrongestExtension.strongestExtension(className7, extensions7));

        // Test case 8
        String className8 = "finNNalLLly";
        List<String> extensions8 = Arrays.asList("Die", "NowW", "Wow", "WoW");
        String expected8 = "finNNalLLly.WoW";
        assertEquals(expected8, StrongestExtension.strongestExtension(className8, extensions8));

        // Test case 9
        String className9 = "_";
        List<String> extensions9 = Arrays.asList("Bb", "91245");
        String expected9 = "_.Bb";
        assertEquals(expected9, StrongestExtension.strongestExtension(className9, extensions9));

        // Test case 10
        String className10 = "Sp";
        List<String> extensions10 = Arrays.asList("671235", "Bb");
        String expected10 = "Sp.671235";
        assertEquals(expected10, StrongestExtension.strongestExtension(className10, extensions10));
    }
}