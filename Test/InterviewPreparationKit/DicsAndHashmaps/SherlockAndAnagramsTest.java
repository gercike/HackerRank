package InterviewPreparationKit.DicsAndHashmaps;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SherlockAndAnagramsTest {

    @Test
    void sherlockAndAnagrams() {
        assertEquals(2, SherlockAndAnagrams.sherlockAndAnagrams("mom"));
        assertEquals(4, SherlockAndAnagrams.sherlockAndAnagrams("abba"));
        assertEquals(0, SherlockAndAnagrams.sherlockAndAnagrams("abcd"));
        assertEquals(3, SherlockAndAnagrams.sherlockAndAnagrams("ifailuhkqq"));
        assertEquals(10, SherlockAndAnagrams.sherlockAndAnagrams("kkkk"));
        assertEquals(5, SherlockAndAnagrams.sherlockAndAnagrams("cdcd"));
    }
}