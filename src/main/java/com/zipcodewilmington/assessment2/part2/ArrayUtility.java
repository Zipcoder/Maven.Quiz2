package com.zipcodewilmington.assessment2.part2;

import java.util.Map;
import java.util.TreeMap;

public class ArrayUtility {
    public Integer[] merge(Integer[] array1, Integer[] array2) {

        Integer[] newArray = new Integer[array1.length + array2.length];
        for (int i = 0; i < array1.length; i++) {
            newArray[i] = array1[i];
        }

        for (int j = 0; j < array2.length; j++) newArray[j + array1.length] = array2[j];

        return newArray;
    }

    public Integer[] rotate(Integer[] array, Integer index) {

        Integer[] newArray = new Integer[array.length];
        for (int i = 0; i < array.length; i++) {
            if (i - index < 0) {
                newArray[array.length - index + i] = array[i];
            } else {
                newArray[i - index] = array[i];
            }
        }
        return newArray;
    }

    public Integer countOccurrence(Integer[] array1, Integer[] array2, Integer valueToEvaluate) {

        int c = 0;
        for(Integer i : array1){
            if(i == valueToEvaluate){
                c++;
            }
        }
        for(Integer i : array2){
            if(i == valueToEvaluate){
                c++;
            }
        }
        return c;
    }

    public static Integer mostCommon(Integer[] array) {

        Map<Integer, Integer> c = new TreeMap<>();
        int nc = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null) {
                Integer count = c.get(array[i]);
                if (count == null) {
                    c.put(array[i], 1);
                } else {
                    c.put(array[i], count++);
                }
            } else {
                nc++;
            }
        }


        Integer maxKey = null;
        int maxValue = 0;

        for (Map.Entry<Integer, Integer> e : c.entrySet()) {
            if (e.getValue() >= maxValue) {
                maxKey = e.getKey();
                maxValue = e.getValue();
            }
        }
        if (nc > maxValue) {
            return null;
        }
        return maxKey;
    }
}
