package com.zipcodewilmington.assessment2.part2;

import java.util.HashMap;
import java.util.Map;

public class ArrayUtility {
    public Integer[] merge(Integer[] array1, Integer[] array2) {
        Integer[] newArr = new Integer[array1.length + array2.length];
        int iter = 0;
        for (Integer i : array1) {
            newArr[iter] = i;
            iter++;
        }
        for (Integer i : array2) {
            newArr[iter] = i;
            iter++;
        }
        return newArr;
    }

    public Integer[] rotate(Integer[] array, Integer index) {
        Integer[] newArr = new Integer[array.length];
        int iter = 0;
        for (int i = index; i < array.length; i++) {
            newArr[iter] = array[i];
            iter++;
        }

        for (int i = 0; i < index; i++) {
            newArr[iter] = array[i];
            iter++;
        }
        return newArr;
    }

    public Integer countOccurrence(Integer[] array1, Integer[] array2, Integer valueToEvaluate) {
        int sum = 0;
        for (Integer i : array1) {
            if (i == valueToEvaluate) {
                sum++;
            }
        }
        for (Integer i : array2) {
            if (i == valueToEvaluate) {
                sum++;
            }
        }
        return sum;
    }

    public Integer mostCommon(Integer[] array) {
        if (array.length < 1) {
            throw new IllegalArgumentException("Cannot find most common element of empty array!");
        }
        Map<Integer, Integer> occ = new HashMap<>();
        for (Integer i : array) {
            if (occ.containsKey(i)) {
                occ.put(i, occ.get(i) + 1);
            } else {
                occ.put(i, 1);
            }
        }

        Integer highest = 0;
        Integer num = array[0];
        for (Map.Entry<Integer, Integer> i : occ.entrySet()) {
            if (i.getValue() > highest) {
                num = i.getKey();
                highest = i.getValue();
            }
        }
        return num;
    }
}
