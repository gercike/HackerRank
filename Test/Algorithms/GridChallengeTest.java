package Algorithms;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class GridChallengeTest {

    @Test
    void gridChallenge() {
        assertEquals("YES", GridChallenge.gridChallenge(Arrays.asList("abc", "ade", "efg")));
        assertEquals("YES", GridChallenge.gridChallenge(Arrays.asList("ebacd", "fghij", "olmkn", "trpqs", "xywuv")));
        assertEquals("YES", GridChallenge.gridChallenge(Arrays.asList("kc", "iu")));
        assertEquals("NO", GridChallenge.gridChallenge(Arrays.asList("uxf", "vof", "hmp")));
        assertEquals("YES", GridChallenge.gridChallenge(Arrays.asList("l")));
    }
}