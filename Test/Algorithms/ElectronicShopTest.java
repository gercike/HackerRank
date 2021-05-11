package Algorithms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ElectronicShopTest {

    @Test
    void getMoneySpent() {
        assertEquals(58, ElectronicShop.getMoneySpent(new int[]{40, 50, 60}, new int[]{5, 8, 12}, 60));
        assertEquals(9, ElectronicShop.getMoneySpent(new int[]{3, 1}, new int[]{5, 2, 8}, 10));
        assertEquals(-1, ElectronicShop.getMoneySpent(new int[]{4}, new int[]{5}, 5));
    }
}