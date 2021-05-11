package Algorithms;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SubarrayDivisionTest {

    @Test
    void birthday() {
        SubarrayDivision subarrayDivision = new SubarrayDivision();
        assertEquals(2, SubarrayDivision.birthday(Arrays.asList(2, 2, 1, 3, 2), 4, 2));
        assertEquals(2, SubarrayDivision.birthday(Arrays.asList(1, 2, 1, 3, 2), 3, 2));
        assertEquals(0, SubarrayDivision.birthday(Arrays.asList(1, 1, 1, 1, 1, 1), 3, 2));
        assertEquals(1, SubarrayDivision.birthday(Arrays.asList(4), 4, 1));
    }
}