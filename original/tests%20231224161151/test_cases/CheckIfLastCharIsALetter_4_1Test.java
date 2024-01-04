package original;

import org.junit.Test;
import static org.junit.Assert.*;

public class CheckIfLastCharIsALetter_4_1Test {

    @Test(timeout = 8000)
    public void testEmptyString() {
        assertFalse(CheckIfLastCharIsALetter.checkIfLastCharIsALetter(""));
    }

    @Test(timeout = 8000)
    public void testSingleLetter() {
        assertTrue(CheckIfLastCharIsALetter.checkIfLastCharIsALetter("a"));
        assertTrue(CheckIfLastCharIsALetter.checkIfLastCharIsALetter("A"));
    }

    @Test(timeout = 8000)
    public void testTwoLetters() {
        assertFalse(CheckIfLastCharIsALetter.checkIfLastCharIsALetter("aa"));
        assertFalse(CheckIfLastCharIsALetter.checkIfLastCharIsALetter("AA"));
        assertFalse(CheckIfLastCharIsALetter.checkIfLastCharIsALetter("aA"));
        assertFalse(CheckIfLastCharIsALetter.checkIfLastCharIsALetter("Aa"));
    }

    @Test(timeout = 8000)
    public void testNonLetterLastChar() {
        assertFalse(CheckIfLastCharIsALetter.checkIfLastCharIsALetter("a1"));
        assertFalse(CheckIfLastCharIsALetter.checkIfLastCharIsALetter("A!"));
        assertFalse(CheckIfLastCharIsALetter.checkIfLastCharIsALetter("a "));
        assertFalse(CheckIfLastCharIsALetter.checkIfLastCharIsALetter("A."));
    }

    @Test(timeout = 8000)
    public void testNonLetterSecondLastChar() {
        assertTrue(CheckIfLastCharIsALetter.checkIfLastCharIsALetter("a1a"));
        assertTrue(CheckIfLastCharIsALetter.checkIfLastCharIsALetter("A!a"));
        assertTrue(CheckIfLastCharIsALetter.checkIfLastCharIsALetter("a a"));
        assertTrue(CheckIfLastCharIsALetter.checkIfLastCharIsALetter("A.a"));
    }
}