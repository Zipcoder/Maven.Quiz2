package com.zipcodewilmington.assessment2.part2;

public class ArrayUtility {
    public Integer[] merge(Integer[] array1, Integer[] array2) {
        Integer[] merged = new Integer[array1.length + array2.length];
        int counter = 0;
        for (int j = 0;j<array1.length;j++){
            merged[counter]=array1[j];
            counter++;
        }
        counter=0;
        for (int i = array1.length;i<merged.length;i++){
            merged[i] = array2[counter];
            counter++;
        }
        return merged;
    }

    public Integer[] rotate(Integer[] array, Integer index) {
        Integer[] holdArray = new Integer[array.length];
        int firstValue;
        for (int i = 0; i < index; i++) {
            firstValue = array[0];
            for (int j = 0; j < array.length; j++) {
                if (j < array.length - 1) {
                    array[j] = array[j + 1];
                } else {
                    array[j] = firstValue;
                }
            }
        }
        return array;
    }

    public Integer countOccurrence(Integer[] array1, Integer[] array2, Integer valueToEvaluate) {
        int counter = 0;
        for (Integer num : array1){
            if (num == valueToEvaluate){
                counter++;
            }
        }
        for (Integer num : array2){
            if (num == valueToEvaluate) {

                counter++;
            }
        }
        return counter;
    }

    public Integer mostCommon(Integer[] array) {
        Integer result=0;
        int counter = 0;
        int prevCounter = 0;
        for(Integer num : array){
            prevCounter = counter;
            counter = 0;
            for (Integer currentNum :array){
                if (currentNum == num){
                    counter++;
                }
                if (counter > prevCounter){
                    result = num;
                }
            }
        }
        return result;
    }
}
