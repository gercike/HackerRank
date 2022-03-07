package InterviewPreparationKit.StringManipulation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CommonChildTest {

    @Test
    void commonChild() {
        assertEquals(3, CommonChild.commonChild("ABCD", "ABDC"));
        assertEquals(2, CommonChild.commonChild("HARRY", "SALLY"));
        assertEquals(0, CommonChild.commonChild("AA", "BB"));
        assertEquals(3, CommonChild.commonChild("SHINCHAN", "NOHARAAA"));
        assertEquals(2, CommonChild.commonChild("ABCDEF", "FBDAMN"));
    }
}