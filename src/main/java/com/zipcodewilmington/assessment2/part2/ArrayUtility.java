package com.zipcodewilmington.assessment2.part2;

import java.util.HashMap;
import java.util.Map;

public class ArrayUtility {
    public Integer[] merge(Integer[] array1, Integer[] array2) {
        Integer[] mergedArray = new Integer[array1.length + array2.length];
        for (int i = 0; i < array1.length; i++) {
            mergedArray[i] = array1[i];
        }
        for (int i = 0; i < array2.length; i++) {
            mergedArray[array1.length+i] = array2[i];
        }
        return mergedArray;
    }

    public Integer[] rotate(Integer[] array, Integer index) {
        Integer[] firstPart = split(array, 0, index);
        Integer[] secondPart = split(array, index, array.length);
        Integer[] retArray = merge(secondPart, firstPart);
        return retArray;
    }

    public Integer countOccurrence(Integer[] array1, Integer[] array2, Integer valueToEvaluate) {
        Integer count = 0;
        Integer[] mergedArray = merge(array1, array2);
        for (int i = 0; i < mergedArray.length; i++) {
            if(mergedArray[i].equals(valueToEvaluate))
                count++;
        }
        return count;
    }

//    public Integer mostCommon(Integer[] array) {
//        int maxCount = 0;
//        Integer retInt = 0;
//        for (int i = 0; i < array.length; i++) {
//            int count = 1;
//            for (int j = 1; j < array.length; j++) {
//                if(array[i].equals(array[j]))
//                    count++;
//            }
//            if(count > maxCount){
//                retInt = array[i];
//                maxCount = count;
//            }
//        }
//        return retInt;
//    }

    public Integer mostCommon(Integer[] array){
        Map<Integer, Integer> most = new HashMap<>();
        Integer maxInt = 0;
        Integer maxCount = 0;
        for (int i = 0; i < array.length; i++) {
            if(!most.containsKey(array[i]))
                most.put(array[i], 1);
            else
                most.replace(array[i], most.get(array[i]), most.get(array[i]) + 1);
            if(most.get(array[i]) > maxCount){
                maxInt = array[i];
                maxCount = most.get(array[i]);
            }
        }
        return maxInt;
    }

    public Integer[] split(Integer[] array, Integer startIndex, Integer endIndex){
        Integer[] retArray = new Integer[endIndex - startIndex];
        for (int i = 0, j = 0; i < array.length; i++) {
            if(i >= startIndex && i < endIndex) {
                retArray[j] = array[i];
                j++;
            }
        }
        return retArray;
    }
}
