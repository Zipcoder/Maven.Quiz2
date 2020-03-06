package com.zipcodewilmington.assessment2.part2;

public class ArrayUtility {
    public Integer[] merge(Integer[] array1, Integer[] array2) {

        Integer[] result = new Integer[array1.length + array2.length];
        int count =0;
        for (int i = 0; i< array1.length; i++){
            result[i] = array1[i];
            count++;
        }
        for (int j = 0; j < array2.length; j++){
            result[count++] = array2[j];
        }
        return result;
    }

    public Integer[] rotate(Integer[] array, Integer index) {
        Integer[] result = new Integer[array.length];
        for (int i = 0; i < array.length; i++) {
            result[(i + array.length - index) % array.length] = array[i];
        }
        return result;
    }

    public Integer countOccurrence(Integer[] array1, Integer[] array2, Integer valueToEvaluate) {

        Integer count = 0;
        for (int i = 0; i < array1.length; i++) {
            if (valueToEvaluate == array1[i]) {
                count++;
            }
        }
        for (int i = 0; i < array2.length; i++) {
            if (valueToEvaluate == array2[i]) {
                count++;
            }
        }
        return count;
    }

    public static Integer mostCommon(Integer[] array) {

        Integer count = 1;
        Integer mostCommon = array[0];

        for (int i = 0; i < array.length - 1; i++) {
            Integer temp = array[i];
            Integer tempCount = 0;

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

