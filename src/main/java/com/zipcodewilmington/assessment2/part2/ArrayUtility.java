package com.zipcodewilmington.assessment2.part2;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayUtility {
    public Integer[] merge(Integer[] array1, Integer[] array2) {
        ArrayList <Integer> theList = new ArrayList(Arrays.asList(array1));
        theList.addAll(Arrays.asList(array2));
        return theList.toArray(new Integer[theList.size()]);
    }

    public Integer[] rotate(Integer[] array, Integer index) {
        return null;
    }

    public Integer countOccurrence(Integer[] array1, Integer[] array2, Integer valueToEvaluate) {
        // two separate loops to count "valueToEvaluate" in each array(part of this in exam1)
        int counter = 0;
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] == (valueToEvaluate)) {
                counter++;
            }
        }
        for (int j = 0; j < array2.length; j++) {
            if (array2[j] == (valueToEvaluate)) {
                counter++;
            }
        }

        return counter;
    }

    public Integer mostCommon(Integer[] array) {
        // declare variables needed (From exam1, just changed signs)
        int counter =  0;
        int counterTemp = 0;
        Integer highest = 0;

        // inner loop checks for highest number before outer loop goes thru
        for (int i = 0 ; i <= array.length -1 ; i ++ ) {
            for (int j = 0; j <= array.length -1; j++) {
                if (array[i] == array[j]){
                    counterTemp++;
                }
                // after inner loop checks for MC num,
                if(counterTemp >= counter){
                    counter = counterTemp;
                    counterTemp = 0;
                    highest = array[i];
                }

            }
        }
        return highest;
    }
}
