package com.zipcodewilmington.assessment2.part2;

import java.util.Arrays;

public class ArrayUtility {
    public Integer[] merge(Integer[] array1, Integer[] array2) {
        int a = array1.length;
        int b = array2.length;
        Integer[] newArray = new Integer[a + b];
        System.arraycopy(array1, 0, newArray, 0, a);
        System.arraycopy(array2, 0, newArray, a, b);
        return newArray;

    }

    public Integer[] rotate(Integer[] array, Integer index) {
//        int len = array.length;
//        int temp;
//        Integer[] newArray = new Integer[len];
////        for( int i = 0; i <= index; i++)
////       newArray[i] = array[i + index];
////        return newArray;
//
//            temp = newArray[0];
//            for (i = 0; i < len - 1; i++)
//                newArray[i] = newArray[i + 1];
//            newArray[i] = temp;
            return null;
        }

    public Integer countOccurrence(Integer[] array1, Integer[] array2, Integer valueToEvaluate) {
        return null;
    }

    public Integer mostCommon(Integer[] array) {
        return null;
    }
}
