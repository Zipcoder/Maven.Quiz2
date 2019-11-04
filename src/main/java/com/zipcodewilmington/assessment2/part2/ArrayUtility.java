package com.zipcodewilmington.assessment2.part2;

import com.sun.tools.javac.util.ArrayUtils;

import java.util.Arrays;
import java.util.Collections;

public class ArrayUtility {
    public Integer[] merge(Integer[] array1, Integer[] array2) {
        Integer[] mergedArray = new Integer[array1.length + array2.length];
        Integer counter = 0;
        for(int i = 0; i < array1.length;i++){
            mergedArray[counter] = array1[i];
            counter++;
        }

        for(int i = 0; i < array2.length; i++){
            mergedArray[counter] = array2[i];
            counter++;
        }


        return mergedArray;
    }

    public Integer[] rotate(Integer[] array, Integer index) {
        return null;
    }

    public Integer countOccurrence(Integer[] array1, Integer[] array2, Integer valueToEvaluate) {
        Integer occurrenceCounter = 0;
        for(int i = 0; i < array1.length;i++) {
            if (array1[i].equals(valueToEvaluate)) {
                occurrenceCounter++;
            }
        }

            for(int i = 0; i < array2.length;i++){
                if(array2[i].equals(valueToEvaluate)){
                    occurrenceCounter++;
                }
        }
        return occurrenceCounter;
    }

    public Integer mostCommon(Integer[] array) {

        int count = 0;
        int mostCommon = array[0];
        int temp = 0;
        int tempCount = 0;
        for(int i = 0; i <= array.length - 1;i++){
            temp = array[i];
            tempCount = Collections.frequency(Arrays.asList(array), temp);
        }
        if(tempCount > count){
            mostCommon = temp;
            count = tempCount;
            tempCount = 0;
        }
        return mostCommon;
    }
}
