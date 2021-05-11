package Algorithms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DivisibleSumPairsTest {

    @Test
    void divisibleSumPairs() {
        assertEquals(3, DivisibleSumPairs.divisibleSumPairs(6, 5, new int[]{1, 2, 3, 4, 5, 6}));
        assertEquals(5, DivisibleSumPairs.divisibleSumPairs(6, 3, new int[]{1, 3, 2, 6, 1, 2}));
    }
}