package com.examples.overTheRoad;


import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

class OverTheRoadTest {

    @Test
    public void smallStreetTest() {
        assertEquals(6, OverTheRoad.overTheRoad(1, 2));
        assertEquals(4, OverTheRoad.overTheRoad(3, 2));
        assertEquals(1, OverTheRoad.overTheRoad(6, 2));
        assertEquals(3, OverTheRoad.overTheRoad(4, 2));
    }

    @Test
    public void basicTestCases() {
        assertEquals(6, OverTheRoad.overTheRoad(1, 3));
        assertEquals(4, OverTheRoad.overTheRoad(3, 3));
        assertEquals(5, OverTheRoad.overTheRoad(2, 3));
        assertEquals(8, OverTheRoad.overTheRoad(3, 5));
        assertEquals(16, OverTheRoad.overTheRoad(7, 11));
        assertEquals(1999981L, OverTheRoad.overTheRoad(20, 1000000));
        assertEquals(596421736780L, OverTheRoad.overTheRoad(23633656673L, 310027696726L));
    }
}