package InterviewPreparationKit.DicsAndHashmaps;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class CountTripletsTest {

    @Test
    void countTriplets() {
        assertEquals(2, CountTriplets.countTriplets(Arrays.asList(1L, 4L, 16L, 64L), 4));
        assertEquals(2, CountTriplets.countTriplets(Arrays.asList(1L, 2L, 2L, 4L), 2));
        assertEquals(6, CountTriplets.countTriplets(Arrays.asList(1L, 3L, 9L, 9L, 27L, 81L), 3));
        assertEquals(4, CountTriplets.countTriplets(Arrays.asList(1L, 5L, 5L, 25L, 125L), 5));
        assertEquals(32, CountTriplets.countTriplets(Arrays.asList(1L, 1L, 1L, 2L, 5L, 10L, 5L, 25L, 25L, 50L, 50L, 25L, 125L, 125L), 5));
        assertEquals(3, CountTriplets.countTriplets(Arrays.asList(1L, 2L, 1L, 2L, 4L), 2));
        assertEquals(56, CountTriplets.countTriplets(Arrays.asList(23L, 23L, 23L, 23L, 23L, 23L, 23L, 23L), 1));
        assertEquals(0, CountTriplets.countTriplets(Arrays.asList(1L, 17L, 80L, 68L, 5L, 5L, 58L, 17L, 38L, 81L, 26L, 44L, 38L, 6L, 12L, 11L, 37L, 67L, 70L, 16L, 19L, 35L, 71L,
                16L, 32L, 45L, 7L), 3));
    }
}