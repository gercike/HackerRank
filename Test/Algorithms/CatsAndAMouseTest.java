package Algorithms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CatsAndAMouseTest {

    @Test
    void catAndMouse() {
        assertEquals("Cat B", CatsAndAMouse.catAndMouse(2, 5, 4));
        assertEquals("Cat B", CatsAndAMouse.catAndMouse(1, 2, 3));
        assertEquals("Mouse C", CatsAndAMouse.catAndMouse(1, 3, 2));
    }
}