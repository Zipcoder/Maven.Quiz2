package com.zipcodewilmington.assessment2.part2;

import com.j256.ormlite.stmt.query.In;

import java.util.Arrays;

public class ArrayUtility {
    public Integer[] merge(Integer[] array1, Integer[] array2) {
        Integer[]mergedArray = new Integer[array1.length+array2.length];
        for (int i = 0; i < array1.length; i++) {
            mergedArray[i]=array1[i];
        }
        for (int i = array1.length; i < mergedArray.length; i++) {
            mergedArray[i]=array2[i-array1.length];
        }
        return mergedArray;
    }

    public Integer[] rotate(Integer[] array, Integer index) {
        Integer[]rotatedArray = new Integer[array.length];
        for (int i = 0; i < array.length; i++) {
            if ((i+index)>array.length-1){
                rotatedArray[i]=array[i-(array.length-index)];
            }
            rotatedArray[i]=array[i+index];

        }
        return rotatedArray;
    }

    public Integer countOccurrence(Integer[] array1, Integer[] array2, Integer valueToEvaluate) {
        Integer count = 0;
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] == valueToEvaluate) {
                count++;
            }
        }
        for (int i = 0; i < array2.length; i++) {
            if (array2[i] == valueToEvaluate) {
                count++;

            }
        }
        return count;
    }

    public Integer mostCommon(Integer[] array) {

        Arrays.sort(array);
        int count1 = 1;
        int newMax = 1;
        int mostCommon = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] == array[i - 1]) {
                count1++;
            } else {
                if (count1 > newMax) {
                    newMax = count1;
                    mostCommon = array[i - 1];
                }
                count1 = 1;
            }
            if (count1 > newMax) {
                mostCommon = array[array.length - 1];

            }
        }
        return mostCommon;

    }
}
