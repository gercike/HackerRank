package InterviewPreparationKit.GreedyAlgorithms;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class MinimumAbsoluteDifferenceInAnArrayTest {

    @Test
    void minimumAbsoluteDifference() {
        assertEquals(2, MinimumAbsoluteDifferenceInAnArray.minimumAbsoluteDifference(Arrays.asList(-2, 2, 4)));
        assertEquals(3, MinimumAbsoluteDifferenceInAnArray.minimumAbsoluteDifference(Arrays.asList(3, -7, 0)));
        assertEquals(1, MinimumAbsoluteDifferenceInAnArray.minimumAbsoluteDifference(Arrays.asList(-59, -36, -13, 1, -53, -92, -2, -96, -54, 75)));
        assertEquals(3, MinimumAbsoluteDifferenceInAnArray.minimumAbsoluteDifference(Arrays.asList(1, -3, 71, 68, 17)));
    }
}