package com.examples.codewars.kata.overTheRoad;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class OverTheRoadTest {

    @Test
    public void smallStreetTest() {
        Assertions.assertEquals(4, OverTheRoad.overTheRoad(1, 2));
        Assertions.assertEquals(2, OverTheRoad.overTheRoad(3, 2));
        Assertions.assertEquals(1, OverTheRoad.overTheRoad(4, 2));
        Assertions.assertEquals(3, OverTheRoad.overTheRoad(2, 2));
    }

    @Test
    public void basicTestCases() {
        Assertions.assertEquals(6, OverTheRoad.overTheRoad(1, 3));
        Assertions.assertEquals(4, OverTheRoad.overTheRoad(3, 3));
        Assertions.assertEquals(5, OverTheRoad.overTheRoad(2, 3));
        Assertions.assertEquals(8, OverTheRoad.overTheRoad(3, 5));
        Assertions.assertEquals(16, OverTheRoad.overTheRoad(7, 11));
        Assertions.assertEquals(1999981L, OverTheRoad.overTheRoad(20, 1000000));
        Assertions.assertEquals(596421736780L, OverTheRoad.overTheRoad(23633656673L, 310027696726L));
    }

    @Test
    public void invalidInputTests() {
        Assertions.assertEquals(-1, OverTheRoad.overTheRoad(-1, -2));
        Assertions.assertEquals(-1, OverTheRoad.overTheRoad(0, 0));
    }
}