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

    private static int theValue;

    public static int[] parse(String data) {
        theValue = 0;
        char[] characters  = data.toCharArray();
        List<Integer> outputList = new ArrayList<>();

        for(char character: characters){
            if (handleCharacter(character)){
                outputList.add(theValue);
            }
        }

        int[] outputArray = new int[outputList.size()];
        for(int i=0; i< outputList.size(); i++) {
            outputArray[i] = outputList.get(i);
        }
        return outputArray;
    }

    private static boolean handleCharacter(char character) {
        switch (character) {
            case 'i':
                theValue++;
                return false;
            case 'd':
                theValue--;
                return false;
            case 's':
                theValue = theValue * theValue;
                return false;
            case 'o':
                return true;
            default:
                return false;
        }
    }
}
