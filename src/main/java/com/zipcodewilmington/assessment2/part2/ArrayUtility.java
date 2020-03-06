package com.zipcodewilmington.assessment2.part2;

import com.j256.ormlite.stmt.query.In;

import java.util.*;

public class ArrayUtility {
    public Integer[] merge(Integer[] array1, Integer[] array2) {
        int n = array1.length + array2.length;
        Integer[] arraySum = new Integer[n];
        for (int i = 0; i < n; i++) {
            if(i<=array1.length-1)
                arraySum[i]=array1[i];
            else{
                arraySum[i]=array2[i-array1.length];
            }
        }
        return arraySum;
    }

    public Integer[] rotate(Integer[] array, Integer index) {
        List<Integer> l = new ArrayList<>(Arrays.asList(array));
        for (int i = 0; i < index; i++) {
            Integer temp =l.remove(0);
            l.add(array.length-1,temp);
        }
        return l.toArray(new Integer[0]);
    }

    public Integer countOccurrence(Integer[] array1, Integer[] array2, Integer valueToEvaluate) {
        int counter = 0;
        for (Integer integer : array1) {
            if(valueToEvaluate==null){
                counter++;
            }else if (valueToEvaluate.equals(integer))
                counter++;
        }
        if (array2 != null) {
            for (Integer integer : array2) {
                if (valueToEvaluate.equals(integer))
                    counter++;
            }

        }
        return counter;
    }

    public Integer mostCommon(Integer[] array) {
        Map<Integer, Integer> hp = new HashMap<Integer, Integer>();
        for (Integer i:array) {
            hp.put(i,countOccurrence(array,null,i));
        }
        // find max frequency.
        int max_count = 0;
        Integer res = -1;
        for(Map.Entry<Integer, Integer> val : hp.entrySet()) {
            if (max_count < val.getValue()) {
                res = val.getKey();
                max_count = val.getValue();
            }
        }
        return res;
    }
}
