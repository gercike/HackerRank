package Algorithms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxMinTest {

    @Test
    void maxMin() {
        assertEquals(20, MaxMin.maxMin(3, new int[]{10, 100, 300, 200, 1000, 20, 30}));
        assertEquals(0, MaxMin.maxMin(2, new int[]{1, 2, 1, 2, 1}));
        assertEquals(1, MaxMin.maxMin(2, new int[]{1, 4, 7, 2}));
        assertEquals(2, MaxMin.maxMin(3, new int[]{100, 200, 300, 350, 400, 401, 402}));
    }
}
