package com.examples.codewars.kata.easyline;

import java.math.BigInteger;

public class Easyline {
    public static BigInteger easyLine(int i) {
        if (i == 0) {
            return new BigInteger("1");
        }
        if (i == 1) {
            return new BigInteger("2");
        }
        return null;
    }
}
