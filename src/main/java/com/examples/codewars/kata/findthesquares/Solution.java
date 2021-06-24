package com.examples.codewars.kata.findthesquares;

public class Solution {
    public static String findSquares(int n) {
        long bigger = Math.round(Math.pow(Math.ceil((float) n / 2), 2));
        long smaller = Math.round(Math.pow(Math.floor((float) n / 2), 2));

        return String.format("%d-%d", bigger, smaller);
    }
}