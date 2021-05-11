package InterviewPreparationKit;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class JumpingOnTheCloudsTest {

    @Test
    void jumpingOnClouds() {
        assertEquals(4, JumpingOnTheClouds.jumpingOnClouds(Arrays.asList(0, 0, 1, 0, 0, 1, 0)));
        assertEquals(3, JumpingOnTheClouds.jumpingOnClouds(Arrays.asList(0, 1, 0, 0, 0, 1, 0)));
        assertEquals(3, JumpingOnTheClouds.jumpingOnClouds(Arrays.asList(0, 0, 1, 0, 0)));
        assertEquals(3, JumpingOnTheClouds.jumpingOnClouds(Arrays.asList(0, 0, 0, 0, 1, 0)));
    }
}