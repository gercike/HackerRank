package Algorithms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FormingAMagicSquareTest {

    @Test
    void formingMagicSquare() {
        int[][] array1 = new int[][]{{4, 9, 2}, {3, 5, 7}, {8, 1, 5}};
        assertEquals(1, FormingAMagicSquare.formingMagicSquare(array1));

    }
}