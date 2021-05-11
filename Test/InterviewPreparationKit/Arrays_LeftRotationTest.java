package InterviewPreparationKit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Arrays_LeftRotationTest {

    @Test
    void rotLeft() {
        assertArrayEquals(new int[]{5, 1, 2, 3, 4}, Arrays_LeftRotation.rotLeft(new int[]{1, 2, 3, 4, 5}, 4));
    }
}