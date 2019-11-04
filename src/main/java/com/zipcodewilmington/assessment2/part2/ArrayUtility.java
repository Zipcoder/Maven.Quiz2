package com.zipcodewilmington.assessment2.part2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeMap;

public class ArrayUtility {
    public Integer[] merge(Integer[] array1, Integer[] array2) {
        ArrayList<Integer> aL1 = new ArrayList<>(Arrays.asList(array1));
        ArrayList<Integer> aL2 = new ArrayList<>(Arrays.asList(array2));
        aL1.addAll(aL2);

        return aL1.toArray(new Integer[array1.length + array2.length]);
    }

    public Integer[] rotate(Integer[] array, Integer index) {
        Integer[] result = new Integer[array.length];
        for (int i = 0; i < array.length; i++) {
            result[i] = array[(i + array.length + index)%array.length];
        }
        return result;
    }

    public Integer countOccurrence(Integer[] array1, Integer[] array2, Integer valueToEvaluate) {
        int count = 0;
        for (int num : array1) {
            if (num == valueToEvaluate){
                count++;
            }
        }
        for (int num : array2) {
            if (num == valueToEvaluate){
                count++;
            }
        }
        return count;
    }

    public Integer countOccurrence(Integer[] array1, Integer valueToEvaluate) {
        int count = 0;
        for (int num : array1) {
            if (num == valueToEvaluate){
                count++;
            }
        }
        return count;
    }

    public Integer mostCommon(Integer[] array) {
        int max = 0;
        TreeMap<Integer, Integer> counts = new TreeMap<Integer,Integer>();
        for (int num : array) {
            counts.put(countOccurrence(array,num),num);
        }
        return counts.get(counts.lastKey());
    }
}
