package com.examples.codewars.kata.highestandlowest;

import java.util.Arrays;
import java.util.IntSummaryStatistics;

public class Kata {
    public static String highAndLow(String numbers) {

        IntSummaryStatistics statistics = Arrays.stream(numbers.split(" "))
                .mapToInt(Integer::valueOf)
                .summaryStatistics();

        return String.format("%d %d", statistics.getMax(), statistics.getMin());
    }




}
