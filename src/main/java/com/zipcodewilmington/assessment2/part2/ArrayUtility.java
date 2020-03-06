package com.zipcodewilmington.assessment2.part2;

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
        return null;
    }

    public Integer countOccurrence(Integer[] array1, Integer[] array2, Integer valueToEvaluate) {
        return null;
    }

    public Integer mostCommon(Integer[] array) {
        return null;
    }
}
