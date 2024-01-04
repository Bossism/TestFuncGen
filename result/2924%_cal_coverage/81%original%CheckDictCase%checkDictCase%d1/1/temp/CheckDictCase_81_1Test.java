package original;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class CheckDictCase_81_1Test {

    @Test(timeout = 8000)
    public void testCheckDictCase() {
        // Test case 1: Empty map
        Map<String, Integer> emptyMap = new HashMap<>();
        assertFalse(CheckDictCase.checkDictCase(emptyMap));

        // Test case 2: Map with all lowercase keys
        Map<String, Integer> lowercaseMap = new HashMap<>();
        lowercaseMap.put("key1", 1);
        lowercaseMap.put("key2", 2);
        assertTrue(CheckDictCase.checkDictCase(lowercaseMap));

        // Test case 3: Map with all uppercase keys
        Map<String, Integer> uppercaseMap = new HashMap<>();
        uppercaseMap.put("KEY1", 1);
        uppercaseMap.put("KEY2", 2);
        assertTrue(CheckDictCase.checkDictCase(uppercaseMap));

        // Test case 4: Map with mixed case keys
        Map<String, Integer> mixedCaseMap = new HashMap<>();
        mixedCaseMap.put("Key1", 1);
        mixedCaseMap.put("KEY2", 2);
        assertFalse(CheckDictCase.checkDictCase(mixedCaseMap));

        // Test case 5: Map with non-string keys
        Map<Integer, Integer> nonStringKeyMap = new HashMap<>();
        nonStringKeyMap.put(1, 1);
        nonStringKeyMap.put(2, 2);
        assertFalse(CheckDictCase.checkDictCase(nonStringKeyMap));

        // Test case 6: Non-map object
        Object nonMapObject = new Object();
        assertFalse(CheckDictCase.checkDictCase(nonMapObject));
    }
}