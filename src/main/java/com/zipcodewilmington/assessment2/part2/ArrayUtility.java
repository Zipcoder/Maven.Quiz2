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
        Integer count = 0;
        Integer[] array = merge(array1, array2);
        for (int i = 0; i < array.length; i++) {
            if (array[i] == valueToEvaluate) count += 1;
        }
        return count;
    }

    public Integer mostCommon(Integer[] array) {
        Integer commonValue = 0;
        Integer maxCount = 0;
        for (Integer value : array) {
            Integer occurrences = countOccurrence(array, new Integer[0], value);
            if (occurrences > maxCount) {
                maxCount = occurrences;
                commonValue = value;
            }
        }
        return commonValue;
    }
}
