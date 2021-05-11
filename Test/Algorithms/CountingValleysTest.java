package Algorithms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountingValleysTest {

    @Test
    void countingValleys() {
        assertEquals(1, CountingValleys.countingValleys(8, "DDUUUUDD"));
        assertEquals(1, CountingValleys.countingValleys(8, "UDDDUDUU"));
    }
}