package original;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.when;

class GetClosestVowel_155_1Test {

    @Test
    @Timeout(8000)
    void testGetClosestVowel() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        // Create a spy object of the GetClosestVowel class
        GetClosestVowel getClosestVowel = spy(GetClosestVowel.class);

        // Mock the vowels string
        String vowels = "aeiouAEIOU";
        when(getClosestVowel.getVowels()).thenReturn(vowels);

        // Get the private getClosestVowel method using reflection
        Method getClosestVowelMethod = GetClosestVowel.class.getDeclaredMethod("getClosestVowel", String.class);
        getClosestVowelMethod.setAccessible(true);

        // Test cases
        assertEquals("a", getClosestVowelMethod.invoke(getClosestVowel, "hello"));
        assertEquals("o", getClosestVowelMethod.invoke(getClosestVowel, "world"));
        assertEquals("", getClosestVowelMethod.invoke(getClosestVowel, "xyz"));
    }
}