package com.zipcodewilmington.assessment2.part2;

public class ArrayUtility {
    public Integer[] merge(Integer[] array1, Integer[] array2) {
        Integer[] newArray = new Integer[array1.length+array2.length];
        for (int i = 0; i < newArray.length; i++) {
            if (i < array1.length) {
                newArray[i] = array1[i];
            } else {
                newArray[i] = array2[i-array1.length];
            }
        }
        return newArray;
    }

    public Integer[] rotate(Integer[] array, Integer index) {
        Integer[] newArray = new Integer[array.length];
        for (int i = 0; i < array.length; i++) {
            Integer newIndex = i + index;
            if (newIndex >= array.length) newIndex -= array.length;
            newArray[i] = array[newIndex];
        }
        return newArray;
    }

    public Integer countOccurrence(Integer[] array1, Integer[] array2, Integer valueToEvaluate) {
        return null;
    }

    public Integer mostCommon(Integer[] array) {
        return null;
    }
}
