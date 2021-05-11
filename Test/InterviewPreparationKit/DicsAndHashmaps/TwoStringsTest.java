package InterviewPreparationKit.DicsAndHashmaps;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoStringsTest {

    @Test
    void twoStrings() {
        assertEquals("YES", TwoStrings.twoStrings("and", "art"));
        assertEquals("NO", TwoStrings.twoStrings("be", "cat"));
        assertEquals("YES", TwoStrings.twoStrings("hello", "world"));
        assertEquals("NO", TwoStrings.twoStrings("hi", "world"));
    }
}