package original;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class CheckDictCase_81_1Test {

    @Test(timeout = 8000)
    public void testCheckDictCase_AllLowercaseKeys_ReturnsTrue() {
        Map<String, String> dict = new HashMap<>();
        dict.put("a", "apple");
        dict.put("b", "banana");
        assertTrue(CheckDictCase.checkDictCase(dict));
    }

    @Test(timeout = 8000)
    public void testCheckDictCase_MixedCaseKeys_ReturnsFalse() {
        Map<String, String> dict = new HashMap<>();
        dict.put("a", "apple");
        dict.put("A", "banana");
        dict.put("B", "banana");
        assertFalse(CheckDictCase.checkDictCase(dict));
    }

    @Test(timeout = 8000)
    public void testCheckDictCase_NonStringKey_ReturnsFalse() {
        Map<Object, String> dict = new HashMap<>();
        dict.put("p", "pineapple");
        dict.put(5, "banana");
        dict.put("a", "apple");
        assertFalse(CheckDictCase.checkDictCase(dict));
    }

    @Test(timeout = 8000)
    public void testCheckDictCase_MixedCaseKeysWithNonStringKey_ReturnsFalse() {
        Map<Object, String> dict = new HashMap<>();
        dict.put("Name", "John");
        dict.put("Age", "36");
        dict.put("City", "Houston");
        assertFalse(CheckDictCase.checkDictCase(dict));
    }

    @Test(timeout = 8000)
    public void testCheckDictCase_AllUppercaseKeys_ReturnsTrue() {
        Map<String, String> dict = new HashMap<>();
        dict.put("STATE", "NC");
        dict.put("ZIP", "12345");
        assertTrue(CheckDictCase.checkDictCase(dict));
    }

    @Test(timeout = 8000)
    public void testCheckDictCase_OtherKeys_ReturnsTrue() {
        Map<String, String> dict = new HashMap<>();
        dict.put("fruit", "Orange");
        dict.put("taste", "Sweet");
        assertTrue(CheckDictCase.checkDictCase(dict));
    }

    @Test(timeout = 8000)
    public void testCheckDictCase_EmptyDictionary_ReturnsFalse() {
        Map<String, String> dict = new HashMap<>();
        assertFalse(CheckDictCase.checkDictCase(dict));
    }
}