package com.examples.codewars.kata.digitalroot;

import java.util.List;

/**
 * Digital root is the recursive sum of all the digits in a number.
 * <p>
 * Given n, take the sum of the digits of n.
 * If that value has more than one digit, continue reducing in this way until a single-digit number is produced.
 * <p>
 * The input will be a non-negative integer.
 */
public class DRoot {

    private static int sumOfDigits(int n) {
        return String.valueOf(n)
                .chars()
                .map(Character::getNumericValue)
                .sum();
    }

    public static int digital_root(int n) {
        int sum = sumOfDigits(n);
        if (sum < 10) {
            return sum;
        } else {
            sum = sumOfDigits(sum);
        }
        return sum;
    }
}
