package Algorithms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DayOfTheProgrammerTest {

    @Test
    void dayOfProgrammer() {
        assertEquals("13.09.2017", DayOfTheProgrammer.dayOfProgrammer(2017));
        assertEquals("12.09.2016", DayOfTheProgrammer.dayOfProgrammer(2016));
        assertEquals("12.09.1800", DayOfTheProgrammer.dayOfProgrammer(1800));
    }
}