package com.zipcodewilmington.assessment2.part2;

import com.j256.ormlite.stmt.query.In;

import java.util.*;

public class ArrayUtility {
    public Integer[] merge(Integer[] array1, Integer[] array2) {
        List arr1 = new ArrayList(Arrays.asList(array1));
        arr1.addAll(Arrays.asList(array2));
        Integer[] result = new Integer[arr1.size()];
        result = (Integer[]) arr1.toArray(result);
        return result;
    }

    public Integer[] rotate(Integer[] array, Integer index) {

        for (int i = 0; i < index; i++) {
            int j;
            int first= array[0];
            for( j = 0; j < array.length-1;j++){
                array[j] = array[j+1];
            }
            array[j] = first;
        }
        return array;
    }

    public Integer countOccurrence(Integer[] array1, Integer[] array2, Integer valueToEvaluate) {
        ArrayUtility au = new ArrayUtility();
        int count = 0;
        List<Integer> list = Arrays.asList(au.merge(array1, array2));
        for(Integer i : list){
            if(i==valueToEvaluate){
                count++;
            }
        }
        return count;
    }

    public Integer mostCommon(Integer[] array) {

        Map<Integer,Integer> map = new HashMap<>();
        Integer highestValue = Integer.MIN_VALUE;
        Integer highestKey = 0;
        for(Integer i : array){
            if(array.length == 1){
                return array[0];
            }
            Integer v = map.get(i);
            if(!map.containsKey(i)){
                map.put(i,1);
            }
            else{
                map.replace(i,v+1);
                if(v>highestValue){
                    highestValue = v;
                    highestKey = i;
                }
            }


        }

        return highestKey;
    }
}
