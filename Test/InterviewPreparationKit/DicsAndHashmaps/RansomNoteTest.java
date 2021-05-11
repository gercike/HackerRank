package InterviewPreparationKit.DicsAndHashmaps;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class RansomNoteTest {

    @Test
    void checkMagazine() {
        assertEquals(-1, RansomNote.checkMagazine(Arrays.asList("attack", "at", "dawn"), Arrays.asList("Attack", "at", "dawn")));
        assertEquals(1, RansomNote.checkMagazine(Arrays.asList("give", "me", "one", "grand", "today", "night"), Arrays.asList("give", "one", "grand", "today")));
        assertEquals(-1, RansomNote.checkMagazine(Arrays.asList("two", "times", "three", "is", "not", "four"), Arrays.asList("two", "times", "two", "is", "four")));
        assertEquals(-1, RansomNote.checkMagazine(Arrays.asList("ive", "got", "a", "lovely", "bunch", "of", "coconuts"), Arrays.asList("ive", "got", "some", "coconuts")));
    }
}