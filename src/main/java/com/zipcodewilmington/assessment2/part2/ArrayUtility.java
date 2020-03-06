package com.zipcodewilmington.assessment2.part2;

public class ArrayUtility {
    public Integer [] merge(Integer[] array1, Integer[] array2) {
       Integer [] firstArray = array1;
       Integer [] secondArray = array2;
       int length = firstArray.length + secondArray.length;
       Integer[] mergedArray = new Integer[length];
       int pos = 0;
       for (Integer element : firstArray){
           mergedArray[pos] = element;
           pos++;
       }
       for(Integer element : secondArray){
           mergedArray[pos] = element;
           pos++;
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
