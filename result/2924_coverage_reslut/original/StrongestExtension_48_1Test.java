package original;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.List;

public class StrongestExtension_48_1Test {

    @Test(timeout = 8000)
    public void testStrongestExtension() {
        String className = "TestClass";
        List<String> extensions = Arrays.asList("Extension1", "Extension2", "Extension3");

        String result = StrongestExtension.strongestExtension(className, extensions);

        assertEquals("TestClass.Extension1", result);
    }

    @Test(timeout = 8000)
    public void testStrongestExtensionWithEmptyExtensions() {
        String className = "TestClass";
        List<String> extensions = Arrays.asList();

        String result = StrongestExtension.strongestExtension(className, extensions);

        assertEquals("", result);
    }

    @Test(timeout = 8000)
    public void testStrongestExtensionWithEqualCapAndSm() {
        String className = "TestClass";
        List<String> extensions = Arrays.asList("Extension1", "Extension2", "Extension3");

        String result = StrongestExtension.strongestExtension(className, extensions);

        assertEquals("TestClass.Extension1", result);
    }

    @Test(timeout = 8000)
    public void testStrongestExtensionWithMultipleMaxDifferences() {
        String className = "TestClass";
        List<String> extensions = Arrays.asList("Extension1", "Extension2", "Extension3", "Extension4");

        String result = StrongestExtension.strongestExtension(className, extensions);

        assertEquals("TestClass.Extension1", result);
    }
}