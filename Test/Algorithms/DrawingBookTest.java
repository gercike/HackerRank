package Algorithms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DrawingBookTest {

    @Test
    void pageCount() {
        assertEquals(1, DrawingBook.pageCount(5, 3));
        assertEquals(1, DrawingBook.pageCount(6, 2));
        assertEquals(0, DrawingBook.pageCount(5, 4));
        assertEquals(0, DrawingBook.pageCount(1, 1));
        assertEquals(1, DrawingBook.pageCount(6, 5));
        assertEquals(1, DrawingBook.pageCount(4, 3));
        assertEquals(1, DrawingBook.pageCount(100, 99));
        assertEquals(0, DrawingBook.pageCount(4, 4));
    }
}