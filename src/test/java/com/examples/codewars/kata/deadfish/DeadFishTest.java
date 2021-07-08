package com.examples.codewars.kata.deadfish;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DeadFishTest {

    @Test
    public void twoPrintsExampleTest() {
        assertArrayEquals(new int[] {8, 64}, DeadFish.parse("iiisdoso"));
    }

    @Test
    public void threePrintsExampleTest() {
        assertArrayEquals(new int[] {8, 64, 3600}, DeadFish.parse("iiisdosodddddiso"));
    }

}