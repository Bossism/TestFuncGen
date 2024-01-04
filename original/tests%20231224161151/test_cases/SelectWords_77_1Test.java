package original;
import java.util.ArrayList;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.List;

public class SelectWords_77_1Test {

    @Test(timeout = 8000)
    public void testSelectWords() {
        String input = "Hello world, how are you today?";
        int n = 3;
        List<Object> expectedOutput = List.of("Hello", "world,", "today?");
        
        List<Object> result = SelectWords.selectWords(input, n);
        
        assertEquals(expectedOutput, result);
    }
    
    @Test(timeout = 8000)
    public void testSelectWords_NoWordsWithNConsonants() {
        String input = "This is a test";
        int n = 4;
        List<Object> expectedOutput = List.of();
        
        List<Object> result = SelectWords.selectWords(input, n);
        
        assertEquals(expectedOutput, result);
    }
    
    @Test(timeout = 8000)
    public void testSelectWords_EmptyInput() {
        String input = "";
        int n = 2;
        List<Object> expectedOutput = List.of();
        
        List<Object> result = SelectWords.selectWords(input, n);
        
        assertEquals(expectedOutput, result);
    }
    
    @Test(timeout = 8000)
    public void testSelectWords_NoWordsInInput() {
        String input = "   ";
        int n = 1;
        List<Object> expectedOutput = List.of();
        
        List<Object> result = SelectWords.selectWords(input, n);
        
        assertEquals(expectedOutput, result);
    }
}