package com.zipcodewilmington.assessment2.part2;

import java.util.HashMap;
import java.util.Map;

public class ArrayUtility {
    public Integer[] merge(Integer[] array1, Integer[] array2) {
        Integer[] results = new Integer[array1.length + array2.length];
        System.arraycopy(array1, 0, results, 0, array1.length);
        System.arraycopy(array2, 0, results, array1.length, array2.length);
        return results;
    }

    public Integer[] rotate(Integer[] array, Integer index) {
        for (int i = 0; i < index; i++) {
            rotateByOne(array, array.length);
        }
        return array;
    }

    public void rotateByOne(Integer[] array, int length){
        int i;
        int holder = array[0];
        for (i = 0; i < length - 1; i++) {
            array[i] = array[i + 1];
        }
        array[i] = holder;
    }

    public Integer countOccurrence(Integer[] array1, Integer[] array2, Integer valueToEvaluate) {
        Integer count = 0;
        for (int i = 0; i < array1.length; i++) {
            if (array1[i].equals(valueToEvaluate)){
                count++;
            }
        }
        for (int j = 0; j < array2.length; j++) {
            if (array2[j].equals(valueToEvaluate)){
                count++;
            }
        }
        return count;
    }

    public Integer mostCommon(Integer[] array) {
        HashMap<Integer, Integer> count = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
             if (count.containsKey(array[i])){
                 count.put(array[i], count.get(array[i]) + 1);
             }
             else {
                 count.put(array[i], 1);
             }
        }
        Integer mostCommon = null;
        Integer mostCommonOccurences = 0;
        for (Map.Entry<Integer, Integer> entry : count.entrySet()){
            if (entry.getValue() > mostCommonOccurences){
                mostCommon = entry.getKey();
            }
        }
        return mostCommon;
    }
}
