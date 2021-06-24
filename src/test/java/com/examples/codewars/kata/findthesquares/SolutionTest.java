package com.examples.codewars.kata.findthesquares;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
//    @Test
//    public void testBasicNumbers() {
//        assertEquals("25-16", Solution.findSquares(9));
//    }

    @Test
    public void testSmallerNumbers() {
        assertEquals("1-0", Solution.findSquares(1));
    }
//
//    @Test
//    public void testBiggerNumbers() {
//        assertEquals("891136-889249", Solution.findSquares(1887));
//        assertEquals("2499600016-2499500025", Solution.findSquares(99991));
//    }
}