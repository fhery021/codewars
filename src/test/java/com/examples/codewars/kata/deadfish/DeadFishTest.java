package com.examples.codewars.kata.deadfish;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DeadFishTest {

    @Test
    public void exampleTest() {
        assertArrayEquals(new int[] {8, 64}, DeadFish.parse("iiisdoso"));
    }

}