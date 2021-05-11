package Algorithms;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BetweenTwoSetsTest {

    @Test
    void getTotalX() {
        List<Integer> a = Arrays.asList(2, 6);
        List<Integer> b = Arrays.asList(24, 36);
        assertEquals(2, BetweenTwoSets.getTotalX(a, b));
        List<Integer> a2 = Arrays.asList(2, 4);
        List<Integer> b2= Arrays.asList(16, 32, 96);
        assertEquals(3, BetweenTwoSets.getTotalX(a2, b2));
    }
}