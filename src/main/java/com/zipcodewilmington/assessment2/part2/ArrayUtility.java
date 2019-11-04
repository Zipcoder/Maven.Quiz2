package com.zipcodewilmington.assessment2.part2;

public class ArrayUtility {
    public Integer[] merge(Integer[] array1, Integer[] array2) {
        Integer[] mergedArray = new Integer[array1.length + array2.length];
        Integer counter = 0;
        for(int i = 0; i < array1.length;i++){
            mergedArray[counter] = array1[i];
            counter++;
        }

        for(int i = 0; i < array2.length; i++){
            mergedArray[counter] = array2[i];
            counter++;
        }


        return mergedArray;
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
