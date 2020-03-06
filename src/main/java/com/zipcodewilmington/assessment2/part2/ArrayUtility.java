package com.zipcodewilmington.assessment2.part2;

import java.util.HashMap;
import java.util.Map;

public class ArrayUtility {
    public Integer[] merge(Integer[] array1, Integer[] array2) {
        int newLength = array1.length + array2.length;

        Integer[] newArr = new Integer[newLength];

        for (int i = 0; i < array1.length; i++) {
            newArr[i] = array1[i];
        }
        int counter = 0;
        for (int i = array1.length; i < newArr.length; i++) {
            newArr[i] = array2[counter];
            counter++;
        }
        return newArr;
    }

    public Integer[] rotate(Integer[] array, Integer index) {
        Integer[] newArr = new Integer[array.length];


        return null;
    }

    public Integer countOccurrence(Integer[] array1, Integer[] array2, Integer valueToEvaluate) {
        int counter = 0;
        for (Integer i : array1) {
            if (i == valueToEvaluate) {
                counter++;
            }
        }

        for (Integer i : array2) {
            if (i == valueToEvaluate) {
                counter++;
            }
        }
        return counter;
    }

    public Integer mostCommon(Integer[] array) {
       int result = -1;
        HashMap<Integer, Integer> myMap = new HashMap<>();

        for (int i = 0; i < array.length; i++) {
            int key = array[i];
            if(myMap.containsKey(key)){
                int counter = myMap.get(key);
                counter++;
                myMap.put(key,counter);
            }else {
                myMap.put(key,1);
            }
        }

        int maxCount = 0;
        for(Map.Entry<Integer,Integer> val : myMap.entrySet()){
            if(maxCount < val.getValue()){
                result = val.getKey();
                maxCount = val.getValue();
            }
        }


       return result;
    }
}
