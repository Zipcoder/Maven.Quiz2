package com.zipcodewilmington.assessment2.part2;

import java.util.Map;
import java.util.TreeMap;

public class ArrayUtility {
    public Integer[] merge(Integer[] array1, Integer[] array2) {

        Integer[] merge = new Integer[array1.length + array2.length];

        for (int i = 0; i < array1.length ; i++) {
            merge[i] = array1[i];
        }
        for (int i = 0; i < array2.length ; i++) {
            merge[i + array1.length] = array2[i];
        }

        return merge;
    }

    public Integer[] rotate(Integer[] array, Integer index) {

        Integer[] shifter = new Integer[array.length];

        for (int i = 0; i < array.length; i++) {
            if(i-index < 0){
                shifter[array.length-index + i] = array[i];
            } else {
                shifter[i-index] = array[i];
            }
        }

        return shifter;
    }

    public Integer countOccurrence(Integer[] array1, Integer[] array2, Integer valueToEvaluate) {
        int counter = 0;

        for(Integer i : array1){
            if(i == valueToEvaluate){
                counter++;
            }
        }
        for(Integer i : array2){
            if(i == valueToEvaluate){
                counter++;
            }
        }

        return counter;
    }

    public Integer mostCommon(Integer[] array) {

        Map<Integer, Integer> mostMap = new TreeMap<>();
        int nullCount = 0;

        for (int i = 0; i < array.length; i++) {
            if(array[i] != null){
                Integer count = mostMap.get(array[i]);
                if(count == null) {
                    mostMap.put(array[i], 1);
                } else {
                    mostMap.put(array[i], count++);
                }
            }
            else {
                nullCount++;
            }

        }

        Integer maxKey = null;
        int maxValue = 0;

        for(Map.Entry<Integer, Integer> e : mostMap.entrySet()){
            if(e.getValue() >= maxValue){
                maxKey = e.getKey();
                maxValue = e.getValue();
            }
        }
        if(nullCount > maxValue){
            return null;
        }

        return maxKey;
    }
}












