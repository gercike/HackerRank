package Algorithms;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class AngryProfessorTest {

    @Test
    void angryProfessor() {
        assertEquals("YES", AngryProfessor.angryProfessor(3, new int[]{-1, -3, 4, 2}));
        assertEquals("NO", AngryProfessor.angryProfessor(2, new int[]{0, -1, 2, 1}));
    }
}