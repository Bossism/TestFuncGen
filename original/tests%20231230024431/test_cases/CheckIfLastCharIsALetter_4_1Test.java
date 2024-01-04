package original;

import org.junit.Test;
import static org.junit.Assert.*;

public class CheckIfLastCharIsALetter_4_1Test {

    @Test(timeout = 8000)
    public void testCheckIfLastCharIsALetter_emptyString() {
        assertFalse(CheckIfLastCharIsALetter.checkIfLastCharIsALetter(""));
    }

    @Test(timeout = 8000)
    public void testCheckIfLastCharIsALetter_singleLetter() {
        assertTrue(CheckIfLastCharIsALetter.checkIfLastCharIsALetter("A"));
    }

    @Test(timeout = 8000)
    public void testCheckIfLastCharIsALetter_singleNonLetter() {
        assertFalse(CheckIfLastCharIsALetter.checkIfLastCharIsALetter("1"));
    }

    @Test(timeout = 8000)
    public void testCheckIfLastCharIsALetter_singleLetterWithSpace() {
        assertTrue(CheckIfLastCharIsALetter.checkIfLastCharIsALetter("A "));
    }

    @Test(timeout = 8000)
    public void testCheckIfLastCharIsALetter_singleNonLetterWithSpace() {
        assertFalse(CheckIfLastCharIsALetter.checkIfLastCharIsALetter("1 "));
    }

    @Test(timeout = 8000)
    public void testCheckIfLastCharIsALetter_wordWithLetter() {
        assertFalse(CheckIfLastCharIsALetter.checkIfLastCharIsALetter("apple"));
    }

    @Test(timeout = 8000)
    public void testCheckIfLastCharIsALetter_wordWithNonLetter() {
        assertTrue(CheckIfLastCharIsALetter.checkIfLastCharIsALetter("apple1"));
    }

    @Test(timeout = 8000)
    public void testCheckIfLastCharIsALetter_wordWithLetterAndSpace() {
        assertTrue(CheckIfLastCharIsALetter.checkIfLastCharIsALetter("apple "));
    }

    @Test(timeout = 8000)
    public void testCheckIfLastCharIsALetter_wordWithNonLetterAndSpace() {
        assertTrue(CheckIfLastCharIsALetter.checkIfLastCharIsALetter("apple1 "));
    }

    @Test(timeout = 8000)
    public void testCheckIfLastCharIsALetter_wordWithLetterAndSpaceAndLetter() {
        assertFalse(CheckIfLastCharIsALetter.checkIfLastCharIsALetter("apple pie"));
    }

    @Test(timeout = 8000)
    public void testCheckIfLastCharIsALetter_wordWithLetterAndSpaceAndNonLetter() {
        assertTrue(CheckIfLastCharIsALetter.checkIfLastCharIsALetter("apple pi1"));
    }

    @Test(timeout = 8000)
    public void testCheckIfLastCharIsALetter_wordWithLetterAndSpaceAndLetterAndSpace() {
        assertFalse(CheckIfLastCharIsALetter.checkIfLastCharIsALetter("apple pie "));
    }

    @Test(timeout = 8000)
    public void testCheckIfLastCharIsALetter_wordWithLetterAndSpaceAndNonLetterAndSpace() {
        assertTrue(CheckIfLastCharIsALetter.checkIfLastCharIsALetter("apple pi1 "));
    }
}