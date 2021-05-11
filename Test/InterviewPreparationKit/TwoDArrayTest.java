package InterviewPreparationKit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoDArrayTest {

    @Test
    void hourglassSum() {
        assertEquals(28, TwoDArray
                .hourglassSum(new int[][]{{-9, -9, -9, 1, 1, 1}, {0, -9, 0, 4, 3, 2}, {-9, -9, -9, 1, 2, 3}, {0, 0, 8, 6, 6, 0}, {0, 0, 0, -2, 0, 0}, {0, 0, 1, 2, 4, 0}}));
        assertEquals(-6, TwoDArray.hourglassSum(new int[][]{{-1, -1, 0, -9, -2, -2},
                {-2, -1, -6, -8, -2, -5}, {-1, -1, -1, -2, -3, -4}, {-1, -9, -2, -4, -4, -5}, {-7, -3, -3, -2, -9, -9}, {-1, -3, -1, -2, -4, -5}}));
    }
}