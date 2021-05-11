package Algorithms;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class PickingNumbersTest {

    @Test
    void pickingNumbers() {
        assertEquals(5, PickingNumbers.pickingNumbers(Arrays.asList(1, 1, 2, 2, 4, 4, 5, 5, 5)));
        assertEquals(3, PickingNumbers.pickingNumbers(Arrays.asList(4, 6, 5, 3, 3, 1)));
        assertEquals(5, PickingNumbers.pickingNumbers(Arrays.asList(1, 2, 2, 3, 1, 2)));
        assertEquals(2, PickingNumbers.pickingNumbers(Arrays.asList(98, 3, 99, 1, 97, 2)));
    }
}