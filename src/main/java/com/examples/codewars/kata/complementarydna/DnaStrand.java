package com.examples.codewars.kata.complementarydna;

import java.util.Map;

public class DnaStrand {

    public static String makeComplement(String dna) {
        return dna.toUpperCase()
                .chars()
                .map(c -> complementOf((char) c))
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();
    }


    private static char complementOf(char c) {
        switch (c) {
            case 'T':
                return 'A';
            case 'A':
                return 'T';
            case 'C':
                return 'G';
            case 'G':
                return 'C';
            default:
                return 'X';
        }
    }
}