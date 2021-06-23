package com.examples.codewars.kata.easyline;

import org.junit.jupiter.api.Test;

import java.math.BigInteger;

import static org.junit.jupiter.api.Assertions.*;

class EasyLineTest {


    private static void testing(BigInteger actual, BigInteger expected) {
        assertEquals(expected, actual);
    }
    @Test
    public void test1() {
        testing(Easyline.easyLine(7),  new BigInteger("3432"));
        testing(Easyline.easyLine(13), new BigInteger("10400600"));
        testing(Easyline.easyLine(17), new BigInteger("2333606220"));
        testing(Easyline.easyLine(19), new BigInteger("35345263800"));
    }

    @Test
    public void firstLineTest() {
        testing(Easyline.easyLine(0), new BigInteger("1"));
    }

    @Test
    public void secondLineTest() {
        testing(Easyline.easyLine(1), new BigInteger("2"));
    }

}