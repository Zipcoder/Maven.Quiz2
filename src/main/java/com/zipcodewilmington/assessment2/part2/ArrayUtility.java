package com.zipcodewilmington.assessment2.part2;

import java.util.ArrayList;

public class ArrayUtility {
    public Integer[] merge(Integer[] array1, Integer[] array2) {
        ArrayList<Integer> result = new ArrayList<>();
        for (Integer to : array1) {
            result.add(to);

        } for (Object to : array2) {
            result.add((Integer) to);
        }
        Integer[] array = result.toArray(new Integer[array1.length + array2.length]);
        return array;
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
