package com.examples.overTheRoad;

public class OverTheRoad {
    /**
     * Given your house number address and length of street n, give the house number on the opposite side of the street.
     *
     * @param address    Positive number, greater than 0
     * @param streetSize Positive number, greater than 0
     * @return Opposite side of the street. For invalid inputs it returns -1.
     */
    public static long overTheRoad(long address, long streetSize) {
        if (address <= 0 || streetSize <= 0) {
            return -1;
        }
        return streetSize * 2 - (address - 1);
    }
}
