package Algorithms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CuttingBoardsTest {

    @Test
    void boardCutting() {
        assertEquals(4, CuttingBoards.boardCutting(new int[]{2}, new int[]{1}));
        assertEquals(42, CuttingBoards.boardCutting(new int[]{2, 1, 3, 1, 4}, new int[]{4, 1, 2}));
    }
}