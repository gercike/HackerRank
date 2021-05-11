package Algorithms;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

class TimeConversionTest {

    @Test
    void timeConversion() {
        TimeConversion tc = new TimeConversion();
        assertEquals("12:01:00", tc.timeConversion("12:01:00PM"));
        assertEquals("00:01:00", tc.timeConversion("12:01:00AM"));
        assertEquals("12:01:00", tc.timeConversion("00:01:00PM"));
    }
}