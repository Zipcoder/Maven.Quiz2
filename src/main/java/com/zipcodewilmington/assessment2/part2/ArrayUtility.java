package com.zipcodewilmington.assessment2.part2;

import java.util.Arrays;

public class ArrayUtility {
    public Integer[] merge(Integer[] array1, Integer[] array2) {
        Integer[] array3 = new Integer[array1.length + array2.length];

        for(int j = 0; j < array1.length; j++) {
            array3[j] = array1[j];
        }

        for(int i = array1.length; i < array3.length; i++) {
            array3[i] = array2[i];
        }

        return array3;
    }

    public Integer[] rotate(Integer[] array, Integer index) {
        return null;
    }

    public Integer countOccurrence(Integer[] array1, Integer[] array2, Integer valueToEvaluate) {
        return null;
    }

    public Integer mostCommon(Integer[] array) {
        return null;
    }
}
