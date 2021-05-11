package InterviewPreparationKit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinimumSwap2Test {

    @Test
    void minimumSwaps() {
        assertEquals(5, MinimumSwap2.minimumSwaps(new int[]{7, 1, 3, 2, 4, 5, 6}));
        assertEquals(3, MinimumSwap2.minimumSwaps(new int[]{4, 3, 1, 2}));
        assertEquals(3, MinimumSwap2.minimumSwaps(new int[]{2, 3, 4, 1, 5}));
        assertEquals(3, MinimumSwap2.minimumSwaps(new int[]{1, 3, 5, 2, 4, 6, 7}));
    }
}