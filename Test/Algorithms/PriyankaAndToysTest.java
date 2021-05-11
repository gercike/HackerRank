package Algorithms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PriyankaAndToysTest {

    @Test
    void toys() {
        assertEquals(2, PriyankaAndToys.toys(new int[]{1, 2, 3, 4, 5, 10, 11, 12, 13}));
        assertEquals(4, PriyankaAndToys.toys(new int[]{1, 2, 3, 21, 7, 12, 14, 21}));
    }
}