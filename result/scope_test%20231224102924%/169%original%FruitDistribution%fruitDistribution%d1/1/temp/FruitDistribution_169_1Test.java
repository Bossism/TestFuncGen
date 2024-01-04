package original;

import org.junit.Test;
import static org.junit.Assert.*;

public class FruitDistribution_169_1Test {

    @Test(timeout = 8000)
    public void testFruitDistribution() {
        String s = "I have 3 apples and 2 oranges";
        int n = 10;
        int expectedMangoes = 5;

        int actualMangoes = FruitDistribution.fruitDistribution(s, n);

        assertEquals(expectedMangoes, actualMangoes);
    }

    @Test(timeout = 8000)
    public void testFruitDistributionWithNoApplesOrOranges() {
        String s = "I have no apples and no oranges";
        int n = 10;
        int expectedMangoes = 10;

        int actualMangoes = FruitDistribution.fruitDistribution(s, n);

        assertEquals(expectedMangoes, actualMangoes);
    }

    @Test(timeout = 8000)
    public void testFruitDistributionWithNoFruits() {
        String s = "I have no fruits";
        int n = 10;
        int expectedMangoes = 10;

        int actualMangoes = FruitDistribution.fruitDistribution(s, n);

        assertEquals(expectedMangoes, actualMangoes);
    }

    @Test(timeout = 8000)
    public void testFruitDistributionWithNegativeN() {
        String s = "I have 3 apples and 2 oranges";
        int n = -10;
        int expectedMangoes = 15;

        int actualMangoes = FruitDistribution.fruitDistribution(s, n);

        assertEquals(expectedMangoes, actualMangoes);
    }
}