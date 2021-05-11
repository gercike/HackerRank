package Algorithms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChocolateFeastTest {

    @Test
    void chocolateFeast() {
        assertEquals(9, ChocolateFeast.chocolateFeast(15, 3, 2));
        assertEquals(6, ChocolateFeast.chocolateFeast(10, 2, 5));
        assertEquals(3, ChocolateFeast.chocolateFeast(12, 4, 4));
        assertEquals(5, ChocolateFeast.chocolateFeast(6, 2, 2));
    }
}