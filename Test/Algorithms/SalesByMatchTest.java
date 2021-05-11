package Algorithms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SalesByMatchTest {

    @Test
    void sockMerchant() {
        assertEquals(2, SalesByMatch.sockMerchant(7, new int[]{1, 2, 1, 2, 1, 3, 2}));
        assertEquals(3, SalesByMatch.sockMerchant(9, new int[]{10, 20, 20, 10, 10, 30, 50, 10, 20}));
        assertEquals(4, SalesByMatch.sockMerchant(10, new int[]{1, 1, 3, 1, 2, 1, 3, 3, 3, 3}));
    }
}