package com.zipcodewilmington.assessment2.part2;

import com.sun.tools.javac.util.ArrayUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayUtility {
    public Integer[] merge(Integer[] array1, Integer[] array2) {
        List<Integer> merged = new ArrayList<>();

        for (int i=0; i<array1.length; i++){
            merged.add(array1[i]);
        }

        for (int i=0; i<array2.length; i++){
            merged.add(array2[i]);
        }

        Collections.sort(merged);
        Integer[] result=new Integer[merged.size()];
        for (int i=0; i<merged.size(); i++){
            result[i]=merged.get(i);
        }
        return result;
    }

    public Integer[] rotate(Integer[] array, Integer index) {
        return null;
    }

    public Integer countOccurrence(Integer[] array1, Integer[] array2, Integer valueToEvaluate) {
        return null;
    }

    public Integer mostCommon(Integer[] array) {
        return null;
    }
}
