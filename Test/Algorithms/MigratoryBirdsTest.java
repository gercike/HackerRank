package Algorithms;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class MigratoryBirdsTest {

    @Test
    void migratoryBirds() {
        assertEquals(4, MigratoryBirds.migratoryBirds(Arrays.asList(1, 4, 4, 4, 5, 3)));
        assertEquals(3, MigratoryBirds.migratoryBirds(Arrays.asList(1, 2, 3, 4, 5, 4, 3, 2, 1, 3, 4)));
    }
}