package com.zipcodewilmington.assessment2.part2;

import com.j256.ormlite.stmt.query.In;

import java.util.Arrays;

public class ArrayUtility {
    public Integer[] merge(Integer[] array1, Integer[] array2) {
        Integer[] result = new Integer[array1.length + array2.length];
        System.arraycopy(array1, 0, result, 0, array1.length);
        System.arraycopy(array2, 0, result, array1.length, array2.length);
        return result;
    }

    public Integer[] rotate(Integer[] array, Integer index) {
//        Integer[] result = new Integer[];
//        for (int i = )
        return null;
    }

    public Integer countOccurrence(Integer[] array1, Integer[] array2, Integer valueToEvaluate) {
           int intCount = 0;
           Integer[] result = new Integer[array1.length + array2.length];
           result = merge(array1, array2);
        for (int i = 0; i < result.length; i++) {
            if (result[i].equals(valueToEvaluate)) {
                intCount++;
            }
        }
        return intCount;
    }

    public Integer mostCommon(Integer[] array) {
        Integer count = 1;
        Object mostPop = array[0];
        Integer tempCount;
        Object temp = 0;

        for (int i = 0; i < array.length; i++) {
            temp = array[i];
            tempCount = 0;
            for (int j = 0; j < array.length; j++) {
                if (temp == array[j]) {
                    tempCount++;
                }
                if ((tempCount > count)){
                    mostPop = temp;
                    count = tempCount;
                }
            }
        }
        return (Integer) mostPop;
    }
}
