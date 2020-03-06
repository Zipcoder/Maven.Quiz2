package com.zipcodewilmington.assessment2.part2;

public class ArrayUtility {
    public Integer[] merge(Integer[] array1, Integer[] array2) {
        int lengthOne = array1.length;
        int lengthTwo = array2.length;
        Integer[] result = new Integer[lengthOne + lengthTwo];

        System.arraycopy(array1, 0, result, 0, lengthOne);
        System.arraycopy(array2, 0, result, lengthOne, lengthTwo);
        return result;
    }


    public Integer[] rotate(Integer[] array, Integer index) {
        Integer[] result = new Integer[array.length];
        for (int i = 0; i < array.length; i++) {
            result[( i + array.length - index ) % array.length] = array[i];
        }
        return result;
    }


    public Integer countOccurrence(Integer[] array1, Integer[] array2, Integer valueToEvaluate) {
        Integer counter = 0;
        for (int i = 0; i < array1.length && i < array2.length; i++)
            if (valueToEvaluate == array1[i] || valueToEvaluate == array2[i])
                counter++;

        return counter;

    }

    public Integer mostCommon(Integer[] array) {
        Integer count = 1, tempCount;
        Integer mostCommon = array[0];
        Integer temp = 0;
        for (int i = 0; i < array.length - 1; i++) {
            temp = array[i];
            tempCount = 0;
            for (int j = 1; j < array.length; j++)
                if (temp == array[j])
                    tempCount++;

            if (tempCount > count) {
                mostCommon = temp;
                count = tempCount;
            }
        }
        return mostCommon;
    }
}

