package InterviewPreparationKit.Sorting;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MergeSortCountingInversionsTest {

    @Test
    void countInversions() {
        List<Integer> list1 = new ArrayList(Arrays.asList(2, 4, 1));
        assertEquals(2, MergeSortCountingInversions.countInversions(list1));
        List<Integer> list2 = new ArrayList(Arrays.asList(1, 1, 1, 2, 2));
        assertEquals(0, MergeSortCountingInversions.countInversions(list2));
        List<Integer> list3 = new ArrayList(Arrays.asList(2, 1, 3, 1, 2));
        assertEquals(4, MergeSortCountingInversions.countInversions(list3));
    }
}