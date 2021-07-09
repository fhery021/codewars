package com.examples.codewars.kata.digitalroot;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DRootTest {

    @Test
    public void oneIterationTest() {
        assertEquals(6, DRoot.digital_root(15));
    }

    @Test
    public void twoIterationsTest() {
        assertEquals(6, DRoot.digital_root(456));
    }
}