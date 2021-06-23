package com.examples.codewars.kata.easyline;

import java.math.BigInteger;

/**
 * We want to calculate the sum of the squares of the binomial coefficients on a given horizontal line with a function called easyline (or easyLine or easy-line).
 * <p>
 * Can you write a program which calculate easyline(n) where n is the horizontal line number?
 * <p>
 * The function will take n (with: n>= 0) as parameter and will return the sum of the squares of the binomial coefficients on line n.
 */
public class Easyline {


    private static BigInteger calculate(int n, int p) {
        BigInteger ret = BigInteger.ONE;
        for (int i = 0; i < p; i++) {
            ret = ret.multiply(BigInteger.valueOf(n - i))
                    .divide(BigInteger.valueOf(i + 1));
        }
        return ret;
    }

    public static BigInteger easyLine(int n) {
        return calculate(2 * n, n);
    }

}
