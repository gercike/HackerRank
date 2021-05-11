package Algorithms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JumpingOnTheCloudsRevisitedTest {

    @Test
    void jumpingOnClouds() {
        assertEquals(96, JumpingOnTheCloudsRevisited.jumpingOnClouds(new int[]{0, 0, 1, 0}, 2));
        assertEquals(92, JumpingOnTheCloudsRevisited.jumpingOnClouds(new int[]{0, 0, 1, 0, 0, 1, 1, 0}, 2));
        assertEquals(80, JumpingOnTheCloudsRevisited.jumpingOnClouds(new int[]{1, 1, 1, 0, 1, 1, 0, 0, 0, 0}, 3));
        assertEquals(97, JumpingOnTheCloudsRevisited.jumpingOnClouds(new int[]{1,1,0,1,0,1,0,1,0,1,0,1,1,0,1,1,1,1,1}, 19));
    }
}