package com.zipcodewilmington.assessment2.part2;

import java.util.HashMap;
import java.util.Map;


public class ArrayUtility {


    public Integer[] merge(Integer[] array1, Integer[] array2) {
        Integer[] newArr = new Integer[array1.length + array2.length];
        int counter = 0;

        for (int i = 0; i < array1.length; i++) {
            newArr[i] = array1[i];
            counter++;
        }
        for (int j = 0; j < array2.length; j++) {
            newArr[counter++] = array2[j];
        }
        return newArr;
    }


    public Integer[] rotate(Integer[] array, Integer index) {

        for (int i = 0; i < index; i++) {
            int k;
            int temp = array[0];

            for (k = 0; k < array.length - 1; k++) {
                array[k] = array[k + 1];
            }
            array[k] = temp;
        }
        return array;
    }


    public Integer countOccurrence(Integer[] array1, Integer[] array2, Integer valueToEvaluate) {
        int counter = 0;
        int counter2 = 0;

        for (Integer value1 : array1) {
            if (value1.equals(valueToEvaluate)) counter++;
        }
        for (Integer value2 : array2) {
            if (value2.equals(valueToEvaluate)) counter2++;
        }
        return counter + counter2;
    }


    public Integer mostCommon(Integer[] array) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < array.length; i++) {
            int key = array[i];
            if (map.containsKey(key)) {
                int freq = map.get(key);
                freq++;
                map.put(key,freq);
            } else {
                map.put(key,1);
            }
        }
        int maxCount = 0;
        int result = -1;
        for(Map.Entry<Integer, Integer> val : map.entrySet()) {
            if (maxCount < val.getValue()) {
                result = val.getKey();
                maxCount = val.getValue();
            }
        }
        return result;
    }
}
