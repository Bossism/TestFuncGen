package original;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.List;

public class SelectWords_77_1Test {

    @Test(timeout = 8000)
    public void testSelectWords() {
        // Test case 1
        String s1 = "Mary had a little lamb";
        int n1 = 4;
        List<Object> expected1 = List.of("little");
        List<Object> result1 = SelectWords.selectWords(s1, n1);
        assertEquals(expected1, result1);

        // Test case 2
        String s2 = "Mary had a little lamb";
        int n2 = 3;
        List<Object> expected2 = List.of("Mary", "lamb");
        List<Object> result2 = SelectWords.selectWords(s2, n2);
        assertEquals(expected2, result2);

        // Test case 3
        String s3 = "simple white space";
        int n3 = 2;
        List<Object> expected3 = List.of();
        List<Object> result3 = SelectWords.selectWords(s3, n3);
        assertEquals(expected3, result3);

        // Test case 4
        String s4 = "Hello world";
        int n4 = 4;
        List<Object> expected4 = List.of("world");
        List<Object> result4 = SelectWords.selectWords(s4, n4);
        assertEquals(expected4, result4);

        // Test case 5
        String s5 = "Uncle sam";
        int n5 = 3;
        List<Object> expected5 = List.of("Uncle");
        List<Object> result5 = SelectWords.selectWords(s5, n5);
        assertEquals(expected5, result5);

        // Test case 6
        String s6 = "";
        int n6 = 4;
        List<Object> expected6 = List.of();
        List<Object> result6 = SelectWords.selectWords(s6, n6);
        assertEquals(expected6, result6);

        // Test case 7
        String s7 = "a b c d e f";
        int n7 = 1;
        List<Object> expected7 = List.of("b", "c", "d", "f");
        List<Object> result7 = SelectWords.selectWords(s7, n7);
        assertEquals(expected7, result7);
    }
}