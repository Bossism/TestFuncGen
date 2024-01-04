package original;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.Arrays;

public class AntiShuffle_17_1Test {

    @Test(timeout = 8000)
    public void testSortString() {
        String input = "shuffle";
        String expectedOutput = "efhlrsu";
        
        String actualOutput = AntiShuffle.sortString(input);
        
        assertEquals(expectedOutput, actualOutput);
    }
    
    @Test(timeout = 8000)
    public void testSortStringWithEmptyString() {
        String input = "";
        String expectedOutput = "";
        
        String actualOutput = AntiShuffle.sortString(input);
        
        assertEquals(expectedOutput, actualOutput);
    }
    
    @Test(timeout = 8000)
    public void testSortStringWithSingleCharacter() {
        String input = "a";
        String expectedOutput = "a";
        
        String actualOutput = AntiShuffle.sortString(input);
        
        assertEquals(expectedOutput, actualOutput);
    }
    
    @Test(timeout = 8000)
    public void testSortStringWithRepeatedCharacters() {
        String input = "banana";
        String expectedOutput = "aaabnn";
        
        String actualOutput = AntiShuffle.sortString(input);
        
        assertEquals(expectedOutput, actualOutput);
    }
    
    @Test(timeout = 8000)
    public void testAntiShuffle() {
        String input = "shuffle";
        String expectedOutput = "shuffle";
        
        String actualOutput = AntiShuffle.antiShuffle(input);
        
        assertEquals(expectedOutput, actualOutput);
    }
    
    @Test(timeout = 8000)
    public void testAntiShuffleWithEmptyString() {
        String input = "";
        String expectedOutput = "";
        
        String actualOutput = AntiShuffle.antiShuffle(input);
        
        assertEquals(expectedOutput, actualOutput);
    }
    
    @Test(timeout = 8000)
    public void testAntiShuffleWithSingleCharacter() {
        String input = "a";
        String expectedOutput = "a";
        
        String actualOutput = AntiShuffle.antiShuffle(input);
        
        assertEquals(expectedOutput, actualOutput);
    }
    
    @Test(timeout = 8000)
    public void testAntiShuffleWithRepeatedCharacters() {
        String input = "banana";
        String expectedOutput = "banana";
        
        String actualOutput = AntiShuffle.antiShuffle(input);
        
        assertEquals(expectedOutput, actualOutput);
    }
}