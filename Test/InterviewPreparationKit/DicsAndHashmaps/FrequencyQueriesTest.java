package InterviewPreparationKit.DicsAndHashmaps;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FrequencyQueriesTest {

    @Test
    void freqQuery() {
        assertIterableEquals(Arrays.asList(0, 1), FrequencyQueries.freqQuery(
                Arrays.asList(Arrays.asList(1, 1), Arrays.asList(2, 2), Arrays.asList(3, 2), Arrays.asList(1, 1), Arrays.asList(1, 1), Arrays.asList(2, 1), Arrays.asList(3, 2))));
        assertIterableEquals(Arrays.asList(0, 1), FrequencyQueries.freqQuery(Arrays.asList(Arrays.asList(1, 5), Arrays.asList(1, 6), Arrays.asList(3, 2), Arrays.asList(1, 10),
                Arrays.asList(1, 10), Arrays.asList(1, 6), Arrays.asList(2, 5), Arrays.asList(3, 2))));
        assertIterableEquals(Arrays.asList(0, 1),
                FrequencyQueries.freqQuery(Arrays.asList(Arrays.asList(3, 4), Arrays.asList(2, 1003), Arrays.asList(1, 16), Arrays.asList(3, 1))));
        assertIterableEquals(Arrays.asList(0, 1, 1), FrequencyQueries.freqQuery(Arrays.asList(Arrays.asList(1, 3), Arrays.asList(2, 3), Arrays.asList(3, 2), Arrays.asList(1, 4),
                Arrays.asList(1, 5), Arrays.asList(1, 5), Arrays.asList(1, 4), Arrays.asList(3, 2), Arrays.asList(2, 4), Arrays.asList(3, 2))));
    }
}