package com.examples.codewars.kata.deadfish;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * Write a simple parser that will parse and run Deadfish.
 * <p>
 * Deadfish has 4 commands, each 1 character long:
 * <p>
 * i increments the value (initially 0)
 * d decrements the value
 * s squares the value
 * o outputs the value into the return array
 * Invalid characters should be ignored.
 */
public class DeadFish {
    private static final Set<Character> validCharacters = Set.of('i', 'd', 's', 'o');
    private static int theValue = 0;
    private static List<Integer> outputList = new ArrayList<>();

    public static int[] parse(String data) {
        data.toLowerCase()
                .codePoints()
                .mapToObj(c -> (char) c)
                .filter(validCharacters::contains)
                .forEachOrdered(DeadFish::handleCharacter);

        int[] outputArray;
        outputArray = outputList.stream()
                .mapToInt(Integer::intValue)
                .toArray();

        return outputArray;
    }

    private static void handleCharacter(Character character) {
        switch (character) {
            case 'i':
                theValue++;
                break;
            case 'd':
                theValue--;
                break;
            case 's':
                theValue = theValue * theValue;
                break;
            case 'o':
                outputList.add(theValue);
                break;
            default:
                break;
        }
    }
}
