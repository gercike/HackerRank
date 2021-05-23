package InterviewPreparationKit.GreedyAlgorithms;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class LuckBalanceTest {

    @Test
    void luckBalance() {
        assertEquals(10, LuckBalance.luckBalance(2, Arrays.asList(Arrays.asList(5, 1), Arrays.asList(1, 1), Arrays.asList(4, 0))));
        assertEquals(29, LuckBalance.luckBalance(3, Arrays.asList(Arrays.asList(5, 1), Arrays.asList(2, 1), Arrays.asList(1, 1), Arrays.asList(8, 1), Arrays.asList(10, 0),
                Arrays.asList(5, 0))));

    }
}