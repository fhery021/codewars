package com.examples.codewars.kata.highestandlowest;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KataTest {

    @Test
    public void test1() {
        assertEquals("42 -9", Kata.highAndLow("8 3 -5 42 -1 0 0 -9 4 7 4 -4"));
    }

    @Test
    public void sameValuesTest() {
        assertEquals("1 1", Kata.highAndLow("1"));
    }
}