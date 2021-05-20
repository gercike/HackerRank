package InterviewPreparationKit.StringManipulation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SherlockAndTheValidStringTest {

    @Test
    void isValid() {
        assertEquals("YES", SherlockAndTheValidString.isValid("abc"));
        assertEquals("YES", SherlockAndTheValidString.isValid("abcc"));
        assertEquals("NO", SherlockAndTheValidString.isValid("abccc"));
        assertEquals("NO", SherlockAndTheValidString.isValid("aabbcd"));
        assertEquals("YES", SherlockAndTheValidString.isValid("aabbccddd"));
        assertEquals("NO", SherlockAndTheValidString.isValid("aabbccddeefghi"));
    }

}