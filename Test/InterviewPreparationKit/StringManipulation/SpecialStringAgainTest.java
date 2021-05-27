package InterviewPreparationKit.StringManipulation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SpecialStringAgainTest {

    @Test
    void substrCount() {
        assertEquals(12, SpecialStringAgain.substrCount(8, "mnonopoo"));
        assertEquals(7, SpecialStringAgain.substrCount(5, "asasd"));
        assertEquals(10, SpecialStringAgain.substrCount(7, "abcbaba"));
        assertEquals(10, SpecialStringAgain.substrCount(4, "aaaa"));
    }
}