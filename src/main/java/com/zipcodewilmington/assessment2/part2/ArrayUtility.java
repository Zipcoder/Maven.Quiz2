package com.zipcodewilmington.assessment2.part2;

import java.lang.reflect.Array;
import java.util.*;

public class ArrayUtility {
    public Integer[] merge(Integer[] array1, Integer[] array2) {
        List<Integer> retList = new ArrayList<>(Arrays.asList(array1));
        retList.addAll(Arrays.asList(array2));
        return retList.toArray(new Integer[0]);
    }

    public Integer[] rotate(Integer[] array, Integer index) {
        return merge(split(array, index, array.length), split(array, 0, index));
    }

    public Integer countOccurrence(Integer[] array1, Integer[] array2, Integer valueToEvaluate) {
        Integer count = 0;
        Integer[] mergedArray = merge(array1, array2);
        return (int)Arrays.stream(mergedArray)
                .filter(x -> x.equals(valueToEvaluate))
                .count();
    }

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
