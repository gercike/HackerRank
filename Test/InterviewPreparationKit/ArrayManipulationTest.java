package InterviewPreparationKit;

import InterviewPreparationKit.ArrayManip.ArrayManipulation;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayManipulationTest {

    @Test
    void arrayManipulation() {
        assertEquals(10, ArrayManipulation.arrayManipulation(10, new int[][]{{1, 5, 3}, {4, 8, 7}, {6, 9, 1}}));
        assertEquals(882, ArrayManipulation.arrayManipulation(4, new int[][]{{2, 3, 603}, {1, 1, 286}, {4, 4, 882}}));
        assertEquals(200, ArrayManipulation.arrayManipulation(5, new int[][]{{1, 2, 100}, {2, 5, 100}, {3, 4, 100}}));
        assertEquals(31, ArrayManipulation.arrayManipulation(10, new int[][]{{2, 6, 8}, {3, 5, 7}, {1, 8, 1}, {5, 9, 15}}));
    }
}

