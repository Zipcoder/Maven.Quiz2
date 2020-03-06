package com.zipcodewilmington.assessment2.part2;



public class ArrayUtility {
    public Integer[] merge(Integer[] array1, Integer[] array2) {
        Integer[] newArr = new Integer[array1.length + array2.length];
        for (int i = 0; i < array1.length ; i++) {
            newArr[i] = array1[i];
        }
        for (int i = 0; i < array2.length ; i++) {
            newArr[i + array1.length] = array2[i];
        }
        return newArr;
    }

    public Integer[] rotate(Integer[] array, Integer index) {
        Integer[] newArr = new Integer[array.length];
        for (int i = 0; i < newArr.length ; i++) {
            newArr[i] = array[index];
            index++;
            if(index == array.length){
                index = 0;
            }
        }
        return newArr;
    }

    public Integer countOccurrence(Integer[] array1, Integer[] array2, Integer valueToEvaluate) {
        Integer count = 0;

        for (int i = 0; i < array1.length ; i++) {
            if (array1[i] == valueToEvaluate){
                count++;}
        }
        for (int i = 0; i < array2.length ; i++) {
            if (array2[i] == valueToEvaluate){
                count++;
            }
        }
        return count;
    }

    public Integer mostCommon(Integer[] array) {
        Integer mostOcc = 0;
        Integer currCount = 0;
        Integer occMost =0;
        for (int i = 0; i <array.length ; i++) {
            for (int j = i; j < array.length ; j++) {
                if (array[i] == array[j]){
                    currCount++;
                }}
            if(currCount > mostOcc){
                mostOcc = currCount;
                occMost = array[i];}
                currCount = 0;

        }
        return occMost;
    }
}
