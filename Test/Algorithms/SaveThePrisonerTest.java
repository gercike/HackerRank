package Algorithms;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class SaveThePrisonerTest {

    @Test
    void saveThePrisoner() {
        assertEquals(3, SaveThePrisoner.saveThePrisoner(4, 6, 2));
        assertEquals(2, SaveThePrisoner.saveThePrisoner(5, 2, 1));
        assertEquals(3, SaveThePrisoner.saveThePrisoner(5, 2, 2));
        assertEquals(6, SaveThePrisoner.saveThePrisoner(7, 19, 2));
        assertEquals(3, SaveThePrisoner.saveThePrisoner(3, 7, 3));
        assertEquals(1, SaveThePrisoner.saveThePrisoner(1, 4, 1));
        assertEquals(499999999, SaveThePrisoner.saveThePrisoner(499999999, 999999997, 2));
        assertEquals(1, SaveThePrisoner.saveThePrisoner(499999999, 999999998, 2));
        assertEquals(999999999, SaveThePrisoner.saveThePrisoner(999999999, 999999999, 1));
        assertEquals(4, SaveThePrisoner.saveThePrisoner(4, 4, 1));
        assertEquals(4, SaveThePrisoner.saveThePrisoner(4, 8, 1));
    }
}