package com.zipcodewilmington.assessment2.part2;

import com.j256.ormlite.stmt.query.In;

import java.util.Arrays;

public class ArrayUtility {
    public Integer[] merge(Integer[] array1, Integer[] array2) {
        int newArrayLenght = array1.length + array2.length;
        Integer [] result = new Integer[newArrayLenght];
        int currentIndex = 0;

        for (int i = 0; i < array1.length; i++){
                result[i] = array1[i];
                currentIndex++;
        }

        for (int i = 0; i < array2.length; i++){
            result[currentIndex] = array2[i];
            currentIndex++;
        }

        return result;
    }

    public Integer[] rotate(Integer[] array, Integer index) {
        return null;
    }

    public Integer countOccurrence(Integer[] array1, Integer[] array2, Integer valueToEvaluate) {
        int result = 0;

        for (int i = 0; i < array1.length; i++){
            if (array1[i] == valueToEvaluate) result++;
        }
        for (int i = 0; i < array2.length; i++){
            if (array2[i] == valueToEvaluate) result++;
        }

        return result;
    }

    public Integer mostCommon(Integer[] array) {
        return null;
    }
}
