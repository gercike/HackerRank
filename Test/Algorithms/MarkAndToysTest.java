package Algorithms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MarkAndToysTest {

    @Test
    void maximumToys() {
        assertEquals(3, MarkAndToys.maximumToys(new int[]{1, 2, 3, 4}, 7));
        assertEquals(4, MarkAndToys.maximumToys(new int[]{1, 12, 5, 111, 200, 1000, 10}, 50));
    }
}