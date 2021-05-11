package Algorithms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JimAndTheOrdersTest {

    @Test
    void jimOrdersTest() {
        assertArrayEquals(new int[]{4, 2, 5, 1, 3}, JimAndTheOrders.jimOrders(new int[][]{{8, 1}, {4, 2}, {5, 6}, {3, 1}, {4, 3}}));
        assertArrayEquals(new int[]{1, 2, 3}, JimAndTheOrders.jimOrders(new int[][]{{1, 3}, {2, 3}, {3, 3}}));
    }
}