package com.zipcodewilmington.assessment2.part2;

import java.util.Arrays;

public class ArrayUtility {
    public Integer[] merge(Integer[] array1, Integer[] array2) {
        return null;
    }

    public Integer[] rotate(Integer[] array, Integer index) {
        return null;
    }

    public Integer countOccurrence(Integer[] array1, Integer[] array2, Integer valueToEvaluate) {
        int result = 0;

        if (Arrays.binarySearch(array1,valueToEvaluate) >=0) return result;
        if (Arrays.binarySearch(array2,valueToEvaluate) >=0) return result;

        return result;
    }

    public Integer mostCommon(Integer[] array) {
        return null;
    }
}
