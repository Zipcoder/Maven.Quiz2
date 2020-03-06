package com.zipcodewilmington.assessment2.part2;

import java.util.Arrays;

public class ArrayUtility {
    public Integer[] merge(Integer[] array1, Integer[] array2) {
        Integer newArraySize = array1.length + array2.length;
        Integer[] newArray = new Integer[newArraySize];
        int a = array1.length;
        int b = array2.length;
        System.arraycopy(array1, 0, newArray, 0, a);
        System.arraycopy(array2, 0, newArray, a, b);

        return newArray;

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
