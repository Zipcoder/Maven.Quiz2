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
        Integer [] result = new Integer[array.length];
        Integer [] array1 = new Integer[array.length - index];
        Integer [] array2 = new Integer[index];

        for (int i = 0; i < array2.length; i++){
            array2[i] = array[i];
        }

        for (int i = 0; i < array1.length; i++){
            array1[i] = array[index];
            index++;
        }

        result = merge(array1,array2);
        return result;
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
        Arrays.sort(array);
        int previous = array[0];
        int popular = array[0];
        int counter = 1;
        int maxCount = 1;

        for (int i = 1; i < array.length; i++){
            if (array[i] == previous) {
                counter++;
            } else {
                if (counter > maxCount) {
                    popular = array[i-1];
                    maxCount = counter;
                }
                previous = array[i];
                counter = 1;
            }
        }

        return counter > maxCount ? array[array.length -1] : popular;
    }

}
