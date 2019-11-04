package com.zipcodewilmington.assessment2.part2;

public class ArrayUtility {
    public Integer[] merge(Integer[] array1, Integer[] array2) {

        Integer counter = 0;
        for (Integer i : array1){
            counter++;}
        for (Integer i : array2){
            counter++;
        }


        Integer[] completeArray = new Integer[counter];
        Integer secondCounter = 0;
        for (Integer i : array1){
            completeArray[secondCounter] = i;
            secondCounter++;
        }
        for (Integer i : array2){
            completeArray[secondCounter] = i;
            secondCounter++;
        }
        return completeArray;

    }

    public Integer[] rotate(Integer[] array, Integer index) {
        Integer[] indexToRotate = new Integer[array.length];
        Integer counter = 0;
        for (int i = 0; i < indexToRotate.length; i++) {
            Integer integer = indexToRotate[i];

        }
        for (int i = 0; i < index; i++){
            indexToRotate[counter] = array[i];
            counter++;
        }
        return null;
    }

    public Integer countOccurrence(Integer[] array1, Integer[] array2, Integer valueToEvaluate) {
        return null;
    }

    public Integer mostCommon(Integer[] array) {
        return null;
    }
}
